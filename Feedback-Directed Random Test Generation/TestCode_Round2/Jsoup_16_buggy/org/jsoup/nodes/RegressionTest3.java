package org.jsoup.nodes;

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
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType30);
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
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        org.jsoup.nodes.Node node29 = documentType26.attr("hi!", "hi!");
        boolean boolean31 = documentType26.hasAttr("");
        int int32 = documentType26.siblingIndex();
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node40 = documentType37.attr("hi!", "hi!");
        org.jsoup.nodes.Node node42 = node40.removeAttr("hi!");
        boolean boolean44 = node40.equals((java.lang.Object) 100);
        org.jsoup.nodes.Document document45 = node40.ownerDocument();
        boolean boolean46 = documentType26.equals((java.lang.Object) node40);
        java.lang.String str47 = node40.toString();
        boolean boolean48 = documentType4.equals((java.lang.Object) str47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = documentType4.previousSibling();
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!DOCTYPE html>" + "'", str47, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "hi!", "<!DOCTYPE html #doctype\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html hi!\">" + "'", str5, "<!DOCTYPE html hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int40 = documentType39.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType39.childNodes();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        documentType39.outerHtmlTail(stringBuilder42, (int) '#', outputSettings44);
        java.lang.String str46 = documentType39.baseUri();
        org.jsoup.nodes.Document document47 = documentType39.ownerDocument();
        boolean boolean49 = documentType39.hasAttr("hi!");
        org.jsoup.nodes.Node node50 = documentType39.nextSibling();
        java.lang.StringBuilder stringBuilder51 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings53 = null;
        documentType39.outerHtmlTail(stringBuilder51, 1, outputSettings53);
        java.lang.String str56 = documentType39.attr("<!DOCTYPE html>");
        int int57 = documentType39.siblingIndex();
        java.lang.StringBuilder stringBuilder58 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = null;
        documentType39.outerHtmlTail(stringBuilder58, (int) (byte) 0, outputSettings60);
        int int62 = documentType39.siblingIndex();
        java.lang.StringBuilder stringBuilder63 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = null;
        documentType39.outerHtmlTail(stringBuilder63, 0, outputSettings65);
        boolean boolean67 = documentType16.equals((java.lang.Object) stringBuilder63);
        java.lang.Class<?> wildcardClass68 = documentType16.getClass();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.lang.String str20 = node14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node14.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) ' ', outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodes();
        org.jsoup.nodes.Node node15 = node12.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node15.attr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.lang.String str13 = node7.attr("hi!");
        java.lang.String str15 = node7.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node7.after("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node23.unwrap();
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
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 100, outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (-1), outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        node13.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.String str20 = node14.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node10 = node7.attr("hi!", "#doctype");
        java.lang.String str12 = node10.absUrl("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodes();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        boolean boolean15 = node7.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str22 = documentType20.attr("");
        int int23 = documentType20.siblingIndex();
        org.jsoup.nodes.Node node24 = documentType20.nextSibling();
        org.jsoup.nodes.Node node27 = documentType20.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node7.before((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        int int7 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) 'a', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.before("");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.Class<?> wildcardClass12 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        boolean boolean15 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType20.outerHtmlTail(stringBuilder23, (int) '#', outputSettings25);
        java.lang.String str27 = documentType20.baseUri();
        org.jsoup.nodes.Document document28 = documentType20.ownerDocument();
        boolean boolean30 = documentType20.hasAttr("hi!");
        org.jsoup.nodes.Node node31 = documentType20.nextSibling();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType20.outerHtmlTail(stringBuilder32, 1, outputSettings34);
        java.lang.String str37 = documentType20.attr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int43 = documentType42.siblingIndex();
        org.jsoup.nodes.Attributes attributes44 = documentType42.attributes();
        java.lang.String str45 = documentType42.outerHtml();
        org.jsoup.nodes.Node node47 = documentType42.removeAttr("hi!");
        boolean boolean49 = node47.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean50 = documentType20.equals((java.lang.Object) node47);
        boolean boolean52 = documentType20.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = documentType20.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!DOCTYPE html>" + "'", str45, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeList53);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node11 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
            java.lang.String str21 = node19.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
            org.jsoup.nodes.Node node21 = node7.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
            org.jsoup.nodes.Node node19 = node18.previousSibling();
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass12 = documentType4.getClass();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        node12.setBaseUri("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        node20.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node15.childNodes();
        org.jsoup.nodes.Node node32 = node15.nextSibling();
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
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = node7.attr("");
        java.lang.String str16 = node7.baseUri();
        boolean boolean18 = node7.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document17 = documentType9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = document17.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder33, (int) 'a', outputSettings35);
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
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        int int15 = node14.siblingIndex();
        org.jsoup.nodes.Node node16 = node14.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node16.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, 1, outputSettings20);
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
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node15.childNodes();
        org.jsoup.nodes.Document document32 = node15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes33 = document32.attributes();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        int int6 = documentType4.siblingIndex();
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.before((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str14 = documentType4.nodeName();
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.String str20 = node7.toString();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = node22.baseUri();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "hi!", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        java.lang.String str22 = documentType4.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.unwrap();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        org.jsoup.nodes.Node node18 = documentType4.nextSibling();
        int int19 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.unwrap();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean18 = documentType16.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node20 = documentType16.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType16.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">");
        boolean boolean24 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        boolean boolean26 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder42, (int) '4', outputSettings44);
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        int int17 = documentType4.siblingIndex();
        java.lang.String str18 = documentType4.nodeName();
        java.lang.String str19 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) (byte) -1);
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.lang.Class<?> wildcardClass32 = documentType4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        java.lang.String str13 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str11 = node7.outerHtml();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) (byte) 10, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str10 = node7.toString();
        java.lang.String str11 = node7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node7.before("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 10, outputSettings14);
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        java.lang.String str19 = node14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node14.after("");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.previousSibling();
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
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        org.jsoup.nodes.Node node24 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after("");
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document9.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int32 = documentType31.siblingIndex();
        org.jsoup.nodes.Attributes attributes33 = documentType31.attributes();
        java.lang.String str35 = documentType31.attr("hi!");
        org.jsoup.nodes.Node node36 = documentType31.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node18.before(node36);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str40 = documentType38.attr("");
        int int41 = documentType38.siblingIndex();
        org.jsoup.nodes.Node node42 = documentType38.nextSibling();
        org.jsoup.nodes.Node node45 = documentType38.attr("hi!", "hi!");
        boolean boolean46 = documentType16.equals((java.lang.Object) node45);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType16.unwrap();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        int int10 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        documentType4.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str15 = documentType4.baseUri();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str25 = documentType22.outerHtml();
        java.lang.String str26 = documentType22.baseUri();
        org.jsoup.nodes.Node node28 = documentType22.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str29 = node28.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.before(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str15, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">" + "'", str25, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str26, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str29, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 10, outputSettings14);
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = node16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        int int13 = documentType9.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType9.parent();
        boolean boolean16 = documentType9.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        org.jsoup.nodes.Attributes attributes21 = documentType19.attributes();
        java.lang.String str22 = documentType19.outerHtml();
        java.lang.String str24 = documentType19.attr("<!DOCTYPE html>");
        java.lang.String str25 = documentType19.baseUri();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        org.jsoup.nodes.Node node33 = documentType30.parent();
        org.jsoup.nodes.Node node34 = documentType30.nextSibling();
        boolean boolean36 = documentType30.hasAttr("hi!");
        org.jsoup.nodes.Document document37 = documentType30.ownerDocument();
        int int38 = documentType30.siblingIndex();
        org.jsoup.nodes.Node node39 = documentType30.clone();
        org.jsoup.nodes.Node node40 = documentType30.clone();
        boolean boolean41 = documentType19.equals((java.lang.Object) documentType30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node14.after((org.jsoup.nodes.Node) documentType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str16 = node15.outerHtml();
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
        org.jsoup.nodes.Node node41 = documentType21.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node15.after((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        // The following exception was thrown during execution in test generation
        try {
            node28.remove();
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node27 = documentType24.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType24.attributes();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType24.outerHtmlTail(stringBuilder29, 100, outputSettings31);
        org.jsoup.nodes.Node node33 = documentType24.clone();
        node33.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node18.before(node33);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType9.childNodes();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) '#', outputSettings21);
        java.lang.String str23 = documentType16.baseUri();
        org.jsoup.nodes.Node node26 = documentType16.attr("hi!", "hi!");
        org.jsoup.nodes.Node node27 = node26.clone();
        java.lang.String str28 = node26.outerHtml();
        java.lang.String str29 = node26.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 10, outputSettings14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) (byte) 0, outputSettings18);
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str13 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("#doctype");
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
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node18 = node9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node19 = node18.clone();
        java.lang.String str20 = node18.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.after("hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass9 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str7, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder27, (int) (short) 0, outputSettings29);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) -1, outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, (int) (short) -1, outputSettings22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        node25.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int29 = node25.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node25.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        org.jsoup.nodes.Node node22 = node20.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str29 = documentType27.attr("");
        int int30 = documentType27.siblingIndex();
        java.lang.String str32 = documentType27.absUrl("<!DOCTYPE html>");
        documentType27.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean35 = node22.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = documentType4.previousSibling();
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
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        java.lang.String str18 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.removeAttr("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        documentType4.setBaseUri("#doctype");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str11 = documentType4.absUrl("<!DOCTYPE html>");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        // The following exception was thrown during execution in test generation
        try {
            node18.remove();
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
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("#doctype");
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
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int36 = documentType35.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType35.childNodes();
        org.jsoup.nodes.Node node38 = documentType35.parent();
        documentType35.setBaseUri("");
        org.jsoup.nodes.Node node42 = documentType35.removeAttr("hi!");
        boolean boolean44 = node42.hasAttr("<!DOCTYPE html>");
        node42.setBaseUri("hi!");
        node42.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node30.replaceWith(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node29 = documentType26.attr("hi!", "hi!");
        org.jsoup.nodes.Node node31 = node29.removeAttr("hi!");
        boolean boolean33 = node29.equals((java.lang.Object) 100);
        boolean boolean35 = node29.hasAttr("#doctype");
        java.lang.String str36 = node29.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith(node29);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = document5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        org.jsoup.nodes.Node node55 = node13.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html>");
        java.lang.Class<?> wildcardClass56 = node55.getClass();
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
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        org.jsoup.nodes.Attributes attributes29 = documentType27.attributes();
        java.lang.String str31 = documentType27.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.before((org.jsoup.nodes.Node) documentType27);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes8 = node7.attributes();
        int int9 = node7.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass5 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str40 = documentType38.attr("");
        int int41 = documentType38.siblingIndex();
        org.jsoup.nodes.Node node42 = documentType38.nextSibling();
        org.jsoup.nodes.Node node45 = documentType38.attr("hi!", "hi!");
        boolean boolean46 = documentType16.equals((java.lang.Object) node45);
        org.jsoup.nodes.Node node47 = node45.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node45.remove();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 1, outputSettings10);
        java.lang.String str12 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) '#', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        int int28 = node27.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType4.outerHtmlTail(stringBuilder25, (int) (short) 0, outputSettings27);
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.after((org.jsoup.nodes.Node) documentType33);
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
            org.jsoup.nodes.Node node29 = documentType4.unwrap();
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
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node12.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.lang.String str20 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
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
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
            org.jsoup.nodes.Node node22 = node21.previousSibling();
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.String str8 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        org.jsoup.nodes.Node node20 = node19.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder23, (int) (short) 100, outputSettings25);
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
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        org.jsoup.nodes.Node node18 = documentType4.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.unwrap();
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
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.nodeName();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        documentType4.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "#doctype", "<!DOCTYPE html hi!\">", "");
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str12 = node10.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        java.lang.String str27 = node26.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node26.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        boolean boolean37 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Document document38 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node39 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = node39.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType9.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType9.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str5 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = node26.absUrl("");
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
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
            org.jsoup.nodes.Node node21 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean19 = documentType17.hasAttr("<!DOCTYPE html>");
        java.lang.String str20 = documentType17.outerHtml();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType17.outerHtmlTail(stringBuilder21, (int) (byte) 1, outputSettings23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node7.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        org.jsoup.nodes.Document document41 = node40.ownerDocument();
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
        org.junit.Assert.assertNull(document41);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (int) '4', outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.Node node15 = node12.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.lang.String str11 = documentType4.outerHtml();
        java.lang.String str12 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = documentType4.parent();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) (short) -1, outputSettings18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType19.siblingNodes();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
            java.lang.String str29 = node28.toString();
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 0, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean22 = documentType20.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str24 = documentType20.attr("#doctype");
        org.jsoup.nodes.Document document25 = documentType20.ownerDocument();
        int int26 = documentType20.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str14 = node9.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.String str16 = node9.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        org.jsoup.nodes.Node node31 = documentType28.parent();
        documentType28.setBaseUri("");
        java.lang.String str34 = documentType28.toString();
        boolean boolean36 = documentType28.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document37 = documentType28.ownerDocument();
        java.lang.String str38 = documentType28.outerHtml();
        java.lang.String str40 = documentType28.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str42 = documentType28.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith((org.jsoup.nodes.Node) documentType28);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE html>" + "'", str38, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        int int23 = node22.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.baseUri();
        org.jsoup.nodes.Node node12 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node12.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
            documentType16.remove();
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.lang.Class<?> wildcardClass21 = node11.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        documentType4.setBaseUri("hi!");
        java.lang.String str21 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.lang.String str28 = documentType26.outerHtml();
        boolean boolean30 = documentType26.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.jsoup.nodes.Attributes attributes22 = node21.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) (short) 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        int int12 = documentType4.siblingIndex();
        int int13 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
            org.jsoup.nodes.Node node29 = document27.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
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
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        int int17 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        org.jsoup.nodes.Node node25 = documentType22.parent();
        documentType22.setBaseUri("");
        org.jsoup.nodes.Node node29 = documentType22.removeAttr("hi!");
        boolean boolean31 = node29.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node33 = node29.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str34 = node33.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node33);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        java.lang.Class<?> wildcardClass34 = documentType4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        boolean boolean21 = node18.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Document document22 = node18.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes23 = document22.attributes();
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
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str24 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node27 = documentType26.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType14.replaceWith(node27);
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str24 = documentType22.attr("");
        java.lang.String str26 = documentType22.attr("hi!");
        java.lang.String str27 = documentType22.toString();
        java.lang.String str28 = documentType22.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType22.childNodes();
        org.jsoup.nodes.Node node30 = documentType22.nextSibling();
        java.lang.String str31 = documentType22.outerHtml();
        boolean boolean33 = documentType22.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.after((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.lang.Class<?> wildcardClass18 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        java.lang.String str37 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str39 = documentType4.attr("");
        java.lang.Class<?> wildcardClass40 = documentType4.getClass();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node23 = documentType20.attr("hi!", "hi!");
        boolean boolean25 = documentType20.hasAttr("");
        int int26 = documentType20.siblingIndex();
        java.lang.String str28 = documentType20.absUrl("#doctype");
        int int29 = documentType20.siblingIndex();
        int int30 = documentType20.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        org.jsoup.nodes.Node node18 = documentType15.parent();
        documentType15.setBaseUri("");
        java.lang.String str21 = documentType15.toString();
        boolean boolean23 = documentType15.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node26 = documentType15.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str27 = documentType15.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document10.after((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.toString();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType18.outerHtmlTail(stringBuilder21, (int) '#', outputSettings23);
        java.lang.String str25 = documentType18.baseUri();
        org.jsoup.nodes.Document document26 = documentType18.ownerDocument();
        documentType18.setBaseUri("hi!");
        java.lang.String str30 = documentType18.absUrl("hi!");
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType18.outerHtmlTail(stringBuilder31, (int) ' ', outputSettings33);
        java.lang.String str35 = documentType18.baseUri();
        java.lang.String str36 = documentType18.nodeName();
        java.lang.String str37 = documentType18.baseUri();
        org.jsoup.nodes.Node node39 = documentType18.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#doctype" + "'", str36, "#doctype");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str19 = documentType18.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.before((org.jsoup.nodes.Node) documentType18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str19, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node16.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
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
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node21 = documentType19.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType26.before("<!DOCTYPE html>");
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
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        java.lang.Class<?> wildcardClass13 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) 'a', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) (byte) 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node15 = documentType4.parent();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("");
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
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
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        int int17 = documentType4.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
            java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType26.outerHtmlTail(stringBuilder29, (int) '#', outputSettings31);
        org.jsoup.nodes.Node node33 = documentType26.clone();
        java.lang.String str35 = documentType26.attr("#doctype");
        java.lang.String str36 = documentType26.toString();
        java.lang.String str37 = documentType26.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node18.before((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node23 = documentType22.parent();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType22.outerHtmlTail(stringBuilder24, (int) (short) 1, outputSettings26);
        java.lang.String str28 = documentType22.nodeName();
        java.lang.String str30 = documentType22.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node32 = documentType22.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.before((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        documentType4.setBaseUri("");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (short) -1, outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType11.outerHtmlTail(stringBuilder14, (int) '#', outputSettings16);
        java.lang.String str18 = documentType11.baseUri();
        java.lang.String str19 = documentType11.toString();
        org.jsoup.nodes.Document document20 = documentType11.ownerDocument();
        int int21 = documentType11.siblingIndex();
        documentType11.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node24 = documentType11.clone();
        java.lang.String str25 = node24.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node18.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList25 = node23.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
            java.lang.String str24 = node22.toString();
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        java.lang.String str22 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        java.lang.String str53 = documentType33.attr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType58 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document59 = documentType58.ownerDocument();
        org.jsoup.nodes.Attributes attributes60 = documentType58.attributes();
        org.jsoup.nodes.Node node62 = documentType58.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node63 = documentType58.clone();
        java.lang.String str64 = documentType58.baseUri();
        boolean boolean66 = documentType58.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node68 = documentType58.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node69 = documentType33.after((org.jsoup.nodes.Node) documentType58);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(document59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        java.lang.String str36 = node33.attr("");
        java.lang.Class<?> wildcardClass37 = node33.getClass();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.absUrl("hi!");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        java.lang.String str19 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass20 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str16 = documentType4.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.jsoup.nodes.Node node10 = documentType4.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html hi!\">");
        java.lang.Class<?> wildcardClass5 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        org.jsoup.nodes.Node node18 = documentType15.parent();
        documentType15.setBaseUri("");
        org.jsoup.nodes.Node node22 = documentType15.removeAttr("hi!");
        boolean boolean24 = node22.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node27 = node22.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        org.jsoup.nodes.Node node18 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType23.outerHtmlTail(stringBuilder26, (int) '#', outputSettings28);
        java.lang.String str30 = documentType23.baseUri();
        org.jsoup.nodes.Document document31 = documentType23.ownerDocument();
        documentType23.setBaseUri("hi!");
        java.lang.String str35 = documentType23.absUrl("hi!");
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType23.outerHtmlTail(stringBuilder36, (int) ' ', outputSettings38);
        java.lang.String str40 = documentType23.baseUri();
        java.lang.String str41 = documentType23.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node18.before((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#doctype" + "'", str41, "#doctype");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder23, (int) (byte) 100, outputSettings25);
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document17 = documentType16.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.removeAttr("<!DOCTYPE html>");
        java.lang.String str22 = documentType16.absUrl("<!DOCTYPE html>");
        documentType16.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes25 = documentType16.attributes();
        java.lang.String str27 = documentType16.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.jsoup.nodes.Node node36 = documentType4.clone();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder37, 0, outputSettings39);
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
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
            org.jsoup.nodes.Node node13 = documentType4.previousSibling();
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
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        int int24 = documentType21.siblingIndex();
        java.lang.String str25 = documentType21.nodeName();
        java.lang.String str27 = documentType21.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType21.setBaseUri("hi!");
        org.jsoup.nodes.Node node32 = documentType21.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType21.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.before((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
            org.jsoup.nodes.Node node21 = node19.previousSibling();
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
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        org.jsoup.nodes.DocumentType documentType52 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str53 = documentType52.nodeName();
        java.lang.String str54 = documentType52.outerHtml();
        java.lang.String str55 = documentType52.nodeName();
        java.lang.String str56 = documentType52.outerHtml();
        org.jsoup.nodes.Node node57 = documentType52.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType52);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#doctype" + "'", str53, "#doctype");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str54, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#doctype" + "'", str55, "#doctype");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str56, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        int int22 = node15.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.lang.String str19 = node18.toString();
        org.jsoup.nodes.Attributes attributes20 = node18.attributes();
        java.lang.String str22 = node18.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
            org.jsoup.nodes.Node node21 = node19.unwrap();
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
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str7 = documentType4.toString();
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
        org.jsoup.nodes.Attributes attributes25 = node22.attributes();
        java.lang.String str26 = node22.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        int int21 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (-1), outputSettings10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.jsoup.nodes.Node node35 = documentType32.attr("hi!", "hi!");
        java.lang.String str37 = node35.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int38 = node35.siblingIndex();
        java.lang.String str40 = node35.absUrl("<!DOCTYPE html>");
        int int41 = node35.siblingIndex();
        boolean boolean43 = node35.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node27.after(node35);
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("#doctype");
        java.lang.String str17 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        java.lang.String str24 = documentType17.baseUri();
        org.jsoup.nodes.Document document25 = documentType17.ownerDocument();
        boolean boolean27 = documentType17.hasAttr("hi!");
        java.lang.String str28 = documentType17.outerHtml();
        org.jsoup.nodes.Attributes attributes29 = documentType17.attributes();
        java.lang.String str30 = documentType17.outerHtml();
        org.jsoup.nodes.Attributes attributes31 = documentType17.attributes();
        java.lang.String str32 = documentType17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node12.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
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
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
            org.jsoup.nodes.Node node20 = node18.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 0, outputSettings8);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = documentType9.parent();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType9.outerHtmlHead(stringBuilder18, (-1), outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
            org.jsoup.nodes.Node node48 = node28.previousSibling();
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
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node7.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "hi!", "<!DOCTYPE html>", "#doctype");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html hi!\">");
        java.lang.String str7 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
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
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType21.outerHtmlTail(stringBuilder24, (int) '#', outputSettings26);
        java.lang.String str28 = documentType21.baseUri();
        org.jsoup.nodes.Document document29 = documentType21.ownerDocument();
        documentType21.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType21.outerHtmlTail(stringBuilder32, 1, outputSettings34);
        org.jsoup.nodes.Node node37 = documentType21.removeAttr("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        int int16 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType22.outerHtmlTail(stringBuilder25, (int) (short) 100, outputSettings27);
        org.jsoup.nodes.Node node29 = documentType22.parent();
        java.lang.String str30 = documentType22.toString();
        org.jsoup.nodes.Node node32 = documentType22.removeAttr("hi!");
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.before((org.jsoup.nodes.Node) document33);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        java.lang.String str24 = documentType17.baseUri();
        org.jsoup.nodes.Node node27 = documentType17.attr("hi!", "hi!");
        org.jsoup.nodes.Node node28 = node27.clone();
        java.lang.String str29 = node27.outerHtml();
        org.jsoup.nodes.Node node31 = node27.removeAttr("hi!");
        org.jsoup.nodes.Node node32 = node31.nextSibling();
        boolean boolean34 = node31.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean36 = node31.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType4.after(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.lang.String str29 = documentType4.nodeName();
        java.lang.String str30 = documentType4.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = document27.attr("", "#doctype");
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
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        int int16 = node15.siblingIndex();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.siblingNodes();
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        java.lang.String str18 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        org.jsoup.nodes.Attributes attributes25 = documentType23.attributes();
        java.lang.String str26 = documentType23.outerHtml();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before(node27);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        java.lang.String str22 = documentType4.baseUri();
        java.lang.String str24 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        int int42 = node41.siblingIndex();
        org.jsoup.nodes.DocumentType documentType47 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int48 = documentType47.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = documentType47.childNodes();
        java.lang.StringBuilder stringBuilder50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        documentType47.outerHtmlTail(stringBuilder50, (int) '#', outputSettings52);
        java.lang.String str54 = documentType47.baseUri();
        org.jsoup.nodes.Document document55 = documentType47.ownerDocument();
        boolean boolean57 = documentType47.hasAttr("hi!");
        org.jsoup.nodes.Node node58 = documentType47.nextSibling();
        java.lang.StringBuilder stringBuilder59 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = null;
        documentType47.outerHtmlTail(stringBuilder59, 1, outputSettings61);
        java.lang.String str64 = documentType47.attr("<!DOCTYPE html>");
        int int65 = documentType47.siblingIndex();
        java.lang.StringBuilder stringBuilder66 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = null;
        documentType47.outerHtmlTail(stringBuilder66, (int) (byte) 0, outputSettings68);
        int int70 = documentType47.siblingIndex();
        org.jsoup.nodes.Node node71 = documentType47.clone();
        java.lang.String str72 = documentType47.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node73 = node41.before((org.jsoup.nodes.Node) documentType47);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(document55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!DOCTYPE html>" + "'", str72, "<!DOCTYPE html>");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
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
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.Class<?> wildcardClass10 = attributes9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node41.wrap("<!DOCTYPE html PUBLIC \"hi!\">");
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
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html>", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 10, outputSettings7);
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType13.outerHtmlTail(stringBuilder16, (int) '#', outputSettings18);
        java.lang.String str20 = documentType13.baseUri();
        org.jsoup.nodes.Document document21 = documentType13.ownerDocument();
        org.jsoup.nodes.Node node22 = documentType13.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        boolean boolean37 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Document document38 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node39 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node39.remove();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str14 = documentType4.outerHtml();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        boolean boolean8 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        boolean boolean42 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        org.jsoup.nodes.Document document37 = documentType29.ownerDocument();
        boolean boolean39 = documentType29.hasAttr("hi!");
        org.jsoup.nodes.Node node40 = documentType29.nextSibling();
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        documentType29.outerHtmlTail(stringBuilder41, 1, outputSettings43);
        org.jsoup.nodes.Node node46 = documentType29.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Document document47 = node46.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith((org.jsoup.nodes.Node) document47);
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
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(document47);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
            org.jsoup.nodes.Node node33 = node31.wrap("hi!");
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
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        java.lang.String str18 = node15.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node15.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 0, outputSettings18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node13 = documentType9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str7 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        java.lang.String str21 = documentType14.baseUri();
        org.jsoup.nodes.Node node24 = documentType14.attr("hi!", "hi!");
        org.jsoup.nodes.Node node25 = node24.clone();
        java.lang.String str26 = node24.outerHtml();
        org.jsoup.nodes.Node node28 = node24.removeAttr("hi!");
        org.jsoup.nodes.Node node29 = node28.nextSibling();
        org.jsoup.nodes.Document document30 = node28.ownerDocument();
        org.jsoup.nodes.Node node33 = node28.attr("#doctype", "");
        java.lang.String str35 = node28.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str36 = node28.outerHtml();
        java.lang.String str37 = node28.outerHtml();
        org.jsoup.nodes.Node node38 = node28.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = documentType4.before(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        boolean boolean15 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.String str23 = node21.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType50 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int51 = documentType50.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = documentType50.childNodes();
        boolean boolean53 = documentType45.equals((java.lang.Object) documentType50);
        documentType45.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str56 = documentType45.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = documentType4.before((org.jsoup.nodes.Node) documentType45);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "#doctype" + "'", str56, "#doctype");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "");
        org.jsoup.nodes.Node node21 = documentType20.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
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
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        int int12 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
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
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = document13.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node14.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node32 = documentType31.nextSibling();
        org.jsoup.nodes.Attributes attributes33 = documentType31.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node24.before((org.jsoup.nodes.Node) documentType31);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = documentType4.previousSibling();
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
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        org.jsoup.nodes.Node node26 = documentType23.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType23.outerHtmlTail(stringBuilder27, (int) '4', outputSettings29);
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType23.outerHtmlTail(stringBuilder31, (int) (byte) 10, outputSettings33);
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType23.outerHtmlTail(stringBuilder35, (int) (byte) 0, outputSettings37);
        boolean boolean40 = documentType23.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType23.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.before((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        // The following exception was thrown during execution in test generation
        try {
            document14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = node9.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node13 = documentType12.parent();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType12.outerHtmlTail(stringBuilder14, (int) (short) 1, outputSettings16);
        java.lang.String str18 = documentType12.nodeName();
        java.lang.String str20 = documentType12.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node22 = documentType12.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node18 = documentType15.attr("hi!", "hi!");
        java.lang.String str19 = node18.outerHtml();
        java.lang.String str20 = node18.baseUri();
        org.jsoup.nodes.Node node21 = node18.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        org.jsoup.nodes.Node node55 = node13.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = node55.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        org.jsoup.nodes.Node node29 = documentType4.nextSibling();
        java.lang.Class<?> wildcardClass30 = documentType4.getClass();
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
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node18 = node9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (byte) 0, outputSettings15);
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
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        org.jsoup.nodes.Node node16 = documentType9.clone();
        java.lang.String str18 = documentType9.attr("#doctype");
        java.lang.String str20 = documentType9.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType9.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType9.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        // The following exception was thrown during execution in test generation
        try {
            node24.remove();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.toString();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        java.lang.String str21 = documentType14.baseUri();
        org.jsoup.nodes.Document document22 = documentType14.ownerDocument();
        documentType14.setBaseUri("hi!");
        java.lang.String str25 = documentType14.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType14.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType14.childNodes();
        java.lang.String str29 = documentType14.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str30 = documentType14.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        boolean boolean25 = node23.hasAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node23.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node7.attr("");
        java.lang.String str13 = node7.absUrl("hi!");
        org.jsoup.nodes.Node node14 = node7.clone();
        java.lang.Class<?> wildcardClass15 = node7.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.equals((java.lang.Object) (-1.0d));
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (int) (byte) 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node31.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node7.childNodes();
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        org.jsoup.nodes.Node node38 = documentType27.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html hi!\">");
        java.lang.String str40 = documentType27.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
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
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) '#', outputSettings21);
        java.lang.String str23 = documentType16.baseUri();
        org.jsoup.nodes.Node node26 = documentType16.attr("hi!", "hi!");
        int int27 = node26.siblingIndex();
        org.jsoup.nodes.Node node28 = node26.clone();
        node26.setBaseUri("#doctype");
        org.jsoup.nodes.Node node33 = node26.attr("#doctype", "#doctype");
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str40 = documentType38.attr("");
        int int41 = documentType38.siblingIndex();
        java.lang.String str43 = documentType38.absUrl("<!DOCTYPE html>");
        boolean boolean45 = documentType38.hasAttr("");
        org.jsoup.nodes.DocumentType documentType50 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int51 = documentType50.siblingIndex();
        java.lang.Class<?> wildcardClass52 = documentType50.getClass();
        boolean boolean53 = documentType38.equals((java.lang.Object) wildcardClass52);
        java.lang.String str54 = documentType38.outerHtml();
        org.jsoup.nodes.Node node55 = documentType38.clone();
        boolean boolean56 = node33.equals((java.lang.Object) documentType38);
        boolean boolean57 = documentType4.equals((java.lang.Object) boolean56);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!DOCTYPE html>" + "'", str54, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        java.lang.Object obj20 = null;
        boolean boolean21 = documentType4.equals(obj20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
            org.jsoup.nodes.Node node18 = documentType4.after("hi!");
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
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node18 = node9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node19 = node18.clone();
        java.lang.String str20 = node18.outerHtml();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType25.outerHtmlTail(stringBuilder28, (int) (short) 100, outputSettings30);
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType25.outerHtmlTail(stringBuilder32, (int) '#', outputSettings34);
        java.lang.String str36 = documentType25.toString();
        org.jsoup.nodes.Node node37 = documentType25.parent();
        java.lang.String str39 = documentType25.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node18.after((org.jsoup.nodes.Node) documentType25);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        java.lang.String str13 = node11.toString();
        java.lang.String str15 = node11.absUrl("hi!");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        java.lang.String str22 = documentType20.outerHtml();
        java.lang.String str24 = documentType20.attr("");
        org.jsoup.nodes.Node node25 = documentType20.clone();
        org.jsoup.nodes.Attributes attributes26 = node25.attributes();
        java.lang.String str28 = node25.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str30 = node25.absUrl("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node11.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node24 = documentType21.attr("hi!", "hi!");
        org.jsoup.nodes.Node node26 = node24.removeAttr("hi!");
        java.lang.String str28 = node26.absUrl("hi!");
        node26.setBaseUri("");
        org.jsoup.nodes.Node node32 = node26.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node26.childNodes();
        boolean boolean34 = documentType16.equals((java.lang.Object) node26);
        boolean boolean35 = node11.equals((java.lang.Object) documentType16);
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType16.outerHtmlHead(stringBuilder36, (int) (byte) 10, outputSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodes();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document13.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html>");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        org.jsoup.nodes.Node node17 = documentType14.parent();
        documentType14.setBaseUri("");
        org.jsoup.nodes.Node node21 = documentType14.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str28 = documentType26.attr("");
        int int29 = documentType26.siblingIndex();
        boolean boolean30 = node21.equals((java.lang.Object) documentType26);
        org.jsoup.nodes.Node node31 = documentType26.clone();
        java.lang.String str32 = documentType26.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node9.after((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) 'a', outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        int int11 = documentType4.siblingIndex();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.siblingNodes();
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
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node18.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) (byte) 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 10, outputSettings7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (int) (short) 100, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.Class<?> wildcardClass16 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node27 = documentType24.attr("hi!", "hi!");
        org.jsoup.nodes.Node node29 = node27.removeAttr("hi!");
        node29.setBaseUri("");
        org.jsoup.nodes.Document document32 = node29.ownerDocument();
        org.jsoup.nodes.Node node33 = node29.clone();
        boolean boolean34 = node19.equals((java.lang.Object) node29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node29.wrap("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document14 = documentType13.ownerDocument();
        org.jsoup.nodes.Attributes attributes15 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.removeAttr("<!DOCTYPE html>");
        java.lang.String str19 = documentType13.absUrl("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        java.lang.String str5 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int17 = documentType9.siblingIndex();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node25 = documentType22.attr("hi!", "hi!");
        java.lang.String str27 = node25.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int28 = node25.siblingIndex();
        java.lang.String str30 = node25.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Document document31 = node25.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType9.replaceWith(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(document31);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
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
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        java.lang.String str73 = documentType43.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList74 = documentType43.siblingNodes();
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
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) (byte) 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str21 = documentType19.attr("");
        java.lang.String str22 = documentType19.nodeName();
        org.jsoup.nodes.Node node23 = documentType19.nextSibling();
        org.jsoup.nodes.Node node24 = documentType19.clone();
        java.lang.String str25 = documentType19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.before((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        org.jsoup.nodes.Node node27 = documentType24.parent();
        documentType24.setBaseUri("");
        java.lang.String str30 = documentType24.toString();
        boolean boolean32 = documentType24.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node35 = documentType24.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str42 = documentType40.attr("");
        int int43 = documentType40.siblingIndex();
        java.lang.String str45 = documentType40.absUrl("<!DOCTYPE html>");
        boolean boolean47 = documentType40.hasAttr("");
        boolean boolean48 = node35.equals((java.lang.Object) boolean47);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
            org.jsoup.nodes.Node node25 = node14.unwrap();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = document12.getClass();
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        java.lang.Class<?> wildcardClass24 = node23.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        org.jsoup.nodes.Node node18 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str26 = documentType23.outerHtml();
        java.lang.String str27 = documentType23.baseUri();
        org.jsoup.nodes.Node node29 = documentType23.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean31 = documentType23.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean32 = documentType4.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">" + "'", str26, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str27, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        java.lang.String str34 = documentType16.toString();
        org.jsoup.nodes.Node node35 = documentType16.parent();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        node25.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int29 = node25.siblingIndex();
        java.lang.String str30 = node25.outerHtml();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int36 = documentType35.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType35.childNodes();
        boolean boolean38 = node25.equals((java.lang.Object) documentType35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = documentType35.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = document14.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        boolean boolean27 = documentType19.equals((java.lang.Object) documentType24);
        int int28 = documentType24.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) documentType24);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.outerHtml();
        java.lang.Class<?> wildcardClass10 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType14.outerHtmlTail(stringBuilder16, 10, outputSettings18);
        org.jsoup.nodes.Node node20 = documentType14.parent();
        java.lang.String str21 = documentType14.nodeName();
        org.jsoup.nodes.Node node24 = documentType14.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        java.lang.String str26 = documentType14.absUrl("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node9.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        java.lang.String str13 = node11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType18.childNodes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType18.outerHtmlTail(stringBuilder21, (int) '#', outputSettings23);
        org.jsoup.nodes.Node node25 = documentType18.clone();
        java.lang.String str27 = documentType18.attr("#doctype");
        java.lang.String str29 = documentType18.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str30 = documentType18.toString();
        boolean boolean32 = documentType18.equals((java.lang.Object) 100);
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType18.outerHtmlTail(stringBuilder33, (int) 'a', outputSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType18.childNodes();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int43 = documentType42.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType42.childNodes();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        documentType42.outerHtmlTail(stringBuilder45, (int) '#', outputSettings47);
        java.lang.String str49 = documentType42.baseUri();
        org.jsoup.nodes.Document document50 = documentType42.ownerDocument();
        java.lang.String str51 = documentType42.baseUri();
        org.jsoup.nodes.Node node53 = documentType42.removeAttr("<!DOCTYPE html>");
        boolean boolean54 = documentType18.equals((java.lang.Object) node53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = node13.equals((java.lang.Object) node53);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.siblingNodes();
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
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        node18.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node18.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node14 = node12.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node14.absUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        int int19 = documentType16.siblingIndex();
        java.lang.String str21 = documentType16.absUrl("<!DOCTYPE html>");
        boolean boolean23 = documentType16.hasAttr("");
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.lang.Class<?> wildcardClass30 = documentType28.getClass();
        boolean boolean31 = documentType16.equals((java.lang.Object) wildcardClass30);
        java.lang.String str32 = documentType16.outerHtml();
        org.jsoup.nodes.Node node33 = documentType16.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node11.after((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE html>" + "'", str32, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.lang.String str11 = node9.baseUri();
        java.lang.String str13 = node9.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        org.jsoup.nodes.Document document14 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document25 = documentType24.ownerDocument();
        org.jsoup.nodes.Attributes attributes26 = documentType24.attributes();
        org.jsoup.nodes.Node node29 = documentType24.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str30 = node29.toString();
        org.jsoup.nodes.Node node32 = node29.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node35 = node32.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node7.before(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.jsoup.nodes.Node node38 = documentType27.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html hi!\">");
        java.lang.String str39 = node38.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node38.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
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
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE html>" + "'", str39, "<!DOCTYPE html>");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder20, (int) '4', outputSettings22);
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        org.jsoup.nodes.Node node45 = documentType26.parent();
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
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        int int16 = node7.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node7.childNodes();
        org.jsoup.nodes.Node node18 = node7.nextSibling();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        int int12 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.lang.Class<?> wildcardClass18 = documentType16.getClass();
        boolean boolean19 = documentType4.equals((java.lang.Object) wildcardClass18);
        java.lang.String str20 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, (int) (short) 1, outputSettings23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType21.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document12 = documentType11.ownerDocument();
        org.jsoup.nodes.Attributes attributes13 = documentType11.attributes();
        org.jsoup.nodes.Node node16 = documentType11.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str17 = node16.toString();
        org.jsoup.nodes.Node node19 = node16.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = node6.equals((java.lang.Object) node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (short) 100, outputSettings19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes6 = node5.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = documentType30.before((org.jsoup.nodes.Node) documentType40);
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
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.jsoup.nodes.Attributes attributes29 = node11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node11.unwrap();
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType9.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document17 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = documentType9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType9.childNodes();
        java.lang.String str20 = documentType9.nodeName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        int int22 = node18.siblingIndex();
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
        org.jsoup.nodes.DocumentType documentType50 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int51 = documentType50.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = documentType50.childNodes();
        org.jsoup.nodes.Node node53 = documentType50.parent();
        documentType50.setBaseUri("");
        org.jsoup.nodes.Node node57 = documentType50.removeAttr("hi!");
        boolean boolean58 = documentType27.equals((java.lang.Object) documentType50);
        java.lang.String str60 = documentType27.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node63 = documentType27.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node18.replaceWith(node63);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
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
            documentType4.replaceWith(node20);
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
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        java.lang.String str18 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean11 = node7.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = node7.attr("#doctype", "#doctype");
        java.lang.Object obj15 = null;
        boolean boolean16 = node7.equals(obj15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, 1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        org.jsoup.nodes.Node node18 = documentType15.parent();
        documentType15.setBaseUri("");
        org.jsoup.nodes.Node node22 = documentType15.removeAttr("hi!");
        boolean boolean24 = node22.hasAttr("<!DOCTYPE html>");
        node22.setBaseUri("hi!");
        int int27 = node22.siblingIndex();
        org.jsoup.nodes.Node node28 = node22.clone();
        java.lang.String str29 = node22.toString();
        int int30 = node22.siblingIndex();
        java.lang.String str32 = node22.absUrl("hi!");
        java.lang.String str33 = node22.toString();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html>" + "'", str33, "<!DOCTYPE html>");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType18.outerHtmlTail(stringBuilder24, (int) '4', outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType18.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str8 = node7.outerHtml();
        java.lang.String str9 = node7.baseUri();
        org.jsoup.nodes.Node node10 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.clone();
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html>", "#doctype", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node19 = documentType16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType9.outerHtmlTail(stringBuilder11, 10, outputSettings13);
        org.jsoup.nodes.Node node15 = documentType9.parent();
        java.lang.String str16 = documentType9.nodeName();
        org.jsoup.nodes.Node node19 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node20 = documentType9.nextSibling();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        org.jsoup.nodes.Node node55 = node13.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = node55.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html hi!\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = node11.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.siblingNodes();
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
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document19 = documentType18.ownerDocument();
        org.jsoup.nodes.Attributes attributes20 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.removeAttr("<!DOCTYPE html>");
        int int23 = documentType18.siblingIndex();
        org.jsoup.nodes.Node node25 = documentType18.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str29 = documentType18.outerHtml();
        int int30 = documentType18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.before("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes8 = node7.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        java.lang.String str19 = documentType16.outerHtml();
        java.lang.String str21 = documentType16.attr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType16.childNodes();
        org.jsoup.nodes.Node node23 = documentType16.nextSibling();
        org.jsoup.nodes.Node node24 = documentType16.parent();
        org.jsoup.nodes.Attributes attributes25 = documentType16.attributes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType16.outerHtmlTail(stringBuilder26, (-1), outputSettings28);
        java.lang.String str30 = documentType16.nodeName();
        org.jsoup.nodes.Attributes attributes31 = documentType16.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = node11.equals((java.lang.Object) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str21 = documentType19.attr("");
        java.lang.String str23 = documentType19.attr("hi!");
        java.lang.String str24 = documentType19.toString();
        java.lang.String str25 = documentType19.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType19.childNodes();
        org.jsoup.nodes.Node node27 = documentType19.nextSibling();
        java.lang.String str28 = documentType19.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "#doctype", "");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.String str14 = node13.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        documentType4.setBaseUri("<!DOCTYPE html>");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        int int13 = node7.siblingIndex();
        org.jsoup.nodes.Node node16 = node7.attr("hi!", "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int30 = documentType29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType29.childNodes();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType29.outerHtmlTail(stringBuilder32, (int) '#', outputSettings34);
        java.lang.String str36 = documentType29.baseUri();
        org.jsoup.nodes.Node node39 = documentType29.attr("hi!", "hi!");
        org.jsoup.nodes.Node node40 = node39.clone();
        int int41 = node39.siblingIndex();
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int47 = documentType46.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = documentType46.childNodes();
        org.jsoup.nodes.Node node49 = documentType46.parent();
        documentType46.setBaseUri("");
        java.lang.String str52 = documentType46.toString();
        boolean boolean54 = documentType46.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document55 = documentType46.ownerDocument();
        boolean boolean56 = node39.equals((java.lang.Object) documentType46);
        // The following exception was thrown during execution in test generation
        try {
            node24.replaceWith(node39);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!DOCTYPE html>" + "'", str52, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(document55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (int) 'a', outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        org.jsoup.nodes.Node node27 = node18.parent();
        int int28 = node18.siblingIndex();
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
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document18 = documentType17.ownerDocument();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.nodes.Node node21 = documentType17.removeAttr("<!DOCTYPE html>");
        java.lang.String str23 = documentType17.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node24 = documentType17.parent();
        java.lang.String str25 = documentType17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node9.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE html>" + "'", str25, "<!DOCTYPE html>");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.lang.String str8 = node7.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node7.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) '#', outputSettings21);
        java.lang.String str23 = documentType16.baseUri();
        org.jsoup.nodes.Node node26 = documentType16.attr("hi!", "hi!");
        org.jsoup.nodes.Node node27 = node26.clone();
        java.lang.String str28 = node26.outerHtml();
        org.jsoup.nodes.Node node31 = node26.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node32 = node31.clone();
        boolean boolean33 = documentType11.equals((java.lang.Object) node32);
        node32.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        int int36 = node32.siblingIndex();
        org.jsoup.nodes.Document document37 = node32.ownerDocument();
        boolean boolean38 = node5.equals((java.lang.Object) document37);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        node13.setBaseUri("<!DOCTYPE html>");
        boolean boolean17 = node13.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.String str18 = node13.toString();
        java.lang.String str20 = node13.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        java.lang.String str73 = documentType43.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node75 = documentType43.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str26 = documentType25.toString();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType25.outerHtmlTail(stringBuilder27, (int) (byte) 100, outputSettings29);
        java.lang.String str31 = documentType25.toString();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith((org.jsoup.nodes.Node) documentType25);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str26, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str31, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        org.jsoup.nodes.Node node25 = documentType4.removeAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node25.before("<!DOCTYPE html>");
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        java.lang.Class<?> wildcardClass5 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str7 = documentType4.nodeName();
        java.lang.Class<?> wildcardClass8 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.lang.String str29 = documentType26.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType26.outerHtmlTail(stringBuilder30, 10, outputSettings32);
        java.lang.String str34 = documentType26.toString();
        documentType26.setBaseUri("<!DOCTYPE html>");
        boolean boolean37 = documentType4.equals((java.lang.Object) documentType26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = documentType26.attr("", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        int int10 = documentType4.siblingIndex();
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        boolean boolean37 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Document document38 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node39 = documentType4.nextSibling();
        java.lang.String str41 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int15 = node14.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node5.attr("", "<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            node8.setBaseUri("");
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
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        int int9 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.after("<!DOCTYPE html PUBLIC \"#doctype\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType21.unwrap();
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
            org.jsoup.nodes.Node node14 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str18 = documentType16.attr("");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node20 = documentType16.nextSibling();
        java.lang.String str21 = documentType16.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node11.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) '#', outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        boolean boolean15 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) '#', outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        int int15 = node14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node14.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType4.siblingNodes();
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
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        org.jsoup.nodes.Node node20 = node18.removeAttr("hi!");
        org.jsoup.nodes.Node node22 = node20.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "#doctype", "", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        org.jsoup.nodes.Node node38 = documentType27.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html hi!\">");
        java.lang.String str39 = node38.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node38.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE html>" + "'", str39, "<!DOCTYPE html>");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.nodeName();
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str14 = documentType12.attr("");
        int int15 = documentType12.siblingIndex();
        java.lang.String str17 = documentType12.absUrl("<!DOCTYPE html>");
        boolean boolean19 = documentType12.hasAttr("");
        boolean boolean21 = documentType12.hasAttr("#doctype");
        java.lang.String str22 = documentType12.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        org.jsoup.nodes.Node node24 = node18.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        documentType16.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
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
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.attr("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        int int10 = documentType4.siblingIndex();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = documentType4.equals(obj11);
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">\">", "hi!");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = node8.siblingIndex();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        int int12 = node8.siblingIndex();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        org.jsoup.nodes.Node node20 = documentType17.parent();
        documentType17.setBaseUri("");
        org.jsoup.nodes.Node node24 = documentType17.removeAttr("hi!");
        boolean boolean26 = node24.hasAttr("<!DOCTYPE html>");
        node24.setBaseUri("hi!");
        int int29 = node24.siblingIndex();
        org.jsoup.nodes.Node node30 = node24.clone();
        java.lang.String str31 = node24.toString();
        int int32 = node24.siblingIndex();
        java.lang.String str34 = node24.absUrl("hi!");
        java.lang.String str35 = node24.toString();
        boolean boolean36 = node8.equals((java.lang.Object) node24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node8.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE html>" + "'", str35, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
            org.jsoup.nodes.Node node22 = node11.after("hi!");
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node9.before("");
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
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document17 = documentType16.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.removeAttr("<!DOCTYPE html>");
        int int21 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node23 = documentType16.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType16.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str27 = documentType16.outerHtml();
        int int28 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node29 = documentType16.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after(node29);
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
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "", "<!DOCTYPE html>");
        boolean boolean6 = documentType4.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        boolean boolean16 = documentType9.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node24 = documentType21.attr("hi!", "hi!");
        org.jsoup.nodes.Node node26 = node24.removeAttr("hi!");
        boolean boolean28 = node24.equals((java.lang.Object) 100);
        boolean boolean30 = node24.hasAttr("#doctype");
        boolean boolean32 = node24.hasAttr("#doctype");
        org.jsoup.nodes.Node node33 = node24.clone();
        org.jsoup.nodes.Node node34 = node33.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType9.before(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        org.jsoup.nodes.Document document21 = node12.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean47 = documentType45.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node49 = documentType45.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node52 = documentType45.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">");
        boolean boolean53 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.StringBuilder stringBuilder54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = null;
        documentType4.outerHtmlTail(stringBuilder54, 10, outputSettings56);
        java.lang.StringBuilder stringBuilder58 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder58, (int) (byte) 1, outputSettings60);
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        java.lang.String str23 = documentType14.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        boolean boolean31 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node32.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.String str16 = documentType4.outerHtml();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html <!DOCTYPE html #doctype\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        org.jsoup.nodes.DocumentType documentType76 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str77 = documentType76.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node78 = documentType43.before((org.jsoup.nodes.Node) documentType76);
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "#doctype" + "'", str77, "#doctype");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.previousSibling();
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
        org.junit.Assert.assertNotNull(node21);
    }
}

