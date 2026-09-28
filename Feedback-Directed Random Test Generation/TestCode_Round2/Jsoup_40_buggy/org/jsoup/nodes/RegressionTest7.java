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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node21 = documentType16.previousSibling();
        java.lang.String str22 = documentType16.baseUri();
        org.jsoup.nodes.Node node24 = documentType16.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean25 = node9.equals((java.lang.Object) node24);
        org.jsoup.nodes.Node node28 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node29 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = node29.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
        node14.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        java.lang.String str18 = node14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        java.lang.String str14 = node9.baseUri();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        org.jsoup.nodes.Node node24 = documentType19.clone();
        org.jsoup.nodes.Attributes attributes25 = node24.attributes();
        java.lang.String str27 = node24.attr("#doctype");
        boolean boolean28 = node9.equals((java.lang.Object) node24);
        java.lang.String str29 = node24.outerHtml();
        boolean boolean31 = node24.hasAttr("#doctype");
        java.lang.Object obj32 = null;
        boolean boolean33 = node24.equals(obj32);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.absUrl("#doctype");
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.parentNode();
        org.jsoup.nodes.Node node16 = node13.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        int int21 = node20.siblingIndex();
        java.lang.String str22 = node20.outerHtml();
        org.jsoup.nodes.Node node23 = node20.clone();
        java.lang.String str24 = node20.toString();
        org.jsoup.nodes.Node node27 = node20.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean28 = node5.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str30 = node5.absUrl("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (byte) 100, outputSettings16);
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        org.jsoup.nodes.Node node28 = documentType23.clone();
        int int29 = node28.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node28.siblingNodes();
        org.jsoup.nodes.Document document31 = node28.ownerDocument();
        node28.setBaseUri("hi!");
        java.lang.String str35 = node28.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node38 = node28.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node41 = node28.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Attributes attributes42 = node41.attributes();
        boolean boolean43 = documentType4.equals((java.lang.Object) node41);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        java.lang.String str16 = documentType4.nodeName();
        java.lang.String str17 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        int int13 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.parent();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        boolean boolean21 = node9.equals((java.lang.Object) documentType19);
        java.lang.String str23 = node9.attr("");
        org.jsoup.nodes.Attributes attributes24 = node9.attributes();
        java.lang.String str25 = node9.outerHtml();
        int int26 = node9.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = node14.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        boolean boolean20 = documentType4.equals((java.lang.Object) documentType19);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node13 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = node13.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        int int10 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node17.attributes();
        boolean boolean22 = node17.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean23 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int24 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node25 = documentType4.clone();
        java.lang.String str26 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node29 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node29.attr("#doctype", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "hi!", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        boolean boolean14 = node11.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = node11.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node25 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node26 = documentType16.parentNode();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType16.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        java.lang.String str14 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "", "hi!");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = documentType4.parent();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.lang.String str10 = documentType4.outerHtml();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) -1, outputSettings14);
        java.lang.String str16 = documentType4.outerHtml();
        org.jsoup.nodes.Node node18 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, 0, outputSettings19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        int int8 = node5.childNodeSize();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node12 = node5.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.toString();
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int19 = documentType4.childNodeSize();
        java.lang.String str21 = documentType4.attr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.clone();
        org.jsoup.nodes.Node node15 = node9.clone();
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "");
        org.jsoup.nodes.Node node20 = node17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str21 = node20.baseUri();
        java.lang.String str23 = node20.absUrl("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.Class<?> wildcardClass8 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 0, outputSettings12);
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, (int) ' ', outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 1, outputSettings17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        org.jsoup.nodes.Node node27 = node8.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("hi!");
        org.jsoup.nodes.Attributes attributes35 = documentType32.attributes();
        int int36 = documentType32.siblingIndex();
        org.jsoup.nodes.Node node37 = documentType32.previousSibling();
        java.lang.String str38 = documentType32.baseUri();
        org.jsoup.nodes.Node node39 = documentType32.parentNode();
        org.jsoup.nodes.Attributes attributes40 = documentType32.attributes();
        org.jsoup.nodes.Node node41 = documentType32.nextSibling();
        org.jsoup.nodes.Node node44 = documentType32.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str46 = documentType32.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = node8.before((org.jsoup.nodes.Node) documentType32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        int int15 = node14.childNodeSize();
        node14.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document18 = node14.ownerDocument();
        org.jsoup.nodes.Node node19 = node14.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node14.childNodes();
        org.jsoup.nodes.Node node22 = node14.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.Node node15 = node12.wrap("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = documentType19.previousSibling();
        java.lang.String str23 = documentType19.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType19.siblingNodes();
        org.jsoup.nodes.Attributes attributes25 = documentType19.attributes();
        java.lang.String str26 = documentType19.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.toString();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        int int15 = node14.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType4.siblingNodes();
        int int26 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int13 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) 1, outputSettings19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        int int12 = node8.siblingIndex();
        org.jsoup.nodes.Node node13 = node8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str14 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        int int29 = documentType15.siblingIndex();
        java.lang.String str30 = documentType15.outerHtml();
        java.lang.String str31 = documentType15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType15.childNodesCopy();
        org.jsoup.nodes.Node node34 = documentType15.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes35 = documentType15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType15.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        int int10 = documentType4.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        int int15 = node14.siblingIndex();
        node14.setBaseUri("#doctype");
        int int18 = node14.childNodeSize();
        java.lang.Class<?> wildcardClass19 = node14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "");
        org.jsoup.nodes.Node node20 = node17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = node20.removeAttr("hi!");
        org.jsoup.nodes.Node node25 = node20.attr("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node20.childNodes();
        org.jsoup.nodes.Node node29 = node20.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! \"hi!\">");
        org.jsoup.nodes.Node node31 = node20.removeAttr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        int int19 = documentType15.siblingIndex();
        java.lang.String str20 = documentType15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType15.childNodesCopy();
        java.lang.String str22 = documentType15.nodeName();
        org.jsoup.nodes.Node node25 = documentType15.attr("#doctype", "hi!");
        int int26 = node25.siblingIndex();
        node25.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("hi!");
        org.jsoup.nodes.Attributes attributes36 = documentType33.attributes();
        int int37 = documentType33.siblingIndex();
        int int38 = documentType33.childNodeSize();
        boolean boolean39 = node25.equals((java.lang.Object) documentType33);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node25.childNodes();
        boolean boolean41 = node9.equals((java.lang.Object) node25);
        org.jsoup.nodes.Node node42 = node9.parent();
        org.jsoup.nodes.DocumentType documentType47 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str49 = documentType47.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes50 = documentType47.attributes();
        org.jsoup.nodes.Node node51 = documentType47.clone();
        org.jsoup.nodes.Node node52 = documentType47.clone();
        org.jsoup.nodes.Attributes attributes53 = node52.attributes();
        java.lang.String str55 = node52.attr("#doctype");
        org.jsoup.nodes.Node node56 = node52.clone();
        java.lang.String str58 = node52.attr("#doctype");
        org.jsoup.nodes.Node node60 = node52.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = node42.before(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        boolean boolean11 = documentType4.hasAttr("hi!");
        java.lang.String str12 = documentType4.nodeName();
        int int13 = documentType4.childNodeSize();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node21 = documentType20.clone();
        node21.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes24 = node21.attributes();
        org.jsoup.nodes.Node node25 = node21.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.siblingNodes();
        boolean boolean27 = documentType4.equals((java.lang.Object) node25);
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node33 = documentType32.previousSibling();
        boolean boolean35 = documentType32.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node25.after((org.jsoup.nodes.Node) documentType32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        int int15 = node14.siblingIndex();
        node14.setBaseUri("#doctype");
        int int18 = node14.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node14.childNodes();
        java.lang.String str20 = node14.outerHtml();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str27 = documentType25.attr("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        org.jsoup.nodes.Node node29 = documentType25.clone();
        int int30 = node29.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node29.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str38 = documentType36.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node39 = documentType36.previousSibling();
        java.lang.String str40 = documentType36.toString();
        org.jsoup.nodes.Node node41 = documentType36.parent();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        documentType36.outerHtmlTail(stringBuilder42, (int) (short) -1, outputSettings44);
        boolean boolean46 = node29.equals((java.lang.Object) documentType36);
        org.jsoup.nodes.Node node48 = node29.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str49 = node29.baseUri();
        boolean boolean51 = node29.hasAttr("#doctype");
        org.jsoup.nodes.Node node52 = node29.parent();
        java.lang.String str53 = node29.outerHtml();
        org.jsoup.nodes.Node node54 = node29.parentNode();
        boolean boolean55 = node14.equals((java.lang.Object) node29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str40, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str53, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.childNodeSize();
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str17 = node9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.jsoup.nodes.Attributes attributes15 = node13.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str14 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.clone();
        org.jsoup.nodes.Node node17 = node14.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node19 = node17.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Attributes attributes22 = node21.attributes();
        java.lang.String str24 = node21.attr("#doctype");
        boolean boolean25 = documentType4.equals((java.lang.Object) node21);
        org.jsoup.nodes.Node node26 = documentType4.clone();
        org.jsoup.nodes.Node node27 = node26.parent();
        java.lang.Class<?> wildcardClass28 = node26.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        int int9 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        org.jsoup.nodes.Node node24 = documentType19.clone();
        int int25 = node24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node24.siblingNodes();
        org.jsoup.nodes.Document document27 = node24.ownerDocument();
        node24.setBaseUri("hi!");
        java.lang.String str31 = node24.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node34 = node24.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node37 = node24.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean38 = node11.equals((java.lang.Object) node37);
        org.jsoup.nodes.Node node39 = node37.previousSibling();
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str46 = documentType44.attr("hi!");
        org.jsoup.nodes.Attributes attributes47 = documentType44.attributes();
        org.jsoup.nodes.Node node48 = documentType44.clone();
        int int49 = node48.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = node48.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str57 = documentType55.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node58 = documentType55.previousSibling();
        java.lang.String str59 = documentType55.toString();
        org.jsoup.nodes.Node node60 = documentType55.parent();
        java.lang.StringBuilder stringBuilder61 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = null;
        documentType55.outerHtmlTail(stringBuilder61, (int) (short) -1, outputSettings63);
        boolean boolean65 = node48.equals((java.lang.Object) documentType55);
        documentType55.setBaseUri("hi!");
        org.jsoup.nodes.Node node68 = documentType55.previousSibling();
        org.jsoup.nodes.Node node70 = documentType55.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document71 = node70.ownerDocument();
        java.lang.String str72 = node70.baseUri();
        java.lang.String str73 = node70.toString();
        org.jsoup.nodes.Node node74 = node70.clone();
        // The following exception was thrown during execution in test generation
        try {
            node37.replaceWith(node74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str59, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(document71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str73, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 0, outputSettings15);
        java.lang.String str17 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, 1, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        boolean boolean15 = node5.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node16 = node5.clone();
        node5.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = node10.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        java.lang.String str17 = documentType4.attr("hi!");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType22.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        org.jsoup.nodes.Node node31 = documentType22.removeAttr("hi!");
        boolean boolean32 = documentType4.equals((java.lang.Object) documentType22);
        org.jsoup.nodes.Node node34 = documentType22.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node35 = documentType22.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.clone();
        java.lang.String str9 = node7.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.parentNode();
        org.jsoup.nodes.Node node7 = node5.parentNode();
        java.lang.String str8 = node5.outerHtml();
        java.lang.String str9 = node5.baseUri();
        boolean boolean11 = node5.hasAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) (byte) -1, outputSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        boolean boolean10 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes11 = node5.attributes();
        org.jsoup.nodes.Node node12 = node5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str15 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str18 = node17.baseUri();
        java.lang.String str20 = node17.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node17.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        java.lang.String str12 = node9.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.attr("hi!");
        java.lang.String str15 = node11.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node11.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node11.siblingNodes();
        org.jsoup.nodes.Node node18 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.after("<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) -1, outputSettings14);
        java.lang.String str16 = documentType4.baseUri();
        java.lang.String str18 = documentType4.attr("");
        org.jsoup.nodes.Node node19 = documentType4.clone();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, (int) (short) -1, outputSettings22);
        org.jsoup.nodes.Node node24 = documentType4.parent();
        org.jsoup.nodes.Node node27 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        node19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        node19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass24 = node19.getClass();
        boolean boolean25 = documentType4.equals((java.lang.Object) node19);
        org.jsoup.nodes.Node node27 = node19.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Node node12 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.outerHtml();
        java.lang.String str16 = node13.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = node10.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.Object obj15 = null;
        boolean boolean16 = documentType4.equals(obj15);
        org.jsoup.nodes.Node node17 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, 1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        boolean boolean15 = node13.hasAttr("");
        org.jsoup.nodes.Node node17 = node13.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node13.siblingNodes();
        int int19 = node13.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("#doctype");
        int int15 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType15.toString();
        java.lang.String str17 = documentType15.toString();
        boolean boolean18 = node9.equals((java.lang.Object) str17);
        org.jsoup.nodes.Node node21 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        node21.setBaseUri("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node21.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node21.traverse(nodeVisitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.attr("", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        org.jsoup.nodes.Node node26 = node8.previousSibling();
        org.jsoup.nodes.Node node27 = node8.clone();
        org.jsoup.nodes.Node node28 = node27.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 0, outputSettings16);
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.traverse(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = node11.outerHtml();
        org.jsoup.nodes.Node node18 = node11.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node20 = node11.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean19 = node17.hasAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        int int29 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node30 = documentType15.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType15.siblingNodes();
        java.lang.String str32 = documentType15.nodeName();
        org.jsoup.nodes.Node node33 = documentType15.clone();
        int int34 = documentType15.childNodeSize();
        org.jsoup.nodes.Node node35 = documentType15.clone();
        org.jsoup.nodes.Document document36 = documentType15.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(document36);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        org.jsoup.nodes.Document document19 = documentType15.ownerDocument();
        org.jsoup.nodes.Node node22 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        int int23 = node22.siblingIndex();
        org.jsoup.nodes.Node node26 = node22.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node27 = node26.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = node10.equals((java.lang.Object) node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        boolean boolean14 = node8.hasAttr("#doctype");
        org.jsoup.nodes.Node node15 = node8.parent();
        org.jsoup.nodes.Node node16 = node8.clone();
        org.jsoup.nodes.Node node19 = node16.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        java.lang.String str26 = node8.baseUri();
        java.lang.String str28 = node8.attr("");
        java.lang.String str29 = node8.outerHtml();
        int int30 = node8.siblingIndex();
        java.lang.Object obj31 = null;
        boolean boolean32 = node8.equals(obj31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        documentType4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        org.jsoup.nodes.Document document21 = node20.ownerDocument();
        int int22 = node20.siblingIndex();
        int int23 = node20.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node20.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node20.childNodes();
        node20.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node12.hasAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        int int13 = documentType4.childNodeSize();
        java.lang.String str14 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        java.lang.String str16 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int14 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int18 = documentType4.siblingIndex();
        java.lang.String str19 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.removeAttr("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str15 = documentType4.nodeName();
        boolean boolean17 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str14 = documentType12.attr("hi!");
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        int int16 = documentType12.siblingIndex();
        org.jsoup.nodes.Node node17 = documentType12.previousSibling();
        java.lang.String str18 = documentType12.baseUri();
        org.jsoup.nodes.Node node20 = documentType12.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean21 = documentType4.equals((java.lang.Object) "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        int int18 = documentType14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType14.siblingNodes();
        org.jsoup.nodes.Node node22 = documentType14.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType14.childNodesCopy();
        boolean boolean24 = documentType4.equals((java.lang.Object) documentType14);
        boolean boolean26 = documentType4.hasAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.traverse(nodeVisitor27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        int int10 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node16 = documentType15.clone();
        int int17 = node16.childNodeSize();
        org.jsoup.nodes.Node node18 = node16.previousSibling();
        org.jsoup.nodes.Node node20 = node16.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str15 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.after("<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        int int9 = node5.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.attr("", "#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str18 = node16.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node19 = node16.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = node6.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = node5.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.Class<?> wildcardClass6 = nodeList5.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node10.childNodeSize();
        java.lang.String str15 = node10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node10.childNodesCopy();
        java.lang.String str17 = node10.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType20.childNodesCopy();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType20);
        java.lang.String str23 = documentType4.toString();
        org.jsoup.nodes.Node node24 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.removeAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "#doctype", "", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">" + "'", str5, "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (short) 1, outputSettings20);
        java.lang.String str22 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node13 = node12.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document21 = documentType18.ownerDocument();
        java.lang.String str22 = documentType18.baseUri();
        java.lang.String str23 = documentType18.baseUri();
        java.lang.String str24 = documentType18.nodeName();
        java.lang.String str25 = documentType18.toString();
        documentType18.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node13.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodes();
        org.jsoup.nodes.Node node15 = node11.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "");
        java.lang.String str10 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes14 = documentType11.attributes();
        org.jsoup.nodes.Node node15 = documentType11.clone();
        org.jsoup.nodes.Node node16 = documentType11.clone();
        org.jsoup.nodes.Attributes attributes17 = node16.attributes();
        java.lang.String str19 = node16.attr("#doctype");
        org.jsoup.nodes.Node node20 = node16.clone();
        java.lang.String str21 = node16.toString();
        java.lang.String str22 = node16.outerHtml();
        org.jsoup.nodes.Node node24 = node16.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Node node12 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.outerHtml();
        java.lang.String str15 = node13.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        node9.setBaseUri("hi!");
        java.lang.String str16 = node9.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node9.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        java.lang.String str23 = documentType20.nodeName();
        org.jsoup.nodes.Node node25 = documentType20.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str26 = documentType20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType20.childNodes();
        boolean boolean28 = documentType4.equals((java.lang.Object) documentType20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! \"hi!\">", "", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        boolean boolean10 = node5.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "hi!", "#doctype");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Node node14 = documentType10.clone();
        org.jsoup.nodes.Node node15 = documentType10.clone();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        java.lang.String str18 = node15.attr("#doctype");
        org.jsoup.nodes.Node node19 = node15.clone();
        org.jsoup.nodes.Node node20 = node15.parent();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node26 = documentType25.clone();
        boolean boolean27 = node15.equals((java.lang.Object) documentType25);
        java.lang.String str28 = documentType25.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType25.siblingNodes();
        boolean boolean30 = documentType4.equals((java.lang.Object) documentType25);
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType25.outerHtmlHead(stringBuilder31, (int) (byte) 10, outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        node13.setBaseUri("hi!");
        java.lang.String str17 = node13.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) '4', outputSettings13);
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        int int21 = node20.childNodeSize();
        org.jsoup.nodes.Node node22 = node20.previousSibling();
        org.jsoup.nodes.Node node24 = node20.removeAttr("#doctype");
        java.lang.String str25 = node24.toString();
        org.jsoup.nodes.Node node26 = node24.clone();
        java.lang.String str27 = node26.outerHtml();
        java.lang.String str29 = node26.attr("hi!");
        java.lang.String str30 = node26.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node26.childNodesCopy();
        int int32 = node26.siblingIndex();
        boolean boolean33 = documentType4.equals((java.lang.Object) node26);
        org.jsoup.nodes.Node node34 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType4.siblingNodes();
        java.lang.String str37 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        org.jsoup.nodes.Node node18 = documentType13.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType13.childNodesCopy();
        org.jsoup.nodes.Node node20 = documentType13.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node8.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.attr("hi!");
        java.lang.String str15 = node11.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node11.childNodesCopy();
        int int17 = node11.siblingIndex();
        org.jsoup.nodes.Node node18 = node11.clone();
        org.jsoup.nodes.Node node19 = node11.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node11.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType15.toString();
        java.lang.String str17 = documentType15.toString();
        boolean boolean18 = node9.equals((java.lang.Object) str17);
        java.lang.String str19 = node9.toString();
        org.jsoup.nodes.Node node20 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        node8.setBaseUri("");
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        java.lang.String str12 = node8.outerHtml();
        org.jsoup.nodes.Attributes attributes13 = node8.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        boolean boolean15 = node5.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node16 = node5.clone();
        int int17 = node16.childNodeSize();
        boolean boolean19 = node16.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        boolean boolean9 = node7.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        node8.setBaseUri("");
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        org.jsoup.nodes.Node node12 = node8.clone();
        boolean boolean14 = node8.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.String str15 = node8.toString();
        node8.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = node14.previousSibling();
        java.lang.String str17 = node14.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str19 = node14.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node21 = documentType16.previousSibling();
        java.lang.String str22 = documentType16.baseUri();
        org.jsoup.nodes.Node node24 = documentType16.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean25 = node9.equals((java.lang.Object) node24);
        java.lang.String str27 = node24.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node24.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int13 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodesCopy();
        java.lang.String str18 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Node node24 = documentType16.attr("#doctype", "#doctype");
        boolean boolean25 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node26 = documentType16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType16.siblingNodes();
        org.jsoup.nodes.Node node29 = documentType16.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node32 = documentType16.attr("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType16.outerHtmlHead(stringBuilder33, (int) 'a', outputSettings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        org.jsoup.nodes.Node node30 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node31 = documentType15.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType15.childNodes();
        java.lang.String str33 = documentType15.toString();
        java.lang.String str34 = documentType15.outerHtml();
        java.lang.String str35 = documentType15.nodeName();
        org.jsoup.nodes.Node node37 = documentType15.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.StringBuilder stringBuilder38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType15.outerHtmlHead(stringBuilder38, 10, outputSettings40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#doctype" + "'", str35, "#doctype");
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        int int11 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        java.lang.String str14 = node12.attr("hi!");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        node20.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = node20.nextSibling();
        org.jsoup.nodes.Node node26 = node20.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int27 = node20.siblingIndex();
        boolean boolean28 = node12.equals((java.lang.Object) node20);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node20.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int14 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType22.clone();
        int int24 = documentType22.siblingIndex();
        boolean boolean25 = documentType4.equals((java.lang.Object) int24);
        java.lang.String str26 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node12.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        java.lang.String str17 = documentType4.attr("hi!");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType22.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        org.jsoup.nodes.Node node31 = documentType22.removeAttr("hi!");
        boolean boolean32 = documentType4.equals((java.lang.Object) documentType22);
        java.lang.String str34 = documentType22.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node37 = documentType22.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "hi!");
        org.jsoup.nodes.Node node38 = node37.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node38.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        org.jsoup.nodes.Node node30 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        org.jsoup.nodes.Node node39 = documentType35.clone();
        org.jsoup.nodes.Node node40 = documentType35.clone();
        org.jsoup.nodes.Attributes attributes41 = node40.attributes();
        java.lang.String str43 = node40.attr("#doctype");
        org.jsoup.nodes.Node node44 = node40.clone();
        int int45 = node40.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType15.after(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        node5.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.childNodesCopy();
        org.jsoup.nodes.Node node17 = node13.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        java.lang.String str11 = node5.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodes();
        org.jsoup.nodes.Node node14 = node5.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        java.lang.String str14 = node9.baseUri();
        java.lang.String str15 = node9.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node12 = documentType11.clone();
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        int int14 = node12.siblingIndex();
        node12.setBaseUri("hi!");
        java.lang.String str17 = node12.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node12.childNodesCopy();
        java.lang.String str20 = node12.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node15 = documentType14.clone();
        int int16 = node15.childNodeSize();
        boolean boolean17 = node5.equals((java.lang.Object) int16);
        org.jsoup.nodes.Node node18 = node5.parentNode();
        org.jsoup.nodes.Node node20 = node5.removeAttr("hi!");
        boolean boolean22 = node20.hasAttr("hi!");
        java.lang.String str24 = node20.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node25 = node20.clone();
        int int26 = node20.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node16 = node13.removeAttr("hi!");
        boolean boolean18 = node13.hasAttr("");
        int int19 = node13.childNodeSize();
        org.jsoup.nodes.Node node20 = node13.nextSibling();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str27 = documentType25.attr("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        java.lang.String str30 = documentType25.attr("hi!");
        boolean boolean31 = node13.equals((java.lang.Object) documentType25);
        org.jsoup.nodes.Node node32 = documentType25.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        org.jsoup.nodes.Node node19 = documentType15.clone();
        org.jsoup.nodes.Node node20 = documentType15.clone();
        org.jsoup.nodes.Attributes attributes21 = node20.attributes();
        java.lang.String str23 = node20.attr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node20.childNodes();
        boolean boolean25 = documentType4.equals((java.lang.Object) node20);
        java.lang.String str27 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = node9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
        boolean boolean15 = node9.hasAttr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        org.jsoup.nodes.Node node19 = documentType15.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType15.childNodesCopy();
        org.jsoup.nodes.Document document21 = documentType15.ownerDocument();
        org.jsoup.nodes.Document document22 = documentType15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = document10.equals((java.lang.Object) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean26 = documentType4.hasAttr("#doctype");
        java.lang.String str28 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str29 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes30 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) -1, outputSettings14);
        java.lang.String str16 = documentType4.baseUri();
        java.lang.String str18 = documentType4.attr("");
        org.jsoup.nodes.Node node19 = documentType4.clone();
        org.jsoup.nodes.Node node20 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node15 = node13.nextSibling();
        org.jsoup.nodes.Node node16 = node13.nextSibling();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node22 = documentType21.previousSibling();
        boolean boolean24 = documentType21.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str25 = documentType21.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node16.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = node11.outerHtml();
        org.jsoup.nodes.Attributes attributes16 = node11.attributes();
        node11.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        int int15 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes17 = node16.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int14 = node8.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodesCopy();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int10 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node10.clone();
        java.lang.String str14 = node13.outerHtml();
        java.lang.String str15 = node13.toString();
        org.jsoup.nodes.Node node16 = node13.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        documentType15.setBaseUri("#doctype");
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType15.outerHtmlTail(stringBuilder30, 100, outputSettings32);
        java.lang.String str34 = documentType15.baseUri();
        org.jsoup.nodes.Node node35 = documentType15.clone();
        java.lang.String str36 = node35.toString();
        org.jsoup.nodes.Document document37 = node35.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = document37.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str36, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document37);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node15 = node9.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int22 = documentType21.siblingIndex();
        java.lang.String str23 = documentType21.nodeName();
        org.jsoup.nodes.Node node24 = documentType21.parent();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType21.outerHtmlTail(stringBuilder25, (int) '4', outputSettings27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node15.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        int int7 = node6.childNodeSize();
        java.lang.String str8 = node6.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str8, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str9 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str10 = node5.outerHtml();
        java.lang.String str11 = node5.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        int int10 = node5.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (short) 10, outputSettings20);
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, (int) (short) 10, outputSettings24);
        int int26 = documentType4.childNodeSize();
        java.lang.String str28 = documentType4.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        int int13 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str25 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean29 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document30 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType4.childNodesCopy();
        java.lang.Class<?> wildcardClass32 = nodeList31.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean29 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("hi!");
        org.jsoup.nodes.Attributes attributes37 = documentType34.attributes();
        int int38 = documentType34.siblingIndex();
        java.lang.String str39 = documentType34.nodeName();
        org.jsoup.nodes.Node node40 = documentType34.clone();
        org.jsoup.nodes.Node node41 = node40.nextSibling();
        boolean boolean42 = documentType4.equals((java.lang.Object) node40);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = node40.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node40.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#doctype" + "'", str39, "#doctype");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        java.lang.String str11 = node10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        boolean boolean14 = node11.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node11.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node11.siblingNodes();
        org.jsoup.nodes.Node node17 = node11.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "");
        org.jsoup.nodes.Node node20 = node17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = node20.removeAttr("hi!");
        org.jsoup.nodes.Node node25 = node20.attr("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = node20.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        documentType4.setBaseUri("#doctype");
        java.lang.String str14 = documentType4.absUrl("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.lang.String str10 = documentType4.outerHtml();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) -1, outputSettings14);
        java.lang.String str16 = documentType4.outerHtml();
        int int17 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) '4', outputSettings20);
        org.jsoup.nodes.Node node23 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.toString();
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
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
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.lang.Class<?> wildcardClass6 = documentType4.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        org.jsoup.nodes.Node node27 = node8.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str28 = node8.baseUri();
        boolean boolean30 = node8.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node8.childNodes();
        org.jsoup.nodes.Node node33 = node8.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean35 = node33.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node33.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
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
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        int int29 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node30 = documentType15.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType15.siblingNodes();
        java.lang.String str32 = documentType15.nodeName();
        java.lang.String str33 = documentType15.outerHtml();
        java.lang.String str34 = documentType15.outerHtml();
        org.jsoup.nodes.Node node36 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str38 = documentType15.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = documentType15.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document20 = documentType17.ownerDocument();
        java.lang.String str21 = documentType17.nodeName();
        org.jsoup.nodes.Node node22 = documentType17.previousSibling();
        org.jsoup.nodes.Node node24 = documentType17.removeAttr("#doctype");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        org.jsoup.nodes.Node node33 = documentType29.clone();
        org.jsoup.nodes.Node node34 = documentType29.clone();
        org.jsoup.nodes.Attributes attributes35 = node34.attributes();
        java.lang.String str37 = node34.attr("#doctype");
        boolean boolean38 = documentType17.equals((java.lang.Object) node34);
        java.lang.String str39 = node34.outerHtml();
        int int40 = node34.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node9.before(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str39, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        java.lang.String str12 = node8.toString();
        org.jsoup.nodes.Node node15 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node18 = node8.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Document document27 = documentType23.ownerDocument();
        org.jsoup.nodes.Node node29 = documentType23.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType23.childNodesCopy();
        org.jsoup.nodes.Node node32 = documentType23.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int33 = documentType23.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node8.after((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        boolean boolean11 = documentType4.hasAttr("");
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.nodeName();
        java.lang.String str14 = documentType4.baseUri();
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.siblingIndex();
        java.lang.String str15 = node9.outerHtml();
        java.lang.String str16 = node9.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str15 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node16 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node18 = node17.clone();
        node17.setBaseUri("");
        org.jsoup.nodes.Node node23 = node17.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.siblingNodes();
        org.jsoup.nodes.Node node25 = node23.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str10, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int7 = node6.childNodeSize();
        java.lang.String str8 = node6.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.before("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">" + "'", str8, "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        documentType4.setBaseUri("hi!");
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        int int18 = documentType14.siblingIndex();
        org.jsoup.nodes.Node node19 = documentType14.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType14.childNodesCopy();
        java.lang.String str21 = documentType14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        java.lang.String str10 = node5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Attributes attributes22 = node21.attributes();
        int int23 = node21.siblingIndex();
        java.lang.String str24 = node21.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node21.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node21.childNodes();
        org.jsoup.nodes.Node node27 = node21.clone();
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, 10, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str17 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType15.attributes();
        java.lang.String str30 = documentType15.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        org.jsoup.nodes.Node node39 = documentType35.clone();
        org.jsoup.nodes.Node node40 = documentType35.clone();
        org.jsoup.nodes.Attributes attributes41 = node40.attributes();
        int int42 = node40.siblingIndex();
        java.lang.String str43 = node40.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = documentType15.after(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node28 = documentType4.parentNode();
        java.lang.Class<?> wildcardClass29 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        int int11 = node8.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (short) 10, outputSettings20);
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, (int) (short) 10, outputSettings24);
        int int26 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node28 = documentType4.removeAttr("#doctype");
        java.lang.String str29 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.attr("", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node15 = node13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = node15.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str15 = node9.attr("#doctype");
        org.jsoup.nodes.Node node17 = node9.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node9.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node9.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        java.lang.Class<?> wildcardClass17 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = documentType4.nodeName();
        boolean boolean16 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        org.jsoup.nodes.Node node25 = documentType21.clone();
        org.jsoup.nodes.Node node26 = documentType21.clone();
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        java.lang.String str29 = node26.attr("#doctype");
        org.jsoup.nodes.Node node30 = node26.clone();
        org.jsoup.nodes.Node node31 = node26.parent();
        boolean boolean32 = documentType4.equals((java.lang.Object) node31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 100, outputSettings14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        int int21 = documentType17.siblingIndex();
        java.lang.String str22 = documentType17.nodeName();
        org.jsoup.nodes.Node node23 = documentType17.clone();
        org.jsoup.nodes.Node node24 = node23.nextSibling();
        boolean boolean25 = documentType4.equals((java.lang.Object) node23);
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str32 = documentType30.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes33 = documentType30.attributes();
        org.jsoup.nodes.Node node34 = documentType30.clone();
        org.jsoup.nodes.Node node35 = documentType30.clone();
        org.jsoup.nodes.Node node37 = node35.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int38 = node37.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str9 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str10 = node5.outerHtml();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType15.outerHtmlTail(stringBuilder16, (int) (short) 0, outputSettings18);
        org.jsoup.nodes.Attributes attributes20 = documentType15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node5.after((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "#doctype", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.Class<?> wildcardClass14 = node13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        int int15 = node14.childNodeSize();
        node14.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document18 = node14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = document18.hasAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        java.lang.String str21 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "");
        org.jsoup.nodes.Node node20 = node17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = node20.removeAttr("hi!");
        org.jsoup.nodes.Node node25 = node20.attr("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node20.childNodes();
        org.jsoup.nodes.Node node29 = node20.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! \"hi!\">");
        org.jsoup.nodes.Node node31 = node20.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Document document14 = documentType10.ownerDocument();
        boolean boolean15 = documentType4.equals((java.lang.Object) document14);
        org.jsoup.nodes.Node node16 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodesCopy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        int int12 = node8.siblingIndex();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        boolean boolean21 = documentType17.hasAttr("");
        org.jsoup.nodes.Node node22 = documentType17.nextSibling();
        org.jsoup.nodes.Document document23 = documentType17.ownerDocument();
        boolean boolean24 = node8.equals((java.lang.Object) documentType17);
        org.jsoup.nodes.Node node27 = documentType17.attr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node17.attributes();
        boolean boolean22 = node17.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean23 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int24 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node25 = documentType4.clone();
        org.jsoup.nodes.Node node26 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node26.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        int int14 = node13.childNodeSize();
        org.jsoup.nodes.Node node15 = node13.previousSibling();
        org.jsoup.nodes.Node node16 = node13.clone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = node7.equals((java.lang.Object) node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node18 = node17.clone();
        node17.setBaseUri("");
        org.jsoup.nodes.Node node23 = node17.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "hi!");
        java.lang.String str24 = node17.outerHtml();
        org.jsoup.nodes.Node node25 = node17.previousSibling();
        org.jsoup.nodes.Node node26 = node17.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        org.jsoup.nodes.Node node30 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node30.traverse(nodeVisitor31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str13 = documentType4.nodeName();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.outerHtml();
        java.lang.String str16 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        java.lang.String str28 = documentType15.outerHtml();
        org.jsoup.nodes.Node node29 = documentType15.parentNode();
        org.jsoup.nodes.Node node30 = documentType15.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.toString();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        documentType4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) (short) 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        boolean boolean14 = node11.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node11.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node11.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node11.before("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        int int29 = documentType15.siblingIndex();
        java.lang.String str30 = documentType15.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType15.siblingNodes();
        org.jsoup.nodes.Node node32 = documentType15.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = node10.childNodeSize();
        boolean boolean13 = node10.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        int int8 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        java.lang.Class<?> wildcardClass11 = nodeList10.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        boolean boolean17 = node11.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        int int15 = node14.childNodeSize();
        node14.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node18 = node14.clone();
        org.jsoup.nodes.Node node19 = node14.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node14.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        java.lang.String str17 = documentType4.toString();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.nodeName();
        int int6 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Attributes attributes22 = node21.attributes();
        java.lang.String str24 = node21.attr("#doctype");
        boolean boolean25 = documentType4.equals((java.lang.Object) node21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (byte) 0, outputSettings15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        org.jsoup.nodes.Node node18 = documentType14.clone();
        org.jsoup.nodes.Node node19 = documentType14.clone();
        org.jsoup.nodes.Attributes attributes20 = node19.attributes();
        java.lang.String str22 = node19.attr("#doctype");
        org.jsoup.nodes.Node node23 = node19.clone();
        java.lang.String str24 = node19.toString();
        java.lang.String str25 = node19.outerHtml();
        org.jsoup.nodes.Node node27 = node19.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Node node24 = documentType16.attr("#doctype", "#doctype");
        boolean boolean25 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder26, (int) (byte) 1, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        java.lang.String str12 = node10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodes();
        org.jsoup.nodes.Node node14 = node10.parentNode();
        java.lang.String str15 = node10.baseUri();
        org.jsoup.nodes.Document document16 = node10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = document16.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str28 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (short) 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
        org.jsoup.nodes.Node node13 = node11.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node11.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        java.lang.String str16 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType15.attributes();
        boolean boolean30 = documentType15.hasAttr("hi!");
        java.lang.String str31 = documentType15.nodeName();
        org.jsoup.nodes.Node node32 = documentType15.nextSibling();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType15.outerHtmlHead(stringBuilder33, (int) (short) 1, outputSettings35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        java.lang.String str16 = documentType4.toString();
        java.lang.String str18 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node19 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.lang.String str10 = node8.toString();
        int int11 = node8.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        node15.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node15.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str15 = node9.attr("#doctype");
        org.jsoup.nodes.Node node17 = node9.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        org.jsoup.nodes.Node node26 = documentType22.clone();
        int int27 = node26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node26.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node36 = documentType33.previousSibling();
        java.lang.String str37 = documentType33.toString();
        org.jsoup.nodes.Node node38 = documentType33.parent();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType33.outerHtmlTail(stringBuilder39, (int) (short) -1, outputSettings41);
        boolean boolean43 = node26.equals((java.lang.Object) documentType33);
        documentType33.setBaseUri("hi!");
        documentType33.setBaseUri("#doctype");
        java.lang.StringBuilder stringBuilder48 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = null;
        documentType33.outerHtmlTail(stringBuilder48, 100, outputSettings50);
        java.lang.String str52 = documentType33.baseUri();
        org.jsoup.nodes.Node node53 = documentType33.clone();
        int int54 = documentType33.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = node9.before((org.jsoup.nodes.Node) documentType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str37, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#doctype" + "'", str52, "#doctype");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str18 = node16.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node16.after((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean29 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document30 = documentType4.ownerDocument();
        int int31 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node33 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document13 = documentType10.ownerDocument();
        java.lang.String str14 = documentType10.nodeName();
        java.lang.String str15 = documentType10.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType10.siblingNodes();
        java.lang.String str17 = documentType10.nodeName();
        org.jsoup.nodes.Node node18 = documentType10.parent();
        java.lang.String str19 = documentType10.nodeName();
        boolean boolean20 = node5.equals((java.lang.Object) documentType10);
        org.jsoup.nodes.Node node23 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str24 = documentType10.nodeName();
        int int25 = documentType10.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        org.jsoup.nodes.Node node15 = node13.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Document document14 = documentType10.ownerDocument();
        boolean boolean15 = documentType4.equals((java.lang.Object) document14);
        org.jsoup.nodes.Node node16 = documentType4.clone();
        java.lang.String str17 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str14 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        java.lang.String str16 = documentType4.baseUri();
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodes();
        java.lang.String str20 = documentType4.toString();
        java.lang.String str21 = documentType4.baseUri();
        org.jsoup.nodes.Node node22 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        boolean boolean15 = node5.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node16 = node5.clone();
        java.lang.String str18 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = node5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node5.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        boolean boolean10 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes11 = node5.attributes();
        org.jsoup.nodes.Document document12 = node5.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, 1, outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (-1), outputSettings7);
        java.lang.Class<?> wildcardClass9 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "");
        org.jsoup.nodes.Node node20 = node17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str21 = node20.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str14 = node13.baseUri();
        int int15 = node13.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        int int11 = documentType4.childNodeSize();
        int int12 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (short) 0, outputSettings16);
        int int18 = documentType4.childNodeSize();
        java.lang.String str19 = documentType4.outerHtml();
        org.jsoup.nodes.Node node20 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = node20.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str24 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node25 = documentType4.parentNode();
        java.lang.String str26 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        java.lang.String str17 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, (int) (byte) 10, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node17.attributes();
        boolean boolean22 = node17.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean23 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int24 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node25 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node28 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType4.outerHtmlTail(stringBuilder29, (int) ' ', outputSettings31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        int int9 = node5.childNodeSize();
        java.lang.String str10 = node5.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = node5.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        int int29 = documentType15.siblingIndex();
        java.lang.String str30 = documentType15.toString();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType15.outerHtmlTail(stringBuilder31, 0, outputSettings33);
        org.jsoup.nodes.Node node35 = documentType15.parentNode();
        org.jsoup.nodes.Node node36 = documentType15.previousSibling();
        java.lang.String str37 = documentType15.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#doctype" + "'", str37, "#doctype");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str15 = documentType4.attr("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        int int15 = node14.siblingIndex();
        node14.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        int int26 = documentType22.siblingIndex();
        int int27 = documentType22.childNodeSize();
        boolean boolean28 = node14.equals((java.lang.Object) documentType22);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node14.childNodes();
        java.lang.String str30 = node14.toString();
        java.lang.String str32 = node14.attr("hi!");
        java.lang.String str34 = node14.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = node14.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodesCopy();
        org.jsoup.nodes.Node node12 = node5.parent();
        org.jsoup.nodes.Node node14 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int15 = node14.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = node5.outerHtml();
        org.jsoup.nodes.Node node9 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass10 = node5.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.String str16 = documentType4.attr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node15 = documentType14.clone();
        int int16 = node15.childNodeSize();
        boolean boolean17 = node5.equals((java.lang.Object) int16);
        org.jsoup.nodes.Node node18 = node5.parentNode();
        org.jsoup.nodes.Node node20 = node5.removeAttr("hi!");
        org.jsoup.nodes.Node node22 = node5.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node23 = node22.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.removeAttr("#doctype");
        java.lang.String str15 = node14.outerHtml();
        org.jsoup.nodes.Node node16 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = node16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.lang.String str14 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodesCopy();
        int int16 = documentType4.siblingIndex();
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str14 = node9.toString();
        org.jsoup.nodes.Node node16 = node9.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = documentType4.nodeName();
        boolean boolean16 = documentType4.hasAttr("hi!");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (short) -1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document21 = documentType18.ownerDocument();
        java.lang.String str22 = documentType18.nodeName();
        java.lang.String str23 = documentType18.baseUri();
        java.lang.String str24 = documentType18.nodeName();
        org.jsoup.nodes.Node node25 = documentType18.parent();
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType18.outerHtmlTail(stringBuilder26, (int) (byte) 100, outputSettings28);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType18.siblingNodes();
        boolean boolean31 = node13.equals((java.lang.Object) nodeList30);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.childNodes();
        org.jsoup.nodes.Node node15 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) (short) 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str11 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node12 = node8.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node12.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (short) 10, outputSettings20);
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, (int) (short) 10, outputSettings24);
        org.jsoup.nodes.Node node26 = documentType4.clone();
        org.jsoup.nodes.Node node28 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Attributes attributes29 = documentType4.attributes();
        org.jsoup.nodes.Node node30 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 100, outputSettings14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str19 = documentType16.nodeName();
        org.jsoup.nodes.Node node21 = documentType16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.String str23 = documentType16.nodeName();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType16.outerHtmlHead(stringBuilder24, (int) ' ', outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        java.lang.String str10 = node5.toString();
        boolean boolean12 = node5.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node13 = node5.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.String str15 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str15 = documentType4.absUrl("#doctype");
        int int16 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node18 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str19 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 0, outputSettings10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node16 = node13.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = node13.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node13.childNodes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType23.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        org.jsoup.nodes.Node node32 = documentType23.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType23.siblingNodes();
        java.lang.String str34 = documentType23.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node13.after((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) -1, outputSettings14);
        java.lang.String str16 = documentType4.outerHtml();
        java.lang.String str18 = documentType4.attr("");
        org.jsoup.nodes.Node node19 = documentType4.clone();
        int int20 = node19.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        org.jsoup.nodes.Node node13 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node13.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        boolean boolean15 = node5.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node16 = node5.clone();
        java.lang.String str18 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str20 = node5.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node22 = node5.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node28 = documentType27.clone();
        int int29 = node28.childNodeSize();
        org.jsoup.nodes.Node node30 = node28.previousSibling();
        org.jsoup.nodes.Node node32 = node28.removeAttr("#doctype");
        java.lang.String str33 = node32.toString();
        org.jsoup.nodes.Node node34 = node32.clone();
        java.lang.String str35 = node34.outerHtml();
        java.lang.String str37 = node34.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str38 = node34.outerHtml();
        org.jsoup.nodes.Node node41 = node34.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str38, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        org.jsoup.nodes.Node node13 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node13.attr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) '4', outputSettings15);
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.jsoup.nodes.Node node18 = node17.previousSibling();
        node17.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node9.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("#doctype");
        int int17 = documentType4.childNodeSize();
        java.lang.String str19 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, (int) (byte) 1, outputSettings22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        int int15 = node14.childNodeSize();
        org.jsoup.nodes.Document document16 = node14.ownerDocument();
        node14.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
        java.lang.String str15 = documentType4.baseUri();
        java.lang.String str16 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int15 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.clone();
        int int25 = node24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node24.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node34 = documentType31.previousSibling();
        java.lang.String str35 = documentType31.toString();
        org.jsoup.nodes.Node node36 = documentType31.parent();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType31.outerHtmlTail(stringBuilder37, (int) (short) -1, outputSettings39);
        boolean boolean41 = node24.equals((java.lang.Object) documentType31);
        documentType31.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes44 = documentType31.attributes();
        boolean boolean46 = documentType31.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType4.before((org.jsoup.nodes.Node) documentType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        org.jsoup.nodes.Attributes attributes19 = node18.attributes();
        int int20 = node18.siblingIndex();
        java.lang.String str21 = node18.outerHtml();
        org.jsoup.nodes.Node node23 = node18.removeAttr("#doctype");
        org.jsoup.nodes.Node node25 = node18.removeAttr("hi!");
        org.jsoup.nodes.Node node26 = node25.parentNode();
        boolean boolean27 = documentType4.equals((java.lang.Object) node25);
        node25.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node30 = node25.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        int int15 = node14.childNodeSize();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.clone();
        int int25 = node24.siblingIndex();
        java.lang.String str26 = node24.outerHtml();
        boolean boolean27 = node14.equals((java.lang.Object) node24);
        int int28 = node14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node14.childNodesCopy();
        org.jsoup.nodes.Node node30 = node14.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = node11.outerHtml();
        org.jsoup.nodes.Node node18 = node11.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node21 = node11.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.lang.String str7 = node5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str7, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (-1), outputSettings16);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType20.childNodesCopy();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType20);
        java.lang.String str23 = documentType4.toString();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder24, (int) (byte) 10, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        boolean boolean11 = documentType4.hasAttr("");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Node node21 = documentType17.clone();
        int int22 = node21.siblingIndex();
        java.lang.String str23 = node21.outerHtml();
        org.jsoup.nodes.Node node24 = node21.clone();
        int int25 = node21.siblingIndex();
        org.jsoup.nodes.Node node26 = node21.parent();
        boolean boolean27 = documentType4.equals((java.lang.Object) node26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node26.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        org.jsoup.nodes.Node node30 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node31 = documentType15.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType15.childNodes();
        java.lang.String str33 = documentType15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType15.childNodesCopy();
        org.jsoup.nodes.Node node36 = documentType15.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node37 = documentType15.previousSibling();
        boolean boolean39 = documentType15.hasAttr("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.attr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        org.jsoup.nodes.Node node18 = node15.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        java.lang.String str16 = documentType4.toString();
        int int17 = documentType4.siblingIndex();
        java.lang.String str18 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        int int26 = node8.siblingIndex();
        org.jsoup.nodes.Node node27 = node8.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        java.lang.String str26 = node8.baseUri();
        java.lang.String str28 = node8.attr("");
        java.lang.String str29 = node8.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = node9.toString();
        java.lang.String str12 = node9.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.toString();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        org.jsoup.nodes.Attributes attributes16 = node11.attributes();
        node11.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.Class<?> wildcardClass19 = node11.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) -1, outputSettings19);
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str27 = documentType25.attr("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        int int29 = documentType25.siblingIndex();
        java.lang.String str30 = documentType25.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType25.childNodesCopy();
        java.lang.String str32 = documentType25.nodeName();
        java.lang.String str33 = documentType25.baseUri();
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType25.outerHtmlTail(stringBuilder34, (int) '4', outputSettings36);
        org.jsoup.nodes.Node node38 = documentType25.clone();
        org.jsoup.nodes.Node node39 = documentType25.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        documentType4.setBaseUri("hi!");
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node13.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str12 = documentType4.attr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        int int14 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node14 = node9.wrap("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        org.jsoup.nodes.Node node21 = documentType19.parent();
        org.jsoup.nodes.Document document22 = documentType19.ownerDocument();
        org.jsoup.nodes.Node node24 = documentType19.removeAttr("hi!");
        org.jsoup.nodes.Document document25 = documentType19.ownerDocument();
        org.jsoup.nodes.Document document26 = documentType19.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType19.childNodes();
        documentType19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node9.before((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node18 = node17.clone();
        org.jsoup.nodes.Node node19 = node18.clone();
        java.lang.String str20 = node19.toString();
        java.lang.String str21 = node19.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.siblingIndex();
        java.lang.String str15 = node9.outerHtml();
        java.lang.String str17 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node9.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.childNodeSize();
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str17 = node9.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 0, outputSettings15);
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        org.jsoup.nodes.Node node26 = documentType22.clone();
        int int27 = node26.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node26.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node36 = documentType33.previousSibling();
        java.lang.String str37 = documentType33.toString();
        org.jsoup.nodes.Node node38 = documentType33.parent();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType33.outerHtmlTail(stringBuilder39, (int) (short) -1, outputSettings41);
        boolean boolean43 = node26.equals((java.lang.Object) documentType33);
        documentType33.setBaseUri("hi!");
        java.lang.String str46 = documentType33.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType4.before((org.jsoup.nodes.Node) documentType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str37, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str46, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str12 = documentType11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "#doctype");
        documentType21.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int14 = node8.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        java.lang.String str15 = node9.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document16 = node9.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Node node24 = documentType16.attr("#doctype", "#doctype");
        boolean boolean25 = documentType4.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node26 = documentType16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType16.siblingNodes();
        org.jsoup.nodes.Node node28 = documentType16.nextSibling();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document36 = documentType33.ownerDocument();
        java.lang.String str37 = documentType33.nodeName();
        org.jsoup.nodes.Node node38 = documentType33.clone();
        org.jsoup.nodes.Node node39 = documentType33.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = documentType33.childNodes();
        java.lang.String str42 = documentType33.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        boolean boolean43 = documentType16.equals((java.lang.Object) documentType33);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#doctype" + "'", str37, "#doctype");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        org.jsoup.nodes.Node node30 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document31 = node30.ownerDocument();
        java.lang.String str32 = node30.baseUri();
        java.lang.String str33 = node30.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node30.childNodes();
        boolean boolean36 = node30.hasAttr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        int int29 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node30 = documentType15.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType15.siblingNodes();
        java.lang.String str32 = documentType15.nodeName();
        org.jsoup.nodes.Node node33 = documentType15.clone();
        org.jsoup.nodes.Node node34 = documentType15.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = node14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType15.childNodesCopy();
        int int30 = documentType15.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.attr("");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = document17.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Node node15 = node12.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document16 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node12.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node14 = node11.removeAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document22 = documentType19.ownerDocument();
        java.lang.String str23 = documentType19.nodeName();
        org.jsoup.nodes.Node node24 = documentType19.previousSibling();
        org.jsoup.nodes.Node node26 = documentType19.removeAttr("#doctype");
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes34 = documentType31.attributes();
        org.jsoup.nodes.Node node35 = documentType31.clone();
        org.jsoup.nodes.Node node36 = documentType31.clone();
        org.jsoup.nodes.Attributes attributes37 = node36.attributes();
        java.lang.String str39 = node36.attr("#doctype");
        boolean boolean40 = documentType19.equals((java.lang.Object) node36);
        java.lang.String str41 = node36.outerHtml();
        boolean boolean43 = node36.hasAttr("hi!");
        int int44 = node36.siblingIndex();
        org.jsoup.nodes.Node node46 = node36.removeAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str41, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
        org.jsoup.nodes.Node node30 = documentType15.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node31 = documentType15.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType15.childNodes();
        java.lang.String str33 = documentType15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType15.attr("", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        org.jsoup.nodes.Node node16 = node8.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Attributes attributes17 = node8.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node8.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node8.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node5.setBaseUri("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.attr("");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) '4', outputSettings15);
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.jsoup.nodes.Node node18 = node17.clone();
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node17.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 0, outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node20 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder21, (int) (byte) 0, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (short) 10, outputSettings20);
        java.lang.String str22 = documentType4.baseUri();
        int int23 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType4.outerHtmlTail(stringBuilder24, (int) (byte) 0, outputSettings26);
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType4.outerHtmlTail(stringBuilder28, 1, outputSettings30);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) (byte) -1, outputSettings18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        org.jsoup.nodes.Node node26 = node8.previousSibling();
        org.jsoup.nodes.Node node27 = node8.clone();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("hi!");
        java.lang.String str36 = documentType32.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str38 = documentType32.attr("");
        org.jsoup.nodes.Node node40 = documentType32.removeAttr("#doctype");
        boolean boolean42 = documentType32.hasAttr("#doctype");
        java.lang.String str43 = documentType32.nodeName();
        org.jsoup.nodes.Node node44 = documentType32.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node8.after(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "#doctype");
        int int5 = documentType4.siblingIndex();
        int int6 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        org.jsoup.nodes.Node node9 = node5.previousSibling();
        org.jsoup.nodes.Node node12 = node5.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.clone();
        java.lang.String str14 = node5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node5.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
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
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Attributes attributes12 = node11.attributes();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node20 = documentType17.previousSibling();
        java.lang.String str21 = documentType17.toString();
        org.jsoup.nodes.Node node22 = documentType17.parent();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType17.outerHtmlTail(stringBuilder23, (int) (short) -1, outputSettings25);
        org.jsoup.nodes.Document document27 = documentType17.ownerDocument();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("hi!");
        org.jsoup.nodes.Attributes attributes35 = documentType32.attributes();
        org.jsoup.nodes.Node node36 = documentType32.clone();
        int int37 = node36.siblingIndex();
        java.lang.String str38 = node36.outerHtml();
        org.jsoup.nodes.Node node39 = node36.parent();
        org.jsoup.nodes.Node node40 = node36.clone();
        boolean boolean42 = node36.hasAttr("#doctype");
        org.jsoup.nodes.Node node43 = node36.parent();
        org.jsoup.nodes.Node node44 = node36.clone();
        java.lang.String str45 = node44.baseUri();
        boolean boolean46 = documentType17.equals((java.lang.Object) str45);
        boolean boolean47 = node11.equals((java.lang.Object) documentType17);
        org.jsoup.nodes.DocumentType documentType52 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node53 = documentType52.clone();
        node53.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes56 = node53.attributes();
        org.jsoup.nodes.Node node57 = node53.clone();
        org.jsoup.nodes.Node node58 = node53.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList59 = node53.childNodesCopy();
        boolean boolean60 = node11.equals((java.lang.Object) nodeList59);
        org.jsoup.nodes.Node node61 = node11.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str38, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str16 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        boolean boolean19 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) '4', outputSettings15);
        org.jsoup.nodes.Node node19 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node21 = node19.removeAttr("hi!");
        org.jsoup.nodes.Node node22 = node19.clone();
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.traverse(nodeVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) -1, outputSettings14);
        java.lang.String str16 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.parent();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        boolean boolean21 = node9.equals((java.lang.Object) documentType19);
        java.lang.String str22 = documentType19.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType19.siblingNodes();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node29 = documentType28.clone();
        int int30 = node29.childNodeSize();
        org.jsoup.nodes.Node node31 = node29.previousSibling();
        org.jsoup.nodes.Node node33 = node29.removeAttr("#doctype");
        java.lang.String str34 = node29.baseUri();
        int int35 = node29.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType19.before(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) 100, outputSettings17);
        java.lang.String str20 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node23 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        java.lang.String str11 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        int int18 = node17.childNodeSize();
        org.jsoup.nodes.Node node19 = node17.previousSibling();
        org.jsoup.nodes.Node node21 = node17.removeAttr("#doctype");
        java.lang.String str22 = node21.toString();
        org.jsoup.nodes.Node node23 = node21.clone();
        java.lang.String str24 = node23.outerHtml();
        org.jsoup.nodes.Node node27 = node23.attr("#doctype", "#doctype");
        java.lang.String str28 = node27.outerHtml();
        boolean boolean29 = node8.equals((java.lang.Object) str28);
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("hi!");
        org.jsoup.nodes.Attributes attributes37 = documentType34.attributes();
        int int38 = documentType34.siblingIndex();
        java.lang.String str39 = documentType34.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = documentType34.childNodesCopy();
        java.lang.String str41 = documentType34.nodeName();
        org.jsoup.nodes.Node node44 = documentType34.attr("#doctype", "hi!");
        int int45 = node44.siblingIndex();
        node44.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType52 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str54 = documentType52.attr("hi!");
        org.jsoup.nodes.Attributes attributes55 = documentType52.attributes();
        int int56 = documentType52.siblingIndex();
        int int57 = documentType52.childNodeSize();
        boolean boolean58 = node44.equals((java.lang.Object) documentType52);
        java.util.List<org.jsoup.nodes.Node> nodeList59 = node44.childNodes();
        boolean boolean60 = node8.equals((java.lang.Object) node44);
        java.lang.String str62 = node8.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#doctype" + "'", str41, "#doctype");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        org.jsoup.nodes.Node node16 = node8.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        int int17 = node8.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        org.jsoup.nodes.Node node21 = documentType13.attr("#doctype", "#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType13.childNodes();
        boolean boolean24 = documentType4.equals((java.lang.Object) documentType13);
        org.jsoup.nodes.Node node25 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (byte) 1, outputSettings13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = node17.attributes();
        boolean boolean22 = node17.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean23 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType4.siblingNodes();
        int int25 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str32 = documentType30.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node33 = documentType30.previousSibling();
        java.lang.String str35 = documentType30.absUrl("hi!");
        org.jsoup.nodes.Node node37 = documentType30.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = documentType4.after((org.jsoup.nodes.Node) documentType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int12 = node11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node11.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        int int11 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 0, outputSettings14);
        org.jsoup.nodes.Node node17 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str19 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        int int15 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        int int12 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node16 = node9.removeAttr("hi!");
        org.jsoup.nodes.Node node17 = node16.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node17.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType20.childNodesCopy();
        boolean boolean22 = documentType4.equals((java.lang.Object) documentType20);
        int int23 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 0, outputSettings17);
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        boolean boolean15 = node13.hasAttr("");
        boolean boolean17 = node13.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.nodes.Node node9 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        org.jsoup.nodes.Node node19 = documentType15.clone();
        int int20 = node19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node19.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str28 = documentType26.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node29 = documentType26.previousSibling();
        java.lang.String str30 = documentType26.toString();
        org.jsoup.nodes.Node node31 = documentType26.parent();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType26.outerHtmlTail(stringBuilder32, (int) (short) -1, outputSettings34);
        boolean boolean36 = node19.equals((java.lang.Object) documentType26);
        documentType26.setBaseUri("hi!");
        org.jsoup.nodes.Node node39 = documentType26.previousSibling();
        org.jsoup.nodes.Node node41 = documentType26.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node42 = documentType26.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType26.childNodes();
        java.lang.String str44 = documentType26.toString();
        documentType26.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = node10.equals((java.lang.Object) "#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str44, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int15 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) 'a', outputSettings18);
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder20, (int) (short) 10, outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node15 = node13.nextSibling();
        org.jsoup.nodes.Node node16 = node13.parentNode();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("hi!");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        int int25 = documentType21.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType21.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        boolean boolean30 = documentType21.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node13.before((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int15 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType15.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType15.childNodesCopy();
        documentType15.setBaseUri("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType15.outerHtmlTail(stringBuilder32, 100, outputSettings34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) -1, outputSettings13);
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (short) 10, outputSettings17);
        int int19 = documentType4.childNodeSize();
        java.lang.String str21 = documentType4.attr("#doctype");
        java.lang.String str23 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.before("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str19 = documentType4.attr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean13 = node8.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        java.lang.String str16 = node8.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = node8.attributes();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodes();
        documentType22.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str27 = documentType22.nodeName();
        java.lang.String str29 = documentType22.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        boolean boolean30 = node8.equals((java.lang.Object) "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        int int31 = node8.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodes();
        org.jsoup.nodes.Node node19 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node25 = documentType24.clone();
        org.jsoup.nodes.Document document26 = node25.ownerDocument();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        org.jsoup.nodes.Attributes attributes34 = documentType31.attributes();
        int int35 = documentType31.siblingIndex();
        java.lang.String str36 = documentType31.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType31.childNodesCopy();
        org.jsoup.nodes.Node node40 = documentType31.attr("#doctype", "#doctype");
        boolean boolean41 = node25.equals((java.lang.Object) node40);
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str48 = documentType46.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes49 = documentType46.attributes();
        org.jsoup.nodes.Node node50 = documentType46.clone();
        org.jsoup.nodes.Node node51 = documentType46.clone();
        org.jsoup.nodes.Attributes attributes52 = node51.attributes();
        int int53 = node51.siblingIndex();
        java.lang.String str54 = node51.baseUri();
        boolean boolean55 = node25.equals((java.lang.Object) node51);
        boolean boolean56 = documentType4.equals((java.lang.Object) node25);
        org.jsoup.nodes.Node node57 = documentType4.previousSibling();
        org.jsoup.nodes.Node node60 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.removeAttr("#doctype");
        org.jsoup.nodes.Node node16 = node9.removeAttr("hi!");
        org.jsoup.nodes.Node node17 = node16.parentNode();
        org.jsoup.nodes.Node node20 = node16.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str27 = documentType25.attr("hi!");
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        int int29 = documentType25.siblingIndex();
        java.lang.String str30 = documentType25.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType25.childNodesCopy();
        java.lang.String str32 = documentType25.nodeName();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType25.outerHtmlTail(stringBuilder33, (int) (byte) -1, outputSettings35);
        java.lang.String str37 = documentType25.baseUri();
        java.lang.String str39 = documentType25.attr("");
        org.jsoup.nodes.Node node40 = documentType25.clone();
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceWith((org.jsoup.nodes.Node) documentType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = node11.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node9.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node22 = documentType21.clone();
        int int23 = node22.childNodeSize();
        org.jsoup.nodes.Node node24 = node22.previousSibling();
        int int25 = node22.siblingIndex();
        java.lang.String str26 = node22.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node22.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node22.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("hi!");
        org.jsoup.nodes.Attributes attributes36 = documentType33.attributes();
        org.jsoup.nodes.Node node37 = documentType33.clone();
        int int38 = node37.siblingIndex();
        java.lang.String str39 = node37.outerHtml();
        org.jsoup.nodes.Node node40 = node37.clone();
        java.lang.String str41 = node37.toString();
        org.jsoup.nodes.Node node44 = node37.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean45 = node22.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str39, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str41, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.baseUri();
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Document document15 = node9.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node16 = node13.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes17 = node13.attributes();
        int int18 = node13.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        boolean boolean14 = node8.hasAttr("#doctype");
        org.jsoup.nodes.Node node16 = node8.removeAttr("#doctype");
        org.jsoup.nodes.Node node17 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "");
        java.lang.String str18 = node17.toString();
        boolean boolean20 = node17.hasAttr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str12 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        int int11 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) (byte) -1, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodes();
        org.jsoup.nodes.Node node19 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node25 = documentType24.clone();
        org.jsoup.nodes.Document document26 = node25.ownerDocument();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        org.jsoup.nodes.Attributes attributes34 = documentType31.attributes();
        int int35 = documentType31.siblingIndex();
        java.lang.String str36 = documentType31.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType31.childNodesCopy();
        org.jsoup.nodes.Node node40 = documentType31.attr("#doctype", "#doctype");
        boolean boolean41 = node25.equals((java.lang.Object) node40);
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str48 = documentType46.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes49 = documentType46.attributes();
        org.jsoup.nodes.Node node50 = documentType46.clone();
        org.jsoup.nodes.Node node51 = documentType46.clone();
        org.jsoup.nodes.Attributes attributes52 = node51.attributes();
        int int53 = node51.siblingIndex();
        java.lang.String str54 = node51.baseUri();
        boolean boolean55 = node25.equals((java.lang.Object) node51);
        boolean boolean56 = documentType4.equals((java.lang.Object) node25);
        java.lang.Class<?> wildcardClass57 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        boolean boolean15 = node5.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node16 = node5.clone();
        java.lang.String str18 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = node5.attributes();
        org.jsoup.nodes.Attributes attributes20 = node5.attributes();
        org.jsoup.nodes.Node node21 = node5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node5.before("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.attr("", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document17 = documentType14.ownerDocument();
        java.lang.String str18 = documentType14.nodeName();
        boolean boolean19 = node9.equals((java.lang.Object) str18);
        org.jsoup.nodes.Node node21 = node9.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str16 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        int int15 = node14.siblingIndex();
        node14.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node14.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, (int) 'a', outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node18 = node17.clone();
        node17.setBaseUri("");
        org.jsoup.nodes.Node node23 = node17.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.siblingNodes();
        org.jsoup.nodes.Node node25 = node23.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.attr("");
        java.lang.String str13 = documentType4.toString();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, (int) (byte) 100, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.toString();
        java.lang.String str12 = node8.attr("hi!");
        java.lang.String str13 = node8.baseUri();
        org.jsoup.nodes.Document document14 = node8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = document11.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int5 = documentType4.siblingIndex();
        int int6 = documentType4.siblingIndex();
        int int7 = documentType4.siblingIndex();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.baseUri();
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str16 = node14.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node14.childNodes();
        org.jsoup.nodes.Node node18 = node14.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! \"hi!\">", "", "");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        boolean boolean20 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.Document document21 = documentType19.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document21.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = node8.absUrl("hi!");
        java.lang.String str12 = node8.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        org.jsoup.nodes.Document document14 = node8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node20 = documentType15.parent();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType15.outerHtmlTail(stringBuilder21, (int) (short) -1, outputSettings23);
        boolean boolean25 = node8.equals((java.lang.Object) documentType15);
        documentType15.setBaseUri("hi!");
        documentType15.setBaseUri("#doctype");
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType15.outerHtmlTail(stringBuilder30, 100, outputSettings32);
        java.lang.String str34 = documentType15.baseUri();
        org.jsoup.nodes.Node node35 = documentType15.clone();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType15.outerHtmlTail(stringBuilder36, (int) (byte) 0, outputSettings38);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 10, outputSettings14);
        java.lang.String str16 = documentType4.toString();
        java.lang.String str18 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node20 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        documentType4.setBaseUri("#doctype");
        java.lang.String str13 = documentType4.baseUri();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        int int23 = documentType19.siblingIndex();
        java.lang.String str24 = documentType19.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType19.childNodesCopy();
        org.jsoup.nodes.Node node28 = documentType19.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node29 = documentType19.parentNode();
        org.jsoup.nodes.Node node30 = documentType19.previousSibling();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType19.outerHtmlTail(stringBuilder31, (int) (byte) 1, outputSettings33);
        java.lang.String str35 = documentType19.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean19 = documentType4.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 0, outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodesCopy();
        int int20 = documentType4.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        java.lang.String str10 = node5.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodesCopy();
        org.jsoup.nodes.Node node12 = node5.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (-1), outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        int int15 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 0, outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str14 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        org.jsoup.nodes.Node node13 = node11.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node17 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) 100, outputSettings17);
        java.lang.String str20 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node23 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str24 = node23.toString();
        node23.setBaseUri("hi!");
        int int27 = node23.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node23.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }
}

