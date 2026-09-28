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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) '#', outputSettings13);
        java.lang.String str15 = documentType4.toString();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node7.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        int int20 = node19.siblingIndex();
        java.lang.String str21 = node19.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, 100, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        java.lang.String str9 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        int int6 = documentType4.siblingIndex();
        int int7 = documentType4.siblingIndex();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "");
        documentType4.setBaseUri("<!DOCTYPE html>");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.clone();
        boolean boolean16 = node13.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node13.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        int int16 = node15.siblingIndex();
        java.lang.Class<?> wildcardClass17 = node15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) (byte) 10, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.lang.String str13 = node7.attr("hi!");
        java.lang.String str14 = node7.outerHtml();
        org.jsoup.nodes.Document document15 = node7.ownerDocument();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node19.attributes();
        java.lang.String str21 = node19.outerHtml();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        org.jsoup.nodes.Node node29 = documentType26.parent();
        documentType26.setBaseUri("");
        org.jsoup.nodes.Node node33 = documentType26.removeAttr("hi!");
        boolean boolean35 = node33.hasAttr("<!DOCTYPE html>");
        node33.setBaseUri("hi!");
        int int38 = node33.siblingIndex();
        org.jsoup.nodes.Node node39 = node33.clone();
        java.lang.String str40 = node33.toString();
        org.jsoup.nodes.Attributes attributes41 = node33.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node19.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!DOCTYPE html>" + "'", str40, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str7 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.toString();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str14 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        java.lang.String str19 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str20 = documentType4.outerHtml();
        java.lang.Class<?> wildcardClass21 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        java.lang.String str21 = documentType14.baseUri();
        org.jsoup.nodes.Node node24 = documentType14.attr("hi!", "hi!");
        org.jsoup.nodes.Node node25 = node24.clone();
        boolean boolean26 = node9.equals((java.lang.Object) node24);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node9.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        int int11 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (short) 1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (-1), outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str16 = documentType4.attr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        int int18 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node22 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType16.childNodes();
        java.lang.String str33 = documentType16.outerHtml();
        java.lang.String str35 = documentType16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html>" + "'", str33, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str19 = documentType4.attr("#doctype");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType24.outerHtmlTail(stringBuilder27, (int) '#', outputSettings29);
        java.lang.String str31 = documentType24.baseUri();
        org.jsoup.nodes.Document document32 = documentType24.ownerDocument();
        documentType24.setBaseUri("hi!");
        java.lang.String str36 = documentType24.absUrl("hi!");
        org.jsoup.nodes.Document document37 = documentType24.ownerDocument();
        java.lang.String str38 = documentType24.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE html>" + "'", str38, "<!DOCTYPE html>");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        boolean boolean21 = node18.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node18.after("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = node18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType21.parent();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType21.childNodes();
        boolean boolean26 = node11.equals((java.lang.Object) documentType21);
        org.jsoup.nodes.Attributes attributes27 = documentType21.attributes();
        java.lang.String str29 = documentType21.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass16 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.jsoup.nodes.Node node20 = node16.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node21 = node20.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node20.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.Document document11 = node9.ownerDocument();
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node15.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        org.jsoup.nodes.Node node23 = documentType20.parent();
        documentType20.setBaseUri("");
        java.lang.String str26 = documentType20.toString();
        boolean boolean28 = documentType20.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node31 = documentType20.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str32 = documentType20.baseUri();
        org.jsoup.nodes.Node node33 = documentType20.parent();
        documentType20.setBaseUri("#doctype");
        org.jsoup.nodes.Node node38 = documentType20.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html>");
        boolean boolean40 = documentType20.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = documentType4.before((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        java.lang.String str20 = node11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node11.childNodes();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType26.outerHtmlTail(stringBuilder29, (int) '#', outputSettings31);
        org.jsoup.nodes.Node node33 = documentType26.clone();
        java.lang.String str35 = documentType26.attr("#doctype");
        org.jsoup.nodes.Node node36 = documentType26.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node11.before((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.toString();
        java.lang.String str17 = node15.toString();
        node15.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document20 = node15.ownerDocument();
        java.lang.String str22 = node15.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        documentType16.setBaseUri("<!DOCTYPE html>");
        java.lang.String str36 = documentType16.outerHtml();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType16.outerHtmlTail(stringBuilder37, (int) (short) 0, outputSettings39);
        org.jsoup.nodes.Document document41 = documentType16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document41.setBaseUri("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document41);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        org.jsoup.nodes.Node node17 = documentType11.parent();
        org.jsoup.nodes.Document document18 = documentType11.ownerDocument();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        org.jsoup.nodes.Attributes attributes25 = documentType23.attributes();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        org.jsoup.nodes.Node node33 = documentType30.parent();
        documentType30.setBaseUri("");
        java.lang.String str36 = documentType30.toString();
        boolean boolean37 = documentType23.equals((java.lang.Object) documentType30);
        boolean boolean38 = documentType11.equals((java.lang.Object) documentType23);
        java.lang.String str40 = documentType23.absUrl("hi!");
        java.lang.String str41 = documentType23.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.before((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html hi!\">" + "'", str5, "<!DOCTYPE html hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html hi!\">" + "'", str6, "<!DOCTYPE html hi!\">");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html>" + "'", str41, "<!DOCTYPE html>");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str19 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node13.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes16 = documentType4.attributes();
        java.lang.String str17 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.outerHtml();
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.String str15 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Document document27 = documentType19.ownerDocument();
        documentType19.setBaseUri("hi!");
        java.lang.String str31 = documentType19.absUrl("hi!");
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType19.outerHtmlTail(stringBuilder32, (int) ' ', outputSettings34);
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType19.outerHtmlTail(stringBuilder36, (int) (byte) 100, outputSettings38);
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) -1, outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        java.lang.Class<?> wildcardClass13 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (-1), outputSettings23);
        documentType4.setBaseUri("#doctype");
        org.jsoup.nodes.Document document27 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document27.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str7 = documentType4.toString();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        org.jsoup.nodes.Node node21 = node19.clone();
        org.jsoup.nodes.Node node22 = node19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.outerHtml();
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        java.lang.String str16 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document22 = documentType21.ownerDocument();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType27.childNodes();
        org.jsoup.nodes.Node node30 = documentType27.parent();
        documentType27.setBaseUri("");
        org.jsoup.nodes.Node node33 = documentType27.parent();
        org.jsoup.nodes.Document document34 = documentType27.ownerDocument();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int40 = documentType39.siblingIndex();
        org.jsoup.nodes.Attributes attributes41 = documentType39.attributes();
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int47 = documentType46.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = documentType46.childNodes();
        org.jsoup.nodes.Node node49 = documentType46.parent();
        documentType46.setBaseUri("");
        java.lang.String str52 = documentType46.toString();
        boolean boolean53 = documentType39.equals((java.lang.Object) documentType46);
        boolean boolean54 = documentType27.equals((java.lang.Object) documentType39);
        boolean boolean55 = documentType21.equals((java.lang.Object) documentType27);
        java.lang.String str56 = documentType21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = node15.before((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!DOCTYPE html>" + "'", str52, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        org.jsoup.nodes.Document document20 = node18.ownerDocument();
        org.jsoup.nodes.Node node23 = node18.attr("#doctype", "");
        org.jsoup.nodes.Attributes attributes24 = node23.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node14 = node9.nextSibling();
        java.lang.Class<?> wildcardClass15 = node9.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str12 = node9.attr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node7.attr("");
        java.lang.String str13 = node7.absUrl("hi!");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        java.lang.String str22 = documentType18.attr("hi!");
        java.lang.String str23 = documentType18.toString();
        java.lang.String str24 = documentType18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType18.childNodes();
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node29 = documentType18.clone();
        boolean boolean30 = node7.equals((java.lang.Object) documentType18);
        org.jsoup.nodes.Document document31 = documentType18.ownerDocument();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(document31);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "#doctype", "");
        documentType4.setBaseUri("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.String str14 = node13.baseUri();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document20 = documentType19.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.removeAttr("<!DOCTYPE html>");
        java.lang.String str25 = documentType19.absUrl("<!DOCTYPE html>");
        documentType19.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes28 = documentType19.attributes();
        documentType19.setBaseUri("");
        boolean boolean32 = documentType19.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node13.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        boolean boolean11 = documentType4.hasAttr("");
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 100, outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) 'a', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes16 = documentType4.attributes();
        java.lang.String str17 = documentType4.outerHtml();
        documentType4.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        documentType16.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType16.after("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        int int27 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int34 = documentType33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType33.childNodes();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType33.outerHtmlTail(stringBuilder36, (int) '#', outputSettings38);
        java.lang.String str40 = documentType33.baseUri();
        org.jsoup.nodes.Document document41 = documentType33.ownerDocument();
        org.jsoup.nodes.Node node42 = documentType33.parent();
        java.lang.String str44 = documentType33.attr("#doctype");
        java.lang.String str46 = documentType33.absUrl("hi!");
        boolean boolean47 = node28.equals((java.lang.Object) documentType33);
        java.lang.String str48 = documentType33.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = documentType33.wrap("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#doctype" + "'", str48, "#doctype");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node9.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.String str12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        java.lang.String str24 = documentType17.baseUri();
        org.jsoup.nodes.Node node27 = documentType17.attr("hi!", "hi!");
        int int28 = node27.siblingIndex();
        org.jsoup.nodes.Node node29 = node27.clone();
        node27.setBaseUri("#doctype");
        java.lang.String str32 = node27.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.before(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str32 = documentType16.nodeName();
        org.jsoup.nodes.Node node35 = documentType16.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        java.lang.String str36 = node35.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.parent();
        java.lang.String str21 = node18.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int22 = node18.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.String str16 = documentType9.baseUri();
        org.jsoup.nodes.Node node19 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node19.clone();
        java.lang.String str21 = node19.outerHtml();
        org.jsoup.nodes.Node node24 = node19.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node25 = node24.clone();
        boolean boolean26 = documentType4.equals((java.lang.Object) node25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node25.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        org.jsoup.nodes.Node node21 = documentType4.clone();
        org.jsoup.nodes.Node node22 = node21.nextSibling();
        org.jsoup.nodes.Node node24 = node21.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean26 = node21.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        java.lang.String str15 = documentType4.attr("#doctype");
        java.lang.String str17 = documentType4.absUrl("hi!");
        java.lang.String str19 = documentType4.attr("");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType24.outerHtmlTail(stringBuilder27, (int) (short) 100, outputSettings29);
        org.jsoup.nodes.Node node32 = documentType24.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node33 = node32.clone();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int39 = documentType38.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = documentType38.childNodes();
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        documentType38.outerHtmlTail(stringBuilder41, (int) '#', outputSettings43);
        java.lang.String str45 = documentType38.baseUri();
        org.jsoup.nodes.Node node48 = documentType38.attr("hi!", "hi!");
        java.lang.String str49 = documentType38.baseUri();
        org.jsoup.nodes.Node node50 = documentType38.parent();
        boolean boolean51 = node33.equals((java.lang.Object) node50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = documentType4.before(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        java.lang.Class<?> wildcardClass5 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType25.outerHtmlTail(stringBuilder28, (int) '#', outputSettings30);
        java.lang.String str32 = documentType25.baseUri();
        org.jsoup.nodes.Node node35 = documentType25.attr("hi!", "hi!");
        org.jsoup.nodes.Node node36 = node35.clone();
        java.lang.String str37 = node35.outerHtml();
        org.jsoup.nodes.Node node40 = node35.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node41 = node40.clone();
        boolean boolean42 = documentType20.equals((java.lang.Object) node41);
        node41.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node15.after(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType15.outerHtmlTail(stringBuilder18, (int) '#', outputSettings20);
        java.lang.String str22 = documentType15.baseUri();
        org.jsoup.nodes.Document document23 = documentType15.ownerDocument();
        boolean boolean24 = documentType4.equals((java.lang.Object) document23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = document23.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        org.jsoup.nodes.Attributes attributes21 = documentType19.attributes();
        java.lang.String str23 = documentType19.attr("hi!");
        org.jsoup.nodes.Node node24 = documentType19.clone();
        org.jsoup.nodes.Node node26 = node24.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node14.after(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.clone();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        java.lang.String str20 = node11.toString();
        java.lang.String str22 = node11.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node20 = node19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node19.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node16 = node11.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node17 = node16.parent();
        org.jsoup.nodes.Attributes attributes18 = node16.attributes();
        java.lang.String str20 = node16.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        org.jsoup.nodes.Node node28 = documentType25.parent();
        documentType25.setBaseUri("");
        org.jsoup.nodes.Node node31 = documentType25.parent();
        org.jsoup.nodes.Document document32 = documentType25.ownerDocument();
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int38 = documentType37.siblingIndex();
        org.jsoup.nodes.Attributes attributes39 = documentType37.attributes();
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int45 = documentType44.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = documentType44.childNodes();
        org.jsoup.nodes.Node node47 = documentType44.parent();
        documentType44.setBaseUri("");
        java.lang.String str50 = documentType44.toString();
        boolean boolean51 = documentType37.equals((java.lang.Object) documentType44);
        boolean boolean52 = documentType25.equals((java.lang.Object) documentType37);
        java.lang.String str54 = documentType37.absUrl("hi!");
        documentType37.setBaseUri("<!DOCTYPE html>");
        java.lang.String str57 = documentType37.outerHtml();
        java.lang.StringBuilder stringBuilder58 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = null;
        documentType37.outerHtmlTail(stringBuilder58, (int) (short) 0, outputSettings60);
        org.jsoup.nodes.Document document62 = documentType37.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = node16.before((org.jsoup.nodes.Node) documentType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE html>" + "'", str50, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!DOCTYPE html>" + "'", str57, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document62);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str10 = documentType9.toString();
        java.lang.String str11 = documentType9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType9.childNodes();
        java.lang.String str14 = documentType9.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str10, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node19.attributes();
        node19.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node23 = node19.parent();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Attributes attributes29 = documentType28.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = node23.equals((java.lang.Object) attributes29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        documentType16.setBaseUri("<!DOCTYPE html>");
        java.lang.String str37 = documentType16.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "hi!");
        java.lang.String str21 = node19.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        org.jsoup.nodes.Node node17 = documentType4.parent();
        documentType4.setBaseUri("#doctype");
        java.lang.String str21 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        int int14 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.jsoup.nodes.Node node18 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        java.lang.String str7 = documentType4.nodeName();
        int int8 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 1, outputSettings11);
        java.lang.String str14 = documentType4.absUrl("hi!");
        java.lang.Class<?> wildcardClass15 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        org.jsoup.nodes.Node node20 = node18.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.toString();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str14 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str20 = documentType19.toString();
        java.lang.String str21 = documentType19.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        int int21 = documentType18.siblingIndex();
        org.jsoup.nodes.Node node22 = documentType18.nextSibling();
        boolean boolean23 = node13.equals((java.lang.Object) node22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList24 = node22.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int13 = documentType12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType12.childNodes();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType12.outerHtmlTail(stringBuilder15, (int) '#', outputSettings17);
        java.lang.String str19 = documentType12.baseUri();
        org.jsoup.nodes.Document document20 = documentType12.ownerDocument();
        boolean boolean22 = documentType12.hasAttr("hi!");
        org.jsoup.nodes.Node node23 = documentType12.nextSibling();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType12.outerHtmlTail(stringBuilder24, 1, outputSettings26);
        java.lang.String str29 = documentType12.attr("<!DOCTYPE html>");
        int int30 = documentType12.siblingIndex();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType12.outerHtmlTail(stringBuilder31, (int) (byte) 0, outputSettings33);
        java.lang.String str35 = documentType12.toString();
        documentType12.setBaseUri("#doctype");
        boolean boolean39 = documentType12.hasAttr("hi!");
        boolean boolean40 = documentType4.equals((java.lang.Object) "hi!");
        java.lang.String str41 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE html>" + "'", str35, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html>" + "'", str41, "<!DOCTYPE html>");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        int int15 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        org.jsoup.nodes.Node node12 = documentType9.parent();
        documentType9.setBaseUri("");
        java.lang.String str15 = documentType9.toString();
        boolean boolean17 = documentType9.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node20 = documentType9.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = node20.outerHtml();
        org.jsoup.nodes.Node node22 = node20.parent();
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        org.jsoup.nodes.Node node25 = node20.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node20.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.toString();
        java.lang.String str17 = node15.toString();
        org.jsoup.nodes.Node node20 = node15.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node21 = node15.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node15.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        java.lang.String str21 = documentType19.toString();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType19);
        int int23 = documentType19.siblingIndex();
        int int24 = documentType19.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType19.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str21, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType18.outerHtmlTail(stringBuilder21, (int) '#', outputSettings23);
        java.lang.String str25 = documentType18.baseUri();
        org.jsoup.nodes.Node node28 = documentType18.attr("hi!", "hi!");
        org.jsoup.nodes.Node node29 = node28.clone();
        int int30 = node28.siblingIndex();
        org.jsoup.nodes.Node node33 = node28.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes34 = node33.attributes();
        node33.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node37 = node33.parent();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str43 = documentType42.toString();
        java.lang.String str45 = documentType42.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean46 = node33.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str43, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = node15.attributes();
        java.lang.String str19 = node15.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) -1, outputSettings7);
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE html #doctype\">");
        boolean boolean16 = documentType4.equals((java.lang.Object) "<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html>");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.jsoup.nodes.Node node20 = node16.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node16.after("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        int int17 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType22.outerHtmlTail(stringBuilder25, (int) '#', outputSettings27);
        java.lang.String str29 = documentType22.baseUri();
        org.jsoup.nodes.Node node32 = documentType22.attr("hi!", "hi!");
        org.jsoup.nodes.Node node33 = node32.clone();
        java.lang.String str34 = node33.toString();
        node33.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType4.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.baseUri();
        java.lang.String str19 = documentType4.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = node13.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        org.jsoup.nodes.Node node17 = documentType14.parent();
        documentType14.setBaseUri("");
        org.jsoup.nodes.Node node21 = documentType14.removeAttr("hi!");
        boolean boolean23 = node21.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node25 = node21.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = node9.equals((java.lang.Object) node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node21 = documentType4.clone();
        java.lang.String str23 = node21.attr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str24 = node21.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.String str14 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node18 = node16.clone();
        int int19 = node18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "#doctype", "<!DOCTYPE html hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("");
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.String str18 = documentType15.baseUri();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType15.outerHtmlTail(stringBuilder19, (int) (byte) 0, outputSettings21);
        boolean boolean24 = documentType15.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType15.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (-1), outputSettings18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        node14.setBaseUri("");
        org.jsoup.nodes.Node node18 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        boolean boolean17 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        node14.setBaseUri("");
        org.jsoup.nodes.Node node18 = node14.nextSibling();
        org.jsoup.nodes.Node node19 = node14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node14.wrap("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node15.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = documentType10.attributes();
        java.lang.String str13 = documentType10.outerHtml();
        org.jsoup.nodes.Node node15 = documentType10.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType20.outerHtmlTail(stringBuilder23, (int) '#', outputSettings25);
        java.lang.String str27 = documentType20.baseUri();
        java.lang.String str28 = documentType20.toString();
        boolean boolean30 = documentType20.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean31 = documentType10.equals((java.lang.Object) boolean30);
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int37 = documentType36.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType36.childNodes();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType36.outerHtmlTail(stringBuilder39, (int) '#', outputSettings41);
        java.lang.String str43 = documentType36.baseUri();
        org.jsoup.nodes.Document document44 = documentType36.ownerDocument();
        documentType36.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        documentType36.outerHtmlTail(stringBuilder47, 1, outputSettings49);
        boolean boolean51 = documentType10.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "hi!", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node19 = documentType17.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean20 = node12.equals((java.lang.Object) node19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node19.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        node20.setBaseUri("");
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        java.lang.String str25 = node20.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node20.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        int int9 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node12 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = node12.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node12.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = documentType4.clone();
        java.lang.String str16 = documentType4.attr("#doctype");
        java.lang.String str17 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.baseUri();
        org.jsoup.nodes.Node node12 = node9.parent();
        boolean boolean14 = node9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node24 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!");
        org.jsoup.nodes.Node node26 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document27 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder28, (int) ' ', outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        org.jsoup.nodes.Document document23 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document23.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.nodes.Node node14 = documentType9.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType9.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType9.childNodes();
        boolean boolean17 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) (short) 100, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        org.jsoup.nodes.Node node21 = node19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node19.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node19.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        org.jsoup.nodes.Node node23 = documentType20.parent();
        org.jsoup.nodes.Node node24 = documentType20.nextSibling();
        boolean boolean26 = documentType20.hasAttr("hi!");
        org.jsoup.nodes.Node node27 = documentType20.clone();
        java.lang.String str29 = documentType20.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node30 = documentType20.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node15 = node14.parent();
        java.lang.String str16 = node14.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (short) 1, outputSettings25);
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int32 = documentType31.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType31.childNodes();
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType31.outerHtmlTail(stringBuilder34, (int) '#', outputSettings36);
        java.lang.String str38 = documentType31.baseUri();
        org.jsoup.nodes.Node node41 = documentType31.attr("hi!", "hi!");
        org.jsoup.nodes.Node node42 = node41.clone();
        java.lang.String str43 = node42.outerHtml();
        org.jsoup.nodes.Node node44 = node42.clone();
        org.jsoup.nodes.Document document45 = node44.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType4.after((org.jsoup.nodes.Node) document45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE html>" + "'", str43, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(document45);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType18.outerHtmlTail(stringBuilder21, (int) '#', outputSettings23);
        java.lang.String str25 = documentType18.baseUri();
        org.jsoup.nodes.Document document26 = documentType18.ownerDocument();
        boolean boolean28 = documentType18.hasAttr("hi!");
        org.jsoup.nodes.Node node29 = documentType18.nextSibling();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType18.outerHtmlTail(stringBuilder30, 1, outputSettings32);
        java.lang.String str35 = documentType18.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node36 = documentType18.parent();
        org.jsoup.nodes.Document document37 = documentType18.ownerDocument();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int43 = documentType42.siblingIndex();
        org.jsoup.nodes.Node node44 = documentType42.parent();
        org.jsoup.nodes.Node node45 = documentType42.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = documentType42.childNodes();
        boolean boolean47 = documentType18.equals((java.lang.Object) nodeList46);
        org.jsoup.nodes.Node node50 = documentType18.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">");
        java.lang.String str51 = documentType18.nodeName();
        boolean boolean52 = node13.equals((java.lang.Object) documentType18);
        java.lang.String str54 = node13.attr("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#doctype" + "'", str51, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int15 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType21.outerHtmlTail(stringBuilder24, (int) '#', outputSettings26);
        java.lang.String str28 = documentType21.baseUri();
        org.jsoup.nodes.Document document29 = documentType21.ownerDocument();
        boolean boolean31 = documentType21.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = documentType21.nextSibling();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType21.outerHtmlTail(stringBuilder33, 1, outputSettings35);
        java.lang.String str38 = documentType21.attr("<!DOCTYPE html>");
        int int39 = documentType21.siblingIndex();
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int45 = documentType44.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = documentType44.childNodes();
        org.jsoup.nodes.Node node47 = documentType44.parent();
        documentType44.setBaseUri("");
        org.jsoup.nodes.Node node51 = documentType44.removeAttr("hi!");
        boolean boolean52 = documentType21.equals((java.lang.Object) documentType44);
        java.lang.String str54 = documentType21.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node57 = documentType21.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = node16.after(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str18 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node21 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, (int) (short) 10, outputSettings24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.toString();
        java.lang.String str17 = node15.toString();
        org.jsoup.nodes.Node node20 = node15.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType25.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        org.jsoup.nodes.Node node31 = documentType25.parent();
        java.lang.String str32 = documentType25.nodeName();
        org.jsoup.nodes.Node node35 = documentType25.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node37 = documentType25.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean38 = node20.equals((java.lang.Object) documentType25);
        java.lang.Class<?> wildcardClass39 = documentType25.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node20 = node19.clone();
        org.jsoup.nodes.Node node21 = node20.clone();
        java.lang.String str23 = node20.attr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node20.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        java.lang.String str18 = documentType4.toString();
        java.lang.String str19 = documentType4.nodeName();
        java.lang.String str20 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (short) 100, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document15 = documentType14.ownerDocument();
        documentType14.setBaseUri("#doctype");
        boolean boolean18 = documentType4.equals((java.lang.Object) "#doctype");
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        node9.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document18 = documentType17.ownerDocument();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.nodes.Node node22 = documentType17.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean24 = documentType17.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType17.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType15.outerHtmlTail(stringBuilder18, (int) '#', outputSettings20);
        java.lang.String str22 = documentType15.baseUri();
        org.jsoup.nodes.Node node25 = documentType15.attr("hi!", "hi!");
        org.jsoup.nodes.Node node26 = node25.clone();
        org.jsoup.nodes.Node node29 = node26.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str30 = node26.outerHtml();
        org.jsoup.nodes.Node node31 = node26.nextSibling();
        boolean boolean32 = documentType4.equals((java.lang.Object) node31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = node31.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.String str15 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        int int11 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) 'a', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("");
        documentType4.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType27.childNodes();
        org.jsoup.nodes.Node node30 = documentType27.parent();
        documentType27.setBaseUri("");
        org.jsoup.nodes.Node node34 = documentType27.removeAttr("hi!");
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType27);
        java.lang.String str37 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node40 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node41 = node40.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node41.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 1, outputSettings17);
        org.jsoup.nodes.Node node20 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        boolean boolean22 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType27.childNodes();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType27.outerHtmlTail(stringBuilder30, (int) '#', outputSettings32);
        java.lang.String str34 = documentType27.baseUri();
        org.jsoup.nodes.Document document35 = documentType27.ownerDocument();
        boolean boolean37 = documentType27.hasAttr("hi!");
        org.jsoup.nodes.Node node38 = documentType27.nextSibling();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType27.outerHtmlTail(stringBuilder39, 1, outputSettings41);
        java.lang.String str44 = documentType27.attr("<!DOCTYPE html>");
        int int45 = documentType27.siblingIndex();
        java.lang.StringBuilder stringBuilder46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        documentType27.outerHtmlTail(stringBuilder46, (int) (byte) 0, outputSettings48);
        java.lang.String str50 = documentType27.toString();
        documentType27.setBaseUri("#doctype");
        boolean boolean54 = documentType27.hasAttr("hi!");
        org.jsoup.nodes.Node node55 = documentType27.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE html>" + "'", str50, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node18 = node16.clone();
        java.lang.String str19 = node18.outerHtml();
        java.lang.String str20 = node18.outerHtml();
        int int21 = node18.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.Class<?> wildcardClass12 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.after("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node22 = documentType4.parent();
        org.jsoup.nodes.Document document23 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        org.jsoup.nodes.Node node30 = documentType28.parent();
        org.jsoup.nodes.Node node31 = documentType28.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType28.childNodes();
        boolean boolean33 = documentType4.equals((java.lang.Object) nodeList32);
        boolean boolean35 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node38 = documentType4.attr("<!DOCTYPE html>", "");
        boolean boolean40 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node41 = documentType4.clone();
        boolean boolean43 = node41.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html>" + "'", str5, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 1, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str7, "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean19 = documentType11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node22 = documentType11.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str23 = documentType11.baseUri();
        org.jsoup.nodes.Node node24 = documentType11.parent();
        documentType11.setBaseUri("#doctype");
        org.jsoup.nodes.Node node29 = documentType11.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html>");
        boolean boolean30 = node5.equals((java.lang.Object) documentType11);
        java.lang.String str32 = node5.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) (byte) 0, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        java.lang.String str21 = documentType14.baseUri();
        java.lang.String str22 = documentType14.toString();
        boolean boolean24 = documentType14.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean25 = documentType4.equals((java.lang.Object) boolean24);
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType30.outerHtmlTail(stringBuilder33, (int) '#', outputSettings35);
        java.lang.String str37 = documentType30.baseUri();
        org.jsoup.nodes.Document document38 = documentType30.ownerDocument();
        documentType30.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        documentType30.outerHtmlTail(stringBuilder41, 1, outputSettings43);
        boolean boolean45 = documentType4.equals((java.lang.Object) 1);
        org.jsoup.nodes.Node node46 = documentType4.parent();
        java.lang.StringBuilder stringBuilder47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder47, (int) '#', outputSettings49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">" + "'", str10, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        java.lang.String str15 = node14.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        java.lang.String str12 = node10.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.Class<?> wildcardClass13 = node10.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document18 = documentType17.ownerDocument();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.nodes.Node node22 = documentType17.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean24 = documentType17.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str25 = documentType17.baseUri();
        java.lang.String str26 = documentType17.outerHtml();
        org.jsoup.nodes.Node node28 = documentType17.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node28.childNodes();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node37 = documentType34.attr("hi!", "hi!");
        org.jsoup.nodes.Node node39 = node37.removeAttr("hi!");
        node39.setBaseUri("");
        org.jsoup.nodes.Document document42 = node39.ownerDocument();
        boolean boolean43 = node28.equals((java.lang.Object) document42);
        boolean boolean44 = documentType9.equals((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        org.jsoup.nodes.Attributes attributes20 = documentType18.attributes();
        boolean boolean22 = documentType18.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType18.nextSibling();
        java.lang.String str25 = documentType18.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType18.childNodes();
        org.jsoup.nodes.Document document27 = documentType18.ownerDocument();
        documentType18.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) 10, outputSettings17);
        org.jsoup.nodes.Node node19 = documentType4.clone();
        java.lang.String str21 = node19.absUrl("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node19.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        documentType18.setBaseUri("");
        org.jsoup.nodes.Node node25 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str32 = documentType30.attr("");
        int int33 = documentType30.siblingIndex();
        boolean boolean34 = node25.equals((java.lang.Object) documentType30);
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType30);
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType40.childNodes();
        org.jsoup.nodes.Node node43 = documentType40.parent();
        documentType40.setBaseUri("");
        org.jsoup.nodes.Node node47 = documentType40.removeAttr("hi!");
        boolean boolean49 = node47.hasAttr("<!DOCTYPE html>");
        node47.setBaseUri("hi!");
        int int52 = node47.siblingIndex();
        org.jsoup.nodes.Node node53 = node47.clone();
        int int54 = node53.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = documentType30.before(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        int int13 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        documentType18.setBaseUri("");
        org.jsoup.nodes.Node node24 = documentType18.parent();
        java.lang.String str26 = documentType18.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        java.lang.String str20 = documentType17.outerHtml();
        org.jsoup.nodes.Node node22 = documentType17.removeAttr("hi!");
        java.lang.String str23 = documentType17.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node12.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.Object obj12 = null;
        boolean boolean13 = documentType4.equals(obj12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        int int11 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.lang.String str17 = documentType14.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType14.outerHtmlTail(stringBuilder18, 10, outputSettings20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document9.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType18.outerHtmlTail(stringBuilder20, 10, outputSettings22);
        org.jsoup.nodes.Node node24 = documentType18.parent();
        java.lang.String str25 = documentType18.nodeName();
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node29 = documentType18.nextSibling();
        boolean boolean30 = documentType13.equals((java.lang.Object) documentType18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str11 = documentType4.attr("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (short) 100, outputSettings17);
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        org.jsoup.nodes.Node node24 = documentType23.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.childNodes();
        boolean boolean26 = documentType4.equals((java.lang.Object) node24);
        org.jsoup.nodes.Node node27 = node24.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 10, outputSettings14);
        boolean boolean17 = documentType4.hasAttr("hi!");
        java.lang.String str19 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str20 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.after("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Node node29 = documentType19.attr("hi!", "hi!");
        org.jsoup.nodes.Node node30 = node29.clone();
        int int31 = node29.siblingIndex();
        boolean boolean32 = documentType9.equals((java.lang.Object) int31);
        java.lang.Class<?> wildcardClass33 = documentType9.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        boolean boolean12 = documentType4.equals((java.lang.Object) attributes11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int17 = documentType9.siblingIndex();
        java.lang.String str18 = documentType9.outerHtml();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        int int14 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str20 = documentType4.outerHtml();
        java.lang.String str21 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) ' ', outputSettings19);
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (int) (byte) 100, outputSettings23);
        org.jsoup.nodes.Node node25 = documentType4.nextSibling();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node29 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document30 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        int int15 = node14.siblingIndex();
        org.jsoup.nodes.Node node16 = node14.clone();
        node14.setBaseUri("#doctype");
        org.jsoup.nodes.Node node21 = node14.attr("#doctype", "#doctype");
        java.lang.String str22 = node21.baseUri();
        org.jsoup.nodes.Node node25 = node21.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.parent();
        org.jsoup.nodes.Node node20 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
        java.lang.String str15 = node12.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        org.jsoup.nodes.Node node18 = documentType11.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str25 = documentType23.attr("");
        int int26 = documentType23.siblingIndex();
        boolean boolean27 = node18.equals((java.lang.Object) documentType23);
        boolean boolean28 = documentType4.equals((java.lang.Object) boolean27);
        boolean boolean30 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.toString();
        java.lang.String str17 = node15.toString();
        org.jsoup.nodes.Node node20 = node15.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node21 = node15.clone();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        org.jsoup.nodes.Attributes attributes28 = documentType26.attributes();
        boolean boolean30 = documentType26.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        boolean boolean36 = documentType26.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str37 = documentType26.nodeName();
        org.jsoup.nodes.Node node39 = documentType26.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node21.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#doctype" + "'", str37, "#doctype");
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "");
        boolean boolean15 = documentType4.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        int int15 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) (byte) 1, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        java.lang.String str21 = documentType19.toString();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType19);
        int int23 = documentType19.siblingIndex();
        int int24 = documentType19.siblingIndex();
        java.lang.String str25 = documentType19.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str21, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str25, "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node20 = node19.clone();
        org.jsoup.nodes.Node node21 = node20.clone();
        java.lang.String str23 = node20.attr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node26 = node20.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document32 = documentType31.ownerDocument();
        org.jsoup.nodes.Attributes attributes33 = documentType31.attributes();
        org.jsoup.nodes.Node node35 = documentType31.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node36 = documentType31.clone();
        java.lang.String str37 = documentType31.baseUri();
        boolean boolean39 = documentType31.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node41 = documentType31.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node44 = documentType31.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node26.after(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str5 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        int int16 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        org.jsoup.nodes.Document document19 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        org.jsoup.nodes.Node node21 = documentType4.clone();
        org.jsoup.nodes.Node node22 = node21.nextSibling();
        org.jsoup.nodes.Document document23 = node21.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node21.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node17 = documentType14.attr("hi!", "hi!");
        java.lang.String str18 = node17.outerHtml();
        java.lang.String str19 = node17.baseUri();
        org.jsoup.nodes.Node node20 = node17.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = node7.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = node6.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node22 = documentType4.parent();
        org.jsoup.nodes.Document document23 = documentType4.ownerDocument();
        java.lang.String str24 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        org.jsoup.nodes.Node node12 = documentType9.parent();
        documentType9.setBaseUri("");
        java.lang.String str15 = documentType9.toString();
        boolean boolean17 = documentType9.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node20 = documentType9.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = node20.outerHtml();
        org.jsoup.nodes.Node node22 = node20.parent();
        boolean boolean23 = documentType4.equals((java.lang.Object) node20);
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node26 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        java.lang.String str17 = documentType4.absUrl("hi!");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, 0, outputSettings20);
        java.lang.String str23 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node7.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        java.lang.String str21 = documentType19.toString();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType19);
        int int23 = documentType19.siblingIndex();
        int int24 = documentType19.siblingIndex();
        java.lang.String str26 = documentType19.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str21, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        node14.setBaseUri("");
        org.jsoup.nodes.Node node18 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.String str20 = documentType4.attr("");
        java.lang.String str21 = documentType4.outerHtml();
        java.lang.String str23 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        documentType18.setBaseUri("");
        org.jsoup.nodes.Node node25 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.Node node26 = node25.parent();
        java.lang.String str27 = node25.toString();
        boolean boolean29 = node25.hasAttr("<!DOCTYPE html>");
        boolean boolean30 = documentType4.equals((java.lang.Object) node25);
        int int31 = node25.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        boolean boolean21 = documentType17.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = node6.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = node18.attr("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node20 = node19.clone();
        org.jsoup.nodes.Node node21 = node20.clone();
        java.lang.String str23 = node20.attr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node26 = node20.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node20.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node18 = node16.clone();
        java.lang.String str19 = node18.outerHtml();
        org.jsoup.nodes.Node node21 = node18.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.lang.String str22 = node18.outerHtml();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        org.jsoup.nodes.Node node20 = node11.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        org.jsoup.nodes.Node node18 = node15.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.parent();
        java.lang.String str21 = node18.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        org.jsoup.nodes.Node node29 = documentType26.parent();
        org.jsoup.nodes.Attributes attributes30 = documentType26.attributes();
        boolean boolean32 = documentType26.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        boolean boolean33 = node18.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node18.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node8.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        int int10 = documentType4.siblingIndex();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = documentType4.equals(obj11);
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str14 = node13.outerHtml();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        java.lang.String str13 = node11.toString();
        boolean boolean15 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node16 = node11.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        org.jsoup.nodes.Attributes attributes16 = documentType14.attributes();
        java.lang.String str17 = documentType14.outerHtml();
        java.lang.String str19 = documentType14.attr("<!DOCTYPE html>");
        java.lang.String str20 = documentType14.baseUri();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType14);
        org.jsoup.nodes.Node node24 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        java.lang.String str14 = documentType11.nodeName();
        java.lang.String str15 = documentType11.nodeName();
        documentType11.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 10, outputSettings13);
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node12 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.parent();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType18.outerHtmlTail(stringBuilder21, (int) '#', outputSettings23);
        java.lang.String str25 = documentType18.baseUri();
        org.jsoup.nodes.Node node28 = documentType18.attr("hi!", "hi!");
        org.jsoup.nodes.Node node29 = node28.clone();
        java.lang.String str30 = node28.outerHtml();
        org.jsoup.nodes.Node node32 = node28.removeAttr("hi!");
        org.jsoup.nodes.Node node33 = node32.parent();
        java.lang.String str35 = node32.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        org.jsoup.nodes.Document document27 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node21 = documentType18.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType18.attributes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType18.outerHtmlTail(stringBuilder23, 100, outputSettings25);
        org.jsoup.nodes.Node node27 = documentType18.clone();
        node27.setBaseUri("<!DOCTYPE html>");
        boolean boolean31 = node27.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str32 = node27.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.after(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Node node29 = documentType19.attr("hi!", "hi!");
        org.jsoup.nodes.Node node30 = node29.clone();
        int int31 = node29.siblingIndex();
        boolean boolean32 = documentType9.equals((java.lang.Object) int31);
        java.lang.String str34 = documentType9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str15 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        int int27 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int34 = documentType33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType33.childNodes();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType33.outerHtmlTail(stringBuilder36, (int) '#', outputSettings38);
        java.lang.String str40 = documentType33.baseUri();
        org.jsoup.nodes.Document document41 = documentType33.ownerDocument();
        org.jsoup.nodes.Node node42 = documentType33.parent();
        java.lang.String str44 = documentType33.attr("#doctype");
        java.lang.String str46 = documentType33.absUrl("hi!");
        boolean boolean47 = node28.equals((java.lang.Object) documentType33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node28.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 1, outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) '#', outputSettings21);
        java.lang.String str23 = documentType16.baseUri();
        org.jsoup.nodes.Node node26 = documentType16.attr("hi!", "hi!");
        org.jsoup.nodes.Node node27 = node26.clone();
        int int28 = node26.siblingIndex();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int34 = documentType33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType33.childNodes();
        org.jsoup.nodes.Node node36 = documentType33.parent();
        documentType33.setBaseUri("");
        java.lang.String str39 = documentType33.toString();
        boolean boolean41 = documentType33.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document42 = documentType33.ownerDocument();
        boolean boolean43 = node26.equals((java.lang.Object) documentType33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = documentType4.after(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str7, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE html>" + "'", str39, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        java.lang.String str21 = documentType4.toString();
        org.jsoup.nodes.Document document22 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = document22.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node20 = documentType17.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes21 = node20.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node12.equals((java.lang.Object) attributes21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str14 = documentType4.toString();
        java.lang.String str15 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.toString();
        int int7 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node14.childNodes();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document23 = documentType22.ownerDocument();
        org.jsoup.nodes.Attributes attributes24 = documentType22.attributes();
        org.jsoup.nodes.Node node26 = documentType22.removeAttr("<!DOCTYPE html>");
        java.lang.String str27 = documentType22.baseUri();
        org.jsoup.nodes.Node node30 = documentType22.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        java.lang.String str31 = documentType22.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node14.after((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        org.jsoup.nodes.Node node18 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node20 = node19.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node19.attributes();
        java.lang.String str21 = node19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node19.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        int int27 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType4.clone();
        java.lang.String str29 = node28.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node28.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        int int14 = node7.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        int int14 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) (short) 100, outputSettings14);
        org.jsoup.nodes.Node node16 = documentType9.parent();
        java.lang.String str17 = documentType9.toString();
        org.jsoup.nodes.Node node19 = documentType9.removeAttr("hi!");
        org.jsoup.nodes.Node node21 = node19.removeAttr("#doctype");
        org.jsoup.nodes.Node node22 = node21.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str10 = documentType9.toString();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType9.outerHtmlTail(stringBuilder11, (int) (byte) 100, outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str10, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str8 = node7.outerHtml();
        java.lang.String str9 = node7.baseUri();
        org.jsoup.nodes.Node node10 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str19 = documentType4.nodeName();
        java.lang.String str20 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, 0, outputSettings23);
        org.jsoup.nodes.Node node25 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        int int19 = documentType16.siblingIndex();
        boolean boolean20 = node11.equals((java.lang.Object) documentType16);
        int int21 = node11.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean22 = documentType20.hasAttr("<!DOCTYPE html>");
        java.lang.String str24 = documentType20.attr("#doctype");
        java.lang.String str25 = documentType20.outerHtml();
        org.jsoup.nodes.Node node28 = documentType20.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str19 = documentType4.attr("#doctype");
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        int int22 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str7 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("#doctype");
        java.lang.String str18 = node17.baseUri();
        java.lang.String str19 = node17.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass17 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        org.jsoup.nodes.Node node21 = documentType17.nextSibling();
        boolean boolean23 = documentType17.hasAttr("hi!");
        boolean boolean24 = node11.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node25 = node11.nextSibling();
        org.jsoup.nodes.Node node28 = node11.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str29 = node28.outerHtml();
        org.jsoup.nodes.Node node30 = node28.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html>");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node32 = documentType4.clone();
        org.jsoup.nodes.Node node35 = node32.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        java.lang.String str15 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) ' ', outputSettings19);
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (int) (byte) 100, outputSettings23);
        org.jsoup.nodes.Node node25 = documentType4.nextSibling();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node29 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str30 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        int int20 = node19.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass5 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node7.attr("");
        java.lang.String str13 = node7.absUrl("hi!");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        java.lang.String str22 = documentType18.attr("hi!");
        java.lang.String str23 = documentType18.toString();
        java.lang.String str24 = documentType18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType18.childNodes();
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node29 = documentType18.clone();
        boolean boolean30 = node7.equals((java.lang.Object) documentType18);
        org.jsoup.nodes.Node node33 = documentType18.attr("hi!", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Attributes attributes34 = documentType18.attributes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(attributes34);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        boolean boolean17 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        boolean boolean19 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.jsoup.nodes.Document document20 = documentType4.ownerDocument();
        java.lang.String str21 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        int int8 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        boolean boolean12 = documentType4.equals((java.lang.Object) attributes11);
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (short) 1, outputSettings15);
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE html hi!\">");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.clone();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node16 = node11.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node17 = node16.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str13 = documentType9.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("#doctype");
        java.lang.String str18 = node17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node17.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        org.jsoup.nodes.Attributes attributes19 = node11.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        int int16 = node15.siblingIndex();
        java.lang.String str18 = node15.attr("");
        java.lang.String str20 = node15.absUrl("<!DOCTYPE html>");
        java.lang.String str21 = node15.outerHtml();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        org.jsoup.nodes.Node node29 = documentType26.parent();
        documentType26.setBaseUri("");
        org.jsoup.nodes.Node node33 = documentType26.removeAttr("hi!");
        boolean boolean35 = node33.hasAttr("<!DOCTYPE html>");
        node33.setBaseUri("hi!");
        int int38 = node33.siblingIndex();
        org.jsoup.nodes.Node node39 = node33.clone();
        java.lang.String str40 = node33.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = node33.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!DOCTYPE html>" + "'", str40, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str22 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (short) 0, outputSettings25);
        int int27 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.toString();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Attributes attributes23 = documentType21.attributes();
        boolean boolean25 = documentType21.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType21.nextSibling();
        java.lang.String str28 = documentType21.absUrl("hi!");
        int int29 = documentType21.siblingIndex();
        java.lang.String str30 = documentType21.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType21.childNodes();
        boolean boolean32 = node15.equals((java.lang.Object) nodeList31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node7.attr("");
        java.lang.String str13 = node7.absUrl("hi!");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        java.lang.String str22 = documentType18.attr("hi!");
        java.lang.String str23 = documentType18.toString();
        java.lang.String str24 = documentType18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType18.childNodes();
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node29 = documentType18.clone();
        boolean boolean30 = node7.equals((java.lang.Object) documentType18);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node7.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node7.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html #doctype\">");
        node9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        int int16 = node14.siblingIndex();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = node14.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node23 = node14.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node24 = node14.parent();
        java.lang.String str25 = node14.toString();
        org.jsoup.nodes.Node node26 = node14.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        boolean boolean12 = documentType4.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node8.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        java.lang.String str18 = node15.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node15.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str22 = documentType4.baseUri();
        org.jsoup.nodes.Node node24 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean26 = node24.hasAttr("");
        org.jsoup.nodes.Document document27 = node24.ownerDocument();
        org.jsoup.nodes.Attributes attributes28 = node24.attributes();
        org.jsoup.nodes.Attributes attributes29 = node24.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.toString();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (-1), outputSettings13);
        int int15 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.baseUri();
        org.jsoup.nodes.Node node20 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodes();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int30 = documentType29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType29.childNodes();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType29.outerHtmlTail(stringBuilder32, (int) '#', outputSettings34);
        java.lang.String str36 = documentType29.baseUri();
        org.jsoup.nodes.Node node39 = documentType29.attr("hi!", "hi!");
        java.lang.String str40 = documentType29.baseUri();
        boolean boolean42 = documentType29.hasAttr("<!DOCTYPE html hi!\">");
        java.lang.String str43 = documentType29.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith((org.jsoup.nodes.Node) documentType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        org.jsoup.nodes.Document document20 = node18.ownerDocument();
        org.jsoup.nodes.Node node23 = node18.attr("#doctype", "");
        org.jsoup.nodes.Node node24 = node23.nextSibling();
        org.jsoup.nodes.Node node25 = node23.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (-1), outputSettings9);
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document16 = documentType15.ownerDocument();
        documentType15.setBaseUri("#doctype");
        org.jsoup.nodes.Document document19 = documentType15.ownerDocument();
        java.lang.String str21 = documentType15.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str12 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE html>", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        boolean boolean21 = node18.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        org.jsoup.nodes.Node node34 = documentType16.parent();
        java.lang.String str35 = documentType16.baseUri();
        java.lang.String str36 = documentType16.toString();
        org.jsoup.nodes.DocumentType documentType41 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType16.before((org.jsoup.nodes.Node) documentType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType27.childNodes();
        org.jsoup.nodes.Node node30 = documentType27.parent();
        documentType27.setBaseUri("");
        org.jsoup.nodes.Node node34 = documentType27.removeAttr("hi!");
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType27.wrap("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.String str16 = documentType9.baseUri();
        org.jsoup.nodes.Node node19 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node20 = node19.clone();
        java.lang.String str21 = node19.outerHtml();
        org.jsoup.nodes.Node node24 = node19.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node25 = node24.clone();
        boolean boolean26 = documentType4.equals((java.lang.Object) node25);
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int32 = documentType31.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType31.childNodes();
        org.jsoup.nodes.Node node34 = documentType31.parent();
        org.jsoup.nodes.Node node35 = documentType31.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.clone();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType22.outerHtmlTail(stringBuilder25, (int) '#', outputSettings27);
        java.lang.String str29 = documentType22.baseUri();
        org.jsoup.nodes.Node node32 = documentType22.attr("hi!", "hi!");
        org.jsoup.nodes.Node node33 = node32.clone();
        int int34 = node32.siblingIndex();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int40 = documentType39.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType39.childNodes();
        org.jsoup.nodes.Node node42 = documentType39.parent();
        documentType39.setBaseUri("");
        java.lang.String str45 = documentType39.toString();
        boolean boolean47 = documentType39.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document48 = documentType39.ownerDocument();
        boolean boolean49 = node32.equals((java.lang.Object) documentType39);
        boolean boolean50 = node15.equals((java.lang.Object) documentType39);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = node15.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!DOCTYPE html>" + "'", str45, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(document48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node21 = documentType4.clone();
        java.lang.String str23 = node21.attr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str24 = node21.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str7 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        documentType18.setBaseUri("");
        java.lang.String str24 = documentType18.toString();
        org.jsoup.nodes.Node node26 = documentType18.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str27 = documentType18.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node13.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.childNodes();
        org.jsoup.nodes.Node node23 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType4.childNodes();
        java.lang.Class<?> wildcardClass25 = nodeList24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node15 = node14.parent();
        // The following exception was thrown during execution in test generation
        try {
            node15.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        java.lang.String str14 = node7.baseUri();
        node7.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node7.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.lang.String str17 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.wrap("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        int int9 = documentType4.siblingIndex();
        java.lang.Class<?> wildcardClass10 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        java.lang.String str24 = documentType17.baseUri();
        org.jsoup.nodes.Node node27 = documentType17.attr("hi!", "hi!");
        org.jsoup.nodes.Node node29 = documentType17.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = node13.clone();
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType11.outerHtmlTail(stringBuilder14, (int) '#', outputSettings16);
        java.lang.String str18 = documentType11.baseUri();
        org.jsoup.nodes.Node node21 = documentType11.attr("hi!", "hi!");
        org.jsoup.nodes.Node node22 = node21.clone();
        java.lang.String str23 = node21.outerHtml();
        boolean boolean24 = documentType4.equals((java.lang.Object) str23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = node7.attr("");
        java.lang.String str16 = node7.baseUri();
        org.jsoup.nodes.Node node18 = node7.removeAttr("hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.nodeName();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        int int14 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node15.toString();
        java.lang.String str17 = node15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node15.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("hi!");
        boolean boolean8 = node6.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        int int16 = node9.siblingIndex();
        java.lang.String str17 = node9.toString();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        java.lang.String str14 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        java.lang.String str12 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("hi!");
        documentType4.setBaseUri("");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType25.outerHtmlTail(stringBuilder28, (int) '#', outputSettings30);
        org.jsoup.nodes.Node node32 = documentType25.clone();
        java.lang.String str34 = documentType25.attr("#doctype");
        java.lang.String str36 = documentType25.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node39 = documentType25.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node40 = documentType25.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.String str15 = node14.baseUri();
        java.lang.String str17 = node14.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node14.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        java.lang.Class<?> wildcardClass20 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node19 = node14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        org.jsoup.nodes.Node node21 = node19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node21.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        boolean boolean21 = node18.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean23 = node18.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass24 = node18.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType20.outerHtmlTail(stringBuilder23, (int) '#', outputSettings25);
        java.lang.String str27 = documentType20.baseUri();
        org.jsoup.nodes.Node node30 = documentType20.attr("hi!", "hi!");
        org.jsoup.nodes.Node node31 = node30.clone();
        org.jsoup.nodes.Node node34 = node31.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str35 = node34.outerHtml();
        org.jsoup.nodes.Attributes attributes36 = node34.attributes();
        boolean boolean38 = node34.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE html>" + "'", str35, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        int int16 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        java.lang.String str12 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        int int8 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (int) (short) 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 10, outputSettings10);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str7, "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = node12.clone();
        node12.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType20.outerHtmlTail(stringBuilder23, (int) '#', outputSettings25);
        java.lang.String str27 = documentType20.baseUri();
        org.jsoup.nodes.Node node30 = documentType20.attr("hi!", "hi!");
        org.jsoup.nodes.Node node31 = node30.clone();
        java.lang.String str32 = node30.outerHtml();
        org.jsoup.nodes.Node node34 = node30.removeAttr("hi!");
        org.jsoup.nodes.Node node35 = node34.parent();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node22 = documentType4.parent();
        org.jsoup.nodes.Document document23 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        org.jsoup.nodes.Node node30 = documentType28.parent();
        org.jsoup.nodes.Node node31 = documentType28.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType28.childNodes();
        boolean boolean33 = documentType4.equals((java.lang.Object) nodeList32);
        org.jsoup.nodes.Node node36 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType41 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int42 = documentType41.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType41.childNodes();
        org.jsoup.nodes.Node node44 = documentType41.parent();
        documentType41.setBaseUri("");
        java.lang.String str47 = documentType41.toString();
        boolean boolean49 = documentType41.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList50 = documentType41.childNodes();
        boolean boolean51 = documentType4.equals((java.lang.Object) nodeList50);
        java.lang.String str52 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!DOCTYPE html>" + "'", str47, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#doctype" + "'", str52, "#doctype");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean23 = documentType21.hasAttr("<!DOCTYPE html>");
        java.lang.String str25 = documentType21.attr("#doctype");
        java.lang.String str26 = documentType21.outerHtml();
        org.jsoup.nodes.Node node29 = documentType21.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str30 = documentType21.toString();
        org.jsoup.nodes.Node node31 = documentType21.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.before((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.lang.String str8 = node6.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.lang.String str16 = node9.outerHtml();
        org.jsoup.nodes.Node node17 = node9.nextSibling();
        org.jsoup.nodes.Node node18 = node9.nextSibling();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        org.jsoup.nodes.Attributes attributes25 = documentType23.attributes();
        java.lang.String str27 = documentType23.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node9.after((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int13 = documentType12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType12.childNodes();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType12.outerHtmlTail(stringBuilder15, (int) '#', outputSettings17);
        java.lang.String str19 = documentType12.baseUri();
        org.jsoup.nodes.Document document20 = documentType12.ownerDocument();
        documentType12.setBaseUri("hi!");
        java.lang.String str24 = documentType12.absUrl("hi!");
        org.jsoup.nodes.Document document25 = documentType12.ownerDocument();
        org.jsoup.nodes.Attributes attributes26 = documentType12.attributes();
        boolean boolean27 = documentType4.equals((java.lang.Object) attributes26);
        int int28 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder29, (int) ' ', outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node22 = documentType4.parent();
        org.jsoup.nodes.Document document23 = documentType4.ownerDocument();
        java.lang.String str24 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        java.lang.String str14 = node7.outerHtml();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        java.lang.String str21 = documentType19.toString();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType19);
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) 'a', outputSettings25);
        boolean boolean28 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str21, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        java.lang.String str13 = documentType4.toString();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (short) 0, outputSettings16);
        int int18 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType23.outerHtmlTail(stringBuilder26, (int) '#', outputSettings28);
        java.lang.String str30 = documentType23.baseUri();
        org.jsoup.nodes.Node node33 = documentType23.attr("hi!", "hi!");
        org.jsoup.nodes.Node node34 = node33.clone();
        java.lang.String str35 = node34.toString();
        node34.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.before(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE html>" + "'", str35, "<!DOCTYPE html>");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        java.lang.String str27 = documentType4.toString();
        documentType4.setBaseUri("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType4.childNodes();
        java.lang.Class<?> wildcardClass31 = nodeList30.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) '4', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "hi!");
        boolean boolean21 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.Node node22 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.childNodes();
        org.jsoup.nodes.Node node23 = documentType4.clone();
        java.lang.String str24 = node23.toString();
        org.jsoup.nodes.Node node25 = node23.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        node14.setBaseUri("");
        org.jsoup.nodes.Node node18 = node14.nextSibling();
        org.jsoup.nodes.Node node19 = node14.clone();
        int int20 = node14.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass9 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document12.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) -1, outputSettings14);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        org.jsoup.nodes.Node node23 = documentType20.parent();
        documentType20.setBaseUri("");
        org.jsoup.nodes.Node node26 = documentType20.parent();
        org.jsoup.nodes.Document document27 = documentType20.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass15 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node16 = node14.removeAttr("#doctype");
        int int17 = node16.siblingIndex();
        java.lang.String str19 = node16.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int20 = node16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node16.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        org.jsoup.nodes.Document document20 = node18.ownerDocument();
        org.jsoup.nodes.Node node23 = node18.attr("#doctype", "");
        java.lang.String str25 = node18.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str26 = node18.outerHtml();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document32 = documentType31.ownerDocument();
        org.jsoup.nodes.Node node34 = documentType31.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node35 = documentType31.parent();
        // The following exception was thrown during execution in test generation
        try {
            node18.replaceWith(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        java.lang.String str20 = documentType13.baseUri();
        org.jsoup.nodes.Document document21 = documentType13.ownerDocument();
        boolean boolean23 = documentType13.hasAttr("hi!");
        java.lang.String str24 = documentType13.outerHtml();
        org.jsoup.nodes.Attributes attributes25 = documentType13.attributes();
        java.lang.String str26 = documentType13.outerHtml();
        org.jsoup.nodes.Attributes attributes27 = documentType13.attributes();
        boolean boolean28 = documentType4.equals((java.lang.Object) documentType13);
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder29, (int) 'a', outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">" + "'", str8, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        java.lang.String str27 = documentType4.toString();
        org.jsoup.nodes.Node node28 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node28.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.lang.String str16 = documentType4.nodeName();
        java.lang.String str17 = documentType4.nodeName();
        java.lang.String str19 = documentType4.attr("<!DOCTYPE html hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.jsoup.nodes.Node node10 = documentType4.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        org.jsoup.nodes.Node node20 = documentType13.clone();
        java.lang.String str22 = documentType13.attr("#doctype");
        java.lang.String str24 = documentType13.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str25 = documentType13.toString();
        boolean boolean27 = documentType13.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType13.outerHtmlTail(stringBuilder28, (int) 'a', outputSettings30);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType13.childNodes();
        org.jsoup.nodes.Node node33 = documentType13.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        int int19 = documentType16.siblingIndex();
        boolean boolean20 = node11.equals((java.lang.Object) documentType16);
        java.lang.String str21 = documentType16.outerHtml();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        org.jsoup.nodes.Node node29 = documentType26.parent();
        documentType26.setBaseUri("");
        java.lang.String str32 = documentType26.toString();
        boolean boolean34 = documentType26.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node37 = documentType26.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str38 = documentType26.baseUri();
        int int39 = documentType26.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = documentType16.before((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int13 = documentType12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType12.childNodes();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType12.outerHtmlTail(stringBuilder15, (int) '#', outputSettings17);
        java.lang.String str19 = documentType12.baseUri();
        org.jsoup.nodes.Node node22 = documentType12.attr("hi!", "hi!");
        int int23 = node22.siblingIndex();
        org.jsoup.nodes.Node node24 = node22.clone();
        node22.setBaseUri("#doctype");
        org.jsoup.nodes.Node node29 = node22.attr("#doctype", "#doctype");
        java.lang.String str30 = node29.baseUri();
        org.jsoup.nodes.Node node32 = node29.removeAttr("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        int int22 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType4.outerHtmlTail(stringBuilder23, (int) (byte) 0, outputSettings25);
        int int27 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType4.clone();
        org.jsoup.nodes.Node node29 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = node29.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.Node node19 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) -1, outputSettings17);
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) (byte) 1, outputSettings21);
        org.jsoup.nodes.Attributes attributes23 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document13.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (short) -1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.Node node13 = node11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        boolean boolean25 = node16.equals((java.lang.Object) documentType21);
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType21.outerHtmlHead(stringBuilder26, (int) (short) 0, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        boolean boolean21 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder22, (int) (short) 10, outputSettings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Node node29 = documentType19.attr("hi!", "hi!");
        org.jsoup.nodes.Node node30 = node29.clone();
        int int31 = node29.siblingIndex();
        boolean boolean32 = documentType9.equals((java.lang.Object) int31);
        boolean boolean34 = documentType9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str41 = documentType39.attr("");
        java.lang.String str43 = documentType39.attr("hi!");
        boolean boolean45 = documentType39.hasAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType9.after((org.jsoup.nodes.Node) documentType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        java.lang.String str29 = documentType23.toString();
        boolean boolean30 = documentType16.equals((java.lang.Object) documentType23);
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str33 = documentType16.absUrl("hi!");
        documentType16.setBaseUri("<!DOCTYPE html>");
        java.lang.String str36 = documentType16.outerHtml();
        org.jsoup.nodes.Node node37 = documentType16.clone();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document43 = documentType42.ownerDocument();
        org.jsoup.nodes.Attributes attributes44 = documentType42.attributes();
        org.jsoup.nodes.Node node46 = documentType42.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node47 = documentType42.clone();
        java.lang.String str48 = documentType42.baseUri();
        java.lang.StringBuilder stringBuilder49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        documentType42.outerHtmlTail(stringBuilder49, (int) (byte) 0, outputSettings51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = documentType16.after((org.jsoup.nodes.Node) documentType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.outerHtml();
        java.lang.String str21 = documentType4.toString();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder22, (int) (byte) 10, outputSettings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        java.lang.String str7 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        node9.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document18 = documentType17.ownerDocument();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.nodes.Node node21 = documentType17.removeAttr("<!DOCTYPE html>");
        java.lang.String str23 = documentType17.absUrl("<!DOCTYPE html>");
        documentType17.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes26 = documentType17.attributes();
        java.lang.String str27 = documentType17.nodeName();
        boolean boolean29 = documentType17.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node9.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str19 = documentType4.attr("#doctype");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType24.outerHtmlTail(stringBuilder27, (int) '#', outputSettings29);
        java.lang.String str31 = documentType24.baseUri();
        org.jsoup.nodes.Document document32 = documentType24.ownerDocument();
        boolean boolean34 = documentType24.hasAttr("hi!");
        org.jsoup.nodes.Node node35 = documentType24.nextSibling();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType24.outerHtmlTail(stringBuilder36, 1, outputSettings38);
        java.lang.String str41 = documentType24.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str42 = documentType24.baseUri();
        org.jsoup.nodes.Node node44 = documentType24.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str45 = documentType24.baseUri();
        org.jsoup.nodes.Node node47 = documentType24.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = documentType4.before(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str22 = documentType21.toString();
        org.jsoup.nodes.Node node23 = documentType21.clone();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        org.jsoup.nodes.Node node31 = documentType28.parent();
        documentType28.setBaseUri("");
        org.jsoup.nodes.Node node35 = documentType28.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str42 = documentType40.attr("");
        int int43 = documentType40.siblingIndex();
        boolean boolean44 = node35.equals((java.lang.Object) documentType40);
        boolean boolean45 = documentType21.equals((java.lang.Object) boolean44);
        boolean boolean46 = documentType4.equals((java.lang.Object) boolean45);
        java.lang.String str48 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str22, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document13 = documentType12.ownerDocument();
        org.jsoup.nodes.Attributes attributes14 = documentType12.attributes();
        org.jsoup.nodes.Node node17 = documentType12.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType12.childNodes();
        boolean boolean19 = node7.equals((java.lang.Object) nodeList18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node7.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        java.lang.String str6 = documentType4.nodeName();
        int int7 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) (byte) -1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.toString();
        java.lang.Object obj17 = null;
        boolean boolean18 = documentType4.equals(obj17);
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.jsoup.nodes.Node node20 = node16.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        org.jsoup.nodes.Node node28 = documentType25.parent();
        documentType25.setBaseUri("");
        java.lang.String str31 = documentType25.toString();
        boolean boolean33 = documentType25.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node36 = documentType25.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str37 = node36.outerHtml();
        org.jsoup.nodes.Node node38 = node36.nextSibling();
        org.jsoup.nodes.Document document39 = node36.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node16.after(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(document39);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        int int12 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.toString();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) '#', outputSettings16);
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str23 = documentType22.nodeName();
        java.lang.String str24 = documentType22.toString();
        org.jsoup.nodes.Node node27 = documentType22.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (-1), outputSettings23);
        documentType4.setBaseUri("#doctype");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder29, 1, outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        org.jsoup.nodes.Attributes attributes23 = node14.attributes();
        java.lang.String str25 = node14.attr("");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        java.lang.String str33 = documentType30.baseUri();
        java.lang.String str34 = documentType30.baseUri();
        java.lang.String str36 = documentType30.absUrl("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node37 = documentType30.nextSibling();
        org.jsoup.nodes.Node node38 = documentType30.parent();
        documentType30.setBaseUri("hi!");
        boolean boolean41 = node14.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.Class<?> wildcardClass6 = documentType4.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        java.lang.String str12 = node10.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.String str14 = node10.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.Class<?> wildcardClass15 = node10.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.String str20 = node7.outerHtml();
        org.jsoup.nodes.Node node21 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = node21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType10.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType10.outerHtmlTail(stringBuilder13, (int) '#', outputSettings15);
        java.lang.String str17 = documentType10.baseUri();
        java.lang.String str18 = documentType10.toString();
        org.jsoup.nodes.Document document19 = documentType10.ownerDocument();
        int int20 = documentType10.siblingIndex();
        documentType10.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node25 = documentType10.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document26 = documentType10.ownerDocument();
        boolean boolean27 = documentType4.equals((java.lang.Object) document26);
        java.lang.String str29 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = node5.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node5.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        org.jsoup.nodes.Node node12 = documentType10.parent();
        org.jsoup.nodes.Node node13 = documentType10.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType10.childNodes();
        java.lang.String str15 = documentType10.baseUri();
        java.lang.String str16 = documentType10.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Attributes attributes23 = documentType21.attributes();
        java.lang.String str24 = documentType21.outerHtml();
        org.jsoup.nodes.Node node26 = documentType21.removeAttr("hi!");
        documentType21.setBaseUri("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType21.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node11.before((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        int int5 = documentType4.siblingIndex();
        int int6 = documentType4.siblingIndex();
        java.lang.Class<?> wildcardClass7 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, (int) ' ', outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        int int15 = node14.siblingIndex();
        org.jsoup.nodes.Node node16 = node14.clone();
        org.jsoup.nodes.Attributes attributes17 = node14.attributes();
        org.jsoup.nodes.Document document18 = node14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.Node node15 = node12.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str16 = node12.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node18 = node14.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.nextSibling();
        boolean boolean21 = node18.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node18.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.String str17 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.String str20 = node7.outerHtml();
        org.jsoup.nodes.Node node21 = node7.parent();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType26.outerHtmlTail(stringBuilder29, (int) '#', outputSettings31);
        java.lang.String str33 = documentType26.baseUri();
        org.jsoup.nodes.Document document34 = documentType26.ownerDocument();
        boolean boolean36 = documentType26.hasAttr("hi!");
        org.jsoup.nodes.Node node37 = documentType26.nextSibling();
        java.lang.StringBuilder stringBuilder38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        documentType26.outerHtmlTail(stringBuilder38, 1, outputSettings40);
        java.lang.String str43 = documentType26.attr("<!DOCTYPE html>");
        int int44 = documentType26.siblingIndex();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        documentType26.outerHtmlTail(stringBuilder45, (int) (byte) 0, outputSettings47);
        int int49 = documentType26.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node21.replaceWith((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Document document22 = node21.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document22.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        org.jsoup.nodes.Node node17 = node11.clone();
        java.lang.String str18 = node11.toString();
        int int19 = node11.siblingIndex();
        java.lang.String str21 = node11.absUrl("hi!");
        java.lang.String str22 = node11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        java.lang.String str21 = documentType14.baseUri();
        java.lang.String str22 = documentType14.toString();
        boolean boolean24 = documentType14.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean25 = documentType4.equals((java.lang.Object) boolean24);
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType30.outerHtmlTail(stringBuilder33, (int) '#', outputSettings35);
        java.lang.String str37 = documentType30.baseUri();
        org.jsoup.nodes.Document document38 = documentType30.ownerDocument();
        documentType30.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        documentType30.outerHtmlTail(stringBuilder41, 1, outputSettings43);
        boolean boolean45 = documentType4.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.lang.String str17 = documentType11.toString();
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType11);
        org.jsoup.nodes.Node node19 = documentType4.parent();
        java.lang.String str21 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.lang.String str24 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node16 = node14.removeAttr("#doctype");
        java.lang.String str18 = node14.absUrl("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node19 = node14.clone();
        org.jsoup.nodes.Node node20 = node14.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        documentType18.setBaseUri("");
        org.jsoup.nodes.Node node25 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str32 = documentType30.attr("");
        int int33 = documentType30.siblingIndex();
        boolean boolean34 = node25.equals((java.lang.Object) documentType30);
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType30);
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType40.childNodes();
        java.lang.StringBuilder stringBuilder43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        documentType40.outerHtmlTail(stringBuilder43, (int) (short) 100, outputSettings45);
        org.jsoup.nodes.Node node47 = documentType40.parent();
        java.lang.String str48 = documentType40.toString();
        org.jsoup.nodes.Node node50 = documentType40.removeAttr("hi!");
        org.jsoup.nodes.Node node52 = node50.removeAttr("#doctype");
        org.jsoup.nodes.Document document53 = node52.ownerDocument();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        boolean boolean55 = documentType30.equals((java.lang.Object) wildcardClass54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = documentType30.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE html>" + "'", str48, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        boolean boolean25 = node16.equals((java.lang.Object) documentType21);
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType21.outerHtmlHead(stringBuilder26, (int) (byte) -1, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) '#', outputSettings15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        documentType21.setBaseUri("");
        org.jsoup.nodes.Node node28 = documentType21.removeAttr("hi!");
        boolean boolean30 = node28.hasAttr("<!DOCTYPE html>");
        node28.setBaseUri("hi!");
        int int33 = node28.siblingIndex();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int39 = documentType38.siblingIndex();
        org.jsoup.nodes.Node node40 = documentType38.parent();
        org.jsoup.nodes.Node node41 = documentType38.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType38.childNodes();
        boolean boolean43 = node28.equals((java.lang.Object) documentType38);
        org.jsoup.nodes.Attributes attributes44 = documentType38.attributes();
        org.jsoup.nodes.Node node45 = documentType38.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = node16.before(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node10 = node9.clone();
        java.lang.String str11 = node10.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        java.lang.String str20 = documentType13.baseUri();
        org.jsoup.nodes.Document document21 = documentType13.ownerDocument();
        documentType13.setBaseUri("hi!");
        boolean boolean25 = documentType13.hasAttr("<!DOCTYPE html>");
        java.lang.String str27 = documentType13.attr("hi!");
        org.jsoup.nodes.Node node28 = documentType13.clone();
        boolean boolean29 = documentType4.equals((java.lang.Object) documentType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node14.removeAttr("hi!");
        boolean boolean18 = node16.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document19 = node16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node16.attr("", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        int int13 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        int int15 = node14.siblingIndex();
        org.jsoup.nodes.Node node16 = node14.clone();
        node14.setBaseUri("#doctype");
        org.jsoup.nodes.Node node21 = node14.attr("#doctype", "#doctype");
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str28 = documentType26.attr("");
        int int29 = documentType26.siblingIndex();
        java.lang.String str31 = documentType26.absUrl("<!DOCTYPE html>");
        boolean boolean33 = documentType26.hasAttr("");
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int39 = documentType38.siblingIndex();
        java.lang.Class<?> wildcardClass40 = documentType38.getClass();
        boolean boolean41 = documentType26.equals((java.lang.Object) wildcardClass40);
        java.lang.String str42 = documentType26.outerHtml();
        org.jsoup.nodes.Node node43 = documentType26.clone();
        boolean boolean44 = node21.equals((java.lang.Object) documentType26);
        org.jsoup.nodes.DocumentType documentType49 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node50 = documentType49.parent();
        java.lang.StringBuilder stringBuilder51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = null;
        documentType49.outerHtmlTail(stringBuilder51, (int) (short) 1, outputSettings53);
        org.jsoup.nodes.DocumentType documentType59 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int60 = documentType59.siblingIndex();
        org.jsoup.nodes.Attributes attributes61 = documentType59.attributes();
        java.lang.String str62 = documentType59.outerHtml();
        java.lang.String str64 = documentType59.attr("<!DOCTYPE html>");
        java.lang.String str65 = documentType59.baseUri();
        boolean boolean66 = documentType49.equals((java.lang.Object) documentType59);
        org.jsoup.nodes.Attributes attributes67 = documentType59.attributes();
        boolean boolean68 = node21.equals((java.lang.Object) attributes67);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE html>" + "'", str42, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!DOCTYPE html>" + "'", str62, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) ' ', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 1, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str7, "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = node13.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        boolean boolean14 = documentType4.hasAttr("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes16 = documentType4.attributes();
        java.lang.String str17 = documentType4.outerHtml();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.nodeName();
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node14.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType23.outerHtmlTail(stringBuilder26, (int) '#', outputSettings28);
        java.lang.String str30 = documentType23.baseUri();
        org.jsoup.nodes.Document document31 = documentType23.ownerDocument();
        org.jsoup.nodes.Node node32 = documentType23.parent();
        java.lang.String str34 = documentType23.attr("#doctype");
        java.lang.String str36 = documentType23.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType4.before((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.String str20 = documentType4.attr("");
        java.lang.String str21 = documentType4.outerHtml();
        java.lang.String str23 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str24 = documentType4.toString();
        java.lang.String str25 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        documentType18.setBaseUri("");
        org.jsoup.nodes.Node node25 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str32 = documentType30.attr("");
        int int33 = documentType30.siblingIndex();
        boolean boolean34 = node25.equals((java.lang.Object) documentType30);
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType30);
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType30.outerHtmlHead(stringBuilder36, (int) (short) 10, outputSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.String str18 = documentType4.outerHtml();
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (-1), outputSettings23);
        java.lang.String str25 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }
}

