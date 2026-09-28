package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.after("<!DOCTYPE html>");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        boolean boolean25 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node33 = documentType30.attr("hi!", "hi!");
        org.jsoup.nodes.Node node35 = node33.removeAttr("hi!");
        java.lang.String str37 = node33.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.after(node33);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList22 = node19.siblingNodes();
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
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.before("<!DOCTYPE html hi!\">");
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
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String str47 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodes();
        java.lang.String str12 = node9.attr("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
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
        java.lang.String str38 = documentType21.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str39 = documentType21.baseUri();
        org.jsoup.nodes.Node node41 = documentType21.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str42 = documentType21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        java.lang.String str24 = documentType17.baseUri();
        org.jsoup.nodes.Document document25 = documentType17.ownerDocument();
        documentType17.setBaseUri("hi!");
        java.lang.String str29 = documentType17.absUrl("hi!");
        org.jsoup.nodes.Document document30 = documentType17.ownerDocument();
        java.lang.String str32 = documentType17.attr("#doctype");
        org.jsoup.nodes.Node node35 = documentType17.attr("#doctype", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType4.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        node9.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node16 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str27 = node18.outerHtml();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int33 = documentType32.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType32.childNodes();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType32.outerHtmlTail(stringBuilder35, (int) '#', outputSettings37);
        org.jsoup.nodes.Node node39 = documentType32.clone();
        java.lang.String str41 = documentType32.attr("#doctype");
        org.jsoup.nodes.Node node42 = documentType32.clone();
        org.jsoup.nodes.Node node44 = documentType32.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node18.after((org.jsoup.nodes.Node) documentType32);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document27 = documentType26.ownerDocument();
        org.jsoup.nodes.Attributes attributes28 = documentType26.attributes();
        org.jsoup.nodes.Node node30 = documentType26.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node31 = documentType26.clone();
        org.jsoup.nodes.Document document32 = documentType26.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node21.before((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        org.jsoup.nodes.Node node23 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.after("#doctype");
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document11.remove();
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        documentType21.setBaseUri("");
        java.lang.String str27 = documentType21.toString();
        boolean boolean29 = documentType21.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document30 = documentType21.ownerDocument();
        boolean boolean31 = node14.equals((java.lang.Object) documentType21);
        documentType21.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (byte) 10, outputSettings16);
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
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) '#', outputSettings21);
        java.lang.String str23 = documentType16.baseUri();
        org.jsoup.nodes.Node node26 = documentType16.attr("hi!", "hi!");
        java.lang.String str27 = documentType16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType16.childNodes();
        java.lang.String str29 = documentType16.baseUri();
        org.jsoup.nodes.Node node32 = documentType16.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node35 = documentType16.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int36 = node35.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node9.before(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (byte) -1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType11.childNodes();
        org.jsoup.nodes.Node node14 = documentType11.parent();
        documentType11.setBaseUri("");
        org.jsoup.nodes.Node node18 = documentType11.removeAttr("hi!");
        org.jsoup.nodes.Node node19 = node18.parent();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        org.jsoup.nodes.Node node27 = documentType24.parent();
        org.jsoup.nodes.Node node28 = documentType24.nextSibling();
        boolean boolean30 = documentType24.hasAttr("hi!");
        boolean boolean31 = node18.equals((java.lang.Object) "hi!");
        int int32 = node18.siblingIndex();
        org.jsoup.nodes.Node node34 = node18.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType4.before(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.lang.String str16 = node9.outerHtml();
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
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType21.outerHtmlTail(stringBuilder39, 1, outputSettings41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node9.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node12.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        java.lang.String str37 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#doctype" + "'", str37, "#doctype");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.parent();
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
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.String str16 = documentType9.baseUri();
        org.jsoup.nodes.Document document17 = documentType9.ownerDocument();
        documentType9.setBaseUri("hi!");
        org.jsoup.nodes.Node node20 = documentType9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before((org.jsoup.nodes.Node) documentType27);
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
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node11.unwrap();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
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
        java.lang.String str27 = documentType12.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType28.outerHtmlTail(stringBuilder31, (int) '#', outputSettings33);
        java.lang.String str35 = documentType28.baseUri();
        org.jsoup.nodes.Document document36 = documentType28.ownerDocument();
        boolean boolean38 = documentType28.hasAttr("hi!");
        org.jsoup.nodes.Node node39 = documentType28.nextSibling();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        documentType28.outerHtmlTail(stringBuilder40, 1, outputSettings42);
        java.lang.String str45 = documentType28.attr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType50 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int51 = documentType50.siblingIndex();
        org.jsoup.nodes.Attributes attributes52 = documentType50.attributes();
        java.lang.String str53 = documentType50.outerHtml();
        org.jsoup.nodes.Node node55 = documentType50.removeAttr("hi!");
        boolean boolean57 = node55.hasAttr("<!DOCTYPE html #doctype\">");
        boolean boolean58 = documentType28.equals((java.lang.Object) node55);
        org.jsoup.nodes.Node node59 = documentType28.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = documentType4.after((org.jsoup.nodes.Node) documentType28);
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
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!DOCTYPE html>" + "'", str53, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType11.attributes();
        boolean boolean13 = documentType4.equals((java.lang.Object) attributes12);
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        java.lang.String str27 = documentType19.toString();
        org.jsoup.nodes.Document document28 = documentType19.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
            org.jsoup.nodes.Node node18 = node16.childNode(0);
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int21 = documentType20.siblingIndex();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        boolean boolean24 = documentType20.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node25 = documentType20.nextSibling();
        java.lang.String str27 = documentType20.absUrl("hi!");
        java.lang.String str28 = documentType20.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        java.lang.String str13 = node11.toString();
        java.lang.String str15 = node11.absUrl("hi!");
        org.jsoup.nodes.Document document16 = node11.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType26.outerHtmlTail(stringBuilder29, (int) '#', outputSettings31);
        org.jsoup.nodes.Node node33 = documentType26.clone();
        java.lang.String str35 = documentType26.attr("#doctype");
        org.jsoup.nodes.Node node37 = documentType26.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        int int38 = documentType26.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node19.before((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, 100, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE html>" + "'", str21, "<!DOCTYPE html>");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.String str27 = node18.outerHtml();
        org.jsoup.nodes.Node node28 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node18.wrap("hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node68 = documentType16.previousSibling();
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
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.String str31 = node15.baseUri();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int37 = documentType36.siblingIndex();
        org.jsoup.nodes.Node node38 = documentType36.nextSibling();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType36.outerHtmlTail(stringBuilder39, (int) '4', outputSettings41);
        boolean boolean43 = node15.equals((java.lang.Object) outputSettings41);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str31, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.Class<?> wildcardClass20 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
            java.lang.Class<?> wildcardClass21 = node20.getClass();
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (byte) -1, outputSettings15);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType18.outerHtmlTail(stringBuilder20, 10, outputSettings22);
        org.jsoup.nodes.Node node24 = documentType18.parent();
        java.lang.String str25 = documentType18.nodeName();
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node29 = node28.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "hi!");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        int int13 = documentType4.siblingIndex();
        java.lang.Class<?> wildcardClass14 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node16);
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
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int32 = documentType31.siblingIndex();
        org.jsoup.nodes.Attributes attributes33 = documentType31.attributes();
        java.lang.String str34 = documentType31.outerHtml();
        org.jsoup.nodes.Node node35 = documentType31.clone();
        documentType31.setBaseUri("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) documentType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        node9.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node9.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.unwrap();
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
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodes();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType21.outerHtmlTail(stringBuilder23, 10, outputSettings25);
        org.jsoup.nodes.Node node27 = documentType21.parent();
        java.lang.String str28 = documentType21.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = documentType42.previousSibling();
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
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int16 = node15.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.previousSibling();
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
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.lang.Class<?> wildcardClass29 = documentType4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
            java.lang.String str20 = node19.outerHtml();
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes14 = node11.attributes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        org.jsoup.nodes.Node node26 = documentType19.clone();
        java.lang.String str28 = documentType19.attr("#doctype");
        java.lang.String str29 = documentType19.toString();
        java.lang.String str30 = documentType19.toString();
        org.jsoup.nodes.Node node31 = documentType19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.Class<?> wildcardClass28 = documentType18.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (-1), outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
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
        org.jsoup.nodes.Node node32 = node27.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.childNodes();
        boolean boolean34 = node7.equals((java.lang.Object) node32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node7.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
            org.jsoup.nodes.Node node33 = node31.previousSibling();
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (short) 1, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str31 = documentType29.attr("");
        int int32 = documentType29.siblingIndex();
        java.lang.String str34 = documentType29.absUrl("<!DOCTYPE html>");
        boolean boolean36 = documentType29.hasAttr("");
        org.jsoup.nodes.Node node37 = documentType29.clone();
        org.jsoup.nodes.Node node40 = documentType29.attr("hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = documentType4.before((org.jsoup.nodes.Node) documentType29);
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
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        java.lang.Class<?> wildcardClass17 = nodeList16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
            org.jsoup.nodes.Node node18 = node16.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        int int5 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.before("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node7.childNodes();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        int int20 = documentType17.siblingIndex();
        java.lang.String str21 = documentType17.nodeName();
        java.lang.String str23 = documentType17.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType17.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType17.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.String str31 = node15.baseUri();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int37 = documentType36.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType36.childNodes();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType36.outerHtmlTail(stringBuilder39, (int) '#', outputSettings41);
        java.lang.String str43 = documentType36.baseUri();
        org.jsoup.nodes.Document document44 = documentType36.ownerDocument();
        boolean boolean46 = documentType36.hasAttr("hi!");
        org.jsoup.nodes.Node node47 = documentType36.nextSibling();
        java.lang.StringBuilder stringBuilder48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = null;
        documentType36.outerHtmlTail(stringBuilder48, 1, outputSettings50);
        java.lang.String str53 = documentType36.attr("<!DOCTYPE html>");
        int int54 = documentType36.siblingIndex();
        java.lang.StringBuilder stringBuilder55 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = null;
        documentType36.outerHtmlTail(stringBuilder55, (int) (byte) 0, outputSettings57);
        java.lang.String str59 = documentType36.toString();
        int int60 = documentType36.siblingIndex();
        org.jsoup.nodes.DocumentType documentType65 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int66 = documentType65.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = documentType65.childNodes();
        java.lang.StringBuilder stringBuilder68 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = null;
        documentType65.outerHtmlTail(stringBuilder68, (int) '#', outputSettings70);
        java.lang.String str72 = documentType65.baseUri();
        org.jsoup.nodes.Document document73 = documentType65.ownerDocument();
        boolean boolean75 = documentType65.hasAttr("hi!");
        org.jsoup.nodes.Node node76 = documentType65.nextSibling();
        java.lang.StringBuilder stringBuilder77 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings79 = null;
        documentType65.outerHtmlTail(stringBuilder77, 1, outputSettings79);
        java.lang.String str82 = documentType65.attr("<!DOCTYPE html>");
        boolean boolean83 = documentType36.equals((java.lang.Object) documentType65);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node84 = node15.after((org.jsoup.nodes.Node) documentType36);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html #doctype\">" + "'", str31, "<!DOCTYPE html #doctype\">");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<!DOCTYPE html>" + "'", str59, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(document73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
            boolean boolean29 = document27.hasAttr("<!DOCTYPE html #doctype\">");
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str23 = documentType21.attr("");
        java.lang.String str25 = documentType21.attr("hi!");
        java.lang.String str26 = documentType21.toString();
        java.lang.String str27 = documentType21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE html>" + "'", str26, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) '4', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int37 = documentType36.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType36.childNodes();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType36.outerHtmlTail(stringBuilder39, (int) '#', outputSettings41);
        java.lang.String str43 = documentType36.baseUri();
        org.jsoup.nodes.Node node46 = documentType36.attr("hi!", "hi!");
        org.jsoup.nodes.Node node47 = node46.clone();
        java.lang.String str48 = node47.outerHtml();
        org.jsoup.nodes.Node node49 = node47.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = node7.after(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE html>" + "'", str48, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        node15.setBaseUri("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
            org.jsoup.nodes.Node node18 = node16.wrap("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document10 = documentType9.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        boolean boolean12 = documentType4.equals((java.lang.Object) attributes11);
        int int13 = documentType4.siblingIndex();
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
            org.jsoup.nodes.Node node22 = documentType4.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
            documentType4.remove();
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
            org.jsoup.nodes.Node node20 = node14.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.String str27 = node18.outerHtml();
        org.jsoup.nodes.Node node28 = node18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node28.unwrap();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node14.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int35 = documentType34.siblingIndex();
        org.jsoup.nodes.Attributes attributes36 = documentType34.attributes();
        boolean boolean38 = documentType34.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node39 = documentType34.nextSibling();
        java.lang.String str41 = documentType34.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType34.childNodes();
        org.jsoup.nodes.Document document43 = documentType34.ownerDocument();
        documentType34.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node28.replaceWith((org.jsoup.nodes.Node) documentType34);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNull(document43);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "hi!", "<!DOCTYPE html>", "#doctype");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType16.outerHtmlTail(stringBuilder19, (int) 'a', outputSettings21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after((org.jsoup.nodes.Node) documentType16);
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
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        documentType4.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str17 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        org.jsoup.nodes.Document document26 = node18.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = document26.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            node13.setBaseUri("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
            documentType4.remove();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
            org.jsoup.nodes.Node node16 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        org.jsoup.nodes.Node node19 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.parent();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.Class<?> wildcardClass7 = documentType4.getClass();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        org.jsoup.nodes.Node node16 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = node16.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.Node node15 = node12.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node21 = documentType20.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node12.after(node21);
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.lang.String str19 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes20 = documentType4.attributes();
        org.jsoup.nodes.Node node21 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str28 = documentType26.attr("");
        java.lang.String str30 = documentType26.attr("hi!");
        java.lang.String str31 = documentType26.toString();
        java.lang.String str32 = documentType26.baseUri();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType26.outerHtmlTail(stringBuilder33, (int) (short) 0, outputSettings35);
        java.lang.String str37 = documentType26.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.before((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.nodeName();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE html hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = node17.absUrl("hi!");
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
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
            int int21 = node20.siblingIndex();
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) 0, outputSettings13);
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
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = document8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str8 = node7.outerHtml();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node16 = documentType13.attr("hi!", "hi!");
        org.jsoup.nodes.Node node18 = node16.removeAttr("hi!");
        boolean boolean20 = node16.equals((java.lang.Object) 100);
        int int21 = node16.siblingIndex();
        org.jsoup.nodes.Document document22 = node16.ownerDocument();
        org.jsoup.nodes.Node node23 = node16.parent();
        // The following exception was thrown during execution in test generation
        try {
            node7.replaceWith(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType16.outerHtmlHead(stringBuilder35, (int) (short) -1, outputSettings37);
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
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        org.jsoup.nodes.Node node23 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node23.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        java.lang.Object obj15 = null;
        boolean boolean16 = node14.equals(obj15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) (short) 1, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder26, (int) ' ', outputSettings28);
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
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, 0, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        java.lang.String str20 = documentType16.absUrl("#doctype");
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
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int22 = documentType21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType21.outerHtmlTail(stringBuilder24, (int) '#', outputSettings26);
        java.lang.String str28 = documentType21.baseUri();
        java.lang.Object obj29 = null;
        boolean boolean30 = documentType21.equals(obj29);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.lang.StringBuilder stringBuilder52 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder52, (int) (short) 1, outputSettings54);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!DOCTYPE html>" + "'", str47, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
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
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) -1, outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        int int9 = node8.siblingIndex();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node8.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document12.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        org.jsoup.nodes.Node node23 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder24, (int) (short) -1, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
            documentType4.remove();
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before("<!DOCTYPE html #doctype\">");
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
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
            org.jsoup.nodes.Node node21 = node14.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        int int8 = node7.siblingIndex();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        org.jsoup.nodes.Node node15 = documentType13.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node7.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType21.outerHtmlTail(stringBuilder27, (int) (byte) 1, outputSettings29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType21.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str12 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        boolean boolean8 = documentType4.hasAttr("hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node16 = documentType13.attr("hi!", "hi!");
        org.jsoup.nodes.Node node18 = node16.removeAttr("hi!");
        boolean boolean20 = node16.equals((java.lang.Object) 100);
        int int21 = node16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
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
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        int int12 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.clone();
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
        org.jsoup.nodes.Node node40 = documentType19.nextSibling();
        documentType19.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node13.before((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str6 = documentType4.baseUri();
        documentType4.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
            org.jsoup.nodes.Node node26 = node25.clone();
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        boolean boolean13 = documentType4.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str14 = documentType12.attr("");
        java.lang.String str15 = documentType12.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node15 = node14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.before("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
            node19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE html>" + "'", str36, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document41);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.lang.Class<?> wildcardClass18 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        documentType4.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str15 = documentType4.baseUri();
        org.jsoup.nodes.Node node16 = documentType4.clone();
        java.lang.String str18 = node16.attr("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str15, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 1, outputSettings10);
        java.lang.String str12 = documentType4.nodeName();
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
        org.jsoup.nodes.Node node32 = node27.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        int int33 = node32.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.before(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.unwrap();
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
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.jsoup.nodes.Node node24 = node20.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = node24.toString();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.previousSibling();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.jsoup.nodes.Node node23 = documentType4.nextSibling();
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "#doctype", "", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (byte) 0, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        java.lang.String str26 = node18.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList27 = node18.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.attr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        int int18 = node16.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        int int12 = node7.siblingIndex();
        org.jsoup.nodes.Document document13 = node7.ownerDocument();
        org.jsoup.nodes.Node node14 = node7.parent();
        java.lang.String str15 = node7.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node7.childNodes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        int int10 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.String str16 = documentType9.baseUri();
        org.jsoup.nodes.Document document17 = documentType9.ownerDocument();
        documentType9.setBaseUri("hi!");
        java.lang.String str21 = documentType9.absUrl("hi!");
        org.jsoup.nodes.Node node22 = documentType9.nextSibling();
        java.lang.String str23 = documentType9.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.after((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.jsoup.nodes.Node node10 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.siblingNodes();
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
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str12 = documentType10.attr("");
        java.lang.String str14 = documentType10.attr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node16 = documentType10.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        java.lang.String str13 = node7.attr("hi!");
        java.lang.String str15 = node7.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node7.after("hi!");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) '#', outputSettings13);
        java.lang.Class<?> wildcardClass15 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (int) (byte) 0, outputSettings17);
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
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder20, (int) ' ', outputSettings22);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.jsoup.nodes.Node node20 = node14.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.childNodes();
        java.lang.Class<?> wildcardClass12 = node9.getClass();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        org.jsoup.nodes.Node node17 = documentType14.parent();
        org.jsoup.nodes.Node node18 = documentType14.nextSibling();
        java.lang.String str19 = documentType14.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
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
        org.jsoup.nodes.Node node32 = node27.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.childNodes();
        boolean boolean34 = node7.equals((java.lang.Object) node32);
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node32.before((org.jsoup.nodes.Node) documentType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        documentType4.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str15 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str15, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node33 = documentType30.attr("hi!", "hi!");
        org.jsoup.nodes.Node node35 = node33.removeAttr("hi!");
        java.lang.String str37 = node35.absUrl("hi!");
        node35.setBaseUri("");
        org.jsoup.nodes.Node node41 = node35.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node35.childNodes();
        boolean boolean43 = documentType25.equals((java.lang.Object) node35);
        boolean boolean44 = documentType4.equals((java.lang.Object) node35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.lang.String str21 = documentType4.toString();
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType28.outerHtmlTail(stringBuilder31, (int) '#', outputSettings33);
        java.lang.String str35 = documentType28.baseUri();
        org.jsoup.nodes.Node node38 = documentType28.attr("hi!", "hi!");
        org.jsoup.nodes.Node node39 = node38.clone();
        node38.setBaseUri("");
        org.jsoup.nodes.Node node42 = node38.nextSibling();
        org.jsoup.nodes.Node node43 = node38.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = documentType4.after(node38);
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.String str29 = documentType4.attr("<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str7 = documentType4.toString();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) (byte) 1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int12 = documentType11.siblingIndex();
        org.jsoup.nodes.Attributes attributes13 = documentType11.attributes();
        boolean boolean15 = documentType11.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, (int) ' ', outputSettings16);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str11 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        org.jsoup.nodes.Node node24 = node20.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = node24.siblingIndex();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes14 = node11.attributes();
        java.lang.String str15 = node11.toString();
        java.lang.String str17 = node11.absUrl("<!DOCTYPE html hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        org.jsoup.nodes.DocumentType documentType51 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str53 = documentType51.attr("");
        int int54 = documentType51.siblingIndex();
        org.jsoup.nodes.Node node55 = documentType51.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = documentType4.before(node55);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
            documentType14.remove();
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
            org.jsoup.nodes.Node node17 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
            boolean boolean16 = node14.hasAttr("<!DOCTYPE html hi!\">");
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = node8.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.String str11 = node8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node8.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html hi!\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node12 = node11.parent();
        org.jsoup.nodes.Node node13 = node11.clone();
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node13.after((org.jsoup.nodes.Node) documentType18);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (short) -1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean13 = node9.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node15 = node9.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.before("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int30 = documentType29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType29.childNodes();
        boolean boolean32 = documentType24.equals((java.lang.Object) documentType29);
        documentType24.setBaseUri("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node14.before((org.jsoup.nodes.Node) documentType24);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.lang.String str9 = documentType4.baseUri();
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
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (short) 10, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        java.lang.String str19 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes20 = documentType4.attributes();
        org.jsoup.nodes.Node node21 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType26.outerHtmlTail(stringBuilder29, (int) '#', outputSettings31);
        java.lang.String str33 = documentType26.baseUri();
        org.jsoup.nodes.Document document34 = documentType26.ownerDocument();
        documentType26.setBaseUri("hi!");
        java.lang.String str38 = documentType26.absUrl("hi!");
        org.jsoup.nodes.Document document39 = documentType26.ownerDocument();
        java.lang.String str41 = documentType26.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.before((org.jsoup.nodes.Node) documentType26);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Node node14 = documentType9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node12 = documentType9.attr("hi!", "hi!");
        org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
        java.lang.String str16 = node14.absUrl("hi!");
        node14.setBaseUri("");
        org.jsoup.nodes.Node node20 = node14.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node14.childNodes();
        boolean boolean22 = documentType4.equals((java.lang.Object) node14);
        java.lang.Class<?> wildcardClass23 = node14.getClass();
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        java.lang.String str22 = documentType18.attr("hi!");
        java.lang.String str23 = documentType18.toString();
        java.lang.String str24 = documentType18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType18.childNodes();
        org.jsoup.nodes.Node node28 = documentType18.attr("<!DOCTYPE html>", "#doctype");
        org.jsoup.nodes.Node node29 = documentType18.clone();
        int int30 = node29.siblingIndex();
        java.lang.String str32 = node29.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node29.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE html>" + "'", str23, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 1, outputSettings10);
        java.lang.String str12 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        org.jsoup.nodes.Attributes attributes47 = node45.attributes();
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
        org.junit.Assert.assertNotNull(attributes47);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
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
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        org.jsoup.nodes.Node node24 = documentType21.parent();
        documentType21.setBaseUri("");
        org.jsoup.nodes.Node node27 = documentType21.parent();
        org.jsoup.nodes.Document document28 = documentType21.ownerDocument();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int34 = documentType33.siblingIndex();
        org.jsoup.nodes.Attributes attributes35 = documentType33.attributes();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType40.childNodes();
        org.jsoup.nodes.Node node43 = documentType40.parent();
        documentType40.setBaseUri("");
        java.lang.String str46 = documentType40.toString();
        boolean boolean47 = documentType33.equals((java.lang.Object) documentType40);
        boolean boolean48 = documentType21.equals((java.lang.Object) documentType33);
        java.lang.String str49 = documentType33.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType33);
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
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!DOCTYPE html>" + "'", str46, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#doctype" + "'", str49, "#doctype");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        java.lang.String str23 = documentType4.attr("#doctype");
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        boolean boolean21 = node11.hasAttr("");
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int27 = documentType26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType26.childNodes();
        org.jsoup.nodes.Node node29 = documentType26.parent();
        documentType26.setBaseUri("");
        org.jsoup.nodes.Node node33 = documentType26.removeAttr("hi!");
        boolean boolean35 = node33.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node37 = node33.removeAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str38 = node37.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node11.before(node37);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE html>" + "'", str38, "<!DOCTYPE html>");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder21, (int) (short) -1, outputSettings23);
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node13 = node7.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = node7.attr("");
        org.jsoup.nodes.Node node16 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = node16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        boolean boolean32 = node15.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node15.remove();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node16.before("<!DOCTYPE html>");
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
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.jsoup.nodes.Node node25 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node25.childNode((int) (short) 1);
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
            org.jsoup.nodes.Node node21 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
            org.jsoup.nodes.Node node24 = node21.wrap("#doctype");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.attr("#doctype", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.jsoup.nodes.Document document18 = node15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node15.attr("", "");
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node18.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE html>" + "'", str22, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.lang.String str29 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType4.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
            org.jsoup.nodes.Node node23 = document22.unwrap();
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int35 = documentType34.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType34.childNodes();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType34.outerHtmlTail(stringBuilder37, (int) (short) 100, outputSettings39);
        org.jsoup.nodes.Node node42 = documentType34.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node43 = node42.clone();
        org.jsoup.nodes.Node node44 = node42.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node29.before(node42);
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
            org.jsoup.nodes.Node node29 = documentType21.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) 'a', outputSettings20);
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
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
            java.lang.String str18 = node16.attr("<!DOCTYPE html #doctype\">");
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node21.after("<!DOCTYPE html PUBLIC \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node25.nextSibling();
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
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType10.childNodes();
        org.jsoup.nodes.Node node13 = documentType10.parent();
        documentType10.setBaseUri("");
        org.jsoup.nodes.Node node16 = documentType10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node9.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html>" + "'", str8, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        java.lang.String str19 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes20 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType9.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        org.jsoup.nodes.Node node16 = documentType9.clone();
        java.lang.String str18 = documentType9.attr("#doctype");
        org.jsoup.nodes.Node node19 = documentType9.clone();
        org.jsoup.nodes.Node node21 = documentType9.removeAttr("hi!");
        org.jsoup.nodes.Node node22 = node21.nextSibling();
        org.jsoup.nodes.Node node25 = node21.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.lang.Class<?> wildcardClass20 = node18.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '4', outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE html hi!\">", "hi!");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int19 = documentType18.siblingIndex();
        org.jsoup.nodes.Node node21 = documentType18.removeAttr("<!DOCTYPE html>");
        documentType18.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node11 = documentType10.parent();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType10.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = node5.equals((java.lang.Object) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        documentType23.outerHtmlTail(stringBuilder26, (int) (short) 100, outputSettings28);
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType23.outerHtmlTail(stringBuilder30, (int) '#', outputSettings32);
        java.lang.String str35 = documentType23.attr("hi!");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (byte) 100, outputSettings8);
        java.lang.String str10 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str10, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node26 = documentType23.attr("hi!", "hi!");
        org.jsoup.nodes.Node node28 = node26.removeAttr("hi!");
        java.lang.String str30 = node28.absUrl("hi!");
        node28.setBaseUri("");
        org.jsoup.nodes.Node node34 = node28.removeAttr("#doctype");
        org.jsoup.nodes.Node node37 = node28.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node38 = node37.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node18.before(node38);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.after("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int14 = documentType13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType13.childNodes();
        org.jsoup.nodes.Node node16 = documentType13.parent();
        org.jsoup.nodes.Node node17 = documentType13.nextSibling();
        boolean boolean19 = documentType13.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = documentType13.clone();
        boolean boolean21 = documentType4.equals((java.lang.Object) node20);
        node20.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html #doctype\">");
        java.lang.String str7 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">" + "'", str7, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType16.before("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Attributes attributes16 = node9.attributes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE html>");
        boolean boolean11 = documentType4.hasAttr("");
        boolean boolean13 = documentType4.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str6 = documentType4.attr("hi!");
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        java.lang.String str21 = documentType18.nodeName();
        org.jsoup.nodes.Node node22 = documentType18.nextSibling();
        org.jsoup.nodes.Node node23 = documentType18.clone();
        node23.setBaseUri("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node9.before(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int15 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType14.childNodes();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType14.outerHtmlTail(stringBuilder17, (int) '#', outputSettings19);
        org.jsoup.nodes.Node node21 = documentType14.clone();
        java.lang.String str23 = documentType14.attr("#doctype");
        java.lang.String str24 = documentType14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        int int13 = documentType9.siblingIndex();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType9.outerHtmlHead(stringBuilder14, (int) (short) 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node28 = documentType25.attr("hi!", "hi!");
        java.lang.String str30 = node28.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node31 = node28.nextSibling();
        boolean boolean33 = node28.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.after(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str11 = node9.baseUri();
        java.lang.String str13 = node9.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.String str26 = node18.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node18.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int13 = documentType12.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType12.childNodes();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType12.outerHtmlTail(stringBuilder15, (int) '#', outputSettings17);
        java.lang.String str19 = documentType12.baseUri();
        org.jsoup.nodes.Node node22 = documentType12.attr("hi!", "hi!");
        java.lang.String str23 = documentType12.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (-1), outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.clone();
        node13.setBaseUri("<!DOCTYPE html>");
        boolean boolean17 = node13.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node13.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "hi!");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.after("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" hi!\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str9 = node8.toString();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">" + "'", str9, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, 0, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document20 = documentType19.ownerDocument();
        org.jsoup.nodes.Attributes attributes21 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node24 = documentType19.clone();
        java.lang.String str25 = documentType19.baseUri();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node33 = documentType30.attr("hi!", "hi!");
        org.jsoup.nodes.Node node35 = node33.removeAttr("hi!");
        node35.setBaseUri("");
        boolean boolean38 = documentType19.equals((java.lang.Object) node35);
        org.jsoup.nodes.Node node39 = node35.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        org.jsoup.nodes.DocumentType documentType56 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int57 = documentType56.siblingIndex();
        org.jsoup.nodes.Attributes attributes58 = documentType56.attributes();
        java.lang.String str59 = documentType56.outerHtml();
        org.jsoup.nodes.Document document60 = documentType56.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = documentType4.after((org.jsoup.nodes.Node) document60);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<!DOCTYPE html>" + "'", str59, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document60);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        org.jsoup.nodes.Node node23 = node21.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node23.clone();
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        boolean boolean10 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.parent();
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
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
            org.jsoup.nodes.Node node43 = node41.after("<!DOCTYPE html hi!\">");
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.String str35 = documentType18.attr("<!DOCTYPE html>");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#doctype" + "'", str35, "#doctype");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.before("<!DOCTYPE html #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
            org.jsoup.nodes.Node node16 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.String str29 = documentType4.baseUri();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.String str19 = node15.outerHtml();
        org.jsoup.nodes.Node node20 = node15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = node20.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        java.lang.String str22 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder23, 0, outputSettings25);
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html>", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
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
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = node10.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">", "#doctype");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (byte) 0, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = node8.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node8.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        org.jsoup.nodes.Document document16 = node14.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.String str19 = documentType15.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = node10.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str7 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node15.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
            org.jsoup.nodes.Node node54 = documentType33.previousSibling();
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        org.jsoup.nodes.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType18.replaceWith(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 1, outputSettings8);
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        java.lang.String str11 = node9.absUrl("hi!");
        node9.setBaseUri("");
        org.jsoup.nodes.Node node15 = node9.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        java.lang.String str19 = documentType16.outerHtml();
        org.jsoup.nodes.Node node20 = documentType16.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType16.outerHtmlTail(stringBuilder21, (int) (short) 10, outputSettings23);
        boolean boolean26 = documentType16.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        int int27 = documentType16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE html>" + "'", str19, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node7.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.jsoup.nodes.DocumentType documentType50 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int56 = documentType55.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = documentType55.childNodes();
        boolean boolean58 = documentType50.equals((java.lang.Object) documentType55);
        java.lang.String str60 = documentType55.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str62 = documentType55.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = documentType4.after((org.jsoup.nodes.Node) documentType55);
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        org.jsoup.nodes.Node node35 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes26 = node25.attributes();
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
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        java.lang.Class<?> wildcardClass18 = attributes17.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        boolean boolean21 = documentType17.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        boolean boolean27 = documentType17.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str28 = documentType17.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node7.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "#doctype");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType10.childNodes();
        org.jsoup.nodes.Node node13 = documentType10.parent();
        documentType10.setBaseUri("");
        org.jsoup.nodes.Node node17 = documentType10.removeAttr("hi!");
        boolean boolean19 = node17.hasAttr("<!DOCTYPE html>");
        node17.setBaseUri("hi!");
        int int22 = node17.siblingIndex();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int28 = documentType27.siblingIndex();
        org.jsoup.nodes.Node node29 = documentType27.parent();
        org.jsoup.nodes.Node node30 = documentType27.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType27.childNodes();
        boolean boolean32 = node17.equals((java.lang.Object) documentType27);
        org.jsoup.nodes.Attributes attributes33 = documentType27.attributes();
        org.jsoup.nodes.Node node34 = documentType27.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType4.after((org.jsoup.nodes.Node) documentType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (byte) -1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        org.jsoup.nodes.Node node20 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document26 = documentType25.ownerDocument();
        org.jsoup.nodes.Attributes attributes27 = documentType25.attributes();
        org.jsoup.nodes.Node node30 = documentType25.attr("<!DOCTYPE html #doctype\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node20.after(node30);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 100, outputSettings9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        org.jsoup.nodes.Node node24 = documentType17.clone();
        java.lang.String str26 = documentType17.attr("#doctype");
        org.jsoup.nodes.Node node27 = documentType17.clone();
        org.jsoup.nodes.Node node29 = documentType17.removeAttr("hi!");
        org.jsoup.nodes.Node node30 = node29.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "hi!", "<!DOCTYPE html>", "#doctype");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) 'a', outputSettings9);
        int int11 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
            org.jsoup.nodes.Node node14 = node12.previousSibling();
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
            java.lang.Class<?> wildcardClass23 = node22.getClass();
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
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
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.previousSibling();
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
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Node node15 = documentType4.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.parent();
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType24.outerHtmlTail(stringBuilder27, (int) '#', outputSettings29);
        java.lang.String str31 = documentType24.baseUri();
        org.jsoup.nodes.Node node32 = documentType24.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node7.before((org.jsoup.nodes.Node) documentType24);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = documentType33.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes15 = node14.attributes();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
            org.jsoup.nodes.Node node25 = documentType4.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        java.lang.String str12 = node7.absUrl("<!DOCTYPE html>");
        org.jsoup.nodes.Node node13 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node7.before("<!DOCTYPE html hi!\">");
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
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
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.jsoup.nodes.Document document29 = node15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = document29.removeAttr("<!DOCTYPE html #doctype\">");
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
        org.junit.Assert.assertNull(document29);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, 10, outputSettings8);
        boolean boolean11 = documentType4.hasAttr("");
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str14 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (-1), outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("hi!");
        boolean boolean13 = node11.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Attributes attributes14 = node11.attributes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Node node29 = documentType19.attr("hi!", "hi!");
        boolean boolean30 = node11.equals((java.lang.Object) node29);
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
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean6 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str8 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
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
        org.jsoup.nodes.Document document29 = documentType16.ownerDocument();
        org.jsoup.nodes.Attributes attributes30 = documentType16.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html #doctype\">");
        java.lang.String str12 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
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
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        java.lang.String str11 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "", "", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str5 = documentType4.toString();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (short) 100, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html>" + "'", str5, "<!DOCTYPE html>");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = node8.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean47 = documentType45.hasAttr("<!DOCTYPE html>");
        java.lang.String str49 = documentType45.attr("#doctype");
        java.lang.String str50 = documentType45.outerHtml();
        org.jsoup.nodes.Node node52 = documentType45.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = documentType4.before((org.jsoup.nodes.Node) documentType45);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str50, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str46 = documentType44.attr("");
        java.lang.String str48 = documentType44.attr("hi!");
        java.lang.String str49 = documentType44.toString();
        int int50 = documentType44.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = documentType4.before((org.jsoup.nodes.Node) documentType44);
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!DOCTYPE html>" + "'", str49, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str28 = documentType26.attr("");
        documentType26.setBaseUri("");
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType26.outerHtmlTail(stringBuilder31, (int) (short) 10, outputSettings33);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.lang.Class<?> wildcardClass17 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node7.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        int int7 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType10.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType10.outerHtmlTail(stringBuilder13, (int) '#', outputSettings15);
        java.lang.String str17 = documentType10.baseUri();
        org.jsoup.nodes.Node node20 = documentType10.attr("hi!", "hi!");
        org.jsoup.nodes.Node node21 = node20.clone();
        int int22 = node20.siblingIndex();
        org.jsoup.nodes.Node node25 = node20.attr("<!DOCTYPE html>", "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes26 = node25.attributes();
        java.lang.String str27 = node25.toString();
        node25.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        org.jsoup.nodes.Node node23 = documentType4.clone();
        boolean boolean25 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType30.outerHtmlTail(stringBuilder33, (int) '#', outputSettings35);
        java.lang.String str37 = documentType30.baseUri();
        org.jsoup.nodes.Document document38 = documentType30.ownerDocument();
        documentType30.setBaseUri("hi!");
        java.lang.String str41 = documentType30.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType30.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType30.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = documentType4.before((org.jsoup.nodes.Node) documentType30);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE html>" + "'", str41, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int11 = documentType10.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = documentType10.attributes();
        boolean boolean14 = documentType10.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
            documentType4.remove();
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
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
            org.jsoup.nodes.Node node23 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass9 = documentType4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
            java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.attr("", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        documentType4.setBaseUri("<!DOCTYPE html>");
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) (byte) 100, outputSettings18);
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node18.unwrap();
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
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.baseUri();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType18.childNodes();
        org.jsoup.nodes.Node node20 = documentType18.nextSibling();
        int int21 = documentType18.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        org.jsoup.nodes.Document document32 = documentType31.ownerDocument();
        java.lang.String str33 = documentType31.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = documentType4.before((org.jsoup.nodes.Node) documentType31);
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
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#doctype" + "'", str33, "#doctype");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.baseUri();
        org.jsoup.nodes.Node node11 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("<!DOCTYPE html>");
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int17 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType16.childNodes();
        java.lang.String str19 = documentType16.baseUri();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType16.outerHtmlTail(stringBuilder20, (int) (byte) 0, outputSettings22);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
            org.jsoup.nodes.Node node30 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.String str8 = documentType4.attr("");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType15.outerHtmlTail(stringBuilder18, (int) '#', outputSettings20);
        java.lang.String str22 = documentType15.baseUri();
        org.jsoup.nodes.Document document23 = documentType15.ownerDocument();
        java.lang.String str24 = documentType15.baseUri();
        org.jsoup.nodes.Node node26 = documentType15.removeAttr("<!DOCTYPE html>");
        java.lang.String str27 = node26.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.lang.String str27 = documentType25.attr("");
        int int28 = documentType25.siblingIndex();
        java.lang.String str29 = documentType25.baseUri();
        org.jsoup.nodes.Node node30 = documentType25.clone();
        java.lang.String str31 = documentType25.toString();
        org.jsoup.nodes.Document document32 = documentType25.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.before((org.jsoup.nodes.Node) document32);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE html>" + "'", str31, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html #doctype\">");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) (byte) 1, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean11 = node7.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node7.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.unwrap();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        org.jsoup.nodes.Document document13 = documentType9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = document13.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        boolean boolean14 = documentType4.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass18 = node17.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int24 = documentType23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType23.outerHtmlTail(stringBuilder26, (int) '#', outputSettings28);
        org.jsoup.nodes.Node node30 = documentType23.clone();
        java.lang.String str32 = documentType23.attr("#doctype");
        org.jsoup.nodes.Node node34 = documentType23.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str35 = documentType23.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType4.after((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE html>" + "'", str35, "<!DOCTYPE html>");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.lang.String str27 = node24.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node24.unwrap();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.jsoup.nodes.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node26.after(node28);
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, 10, outputSettings23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        org.jsoup.nodes.Node node26 = documentType19.clone();
        java.lang.String str28 = documentType19.attr("#doctype");
        java.lang.String str29 = documentType19.toString();
        java.lang.String str30 = documentType19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        boolean boolean30 = documentType4.hasAttr("<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html <!DOCTYPE html #doctype\">\">" + "'", str7, "<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
            org.jsoup.nodes.Node node31 = node28.unwrap();
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
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        boolean boolean41 = node19.equals((java.lang.Object) node35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node35.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE html>" + "'", str37, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
            org.jsoup.nodes.Node node18 = node16.after("");
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
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
            org.jsoup.nodes.Node node55 = documentType33.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str6 = documentType4.attr("");
        java.lang.String str8 = documentType4.attr("hi!");
        java.lang.String str9 = documentType4.toString();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE html hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html>" + "'", str9, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str11 = documentType10.toString();
        java.lang.String str13 = documentType10.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node14 = documentType10.parent();
        org.jsoup.nodes.Document document15 = documentType10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str11, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 0, outputSettings7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 10, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.String str10 = documentType4.toString();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
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
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        org.jsoup.nodes.Document document28 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList29 = node9.siblingNodes();
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
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.jsoup.nodes.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node18);
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (short) 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
            org.jsoup.nodes.Node node54 = node53.previousSibling();
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
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        boolean boolean11 = node7.equals((java.lang.Object) 100);
        boolean boolean13 = node7.hasAttr("#doctype");
        boolean boolean15 = node7.hasAttr("#doctype");
        node7.setBaseUri("");
        node7.setBaseUri("<!DOCTYPE html #doctype\">");
        java.lang.String str20 = node7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
            org.jsoup.nodes.Node node16 = node12.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType21.outerHtmlTail(stringBuilder22, (int) (short) 10, outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            node16.replaceWith((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
            documentType4.remove();
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        boolean boolean11 = node9.hasAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean13 = node9.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str20 = documentType18.attr("");
        int int21 = documentType18.siblingIndex();
        java.lang.String str23 = documentType18.absUrl("<!DOCTYPE html>");
        boolean boolean25 = documentType18.hasAttr("");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.lang.Class<?> wildcardClass32 = documentType30.getClass();
        boolean boolean33 = documentType18.equals((java.lang.Object) wildcardClass32);
        java.lang.String str34 = documentType18.outerHtml();
        org.jsoup.nodes.Node node35 = documentType18.clone();
        org.jsoup.nodes.Node node36 = node35.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node9.before(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int29 = documentType28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType28.childNodes();
        org.jsoup.nodes.Node node31 = documentType28.parent();
        documentType28.setBaseUri("");
        org.jsoup.nodes.Node node34 = documentType28.parent();
        org.jsoup.nodes.Document document35 = documentType28.ownerDocument();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int41 = documentType40.siblingIndex();
        org.jsoup.nodes.Attributes attributes42 = documentType40.attributes();
        org.jsoup.nodes.DocumentType documentType47 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int48 = documentType47.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = documentType47.childNodes();
        org.jsoup.nodes.Node node50 = documentType47.parent();
        documentType47.setBaseUri("");
        java.lang.String str53 = documentType47.toString();
        boolean boolean54 = documentType40.equals((java.lang.Object) documentType47);
        boolean boolean55 = documentType28.equals((java.lang.Object) documentType40);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = documentType40.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = node23.equals((java.lang.Object) nodeList56);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!DOCTYPE html>" + "'", str53, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeList56);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        org.jsoup.nodes.Node node17 = node14.nextSibling();
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        org.jsoup.nodes.Node node27 = documentType24.parent();
        documentType24.setBaseUri("");
        org.jsoup.nodes.Node node30 = documentType24.parent();
        org.jsoup.nodes.Document document31 = documentType24.ownerDocument();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int37 = documentType36.siblingIndex();
        org.jsoup.nodes.Attributes attributes38 = documentType36.attributes();
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int44 = documentType43.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = documentType43.childNodes();
        org.jsoup.nodes.Node node46 = documentType43.parent();
        documentType43.setBaseUri("");
        java.lang.String str49 = documentType43.toString();
        boolean boolean50 = documentType36.equals((java.lang.Object) documentType43);
        boolean boolean51 = documentType24.equals((java.lang.Object) documentType36);
        java.lang.String str52 = documentType36.nodeName();
        org.jsoup.nodes.Node node55 = documentType36.attr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">", "<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = documentType4.before((org.jsoup.nodes.Node) documentType36);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!DOCTYPE html>" + "'", str49, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#doctype" + "'", str52, "#doctype");
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 10, outputSettings14);
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Attributes attributes19 = node18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean24 = documentType22.hasAttr("<!DOCTYPE html>");
        java.lang.String str26 = documentType22.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        org.jsoup.nodes.Node node23 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder24, (int) (byte) 100, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE html>" + "'", str16, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType16.outerHtmlHead(stringBuilder41, 0, outputSettings43);
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
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType11.attributes();
        boolean boolean13 = documentType4.equals((java.lang.Object) attributes12);
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int20 = documentType19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        java.lang.String str26 = documentType19.baseUri();
        org.jsoup.nodes.Document document27 = documentType19.ownerDocument();
        boolean boolean29 = documentType19.hasAttr("hi!");
        org.jsoup.nodes.Node node30 = documentType19.nextSibling();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType19.outerHtmlTail(stringBuilder31, 1, outputSettings33);
        org.jsoup.nodes.Node node36 = documentType19.removeAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node39 = documentType19.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = documentType4.before(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE html>", "<!DOCTYPE html>");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (short) 0, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str8 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = document10.absUrl("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.wrap("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = node8.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html>");
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int30 = documentType29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType29.childNodes();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType29.outerHtmlTail(stringBuilder32, (int) '#', outputSettings34);
        java.lang.String str36 = documentType29.baseUri();
        org.jsoup.nodes.Node node39 = documentType29.attr("hi!", "hi!");
        org.jsoup.nodes.Node node40 = node39.clone();
        org.jsoup.nodes.Node node43 = node40.attr("hi!", "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str44 = node43.outerHtml();
        org.jsoup.nodes.Attributes attributes45 = node43.attributes();
        java.lang.String str47 = node43.absUrl("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Attributes attributes48 = node43.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node14.after(node43);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!DOCTYPE html>" + "'", str44, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "hi!", "<!DOCTYPE html>", "<!DOCTYPE html>");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) (byte) 100, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">" + "'", str5, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE html>" + "'", str6, "<!DOCTYPE html>");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
            org.jsoup.nodes.Node node36 = documentType30.previousSibling();
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str17 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) (short) 0, outputSettings20);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html>", "#doctype", "<!DOCTYPE html PUBLIC \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("<!DOCTYPE html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int25 = documentType24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType24.childNodes();
        org.jsoup.nodes.Node node27 = documentType24.parent();
        documentType24.setBaseUri("");
        org.jsoup.nodes.Node node31 = documentType24.removeAttr("hi!");
        boolean boolean33 = node31.hasAttr("<!DOCTYPE html>");
        node31.setBaseUri("hi!");
        int int36 = node31.siblingIndex();
        org.jsoup.nodes.Node node37 = node31.clone();
        java.lang.String str38 = node31.toString();
        org.jsoup.nodes.Attributes attributes39 = node31.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node31.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node31);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE html>" + "'", str38, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.before("<!DOCTYPE html PUBLIC \"hi!\">");
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
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node68 = documentType16.unwrap();
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
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.String str17 = documentType4.toString();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) (byte) 0, outputSettings20);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE html>" + "'", str17, "<!DOCTYPE html>");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str11 = documentType4.toString();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE html <!DOCTYPE html #doctype\">\">");
        java.lang.String str14 = documentType4.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE html>" + "'", str11, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE html>" + "'", str14, "<!DOCTYPE html>");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) '#', outputSettings9);
        java.lang.String str11 = documentType4.baseUri();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean20 = documentType18.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str22 = documentType18.attr("#doctype");
        org.jsoup.nodes.Document document23 = documentType18.ownerDocument();
        int int24 = documentType18.siblingIndex();
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = documentType18.equals(obj25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>", "<!DOCTYPE html hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (-1), outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        boolean boolean9 = documentType4.hasAttr("");
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        int int13 = documentType4.siblingIndex();
        int int14 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "", "#doctype", "");
        boolean boolean21 = documentType19.equals((java.lang.Object) "<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType19.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        boolean boolean24 = documentType4.equals((java.lang.Object) node23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after("<!DOCTYPE html hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("#doctype");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) ' ', outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int26 = documentType25.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType25.childNodes();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType25.outerHtmlTail(stringBuilder28, (int) '#', outputSettings30);
        java.lang.String str32 = documentType25.baseUri();
        org.jsoup.nodes.Document document33 = documentType25.ownerDocument();
        boolean boolean35 = documentType25.hasAttr("hi!");
        org.jsoup.nodes.Node node36 = documentType25.nextSibling();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType25.outerHtmlTail(stringBuilder37, 1, outputSettings39);
        java.lang.String str42 = documentType25.attr("<!DOCTYPE html>");
        int int43 = documentType25.siblingIndex();
        java.lang.StringBuilder stringBuilder44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        documentType25.outerHtmlTail(stringBuilder44, (int) (byte) 0, outputSettings46);
        int int48 = documentType25.siblingIndex();
        org.jsoup.nodes.Node node49 = documentType25.clone();
        java.lang.String str50 = documentType25.toString();
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceWith((org.jsoup.nodes.Node) documentType25);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE html>" + "'", str50, "<!DOCTYPE html>");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node12 = node9.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node9.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" #doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE html>" + "'", str10, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node21.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE html>" + "'", str20, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.unwrap();
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
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
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
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder27, (int) (byte) 0, outputSettings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE html>");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
            org.jsoup.nodes.Node node36 = node31.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE html>" + "'", str29, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node28 = documentType25.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType25.outerHtmlTail(stringBuilder29, (int) '4', outputSettings31);
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType25.outerHtmlTail(stringBuilder33, (int) (byte) 10, outputSettings35);
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType25.outerHtmlTail(stringBuilder37, (int) (byte) 0, outputSettings39);
        boolean boolean42 = documentType25.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType25);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        java.lang.Class<?> wildcardClass18 = node16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE html>" + "'", str12, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE html #doctype\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node19 = documentType16.attr("hi!", "hi!");
        org.jsoup.nodes.Node node21 = node19.removeAttr("hi!");
        boolean boolean23 = node19.equals((java.lang.Object) 100);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node19.childNodes();
        org.jsoup.nodes.Document document25 = node19.ownerDocument();
        boolean boolean27 = node19.hasAttr("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = document17.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        org.jsoup.nodes.Node node15 = documentType4.parent();
        java.lang.String str16 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document22 = documentType21.ownerDocument();
        org.jsoup.nodes.Attributes attributes23 = documentType21.attributes();
        org.jsoup.nodes.Node node25 = documentType21.removeAttr("<!DOCTYPE html>");
        int int26 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType21.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node31 = documentType21.attr("<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.before((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str8 = documentType4.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "", "", "<!DOCTYPE html>");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int10 = documentType9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType9.childNodes();
        boolean boolean12 = documentType4.equals((java.lang.Object) documentType9);
        java.lang.String str14 = documentType9.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        java.lang.String str15 = documentType9.outerHtml();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE html>" + "'", str15, "<!DOCTYPE html>");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE html PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int18 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType17.outerHtmlTail(stringBuilder20, (int) '#', outputSettings22);
        org.jsoup.nodes.Node node24 = documentType17.clone();
        java.lang.String str26 = documentType17.attr("#doctype");
        java.lang.String str27 = documentType17.toString();
        java.lang.String str28 = documentType17.toString();
        org.jsoup.nodes.Node node29 = documentType17.nextSibling();
        java.lang.String str30 = documentType17.toString();
        java.lang.String str32 = documentType17.attr("<!DOCTYPE html #doctype\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE html>" + "'", str27, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE html>" + "'", str28, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE html>" + "'", str30, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node14.before("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\" hi!\">\" <!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">\">");
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
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType21.childNodes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType21.outerHtmlTail(stringBuilder26, (int) (short) 10, outputSettings28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE html #doctype\">", "<!DOCTYPE html PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
            org.jsoup.nodes.Node node17 = node14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node15 = documentType12.attr("hi!", "hi!");
        org.jsoup.nodes.Node node17 = node15.removeAttr("hi!");
        java.lang.String str19 = node17.absUrl("hi!");
        node17.setBaseUri("");
        org.jsoup.nodes.Node node23 = node17.removeAttr("#doctype");
        java.lang.String str24 = node17.outerHtml();
        org.jsoup.nodes.Node node25 = node17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE html>" + "'", str24, "<!DOCTYPE html>");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document32 = documentType31.ownerDocument();
        org.jsoup.nodes.Attributes attributes33 = documentType31.attributes();
        org.jsoup.nodes.Node node36 = documentType31.attr("<!DOCTYPE html #doctype\">", "");
        node36.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = documentType4.after(node36);
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
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.String str24 = node20.baseUri();
        node20.setBaseUri("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "hi!");
        int int5 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">", "<!DOCTYPE html hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, (int) '#', outputSettings24);
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node33 = documentType30.attr("hi!", "hi!");
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType30.outerHtmlTail(stringBuilder34, (int) '4', outputSettings36);
        org.jsoup.nodes.Node node40 = documentType30.attr("<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html>\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType30);
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
            documentType4.remove();
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        org.jsoup.nodes.Node node20 = documentType4.removeAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\" <!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Attributes attributes21 = node20.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE html>" + "'", str18, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.jsoup.nodes.Node node23 = documentType4.clone();
        boolean boolean25 = documentType4.hasAttr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html #doctype\">\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int31 = documentType30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodes();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType30.outerHtmlTail(stringBuilder33, (int) '#', outputSettings35);
        java.lang.String str37 = documentType30.baseUri();
        org.jsoup.nodes.Node node40 = documentType30.attr("hi!", "hi!");
        org.jsoup.nodes.Node node41 = node40.clone();
        java.lang.String str42 = node40.outerHtml();
        org.jsoup.nodes.Node node44 = node40.removeAttr("hi!");
        org.jsoup.nodes.Node node45 = node44.nextSibling();
        boolean boolean47 = node44.hasAttr("<!DOCTYPE html #doctype\">");
        org.jsoup.nodes.Document document48 = node44.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = documentType4.before((org.jsoup.nodes.Node) document48);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE html>" + "'", str42, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(document48);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html>" + "'", str7, "<!DOCTYPE html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("", "", "", "");
        int int23 = documentType22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType22.outerHtmlTail(stringBuilder25, (int) '#', outputSettings27);
        java.lang.String str29 = documentType22.baseUri();
        org.jsoup.nodes.Node node32 = documentType22.attr("hi!", "hi!");
        org.jsoup.nodes.Node node33 = node32.clone();
        java.lang.String str34 = node32.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE html>" + "'", str13, "<!DOCTYPE html>");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE html>" + "'", str34, "<!DOCTYPE html>");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE html>");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE html PUBLIC \"<!DOCTYPE html PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE html>");
        java.lang.String str7 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 1, outputSettings10);
        documentType4.setBaseUri("<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE html PUBLIC \"hi!\">");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html <!DOCTYPE html #doctype\">\">", "<!DOCTYPE html PUBLIC \"hi!\" hi!\">", "#doctype", "#doctype");
        int int5 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (short) 1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "", "");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) (short) 10, outputSettings8);
        int int10 = documentType4.siblingIndex();
        java.lang.String str12 = documentType4.attr("<!DOCTYPE html PUBLIC \"<!DOCTYPE html>\" <!DOCTYPE html #doctype\">\">");
        java.lang.String str13 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "", "", "");
        java.lang.String str30 = documentType28.attr("");
        java.lang.String str32 = documentType28.attr("hi!");
        java.lang.String str33 = documentType28.toString();
        java.lang.String str34 = documentType28.baseUri();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType28.outerHtmlTail(stringBuilder35, (int) (short) 0, outputSettings37);
        java.lang.String str39 = documentType28.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType28);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE html>" + "'", str33, "<!DOCTYPE html>");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE html>" + "'", str39, "<!DOCTYPE html>");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE html PUBLIC \"hi!\">", "hi!", "<!DOCTYPE html PUBLIC \"hi!\">", "<!DOCTYPE html>");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE html hi!\">");
        java.lang.String str9 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">" + "'", str9, "<!DOCTYPE html PUBLIC \"hi!\" <!DOCTYPE html PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "", "", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("hi!", "hi!");
        java.lang.String str9 = node7.absUrl("<!DOCTYPE html PUBLIC \"hi!\">");
        int int10 = node7.siblingIndex();
        org.jsoup.nodes.Node node11 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.attr("hi!");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node16.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }
}

