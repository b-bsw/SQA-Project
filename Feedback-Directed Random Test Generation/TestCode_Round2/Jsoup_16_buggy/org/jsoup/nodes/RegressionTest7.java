package org.jsoup.nodes;

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
        org.jsoup.nodes.Node node20 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        org.jsoup.nodes.Node node28 = documentType25.parent();
        documentType25.setBaseUri("");
        org.jsoup.nodes.Node node32 = documentType25.removeAttr("hi!");
        boolean boolean34 = node32.hasAttr("<!DOCTYPE html>");
        node32.setBaseUri("hi!");
        int int37 = node32.siblingIndex();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int43 = documentType42.siblingIndex();
        org.jsoup.nodes.Node node44 = documentType42.parent();
        org.jsoup.nodes.Node node45 = documentType42.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = documentType42.childNodes();
        boolean boolean47 = node32.equals((java.lang.Object) documentType42);
        java.lang.StringBuilder stringBuilder48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = null;
        documentType42.outerHtmlTail(stringBuilder48, (int) (byte) 1, outputSettings50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = documentType4.after((org.jsoup.nodes.Node) documentType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        org.jsoup.nodes.Node node12 = node9.parent();
        java.lang.String str13 = node9.outerHtml();
        org.jsoup.nodes.Node node16 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (-1), outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (short) 1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        java.lang.String str19 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (byte) 1, outputSettings8);
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 10, outputSettings12);
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        java.lang.String str16 = documentType4.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str16, "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        org.jsoup.nodes.Attributes attributes28 = documentType26.attributes();
        java.lang.String str29 = documentType26.outerHtml();
        org.jsoup.nodes.Node node31 = documentType26.removeAttr("hi!");
        boolean boolean33 = node31.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean34 = documentType4.equals((java.lang.Object) node31);
        boolean boolean36 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str37 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        documentType4.outerHtmlTail(stringBuilder38, 0, outputSettings40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.jsoup.nodes.Node node38 = documentType4.nextSibling();
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
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType14.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.previousSibling();
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
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        java.lang.String str21 = documentType4.outerHtml();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes24 = documentType4.attributes();
        org.jsoup.nodes.Document document25 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        org.jsoup.nodes.Attributes attributes17 = documentType15.attributes();
        java.lang.String str18 = documentType15.outerHtml();
        java.lang.String str20 = documentType15.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType15.childNodes();
        org.jsoup.nodes.Node node22 = documentType15.nextSibling();
        org.jsoup.nodes.Node node23 = documentType15.parent();
        org.jsoup.nodes.Attributes attributes24 = documentType15.attributes();
        java.lang.String str25 = documentType15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) 'a', outputSettings14);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document21 = documentType20.ownerDocument();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.removeAttr("<!DOCTYPE html>");
        int int25 = node24.siblingIndex();
        java.lang.Class<?> wildcardClass26 = node24.getClass();
        boolean boolean27 = documentType4.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        org.jsoup.nodes.Attributes attributes23 = documentType21.attributes();
        java.lang.String str24 = documentType21.outerHtml();
        org.jsoup.nodes.Node node26 = documentType21.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int32 = documentType31.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType31.childNodes();
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType31.outerHtmlTail(stringBuilder34, (int) '#', outputSettings36);
        java.lang.String str38 = documentType31.baseUri();
        java.lang.String str39 = documentType31.toString();
        boolean boolean41 = documentType31.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean42 = documentType21.equals((java.lang.Object) boolean41);
        org.jsoup.nodes.DocumentType documentType47 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int48 = documentType47.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = documentType47.childNodes();
        java.lang.StringBuilder stringBuilder50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        documentType47.outerHtmlTail(stringBuilder50, (int) '#', outputSettings52);
        java.lang.String str54 = documentType47.baseUri();
        org.jsoup.nodes.Document document55 = documentType47.ownerDocument();
        documentType47.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder58 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = null;
        documentType47.outerHtmlTail(stringBuilder58, 1, outputSettings60);
        boolean boolean62 = documentType21.equals((java.lang.Object) 1);
        java.lang.String str64 = documentType21.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder65 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = null;
        documentType21.outerHtmlTail(stringBuilder65, 1, outputSettings67);
        boolean boolean69 = documentType4.equals((java.lang.Object) documentType21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE html>" + "'", str39, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(document55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str5 = documentType4.toString();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document8.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node19 = documentType16.attr("hi!", "hi!");
        java.lang.String str21 = node19.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node11.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.jsoup.nodes.Node node42 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes43 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType48 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node51 = documentType48.attr("hi!", "hi!");
        org.jsoup.nodes.Node node53 = node51.removeAttr("hi!");
        java.lang.String str55 = node53.absUrl("hi!");
        java.lang.String str56 = node53.toString();
        java.lang.String str57 = node53.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node58 = documentType4.after(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<!DOCTYPE html>" + "'", str56, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!DOCTYPE html>" + "'", str57, "<!DOCTYPE html>");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        org.jsoup.nodes.Node node19 = node14.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        int int16 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node20 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node28 = documentType25.attr("hi!", "hi!");
        boolean boolean30 = documentType25.hasAttr("");
        int int31 = documentType25.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node20.before((org.jsoup.nodes.Node) documentType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 0, outputSettings11);
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = node21.siblingNodes();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.jsoup.nodes.Node node22 = node14.clone();
        org.jsoup.nodes.Attributes attributes23 = node22.attributes();
        java.lang.Class<?> wildcardClass24 = node22.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        org.jsoup.nodes.Node node35 = documentType9.clone();
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
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "#doctype", "");
        java.lang.String str20 = documentType18.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.jsoup.nodes.Node node41 = documentType16.parent();
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
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        org.jsoup.nodes.Document document17 = node16.ownerDocument();
        org.jsoup.nodes.Node node18 = node16.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document22 = documentType21.ownerDocument();
        org.jsoup.nodes.Attributes attributes23 = documentType21.attributes();
        org.jsoup.nodes.Node node25 = documentType21.removeAttr("<!DOCTYPE html>");
        java.lang.String str26 = documentType21.baseUri();
        org.jsoup.nodes.Node node29 = documentType21.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE html>");
        int int17 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str9 = node8.outerHtml();
        int int10 = node8.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">" + "'", str9, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        int int15 = documentType4.siblingIndex();
        java.lang.String str16 = documentType4.nodeName();
        int int17 = documentType4.siblingIndex();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        java.lang.String str19 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document20 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = document20.unwrap();
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        org.jsoup.nodes.Node node13 = node9.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, 0, outputSettings22);
        java.lang.String str24 = documentType4.toString();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType4.outerHtmlTail(stringBuilder25, 1, outputSettings27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.lang.String str24 = documentType4.toString();
        org.jsoup.nodes.Document document25 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder26, (int) (byte) 1, outputSettings28);
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
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "#doctype", "", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        org.jsoup.nodes.Node node16 = documentType9.clone();
        java.lang.String str18 = documentType9.attr("#doctype");
        java.lang.String str20 = documentType9.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = documentType9.toString();
        boolean boolean23 = documentType9.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType9.outerHtmlTail(stringBuilder24, (int) 'a', outputSettings26);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType9.childNodes();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int34 = documentType33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType33.childNodes();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType33.outerHtmlTail(stringBuilder36, (int) '#', outputSettings38);
        java.lang.String str40 = documentType33.baseUri();
        org.jsoup.nodes.Document document41 = documentType33.ownerDocument();
        java.lang.String str42 = documentType33.baseUri();
        org.jsoup.nodes.Node node44 = documentType33.removeAttr("<!DOCTYPE html>");
        boolean boolean45 = documentType9.equals((java.lang.Object) node44);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str14 = documentType4.nodeName();
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "", "<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) -1, outputSettings7);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str19 = documentType17.attr("");
        int int20 = documentType17.siblingIndex();
        java.lang.String str22 = documentType17.absUrl("<!DOCTYPE html>");
        boolean boolean24 = documentType17.hasAttr("");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int30 = documentType29.siblingIndex();
        java.lang.Class<?> wildcardClass31 = documentType29.getClass();
        boolean boolean32 = documentType17.equals((java.lang.Object) wildcardClass31);
        java.lang.String str33 = documentType17.outerHtml();
        org.jsoup.nodes.Node node34 = documentType17.clone();
        org.jsoup.nodes.Node node35 = node34.nextSibling();
        org.jsoup.nodes.Document document36 = node34.ownerDocument();
        boolean boolean37 = documentType4.equals((java.lang.Object) node34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node34.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html>" + "'", str33, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) '#', outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.clone();
        java.lang.String str16 = node13.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int17 = node13.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        java.lang.String str14 = documentType4.toString();
        int int15 = documentType4.siblingIndex();
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str14, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.jsoup.nodes.Node node20 = node17.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str21 = node20.baseUri();
        java.lang.String str23 = node20.attr("#doctype");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        org.jsoup.nodes.Attributes attributes28 = documentType26.attributes();
        java.lang.String str29 = documentType26.outerHtml();
        org.jsoup.nodes.Node node31 = documentType26.removeAttr("hi!");
        boolean boolean33 = node31.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean34 = documentType4.equals((java.lang.Object) node31);
        boolean boolean36 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType4.childNodes();
        org.jsoup.nodes.Node node40 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str41 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#doctype" + "'", str41, "#doctype");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">", "<!DOCTYPE html hi!\">");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
            java.lang.String str14 = node12.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
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
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        org.jsoup.nodes.Attributes attributes21 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.before((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "#doctype", "");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        boolean boolean18 = documentType4.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) 'a', outputSettings21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType28.outerHtmlTail(stringBuilder31, (int) '#', outputSettings33);
        java.lang.String str35 = documentType28.baseUri();
        org.jsoup.nodes.Document document36 = documentType28.ownerDocument();
        java.lang.String str37 = documentType28.baseUri();
        org.jsoup.nodes.Node node39 = documentType28.removeAttr("<!DOCTYPE html>");
        boolean boolean40 = documentType4.equals((java.lang.Object) node39);
        java.lang.String str41 = node39.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html>" + "'", str41, "<!DOCTYPE html>");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str15 = node14.baseUri();
        boolean boolean17 = node14.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        node36.setBaseUri("hi!");
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int44 = documentType43.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = documentType43.childNodes();
        java.lang.StringBuilder stringBuilder46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        documentType43.outerHtmlTail(stringBuilder46, (int) '#', outputSettings48);
        java.lang.String str50 = documentType43.baseUri();
        org.jsoup.nodes.Document document51 = documentType43.ownerDocument();
        boolean boolean53 = documentType43.hasAttr("hi!");
        org.jsoup.nodes.Node node54 = documentType43.nextSibling();
        java.lang.StringBuilder stringBuilder55 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = null;
        documentType43.outerHtmlTail(stringBuilder55, 1, outputSettings57);
        java.lang.String str60 = documentType43.attr("<!DOCTYPE html>");
        int int61 = documentType43.siblingIndex();
        java.lang.StringBuilder stringBuilder62 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = null;
        documentType43.outerHtmlTail(stringBuilder62, (int) (byte) 0, outputSettings64);
        java.lang.String str66 = documentType43.toString();
        documentType43.setBaseUri("#doctype");
        boolean boolean70 = documentType43.hasAttr("hi!");
        boolean boolean71 = node36.equals((java.lang.Object) documentType43);
        org.jsoup.nodes.Attributes attributes72 = node36.attributes();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(document51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!DOCTYPE html>" + "'", str66, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(attributes72);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int32 = documentType31.siblingIndex();
        java.lang.String str33 = documentType31.outerHtml();
        java.lang.String str35 = documentType31.attr("");
        org.jsoup.nodes.Node node36 = documentType31.clone();
        org.jsoup.nodes.Attributes attributes37 = node36.attributes();
        java.lang.String str38 = node36.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node36);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html>" + "'", str33, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document12.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str15 = documentType13.attr("");
        int int16 = documentType13.siblingIndex();
        java.lang.String str17 = documentType13.baseUri();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        java.lang.String str19 = documentType13.baseUri();
        boolean boolean21 = documentType13.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node22 = documentType13.nextSibling();
        boolean boolean23 = documentType4.equals((java.lang.Object) node22);
        org.jsoup.nodes.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node16 = node15.clone();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType21.outerHtmlTail(stringBuilder24, (int) '#', outputSettings26);
        java.lang.String str28 = documentType21.baseUri();
        java.lang.String str29 = documentType21.toString();
        boolean boolean31 = documentType21.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node37 = documentType36.clone();
        java.lang.String str38 = documentType36.toString();
        boolean boolean39 = documentType21.equals((java.lang.Object) documentType36);
        // The following exception was thrown during execution in test generation
        try {
            node16.replaceWith((org.jsoup.nodes.Node) documentType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str38, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, 1, outputSettings24);
        org.jsoup.nodes.Node node26 = documentType4.nextSibling();
        java.lang.String str27 = documentType4.baseUri();
        org.jsoup.nodes.Document document28 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document28.remove();
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
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str11 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.childNodes();
        java.lang.String str23 = documentType4.baseUri();
        java.lang.String str24 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        java.lang.String str13 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.String str12 = documentType9.baseUri();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType9.outerHtmlTail(stringBuilder13, (int) (byte) 0, outputSettings15);
        boolean boolean18 = documentType9.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType9.childNodes();
        org.jsoup.nodes.Node node20 = documentType9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        java.lang.String str9 = node8.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        java.lang.String str18 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str24 = documentType23.toString();
        java.lang.Object obj25 = null;
        boolean boolean26 = documentType23.equals(obj25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.before((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        int int12 = documentType4.siblingIndex();
        java.lang.Object obj13 = null;
        boolean boolean14 = documentType4.equals(obj13);
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        java.lang.String str16 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType21.outerHtmlTail(stringBuilder24, (int) '#', outputSettings26);
        java.lang.String str28 = documentType21.baseUri();
        java.lang.String str29 = documentType21.toString();
        boolean boolean31 = documentType21.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node34 = documentType21.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node16.before(node34);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
            org.jsoup.nodes.Node node23 = node19.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
            node18.remove();
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        java.lang.String str19 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        int int22 = documentType4.siblingIndex();
        java.lang.Class<?> wildcardClass23 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.parent();
        org.jsoup.nodes.Node node14 = node7.parent();
        org.jsoup.nodes.Node node15 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (short) 100, outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType15.outerHtmlTail(stringBuilder16, (int) (byte) -1, outputSettings18);
        boolean boolean20 = documentType4.equals((java.lang.Object) documentType15);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType15.childNodes();
        org.jsoup.nodes.Node node22 = documentType15.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
            org.jsoup.nodes.Node node21 = node19.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.jsoup.nodes.Node node21 = documentType16.clone();
        java.lang.String str23 = node21.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        boolean boolean22 = node19.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node16 = node12.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str17 = node12.outerHtml();
        java.lang.String str18 = node12.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        org.jsoup.nodes.Node node22 = node14.clone();
        java.lang.Class<?> wildcardClass23 = node22.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        org.jsoup.nodes.Node node31 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
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
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        int int28 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int34 = documentType33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType33.childNodes();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType33.outerHtmlTail(stringBuilder36, (int) '#', outputSettings38);
        java.lang.String str40 = documentType33.baseUri();
        org.jsoup.nodes.Document document41 = documentType33.ownerDocument();
        boolean boolean43 = documentType33.hasAttr("hi!");
        org.jsoup.nodes.Node node44 = documentType33.nextSibling();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        documentType33.outerHtmlTail(stringBuilder45, 1, outputSettings47);
        java.lang.String str50 = documentType33.attr("<!DOCTYPE html>");
        boolean boolean51 = documentType4.equals((java.lang.Object) documentType33);
        org.jsoup.nodes.Node node52 = documentType33.nextSibling();
        org.jsoup.nodes.Node node53 = documentType33.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node54 = documentType33.unwrap();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "", "<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.lang.String str7 = node6.toString();
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
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int36 = documentType35.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType35.childNodes();
        org.jsoup.nodes.Node node38 = documentType35.parent();
        documentType35.setBaseUri("");
        org.jsoup.nodes.Node node42 = documentType35.removeAttr("hi!");
        boolean boolean43 = documentType12.equals((java.lang.Object) documentType35);
        java.lang.String str45 = documentType12.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node48 = documentType12.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        boolean boolean49 = node6.equals((java.lang.Object) node48);
        org.jsoup.nodes.DocumentType documentType54 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int55 = documentType54.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = documentType54.childNodes();
        java.lang.StringBuilder stringBuilder57 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings59 = null;
        documentType54.outerHtmlTail(stringBuilder57, (int) '#', outputSettings59);
        java.lang.String str61 = documentType54.baseUri();
        org.jsoup.nodes.Node node64 = documentType54.attr("hi!", "hi!");
        org.jsoup.nodes.Node node65 = node64.clone();
        java.lang.String str66 = node64.outerHtml();
        org.jsoup.nodes.Node node69 = node64.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node70 = node69.clone();
        org.jsoup.nodes.Node node71 = node70.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node72 = node48.before(node70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!DOCTYPE html>" + "'", str66, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        int int12 = node9.siblingIndex();
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node9.toString();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str21 = documentType19.attr("");
        int int22 = documentType19.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node9.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (byte) 100, outputSettings15);
        org.jsoup.nodes.Node node18 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        java.lang.String str20 = node18.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str14 = documentType12.attr("");
        java.lang.String str16 = documentType12.attr("hi!");
        java.lang.String str17 = documentType12.toString();
        java.lang.String str18 = documentType12.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node7.after((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 10, outputSettings7);
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str9, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int13 = documentType12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType12.childNodes();
        int int15 = documentType12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType12.childNodes();
        documentType12.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str19 = documentType12.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.before((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        java.lang.String str24 = documentType21.outerHtml();
        java.lang.String str26 = documentType21.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodes();
        boolean boolean28 = node15.equals((java.lang.Object) nodeList27);
        node15.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.String str31 = node15.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        java.lang.String str19 = node16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node22 = node16.attr("<!DOCTYPE html #doctype\">", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node22.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        org.jsoup.nodes.Node node24 = node23.parent();
        org.jsoup.nodes.Node node27 = node23.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node29 = node23.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node23.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        java.lang.String str18 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str24 = documentType23.nodeName();
        java.lang.String str25 = documentType23.nodeName();
        org.jsoup.nodes.Node node26 = documentType23.clone();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document32 = documentType31.ownerDocument();
        org.jsoup.nodes.Attributes attributes33 = documentType31.attributes();
        org.jsoup.nodes.Node node36 = documentType31.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType31.childNodes();
        boolean boolean38 = node26.equals((java.lang.Object) nodeList37);
        java.lang.String str40 = node26.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node41 = node26.clone();
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int47 = documentType46.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = documentType46.childNodes();
        java.lang.StringBuilder stringBuilder49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        documentType46.outerHtmlTail(stringBuilder49, (int) '#', outputSettings51);
        java.lang.String str53 = documentType46.baseUri();
        org.jsoup.nodes.Node node56 = documentType46.attr("hi!", "hi!");
        org.jsoup.nodes.Node node57 = node56.clone();
        java.lang.String str58 = node56.outerHtml();
        java.lang.String str59 = node56.baseUri();
        boolean boolean60 = node41.equals((java.lang.Object) node56);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = documentType4.after(node41);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!DOCTYPE html>" + "'", str58, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str5 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "<!DOCTYPE html>");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) (byte) 10, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        int int23 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder24, (int) '#', outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node18 = node16.clone();
        int int19 = node16.siblingIndex();
        int int20 = node16.siblingIndex();
        java.lang.String str21 = node16.baseUri();
        java.lang.String str23 = node16.attr("#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str14 = node9.absUrl("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node9.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            node6.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        boolean boolean12 = documentType4.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean19 = documentType17.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = documentType17.attr("#doctype");
        org.jsoup.nodes.Document document22 = documentType17.ownerDocument();
        int int23 = documentType17.siblingIndex();
        boolean boolean24 = documentType4.equals((java.lang.Object) int23);
        java.lang.String str26 = documentType4.attr("");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document19 = documentType18.ownerDocument();
        org.jsoup.nodes.Attributes attributes20 = documentType18.attributes();
        java.lang.String str22 = documentType18.attr("");
        boolean boolean23 = node12.equals((java.lang.Object) documentType18);
        boolean boolean25 = node12.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document26 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = document26.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        java.lang.Class<?> wildcardClass12 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document16 = documentType15.ownerDocument();
        org.jsoup.nodes.Attributes attributes17 = documentType15.attributes();
        org.jsoup.nodes.Node node19 = documentType15.removeAttr("<!DOCTYPE html>");
        int int20 = node19.siblingIndex();
        boolean boolean22 = node19.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        int int23 = node19.siblingIndex();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        org.jsoup.nodes.Node node31 = documentType28.parent();
        documentType28.setBaseUri("");
        org.jsoup.nodes.Node node35 = documentType28.removeAttr("hi!");
        boolean boolean37 = node35.hasAttr("<!DOCTYPE html>");
        node35.setBaseUri("hi!");
        int int40 = node35.siblingIndex();
        org.jsoup.nodes.Node node41 = node35.clone();
        java.lang.String str42 = node35.toString();
        int int43 = node35.siblingIndex();
        java.lang.String str45 = node35.absUrl("hi!");
        java.lang.String str46 = node35.toString();
        boolean boolean47 = node19.equals((java.lang.Object) node35);
        org.jsoup.nodes.Node node50 = node19.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE html>" + "'", str42, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!DOCTYPE html>" + "'", str46, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = document15.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
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
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.String str15 = node14.baseUri();
        org.jsoup.nodes.Attributes attributes16 = node14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.unwrap();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.jsoup.nodes.Node node31 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Attributes attributes32 = node31.attributes();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str12 = documentType4.nodeName();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        int int20 = documentType17.siblingIndex();
        java.lang.String str21 = documentType17.nodeName();
        java.lang.String str23 = documentType17.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType17.setBaseUri("hi!");
        org.jsoup.nodes.Node node26 = documentType17.clone();
        boolean boolean28 = node26.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node7.childNodes();
        java.lang.String str15 = node7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node7.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html hi!\">", "<!DOCTYPE html hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        org.jsoup.nodes.Attributes attributes24 = documentType22.attributes();
        java.lang.String str26 = documentType22.attr("hi!");
        org.jsoup.nodes.Node node27 = documentType22.clone();
        boolean boolean29 = node27.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node30 = node27.nextSibling();
        org.jsoup.nodes.Node node32 = node27.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int38 = documentType37.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = documentType37.childNodes();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        documentType37.outerHtmlTail(stringBuilder40, (int) '#', outputSettings42);
        java.lang.String str44 = documentType37.baseUri();
        org.jsoup.nodes.Document document45 = documentType37.ownerDocument();
        boolean boolean47 = documentType37.hasAttr("hi!");
        org.jsoup.nodes.Node node48 = documentType37.nextSibling();
        int int49 = documentType37.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = documentType37.childNodes();
        boolean boolean51 = node27.equals((java.lang.Object) nodeList50);
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        java.lang.String str17 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html hi!\">");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node32 = documentType29.attr("hi!", "hi!");
        boolean boolean34 = documentType29.hasAttr("");
        int int35 = documentType29.siblingIndex();
        java.lang.String str36 = documentType29.toString();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType29.outerHtmlTail(stringBuilder37, (int) ' ', outputSettings39);
        java.lang.String str42 = documentType29.attr("<!DOCTYPE html hi!\">");
        java.lang.String str43 = documentType29.outerHtml();
        boolean boolean44 = documentType22.equals((java.lang.Object) str43);
        org.jsoup.nodes.Node node47 = documentType22.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str49 = documentType22.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
        boolean boolean50 = documentType4.equals((java.lang.Object) str49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE html>" + "'", str43, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, 10, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        java.lang.String str21 = documentType4.outerHtml();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes24 = documentType4.attributes();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) -1, outputSettings19);
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (int) (byte) 100, outputSettings23);
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder25, 0, outputSettings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        org.jsoup.nodes.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            document23.replaceWith(node24);
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
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        org.jsoup.nodes.Attributes attributes28 = documentType26.attributes();
        java.lang.String str29 = documentType26.outerHtml();
        org.jsoup.nodes.Node node31 = documentType26.removeAttr("hi!");
        boolean boolean33 = node31.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean34 = documentType4.equals((java.lang.Object) node31);
        boolean boolean36 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str37 = documentType4.outerHtml();
        org.jsoup.nodes.Node node38 = documentType4.parent();
        org.jsoup.nodes.Node node39 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.after("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
            org.jsoup.nodes.Node node21 = node7.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        java.lang.String str24 = documentType4.toString();
        org.jsoup.nodes.Document document25 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
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
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        java.lang.String str20 = documentType16.attr("hi!");
        java.lang.String str21 = documentType16.toString();
        java.lang.String str22 = documentType16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType16.childNodes();
        org.jsoup.nodes.Node node26 = documentType16.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node27 = documentType16.clone();
        int int28 = node27.siblingIndex();
        java.lang.String str30 = node27.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node27.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = document11.after(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        java.lang.String str25 = documentType4.baseUri();
        org.jsoup.nodes.Node node27 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int33 = documentType32.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType32.childNodes();
        org.jsoup.nodes.Node node35 = documentType32.parent();
        documentType32.setBaseUri("");
        org.jsoup.nodes.Node node39 = documentType32.removeAttr("hi!");
        int int40 = documentType32.siblingIndex();
        java.lang.String str41 = documentType32.toString();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        documentType32.outerHtmlTail(stringBuilder42, (int) '#', outputSettings44);
        // The following exception was thrown during execution in test generation
        try {
            node27.replaceWith((org.jsoup.nodes.Node) documentType32);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html>" + "'", str41, "<!DOCTYPE html>");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document19 = documentType18.ownerDocument();
        org.jsoup.nodes.Attributes attributes20 = documentType18.attributes();
        org.jsoup.nodes.Node node23 = documentType18.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodes();
        boolean boolean25 = documentType4.equals((java.lang.Object) documentType18);
        org.jsoup.nodes.Node node28 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.lang.String str29 = documentType4.outerHtml();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        documentType4.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">");
        int int17 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) (byte) 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">");
        java.lang.String str5 = documentType4.toString();
        boolean boolean7 = documentType4.equals((java.lang.Object) (byte) 10);
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        org.jsoup.nodes.Node node16 = documentType13.parent();
        documentType13.setBaseUri("");
        org.jsoup.nodes.Node node20 = documentType13.removeAttr("hi!");
        boolean boolean22 = node20.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes23 = node20.attributes();
        boolean boolean25 = node20.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean26 = documentType4.equals((java.lang.Object) boolean25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str8, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        org.jsoup.nodes.Node node42 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes43 = documentType4.attributes();
        java.lang.String str44 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType49 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "");
        java.lang.StringBuilder stringBuilder50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        documentType49.outerHtmlTail(stringBuilder50, (int) '#', outputSettings52);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#doctype" + "'", str44, "#doctype");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        int int13 = documentType4.siblingIndex();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        org.jsoup.nodes.Node node18 = node17.clone();
        node18.setBaseUri("<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        java.lang.String str23 = node19.toString();
        java.lang.String str24 = node19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node19.unwrap();
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
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
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str11 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        java.lang.String str12 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        org.jsoup.nodes.Node node24 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes25 = documentType4.attributes();
        org.jsoup.nodes.Node node28 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document29 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        org.jsoup.nodes.Node node19 = documentType4.parent();
        java.lang.String str20 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node11.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        org.jsoup.nodes.Node node27 = documentType4.parent();
        org.jsoup.nodes.Node node28 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after("<!DOCTYPE html>");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node10 = node9.clone();
        int int11 = node9.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
            org.jsoup.nodes.Node node18 = node17.previousSibling();
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
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        org.jsoup.nodes.Node node21 = node19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node19.childNodes();
        java.lang.String str23 = node19.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node19.childNode((-1));
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes14 = node11.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node11.childNodes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        boolean boolean21 = node11.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.jsoup.nodes.Node node24 = node11.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        java.lang.String str18 = node14.baseUri();
        java.lang.String str20 = node14.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node14.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.Object obj12 = null;
        boolean boolean13 = documentType4.equals(obj12);
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = document16.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        java.lang.String str21 = documentType4.baseUri();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.baseUri();
        org.jsoup.nodes.Node node25 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node26 = documentType4.clone();
        org.jsoup.nodes.Node node27 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        org.jsoup.nodes.Attributes attributes24 = documentType22.attributes();
        boolean boolean26 = documentType22.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType22.nextSibling();
        java.lang.String str29 = documentType22.absUrl("hi!");
        int int30 = documentType22.siblingIndex();
        java.lang.Object obj31 = null;
        boolean boolean32 = documentType22.equals(obj31);
        org.jsoup.nodes.Attributes attributes33 = documentType22.attributes();
        java.lang.String str34 = documentType22.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (short) 1, outputSettings15);
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        documentType4.setBaseUri("#doctype");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node13 = documentType10.attr("hi!", "hi!");
        boolean boolean15 = documentType10.hasAttr("");
        int int16 = documentType10.siblingIndex();
        java.lang.String str17 = documentType10.toString();
        java.lang.String str19 = documentType10.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node20 = documentType10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        org.jsoup.nodes.Document document17 = node15.ownerDocument();
        java.lang.String str18 = node15.outerHtml();
        org.jsoup.nodes.Document document19 = node15.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        java.lang.String str7 = documentType4.nodeName();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.toString();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">" + "'", str9, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType18.outerHtmlTail(stringBuilder20, (int) (byte) 1, outputSettings22);
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType18.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        java.lang.String str29 = documentType18.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node13.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        node33.setBaseUri("");
        org.jsoup.nodes.Node node36 = node33.clone();
        org.jsoup.nodes.Node node37 = node33.clone();
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = node25.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.String str15 = node14.baseUri();
        org.jsoup.nodes.Node node18 = node14.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = node10.baseUri();
        java.lang.String str12 = node10.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str15 = documentType13.attr("");
        java.lang.String str17 = documentType13.attr("hi!");
        java.lang.String str18 = documentType13.toString();
        java.lang.String str19 = documentType13.baseUri();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType13.outerHtmlTail(stringBuilder20, (int) (short) 0, outputSettings22);
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType13.outerHtmlTail(stringBuilder24, (int) (byte) 10, outputSettings26);
        boolean boolean28 = documentType4.equals((java.lang.Object) documentType13);
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder29, (int) (byte) 1, outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str7, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.lang.String str21 = documentType4.baseUri();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.baseUri();
        org.jsoup.nodes.Node node25 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node26 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) -1, outputSettings7);
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str10, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes21 = documentType4.attributes();
        int int22 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        org.jsoup.nodes.Node node22 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean29 = documentType27.hasAttr("<!DOCTYPE html>");
        java.lang.String str31 = documentType27.attr("#doctype");
        java.lang.String str32 = documentType27.outerHtml();
        org.jsoup.nodes.Node node34 = documentType27.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        boolean boolean36 = documentType27.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        boolean boolean37 = node22.equals((java.lang.Object) boolean36);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node22.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("#doctype");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        org.jsoup.nodes.Node node27 = documentType24.parent();
        documentType24.setBaseUri("");
        org.jsoup.nodes.Node node30 = documentType24.parent();
        org.jsoup.nodes.Node node32 = documentType24.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str34 = documentType24.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node35 = documentType24.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node19.before(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        org.jsoup.nodes.Node node32 = node29.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.lang.String str34 = node29.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        int int12 = node9.siblingIndex();
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType23.outerHtmlTail(stringBuilder26, (int) '#', outputSettings28);
        java.lang.String str30 = documentType23.baseUri();
        java.lang.String str31 = documentType23.toString();
        org.jsoup.nodes.Document document32 = documentType23.ownerDocument();
        int int33 = documentType23.siblingIndex();
        documentType23.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node36 = documentType23.clone();
        org.jsoup.nodes.Node node37 = documentType23.clone();
        boolean boolean38 = documentType18.equals((java.lang.Object) node37);
        boolean boolean39 = node13.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        java.lang.String str19 = node16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node22 = node16.attr("<!DOCTYPE html #doctype\">", "#doctype");
        org.jsoup.nodes.Node node23 = node16.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        org.jsoup.nodes.Node node44 = documentType26.parent();
        org.jsoup.nodes.Document document45 = documentType26.ownerDocument();
        org.jsoup.nodes.DocumentType documentType50 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int51 = documentType50.siblingIndex();
        org.jsoup.nodes.Node node52 = documentType50.parent();
        org.jsoup.nodes.Node node53 = documentType50.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = documentType50.childNodes();
        boolean boolean55 = documentType26.equals((java.lang.Object) nodeList54);
        org.jsoup.nodes.Node node58 = documentType26.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Attributes attributes59 = documentType26.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = documentType4.after((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(attributes59);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        java.lang.String str14 = node13.toString();
        org.jsoup.nodes.Node node15 = node13.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str14, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.String str16 = documentType9.baseUri();
        java.lang.String str17 = documentType9.toString();
        org.jsoup.nodes.Document document18 = documentType9.ownerDocument();
        int int19 = documentType9.siblingIndex();
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node22 = documentType9.clone();
        org.jsoup.nodes.Node node23 = documentType9.clone();
        boolean boolean24 = documentType4.equals((java.lang.Object) node23);
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str31 = documentType29.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str32 = documentType29.toString();
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType37.childNodes();
        int int39 = documentType37.siblingIndex();
        org.jsoup.nodes.Node node41 = documentType37.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str42 = node41.outerHtml();
        boolean boolean43 = documentType29.equals((java.lang.Object) node41);
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType29.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node23.before((org.jsoup.nodes.Node) documentType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str32, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">" + "'", str42, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeList44);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.attr("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean15 = documentType13.hasAttr("<!DOCTYPE html>");
        java.lang.String str17 = documentType13.attr("#doctype");
        java.lang.String str18 = documentType13.outerHtml();
        documentType13.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        java.lang.String str7 = documentType4.nodeName();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node12.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        org.jsoup.nodes.Document document29 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node37 = documentType34.attr("hi!", "hi!");
        org.jsoup.nodes.Node node39 = node37.removeAttr("hi!");
        java.lang.String str41 = node39.absUrl("hi!");
        node39.setBaseUri("");
        org.jsoup.nodes.Node node45 = node39.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = node39.childNodes();
        org.jsoup.nodes.Document document47 = node39.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = document29.after(node39);
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
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNull(document47);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (-1), outputSettings16);
        int int18 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node18 = node9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node19 = node18.clone();
        java.lang.String str20 = node18.outerHtml();
        org.jsoup.nodes.Document document21 = node18.ownerDocument();
        org.jsoup.nodes.Attributes attributes22 = node18.attributes();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType27.childNodes();
        org.jsoup.nodes.Node node30 = documentType27.parent();
        documentType27.setBaseUri("");
        java.lang.String str33 = documentType27.toString();
        boolean boolean35 = documentType27.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType27.childNodes();
        org.jsoup.nodes.Node node37 = documentType27.nextSibling();
        org.jsoup.nodes.Node node38 = documentType27.parent();
        java.lang.String str39 = documentType27.outerHtml();
        boolean boolean40 = node18.equals((java.lang.Object) str39);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html>" + "'", str33, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE html>" + "'", str39, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 1, outputSettings7);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        java.lang.Class<?> wildcardClass25 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        java.lang.String str27 = documentType4.outerHtml();
        java.lang.String str28 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType4.childNodes();
        int int24 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node25 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str21, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node18 = node9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node19 = node18.clone();
        java.lang.String str20 = node18.outerHtml();
        org.jsoup.nodes.Node node21 = node18.clone();
        org.jsoup.nodes.Node node24 = node21.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (byte) 0, outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        node36.setBaseUri("hi!");
        org.jsoup.nodes.Document document39 = node36.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node36.unwrap();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(document39);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        java.lang.String str8 = node7.outerHtml();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">" + "'", str8, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node12 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = node12.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node12.childNodes();
        java.lang.String str17 = node12.outerHtml();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType40.childNodes();
        java.lang.String str43 = documentType40.nodeName();
        org.jsoup.nodes.Attributes attributes44 = documentType40.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = documentType27.after((org.jsoup.nodes.Node) documentType40);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
        org.junit.Assert.assertNotNull(attributes44);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, 100, outputSettings21);
        boolean boolean24 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Attributes attributes25 = documentType4.attributes();
        java.lang.String str26 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document10.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html #doctype\">");
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        java.lang.String str21 = documentType4.baseUri();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.baseUri();
        org.jsoup.nodes.Node node25 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document26 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType4.outerHtmlTail(stringBuilder27, (int) '4', outputSettings29);
        org.jsoup.nodes.Node node31 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str8 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 0, outputSettings15);
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        boolean boolean19 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType24.outerHtmlTail(stringBuilder27, (int) '#', outputSettings29);
        java.lang.String str31 = documentType24.baseUri();
        java.lang.String str32 = documentType24.toString();
        boolean boolean34 = documentType24.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node40 = documentType39.clone();
        java.lang.String str41 = documentType39.toString();
        boolean boolean42 = documentType24.equals((java.lang.Object) documentType39);
        org.jsoup.nodes.Node node43 = documentType24.clone();
        java.lang.StringBuilder stringBuilder44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        documentType24.outerHtmlTail(stringBuilder44, (int) ' ', outputSettings46);
        java.lang.String str48 = documentType24.baseUri();
        boolean boolean49 = documentType4.equals((java.lang.Object) str48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str41, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        node10.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
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
        java.lang.String str21 = documentType10.outerHtml();
        org.jsoup.nodes.Node node22 = documentType10.clone();
        boolean boolean23 = node5.equals((java.lang.Object) documentType10);
        org.jsoup.nodes.Node node26 = documentType10.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node26.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.toString();
        java.lang.String str13 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str20 = documentType19.nodeName();
        java.lang.String str21 = documentType19.nodeName();
        boolean boolean22 = node9.equals((java.lang.Object) documentType19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node9.before("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.wrap("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html hi!\">\">");
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
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.lang.String str16 = node9.outerHtml();
        org.jsoup.nodes.Node node17 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        node18.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node21 = node18.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node18.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        java.lang.String str24 = documentType21.outerHtml();
        java.lang.String str26 = documentType21.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodes();
        boolean boolean28 = node15.equals((java.lang.Object) nodeList27);
        java.lang.String str30 = node15.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node33 = node15.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node15.before(node34);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        java.lang.String str21 = documentType4.baseUri();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.baseUri();
        org.jsoup.nodes.Node node25 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document26 = documentType4.ownerDocument();
        int int27 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "#doctype", "");
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) ' ', outputSettings9);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str14 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 0, outputSettings7);
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str12 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        java.lang.String str17 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) (byte) -1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node18 = node9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node19 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            node19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
            org.jsoup.nodes.Node node20 = node14.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        org.jsoup.nodes.Node node21 = node19.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node22 = node19.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = node7.attributes();
        int int9 = node7.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html>", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType10.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType10.outerHtmlTail(stringBuilder13, (int) (short) 100, outputSettings15);
        org.jsoup.nodes.Node node18 = documentType10.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document25 = documentType24.ownerDocument();
        org.jsoup.nodes.Attributes attributes26 = documentType24.attributes();
        java.lang.String str28 = documentType24.attr("");
        boolean boolean29 = node18.equals((java.lang.Object) documentType24);
        boolean boolean30 = documentType4.equals((java.lang.Object) node18);
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType4.outerHtmlTail(stringBuilder31, 100, outputSettings33);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "#doctype", "<!DOCTYPE html hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean11 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = node7.attr("#doctype", "#doctype");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str20 = documentType19.nodeName();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType19.outerHtmlTail(stringBuilder21, (int) (short) 10, outputSettings23);
        int int25 = documentType19.siblingIndex();
        org.jsoup.nodes.Node node26 = documentType19.clone();
        java.lang.String str28 = documentType19.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType16.unwrap();
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
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int28 = documentType27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType27.childNodes();
        documentType27.setBaseUri("<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType27.outerHtmlTail(stringBuilder32, 100, outputSettings34);
        boolean boolean36 = documentType4.equals((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        java.lang.String str12 = node10.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.String str14 = node10.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html>", "hi!");
        org.jsoup.nodes.Node node20 = documentType19.nextSibling();
        java.lang.String str21 = documentType19.nodeName();
        boolean boolean22 = node10.equals((java.lang.Object) documentType19);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node15 = documentType12.attr("hi!", "hi!");
        java.lang.String str17 = node15.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int18 = node15.siblingIndex();
        org.jsoup.nodes.Node node21 = node15.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str23 = node15.attr("");
        org.jsoup.nodes.Node node24 = node15.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node7.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "#doctype", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str17 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node18 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
            org.jsoup.nodes.Node node19 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        boolean boolean18 = documentType4.equals((java.lang.Object) 100);
        org.jsoup.nodes.Node node19 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 10, outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str14 = documentType4.toString();
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        java.lang.String str21 = node11.baseUri();
        java.lang.String str22 = node11.toString();
        int int23 = node11.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int11 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.Class<?> wildcardClass13 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str8, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        org.jsoup.nodes.Node node22 = documentType4.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html>");
        boolean boolean24 = documentType4.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        node19.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node20 = node16.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node14.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.toString();
        java.lang.String str11 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        java.lang.String str17 = documentType4.outerHtml();
        java.lang.String str18 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
            documentType4.outerHtmlHead(stringBuilder12, (int) ' ', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (byte) 10, outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.String str16 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        java.lang.String str24 = documentType17.baseUri();
        org.jsoup.nodes.Node node27 = documentType17.attr("hi!", "hi!");
        org.jsoup.nodes.Node node28 = node27.clone();
        int int29 = node27.siblingIndex();
        org.jsoup.nodes.Node node32 = node27.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str34 = node27.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node36 = node27.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node37 = node27.parent();
        java.lang.String str38 = node27.toString();
        org.jsoup.nodes.Node node39 = node27.parent();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE html>" + "'", str38, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 100, outputSettings15);
        java.lang.String str17 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        java.lang.String str19 = node18.outerHtml();
        org.jsoup.nodes.Attributes attributes20 = node18.attributes();
        java.lang.String str22 = node18.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Attributes attributes23 = node18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node18.unwrap();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str11 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document15 = documentType14.ownerDocument();
        documentType14.setBaseUri("#doctype");
        boolean boolean18 = documentType4.equals((java.lang.Object) "#doctype");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        org.jsoup.nodes.Node node30 = documentType23.removeAttr("hi!");
        boolean boolean32 = node30.hasAttr("<!DOCTYPE html>");
        node30.setBaseUri("hi!");
        int int35 = node30.siblingIndex();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        org.jsoup.nodes.Node node42 = documentType40.parent();
        org.jsoup.nodes.Node node43 = documentType40.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType40.childNodes();
        boolean boolean45 = node30.equals((java.lang.Object) documentType40);
        org.jsoup.nodes.Attributes attributes46 = documentType40.attributes();
        documentType40.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node49 = documentType40.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        node36.setBaseUri("hi!");
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int44 = documentType43.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = documentType43.childNodes();
        java.lang.StringBuilder stringBuilder46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = null;
        documentType43.outerHtmlTail(stringBuilder46, (int) '#', outputSettings48);
        java.lang.String str50 = documentType43.baseUri();
        org.jsoup.nodes.Document document51 = documentType43.ownerDocument();
        boolean boolean53 = documentType43.hasAttr("hi!");
        org.jsoup.nodes.Node node54 = documentType43.nextSibling();
        java.lang.StringBuilder stringBuilder55 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = null;
        documentType43.outerHtmlTail(stringBuilder55, 1, outputSettings57);
        java.lang.String str60 = documentType43.attr("<!DOCTYPE html>");
        int int61 = documentType43.siblingIndex();
        java.lang.StringBuilder stringBuilder62 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings64 = null;
        documentType43.outerHtmlTail(stringBuilder62, (int) (byte) 0, outputSettings64);
        java.lang.String str66 = documentType43.toString();
        documentType43.setBaseUri("#doctype");
        boolean boolean70 = documentType43.hasAttr("hi!");
        boolean boolean71 = node36.equals((java.lang.Object) documentType43);
        java.lang.String str73 = node36.absUrl("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(document51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!DOCTYPE html>" + "'", str66, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
            org.jsoup.nodes.Node node20 = node18.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        org.jsoup.nodes.Attributes attributes16 = documentType4.attributes();
        java.lang.Object obj17 = null;
        boolean boolean18 = documentType4.equals(obj17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        boolean boolean18 = documentType4.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) 'a', outputSettings21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType28.outerHtmlTail(stringBuilder31, (int) '#', outputSettings33);
        java.lang.String str35 = documentType28.baseUri();
        org.jsoup.nodes.Document document36 = documentType28.ownerDocument();
        java.lang.String str37 = documentType28.baseUri();
        org.jsoup.nodes.Node node39 = documentType28.removeAttr("<!DOCTYPE html>");
        boolean boolean40 = documentType4.equals((java.lang.Object) node39);
        int int41 = node39.siblingIndex();
        org.jsoup.nodes.Node node42 = node39.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node39.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        boolean boolean12 = documentType4.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean19 = documentType17.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str21 = documentType17.attr("#doctype");
        org.jsoup.nodes.Document document22 = documentType17.ownerDocument();
        int int23 = documentType17.siblingIndex();
        boolean boolean24 = documentType4.equals((java.lang.Object) int23);
        org.jsoup.nodes.Document document25 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes26 = document25.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.String str8 = node7.outerHtml();
        java.lang.String str10 = node7.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (short) 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        java.lang.String str20 = documentType16.absUrl("#doctype");
        org.jsoup.nodes.Node node21 = documentType16.parent();
        java.lang.String str23 = documentType16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType16.outerHtmlTail(stringBuilder24, (int) (short) 1, outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = documentType4.baseUri();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "#doctype");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        org.jsoup.nodes.Node node27 = documentType24.parent();
        documentType24.setBaseUri("");
        java.lang.String str30 = documentType24.toString();
        boolean boolean31 = documentType17.equals((java.lang.Object) documentType24);
        org.jsoup.nodes.Node node32 = documentType17.parent();
        java.lang.String str34 = documentType17.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document35 = documentType17.ownerDocument();
        documentType17.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(document35);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str13 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node15 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        boolean boolean24 = documentType20.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node25 = documentType20.nextSibling();
        java.lang.String str27 = documentType20.absUrl("hi!");
        int int28 = documentType20.siblingIndex();
        java.lang.String str29 = documentType20.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node24 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType15.outerHtmlTail(stringBuilder18, (int) '#', outputSettings20);
        org.jsoup.nodes.Node node22 = documentType15.clone();
        java.lang.String str24 = documentType15.attr("#doctype");
        java.lang.String str26 = documentType15.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str27 = documentType15.toString();
        boolean boolean29 = documentType15.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType15.outerHtmlTail(stringBuilder30, (int) 'a', outputSettings32);
        java.lang.String str34 = documentType15.baseUri();
        java.lang.String str36 = documentType15.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        documentType15.setBaseUri("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node10.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document18 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, 10, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        java.lang.String str14 = documentType13.toString();
        java.lang.String str15 = documentType13.nodeName();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        int int23 = documentType20.siblingIndex();
        java.lang.String str24 = documentType20.nodeName();
        java.lang.String str26 = documentType20.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType20.setBaseUri("hi!");
        org.jsoup.nodes.Node node31 = documentType20.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType20.childNodes();
        boolean boolean33 = documentType13.equals((java.lang.Object) nodeList32);
        boolean boolean34 = documentType4.equals((java.lang.Object) documentType13);
        org.jsoup.nodes.Attributes attributes35 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html hi!\">" + "'", str14, "<!DOCTYPE html hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str10 = node7.toString();
        java.lang.String str11 = node7.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        org.jsoup.nodes.Node node19 = documentType16.parent();
        documentType16.setBaseUri("");
        org.jsoup.nodes.Node node23 = documentType16.removeAttr("hi!");
        boolean boolean25 = node23.hasAttr("<!DOCTYPE html>");
        node23.setBaseUri("hi!");
        int int28 = node23.siblingIndex();
        java.lang.String str29 = node23.toString();
        java.lang.String str30 = node23.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node7.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        org.jsoup.nodes.Attributes attributes22 = node21.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 0, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        org.jsoup.nodes.Node node22 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        boolean boolean24 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        org.jsoup.nodes.Node node22 = documentType4.attr("#doctype", "");
        org.jsoup.nodes.Node node23 = documentType4.parent();
        java.lang.String str24 = documentType4.toString();
        java.lang.String str25 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType11.outerHtmlTail(stringBuilder14, (int) '#', outputSettings16);
        java.lang.String str18 = documentType11.baseUri();
        org.jsoup.nodes.Document document19 = documentType11.ownerDocument();
        boolean boolean21 = documentType11.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = documentType11.nextSibling();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType11.outerHtmlTail(stringBuilder23, 1, outputSettings25);
        java.lang.String str28 = documentType11.attr("<!DOCTYPE html>");
        int int29 = documentType11.siblingIndex();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType11.outerHtmlTail(stringBuilder30, (int) (byte) 0, outputSettings32);
        int int34 = documentType11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 1, outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType16.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType16.childNodes();
        java.lang.String str20 = documentType16.baseUri();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        org.jsoup.nodes.Node node28 = documentType25.parent();
        org.jsoup.nodes.Node node29 = documentType25.nextSibling();
        boolean boolean31 = documentType25.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = documentType25.clone();
        boolean boolean33 = documentType16.equals((java.lang.Object) node32);
        java.lang.Class<?> wildcardClass34 = documentType16.getClass();
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str37 = documentType16.absUrl("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str7, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.String str17 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        java.lang.String str19 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before("");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node13 = node10.attr("<!DOCTYPE html hi!\">", "");
        boolean boolean15 = node10.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        java.lang.String str7 = documentType4.nodeName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        java.lang.String str19 = documentType4.nodeName();
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html>");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        org.jsoup.nodes.Node node20 = node19.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes21 = node20.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType16.outerHtmlHead(stringBuilder36, (int) (byte) 10, outputSettings38);
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
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        boolean boolean18 = documentType4.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) 'a', outputSettings21);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType28.outerHtmlTail(stringBuilder31, (int) '#', outputSettings33);
        java.lang.String str35 = documentType28.baseUri();
        org.jsoup.nodes.Document document36 = documentType28.ownerDocument();
        java.lang.String str37 = documentType28.baseUri();
        org.jsoup.nodes.Node node39 = documentType28.removeAttr("<!DOCTYPE html>");
        boolean boolean40 = documentType4.equals((java.lang.Object) node39);
        int int41 = node39.siblingIndex();
        java.lang.Class<?> wildcardClass42 = node39.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        java.lang.String str24 = node20.outerHtml();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int30 = documentType29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType29.childNodes();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType29.outerHtmlTail(stringBuilder32, (int) '#', outputSettings34);
        java.lang.String str36 = documentType29.baseUri();
        org.jsoup.nodes.Node node39 = documentType29.attr("hi!", "hi!");
        org.jsoup.nodes.Node node40 = node39.clone();
        java.lang.String str41 = node39.outerHtml();
        org.jsoup.nodes.Node node43 = node39.removeAttr("hi!");
        org.jsoup.nodes.Node node44 = node43.nextSibling();
        boolean boolean46 = node43.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean48 = node43.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith(node43);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html>" + "'", str41, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        org.jsoup.nodes.Node node22 = node14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "", "<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.nodes.Node node14 = documentType9.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType9.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType9.childNodes();
        boolean boolean17 = documentType4.equals((java.lang.Object) documentType9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.childNodes();
        java.lang.String str23 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType4.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, 1, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
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
        java.lang.String str19 = node18.outerHtml();
        org.jsoup.nodes.Attributes attributes20 = node18.attributes();
        int int21 = node18.siblingIndex();
        java.lang.String str22 = node18.outerHtml();
        org.jsoup.nodes.Node node23 = node18.clone();
        org.jsoup.nodes.Node node24 = node18.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, (int) (byte) -1, outputSettings22);
        java.lang.String str24 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType4.outerHtmlTail(stringBuilder25, (int) '#', outputSettings27);
        java.lang.String str29 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.wrap("<!DOCTYPE html #doctype\">");
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
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        org.jsoup.nodes.Node node20 = documentType13.clone();
        java.lang.String str22 = documentType13.attr("#doctype");
        java.lang.String str24 = documentType13.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean14 = documentType12.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = documentType12.parent();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType12.outerHtmlTail(stringBuilder16, (int) (byte) 1, outputSettings18);
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        org.jsoup.nodes.Attributes attributes26 = documentType24.attributes();
        java.lang.String str28 = documentType24.attr("hi!");
        org.jsoup.nodes.Node node29 = documentType24.clone();
        org.jsoup.nodes.Node node32 = documentType24.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        boolean boolean33 = documentType12.equals((java.lang.Object) node32);
        boolean boolean34 = documentType4.equals((java.lang.Object) documentType12);
        org.jsoup.nodes.Attributes attributes35 = documentType4.attributes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (byte) 1, outputSettings8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        org.jsoup.nodes.Node node26 = documentType23.parent();
        documentType23.setBaseUri("");
        org.jsoup.nodes.Node node29 = documentType23.parent();
        org.jsoup.nodes.Document document30 = documentType23.ownerDocument();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int36 = documentType35.siblingIndex();
        org.jsoup.nodes.Attributes attributes37 = documentType35.attributes();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int43 = documentType42.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType42.childNodes();
        org.jsoup.nodes.Node node45 = documentType42.parent();
        documentType42.setBaseUri("");
        java.lang.String str48 = documentType42.toString();
        boolean boolean49 = documentType35.equals((java.lang.Object) documentType42);
        boolean boolean50 = documentType23.equals((java.lang.Object) documentType35);
        java.lang.String str52 = documentType35.absUrl("hi!");
        documentType35.setBaseUri("<!DOCTYPE html>");
        java.lang.String str55 = documentType35.outerHtml();
        org.jsoup.nodes.Node node56 = documentType35.clone();
        boolean boolean57 = documentType4.equals((java.lang.Object) documentType35);
        org.jsoup.nodes.Node node58 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE html>" + "'", str48, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!DOCTYPE html>" + "'", str55, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        org.jsoup.nodes.Node node22 = documentType4.clone();
        org.jsoup.nodes.Node node23 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str17 = node11.toString();
        java.lang.String str18 = node11.outerHtml();
        org.jsoup.nodes.Node node20 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Attributes attributes21 = node20.attributes();
        int int22 = node20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node20.childNodes();
        org.jsoup.nodes.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node20.before(node24);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int15 = node14.siblingIndex();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node23 = documentType20.attr("hi!", "hi!");
        boolean boolean25 = documentType20.hasAttr("");
        int int26 = documentType20.siblingIndex();
        java.lang.String str28 = documentType20.absUrl("#doctype");
        int int29 = documentType20.siblingIndex();
        int int30 = documentType20.siblingIndex();
        boolean boolean31 = node14.equals((java.lang.Object) documentType20);
        java.lang.String str32 = node14.toString();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str16 = node9.baseUri();
        org.jsoup.nodes.Attributes attributes17 = node9.attributes();
        java.lang.String str19 = node9.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType24.outerHtmlTail(stringBuilder27, (int) '#', outputSettings29);
        java.lang.String str31 = documentType24.baseUri();
        java.lang.String str32 = documentType24.toString();
        boolean boolean34 = documentType24.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node40 = documentType39.clone();
        java.lang.String str41 = documentType39.toString();
        boolean boolean42 = documentType24.equals((java.lang.Object) documentType39);
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) documentType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str41, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType15.outerHtmlTail(stringBuilder18, (int) '#', outputSettings20);
        java.lang.String str22 = documentType15.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node9.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.String str16 = documentType9.baseUri();
        java.lang.String str17 = documentType9.toString();
        org.jsoup.nodes.Document document18 = documentType9.ownerDocument();
        int int19 = documentType9.siblingIndex();
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node22 = documentType9.clone();
        org.jsoup.nodes.Node node23 = documentType9.clone();
        boolean boolean24 = documentType4.equals((java.lang.Object) node23);
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str31 = documentType29.attr("");
        int int32 = documentType29.siblingIndex();
        java.lang.String str34 = documentType29.absUrl("<!DOCTYPE html>");
        boolean boolean36 = documentType29.hasAttr("");
        org.jsoup.nodes.DocumentType documentType41 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int42 = documentType41.siblingIndex();
        java.lang.Class<?> wildcardClass43 = documentType41.getClass();
        boolean boolean44 = documentType29.equals((java.lang.Object) wildcardClass43);
        java.lang.String str45 = documentType29.baseUri();
        boolean boolean46 = node23.equals((java.lang.Object) str45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
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
        java.lang.String str24 = documentType4.baseUri();
        org.jsoup.nodes.Node node25 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node25.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.baseUri();
        java.lang.String str13 = node9.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.Document document14 = node9.ownerDocument();
        node9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass17 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        org.jsoup.nodes.Node node29 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node30 = node29.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node30.childNode(1);
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "hi!", "<!DOCTYPE html>", "#doctype");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) 'a', outputSettings9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (int) (byte) 100, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        int int12 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        java.lang.Class<?> wildcardClass16 = documentType4.getClass();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.unwrap();
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        java.lang.String str17 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        boolean boolean20 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (short) 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Node node29 = documentType19.attr("hi!", "hi!");
        int int30 = node29.siblingIndex();
        org.jsoup.nodes.Node node31 = node29.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node14.before(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        int int18 = node16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node16.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, 1, outputSettings7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) 'a', outputSettings11);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        org.jsoup.nodes.Node node21 = node18.clone();
        boolean boolean23 = node18.hasAttr("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        java.lang.Class<?> wildcardClass29 = attributes28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 100, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.clone();
        java.lang.String str15 = node14.baseUri();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
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
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node17 = node14.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node25 = documentType22.attr("hi!", "hi!");
        org.jsoup.nodes.Node node27 = node25.removeAttr("hi!");
        boolean boolean29 = node25.equals((java.lang.Object) 100);
        boolean boolean31 = node25.hasAttr("#doctype");
        boolean boolean33 = node25.hasAttr("#doctype");
        org.jsoup.nodes.Node node34 = node25.clone();
        org.jsoup.nodes.Node node35 = node34.clone();
        org.jsoup.nodes.Node node36 = node34.clone();
        java.lang.String str37 = node36.outerHtml();
        org.jsoup.nodes.Node node40 = node36.attr("hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node17.before(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType15.outerHtmlTail(stringBuilder18, (int) '#', outputSettings20);
        org.jsoup.nodes.Node node22 = documentType15.clone();
        java.lang.String str24 = documentType15.attr("#doctype");
        java.lang.String str26 = documentType15.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str27 = documentType15.toString();
        boolean boolean29 = documentType15.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType15.outerHtmlTail(stringBuilder30, (int) 'a', outputSettings32);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType15.childNodes();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int40 = documentType39.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType39.childNodes();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        documentType39.outerHtmlTail(stringBuilder42, (int) '#', outputSettings44);
        java.lang.String str46 = documentType39.baseUri();
        org.jsoup.nodes.Document document47 = documentType39.ownerDocument();
        java.lang.String str48 = documentType39.baseUri();
        org.jsoup.nodes.Node node50 = documentType39.removeAttr("<!DOCTYPE html>");
        boolean boolean51 = documentType15.equals((java.lang.Object) node50);
        int int52 = node50.siblingIndex();
        org.jsoup.nodes.Node node53 = node50.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = node50.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = documentType4.before(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeList54);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (int) (byte) 10, outputSettings23);
        java.lang.String str25 = documentType4.nodeName();
        org.jsoup.nodes.Node node27 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        org.jsoup.nodes.Attributes attributes20 = documentType18.attributes();
        java.lang.String str21 = documentType18.outerHtml();
        java.lang.String str23 = documentType18.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodes();
        org.jsoup.nodes.Node node25 = documentType18.nextSibling();
        org.jsoup.nodes.Node node26 = documentType18.parent();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType18.outerHtmlTail(stringBuilder27, (int) (short) 1, outputSettings29);
        org.jsoup.nodes.Node node33 = documentType18.attr("<!DOCTYPE html #doctype\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node13.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        boolean boolean9 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        java.lang.String str14 = node12.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int15 = node12.siblingIndex();
        org.jsoup.nodes.Node node18 = node12.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = node18.clone();
        org.jsoup.nodes.Node node20 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Document document18 = node16.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        boolean boolean20 = node17.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node17.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        java.lang.String str18 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, (int) (byte) 10, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        org.jsoup.nodes.Node node17 = node16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        boolean boolean20 = node17.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node17.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        int int25 = node11.siblingIndex();
        org.jsoup.nodes.Node node27 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str29 = node11.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE html #doctype\">", "hi!");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str11 = documentType9.attr("");
        java.lang.String str13 = documentType9.attr("hi!");
        java.lang.String str14 = documentType9.toString();
        java.lang.String str15 = documentType9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType9.childNodes();
        org.jsoup.nodes.Node node19 = documentType9.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node20 = documentType9.clone();
        boolean boolean21 = documentType4.equals((java.lang.Object) node20);
        org.jsoup.nodes.Attributes attributes22 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        boolean boolean18 = documentType4.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) 'a', outputSettings21);
        java.lang.String str23 = documentType4.baseUri();
        java.lang.String str25 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        java.lang.String str11 = documentType4.toString();
        java.lang.String str12 = documentType4.toString();
        java.lang.String str13 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        java.lang.String str11 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str15 = node9.toString();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        org.jsoup.nodes.Node node24 = documentType4.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType4.outerHtmlTail(stringBuilder27, 1, outputSettings29);
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder31, (int) (byte) 100, outputSettings33);
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
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (byte) 10, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.childNodes();
        org.jsoup.nodes.Node node13 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str14 = node13.outerHtml();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodes();
        org.jsoup.nodes.Document document18 = node16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        boolean boolean20 = node15.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        java.lang.String str21 = node15.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        documentType4.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        node16.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        int int17 = node15.siblingIndex();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document23 = documentType22.ownerDocument();
        org.jsoup.nodes.Attributes attributes24 = documentType22.attributes();
        org.jsoup.nodes.Node node26 = documentType22.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node27 = documentType22.clone();
        java.lang.String str28 = documentType22.baseUri();
        boolean boolean30 = documentType22.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node32 = documentType22.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node34 = node32.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node15.before(node32);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (byte) 100, outputSettings16);
        org.jsoup.nodes.Node node20 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        java.lang.String str51 = documentType39.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList52 = documentType39.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        java.lang.String str21 = node18.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.jsoup.nodes.Node node22 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType18.outerHtmlTail(stringBuilder21, (int) '#', outputSettings23);
        java.lang.String str25 = documentType18.baseUri();
        org.jsoup.nodes.Node node28 = documentType18.attr("hi!", "hi!");
        int int29 = node28.siblingIndex();
        boolean boolean30 = documentType4.equals((java.lang.Object) node28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">", "#doctype");
        int int14 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        org.jsoup.nodes.Node node30 = documentType4.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.childNodes();
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        org.jsoup.nodes.Attributes attributes37 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int43 = documentType42.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType42.childNodes();
        int int45 = documentType42.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = documentType42.childNodes();
        boolean boolean47 = documentType4.equals((java.lang.Object) documentType42);
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = documentType4.unwrap();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        documentType4.setBaseUri("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, 0, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        int int12 = node9.siblingIndex();
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        java.lang.String str21 = documentType4.baseUri();
        java.lang.String str22 = documentType4.nodeName();
        java.lang.String str23 = documentType4.baseUri();
        org.jsoup.nodes.Node node25 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node26 = documentType4.clone();
        java.lang.String str28 = documentType4.absUrl("#doctype");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        int int16 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node17 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        org.jsoup.nodes.Node node23 = node21.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
        java.lang.String str25 = node21.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        org.jsoup.nodes.Node node13 = node10.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node14 = node10.clone();
        java.lang.String str16 = node14.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str5 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node9 = node8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = node9.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html>" + "'", str5, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        java.lang.String str21 = documentType14.baseUri();
        java.lang.String str22 = documentType14.toString();
        boolean boolean24 = documentType14.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node30 = documentType29.clone();
        java.lang.String str31 = documentType29.toString();
        boolean boolean32 = documentType14.equals((java.lang.Object) documentType29);
        org.jsoup.nodes.Node node33 = documentType14.clone();
        boolean boolean34 = documentType4.equals((java.lang.Object) node33);
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str31, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType11.outerHtmlTail(stringBuilder14, (int) (short) 100, outputSettings16);
        org.jsoup.nodes.Node node20 = documentType11.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType11.outerHtmlTail(stringBuilder21, 1, outputSettings23);
        boolean boolean25 = documentType4.equals((java.lang.Object) 1);
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node32 = documentType30.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str33 = node32.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.before(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str33, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 1, outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType16.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType16.childNodes();
        java.lang.String str20 = documentType16.baseUri();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        org.jsoup.nodes.Node node28 = documentType25.parent();
        org.jsoup.nodes.Node node29 = documentType25.nextSibling();
        boolean boolean31 = documentType25.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = documentType25.clone();
        boolean boolean33 = documentType16.equals((java.lang.Object) node32);
        java.lang.Class<?> wildcardClass34 = documentType16.getClass();
        boolean boolean35 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node38 = documentType16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str6, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str7, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        java.lang.String str14 = documentType4.toString();
        int int15 = documentType4.siblingIndex();
        int int16 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str14, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str18 = node11.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node19 = node11.clone();
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node7.attr("");
        java.lang.String str13 = node7.absUrl("hi!");
        org.jsoup.nodes.Node node14 = node7.clone();
        int int15 = node14.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.Class<?> wildcardClass8 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
            org.jsoup.nodes.Node node20 = documentType4.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document5.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        int int7 = node6.siblingIndex();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        node9.setBaseUri("#doctype");
        org.jsoup.nodes.Node node13 = node9.nextSibling();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        java.lang.String str28 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\" hi!\">");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        int int7 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        java.lang.String str23 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType28.outerHtmlTail(stringBuilder31, (int) '#', outputSettings33);
        java.lang.String str35 = documentType28.baseUri();
        org.jsoup.nodes.Node node38 = documentType28.attr("hi!", "hi!");
        java.lang.String str39 = documentType28.baseUri();
        boolean boolean41 = documentType28.hasAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int47 = documentType46.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = documentType46.childNodes();
        org.jsoup.nodes.Node node49 = documentType46.parent();
        documentType46.setBaseUri("");
        org.jsoup.nodes.Node node53 = documentType46.removeAttr("hi!");
        org.jsoup.nodes.Node node54 = node53.parent();
        org.jsoup.nodes.DocumentType documentType59 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int60 = documentType59.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = documentType59.childNodes();
        org.jsoup.nodes.Node node62 = documentType59.parent();
        org.jsoup.nodes.Node node63 = documentType59.nextSibling();
        boolean boolean65 = documentType59.hasAttr("hi!");
        boolean boolean66 = node53.equals((java.lang.Object) "hi!");
        boolean boolean67 = documentType28.equals((java.lang.Object) boolean66);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = documentType28.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node69 = documentType4.after((org.jsoup.nodes.Node) documentType28);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeList68);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str16 = node9.outerHtml();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType21.outerHtmlTail(stringBuilder24, (int) '#', outputSettings26);
        java.lang.String str28 = documentType21.baseUri();
        org.jsoup.nodes.Node node31 = documentType21.attr("hi!", "hi!");
        org.jsoup.nodes.Node node32 = node31.clone();
        int int33 = node31.siblingIndex();
        org.jsoup.nodes.Node node36 = node31.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str37 = node31.baseUri();
        boolean boolean38 = node9.equals((java.lang.Object) str37);
        org.jsoup.nodes.Node node41 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.jsoup.nodes.Document document42 = node41.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document42.setBaseUri("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(document42);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType20.outerHtmlTail(stringBuilder23, (int) '#', outputSettings25);
        java.lang.String str27 = documentType20.baseUri();
        org.jsoup.nodes.Document document28 = documentType20.ownerDocument();
        documentType20.setBaseUri("hi!");
        java.lang.String str32 = documentType20.absUrl("hi!");
        org.jsoup.nodes.Document document33 = documentType20.ownerDocument();
        java.lang.String str35 = documentType20.attr("#doctype");
        org.jsoup.nodes.Node node38 = documentType20.attr("#doctype", "");
        boolean boolean39 = node15.equals((java.lang.Object) node38);
        java.lang.String str40 = node38.toString();
        org.jsoup.nodes.Attributes attributes41 = node38.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node38.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!DOCTYPE html>" + "'", str40, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        org.jsoup.nodes.Node node20 = node15.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 1, outputSettings13);
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 10, outputSettings13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html>", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType10.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType10.outerHtmlTail(stringBuilder13, (int) (short) 100, outputSettings15);
        org.jsoup.nodes.Node node18 = documentType10.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document25 = documentType24.ownerDocument();
        org.jsoup.nodes.Attributes attributes26 = documentType24.attributes();
        java.lang.String str28 = documentType24.attr("");
        boolean boolean29 = node18.equals((java.lang.Object) documentType24);
        boolean boolean30 = documentType4.equals((java.lang.Object) node18);
        java.lang.String str31 = documentType4.baseUri();
        java.lang.String str32 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">" + "'", str32, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html>\">");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) '#', outputSettings13);
        java.lang.String str16 = documentType4.attr("hi!");
        java.lang.String str17 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass18 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        int int5 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType16.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType16.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        java.lang.String str18 = node16.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str19 = node16.baseUri();
        org.jsoup.nodes.Node node22 = node16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.jsoup.nodes.Node node23 = node16.nextSibling();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = node12.clone();
        node12.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str16 = node12.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (byte) 10, outputSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        org.jsoup.nodes.Node node18 = documentType4.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        int int25 = node11.siblingIndex();
        node11.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        node11.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node11.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        boolean boolean22 = node19.hasAttr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node15 = documentType12.attr("hi!", "hi!");
        org.jsoup.nodes.Node node17 = node15.removeAttr("hi!");
        java.lang.String str19 = node17.absUrl("hi!");
        node17.setBaseUri("");
        org.jsoup.nodes.Node node23 = node17.removeAttr("#doctype");
        org.jsoup.nodes.Node node26 = node17.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        boolean boolean27 = documentType4.equals((java.lang.Object) node26);
        org.jsoup.nodes.Document document28 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        org.jsoup.nodes.Node node31 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int37 = documentType36.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType36.childNodes();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType36.outerHtmlTail(stringBuilder39, (int) '#', outputSettings41);
        java.lang.String str43 = documentType36.baseUri();
        org.jsoup.nodes.Node node46 = documentType36.attr("hi!", "hi!");
        org.jsoup.nodes.Node node47 = node46.clone();
        java.lang.String str48 = node47.toString();
        java.lang.String str49 = node47.toString();
        boolean boolean50 = node31.equals((java.lang.Object) str49);
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int56 = documentType55.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = documentType55.childNodes();
        java.lang.StringBuilder stringBuilder58 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = null;
        documentType55.outerHtmlTail(stringBuilder58, (int) (short) 100, outputSettings60);
        org.jsoup.nodes.Node node62 = documentType55.parent();
        java.lang.String str63 = documentType55.toString();
        org.jsoup.nodes.Node node65 = documentType55.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node68 = documentType55.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder69 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings71 = null;
        documentType55.outerHtmlTail(stringBuilder69, (int) (short) 0, outputSettings71);
        org.jsoup.nodes.Node node74 = documentType55.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node75 = node31.after((org.jsoup.nodes.Node) documentType55);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE html>" + "'", str48, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!DOCTYPE html>" + "'", str49, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!DOCTYPE html>" + "'", str63, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        java.lang.String str19 = documentType4.nodeName();
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        java.lang.Class<?> wildcardClass38 = documentType16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node9.baseUri();
        java.lang.String str14 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes15 = node9.attributes();
        org.jsoup.nodes.Node node17 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str17 = node11.toString();
        java.lang.String str18 = node11.outerHtml();
        org.jsoup.nodes.Node node20 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.childNodes();
        java.lang.String str23 = node20.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document13.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str9 = documentType4.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        org.jsoup.nodes.Attributes attributes28 = documentType26.attributes();
        java.lang.String str29 = documentType26.outerHtml();
        org.jsoup.nodes.Node node31 = documentType26.removeAttr("hi!");
        boolean boolean33 = node31.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean34 = documentType4.equals((java.lang.Object) node31);
        boolean boolean36 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node38 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        org.jsoup.nodes.Document document23 = node19.ownerDocument();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document34 = documentType33.ownerDocument();
        org.jsoup.nodes.Attributes attributes35 = documentType33.attributes();
        boolean boolean36 = documentType28.equals((java.lang.Object) attributes35);
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType28.outerHtmlTail(stringBuilder37, (int) (short) 1, outputSettings39);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node19.before((org.jsoup.nodes.Node) documentType28);
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        java.lang.String str18 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node7.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) '#', outputSettings21);
        java.lang.String str23 = documentType16.baseUri();
        org.jsoup.nodes.Document document24 = documentType16.ownerDocument();
        documentType16.setBaseUri("hi!");
        java.lang.String str28 = documentType16.absUrl("hi!");
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType16.outerHtmlTail(stringBuilder29, (int) ' ', outputSettings31);
        java.lang.String str33 = documentType16.baseUri();
        java.lang.String str34 = documentType16.nodeName();
        java.lang.String str35 = documentType16.baseUri();
        org.jsoup.nodes.Node node37 = documentType16.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node38 = documentType16.clone();
        boolean boolean39 = node11.equals((java.lang.Object) node38);
        node38.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType23.outerHtmlTail(stringBuilder26, (int) '#', outputSettings28);
        java.lang.String str30 = documentType23.baseUri();
        org.jsoup.nodes.Document document31 = documentType23.ownerDocument();
        boolean boolean33 = documentType23.hasAttr("hi!");
        org.jsoup.nodes.Node node34 = documentType23.nextSibling();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType23.outerHtmlTail(stringBuilder35, 1, outputSettings37);
        org.jsoup.nodes.Node node40 = documentType23.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node42 = documentType23.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        org.jsoup.nodes.Node node17 = node16.clone();
        org.jsoup.nodes.Node node18 = node16.clone();
        boolean boolean20 = node16.hasAttr("");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        org.jsoup.nodes.Document document22 = node15.ownerDocument();
        org.jsoup.nodes.Attributes attributes23 = node15.attributes();
        boolean boolean25 = node15.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
            org.jsoup.nodes.Node node23 = document22.unwrap();
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
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        int int13 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("#doctype");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (byte) 10, outputSettings15);
        org.jsoup.nodes.Node node18 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        boolean boolean18 = node15.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str20 = node15.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
        java.lang.String str20 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 10, outputSettings14);
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Node node21 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        java.lang.String str21 = node20.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node20.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, (int) (short) 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        java.lang.String str13 = documentType9.attr("hi!");
        org.jsoup.nodes.Node node14 = documentType9.clone();
        boolean boolean16 = node14.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        org.jsoup.nodes.Node node23 = documentType20.parent();
        documentType20.setBaseUri("");
        org.jsoup.nodes.Node node27 = documentType20.removeAttr("hi!");
        org.jsoup.nodes.Node node28 = node27.parent();
        boolean boolean29 = documentType4.equals((java.lang.Object) node27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
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
        org.jsoup.nodes.Node node30 = documentType4.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str32 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder33, (int) (byte) 0, outputSettings35);
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        int int13 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        java.lang.String str20 = documentType13.baseUri();
        java.lang.String str21 = documentType13.toString();
        boolean boolean23 = documentType13.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node29 = documentType28.clone();
        java.lang.String str30 = documentType28.toString();
        boolean boolean31 = documentType13.equals((java.lang.Object) documentType28);
        int int32 = documentType28.siblingIndex();
        boolean boolean33 = documentType4.equals((java.lang.Object) documentType28);
        java.lang.String str35 = documentType28.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">\">\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str30, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.baseUri();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        node11.setBaseUri("hi!");
        int int16 = node11.siblingIndex();
        java.lang.String str18 = node11.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str19 = node11.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType13.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        java.lang.String str5 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType22.outerHtmlTail(stringBuilder25, (int) '#', outputSettings27);
        java.lang.String str29 = documentType22.baseUri();
        org.jsoup.nodes.Document document30 = documentType22.ownerDocument();
        boolean boolean32 = documentType22.hasAttr("hi!");
        org.jsoup.nodes.Node node33 = documentType22.nextSibling();
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType22.outerHtmlTail(stringBuilder34, 1, outputSettings36);
        java.lang.String str39 = documentType22.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str40 = documentType22.baseUri();
        org.jsoup.nodes.Node node42 = documentType22.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean44 = node42.hasAttr("");
        org.jsoup.nodes.Document document45 = node42.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = node16.after((org.jsoup.nodes.Node) document45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        java.lang.String str20 = documentType13.baseUri();
        java.lang.String str21 = documentType13.toString();
        boolean boolean23 = documentType13.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node29 = documentType28.clone();
        java.lang.String str30 = documentType28.toString();
        boolean boolean31 = documentType13.equals((java.lang.Object) documentType28);
        int int32 = documentType28.siblingIndex();
        boolean boolean33 = documentType4.equals((java.lang.Object) documentType28);
        org.jsoup.nodes.Document document34 = documentType28.ownerDocument();
        documentType28.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str30, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(document34);
    }
}

