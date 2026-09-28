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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = document16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        int int23 = node22.childNodeSize();
        java.lang.String str25 = node22.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node26 = node22.parentNode();
        boolean boolean27 = documentType4.equals((java.lang.Object) node22);
        org.jsoup.select.NodeVisitor nodeVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node22.traverse(nodeVisitor28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        boolean boolean12 = node5.hasAttr("");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node5.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.jsoup.nodes.Node node18 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.unwrap();
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
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) (short) -1, outputSettings13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.toString();
        java.lang.String str15 = node13.baseUri();
        org.jsoup.nodes.Node node16 = node13.parent();
        int int17 = node13.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        org.jsoup.nodes.Document document18 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = document18.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Document document21 = documentType17.ownerDocument();
        org.jsoup.nodes.Node node23 = documentType17.removeAttr("#doctype");
        org.jsoup.nodes.Node node25 = node23.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean27 = node23.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node8.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str11 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        org.jsoup.nodes.Node node14 = documentType12.parent();
        org.jsoup.nodes.Document document15 = documentType12.ownerDocument();
        org.jsoup.nodes.Node node17 = documentType12.removeAttr("hi!");
        java.lang.String str18 = node17.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node17.childNodesCopy();
        boolean boolean20 = node7.equals((java.lang.Object) node17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node7.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str14 = documentType12.attr("hi!");
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        org.jsoup.nodes.Node node16 = documentType12.clone();
        int int17 = node16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType23.previousSibling();
        java.lang.String str27 = documentType23.toString();
        org.jsoup.nodes.Node node28 = documentType23.parent();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType23.outerHtmlTail(stringBuilder29, (int) (short) -1, outputSettings31);
        boolean boolean33 = node16.equals((java.lang.Object) documentType23);
        documentType23.setBaseUri("hi!");
        org.jsoup.nodes.Node node36 = documentType23.previousSibling();
        org.jsoup.nodes.Node node38 = documentType23.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node39 = documentType23.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = documentType23.childNodes();
        java.lang.String str41 = documentType23.toString();
        java.lang.String str42 = documentType23.outerHtml();
        org.jsoup.nodes.Attributes attributes43 = documentType23.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType23.childNodesCopy();
        org.jsoup.nodes.Attributes attributes45 = documentType23.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType4.after((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str41, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str42, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(attributes45);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int17 = node8.childNodeSize();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        int int26 = documentType22.siblingIndex();
        java.lang.String str27 = documentType22.nodeName();
        org.jsoup.nodes.Node node28 = documentType22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType22.siblingNodes();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType22.outerHtmlTail(stringBuilder30, (int) ' ', outputSettings32);
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType22.outerHtmlTail(stringBuilder34, 0, outputSettings36);
        java.lang.String str38 = documentType22.nodeName();
        org.jsoup.nodes.Node node39 = documentType22.parent();
        org.jsoup.nodes.Node node40 = documentType22.clone();
        documentType22.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#doctype" + "'", str38, "#doctype");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.toString();
        java.lang.String str15 = node13.baseUri();
        org.jsoup.nodes.Node node16 = node13.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node13.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.lang.Class<?> wildcardClass33 = nodeList32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.Class<?> wildcardClass10 = attributes9.getClass();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        org.jsoup.nodes.Node node18 = documentType14.clone();
        org.jsoup.nodes.Node node19 = documentType14.parentNode();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType14.outerHtmlTail(stringBuilder20, (int) (byte) -1, outputSettings22);
        org.jsoup.nodes.Node node25 = documentType14.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType14.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node9.before(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node9.after("");
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
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, 10, outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 0, outputSettings15);
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType10.previousSibling();
        java.lang.String str15 = documentType10.absUrl("hi!");
        java.lang.String str16 = documentType10.nodeName();
        java.lang.String str17 = documentType10.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) 0, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = document14.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node11 = node5.parentNode();
        org.jsoup.nodes.Node node12 = node5.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (byte) 100, outputSettings20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.jsoup.nodes.Node node20 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = node20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node7 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
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
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Node node11 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str11 = documentType4.baseUri();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        boolean boolean21 = node19.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node24 = node19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int25 = node24.childNodeSize();
        java.lang.String str26 = node24.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node24.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node24.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.jsoup.nodes.Node node17 = node16.parent();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node23 = documentType22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType22.childNodesCopy();
        java.lang.String str25 = documentType22.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node16.after((org.jsoup.nodes.Node) documentType22);
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = node12.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        int int23 = documentType19.siblingIndex();
        org.jsoup.nodes.Node node24 = documentType19.previousSibling();
        java.lang.String str25 = documentType19.baseUri();
        org.jsoup.nodes.Node node26 = documentType19.parentNode();
        org.jsoup.nodes.Attributes attributes27 = documentType19.attributes();
        org.jsoup.nodes.Node node28 = documentType19.previousSibling();
        int int29 = documentType19.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node12.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("hi!");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        int int39 = documentType35.siblingIndex();
        org.jsoup.nodes.Node node40 = documentType35.previousSibling();
        int int41 = documentType35.childNodeSize();
        org.jsoup.nodes.Document document42 = documentType35.ownerDocument();
        java.lang.StringBuilder stringBuilder43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        documentType35.outerHtmlTail(stringBuilder43, (int) '#', outputSettings45);
        java.lang.String str47 = documentType35.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node30.replaceWith((org.jsoup.nodes.Node) documentType35);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        int int19 = documentType15.siblingIndex();
        java.lang.String str20 = documentType15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType15.childNodesCopy();
        java.lang.String str22 = documentType15.nodeName();
        java.lang.String str23 = documentType15.baseUri();
        java.lang.String str24 = documentType15.baseUri();
        java.lang.String str26 = documentType15.attr("hi!");
        boolean boolean27 = documentType4.equals((java.lang.Object) documentType15);
        boolean boolean29 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str14 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = node16.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        int int26 = documentType4.siblingIndex();
        int int27 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder28, (int) (byte) 10, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.lang.String str24 = documentType20.absUrl("hi!");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("hi!");
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        int int33 = documentType29.siblingIndex();
        java.lang.String str34 = documentType29.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType29.childNodesCopy();
        java.lang.String str36 = documentType29.nodeName();
        org.jsoup.nodes.Node node39 = documentType29.attr("#doctype", "hi!");
        int int40 = node39.siblingIndex();
        node39.setBaseUri("#doctype");
        int int43 = node39.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = node39.childNodes();
        boolean boolean45 = documentType20.equals((java.lang.Object) nodeList44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#doctype" + "'", str36, "#doctype");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.jsoup.nodes.Document document23 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = document23.siblingIndex();
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Document document21 = documentType17.ownerDocument();
        org.jsoup.nodes.Node node23 = documentType17.removeAttr("#doctype");
        org.jsoup.nodes.Node node25 = node23.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int26 = node23.childNodeSize();
        boolean boolean27 = node12.equals((java.lang.Object) node23);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node12.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.attr("");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.unwrap();
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        java.lang.String str13 = node9.toString();
        java.lang.String str14 = node9.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node23 = documentType22.clone();
        int int24 = node23.childNodeSize();
        org.jsoup.nodes.Node node25 = node23.previousSibling();
        org.jsoup.nodes.Node node27 = node23.removeAttr("#doctype");
        java.lang.String str28 = node23.baseUri();
        int int29 = node23.childNodeSize();
        boolean boolean31 = node23.hasAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.after(node23);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str14 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType18.outerHtmlTail(stringBuilder22, (int) '4', outputSettings24);
        documentType18.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str28 = documentType18.baseUri();
        java.lang.String str29 = documentType18.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType18);
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
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.Class<?> wildcardClass8 = nodeList7.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node5.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        int int21 = node20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node20.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str29 = documentType27.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node30 = documentType27.previousSibling();
        java.lang.String str31 = documentType27.toString();
        org.jsoup.nodes.Node node32 = documentType27.parent();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType27.outerHtmlTail(stringBuilder33, (int) (short) -1, outputSettings35);
        boolean boolean37 = node20.equals((java.lang.Object) documentType27);
        documentType27.setBaseUri("hi!");
        org.jsoup.nodes.Node node40 = documentType27.previousSibling();
        org.jsoup.nodes.Node node42 = documentType27.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node43 = documentType27.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType27.childNodes();
        java.lang.String str45 = documentType27.toString();
        java.lang.String str46 = documentType27.outerHtml();
        org.jsoup.nodes.Attributes attributes47 = documentType27.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str45, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str46, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes47);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.attr("");
        java.lang.String str13 = documentType4.outerHtml();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.baseUri();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        int int21 = documentType17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType17.siblingNodes();
        org.jsoup.nodes.Node node25 = documentType17.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType17.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node9.before((org.jsoup.nodes.Node) documentType17);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str11 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType15.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node17.traverse(nodeVisitor25);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        java.lang.String str20 = node9.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str22 = node9.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        int int31 = node30.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node30.unwrap();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.lang.String str16 = documentType4.baseUri();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.lang.String str10 = node9.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes14 = node13.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = node5.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Node node14 = documentType10.clone();
        org.jsoup.nodes.Node node15 = documentType10.clone();
        int int16 = node15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node15.siblingNodes();
        boolean boolean18 = documentType4.equals((java.lang.Object) nodeList17);
        java.lang.String str19 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (-1), outputSettings7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        int int16 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        org.jsoup.nodes.Node node13 = node9.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        java.lang.String str23 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str25 = documentType19.attr("");
        org.jsoup.nodes.Node node26 = documentType19.parentNode();
        org.jsoup.nodes.Node node29 = documentType19.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean30 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.lang.Class<?> wildcardClass26 = node9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType20.previousSibling();
        java.lang.String str24 = documentType20.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType20.siblingNodes();
        org.jsoup.nodes.Attributes attributes26 = documentType20.attributes();
        java.lang.String str27 = documentType20.toString();
        org.jsoup.nodes.Node node28 = documentType20.parentNode();
        java.lang.String str30 = documentType20.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node32 = documentType20.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        boolean boolean33 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.Class<?> wildcardClass34 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "#doctype", "hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) '4', outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.Node node9 = node5.parent();
        int int10 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str7 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        int int9 = node5.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        int int13 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.childNodesCopy();
        java.lang.Class<?> wildcardClass15 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
        java.lang.String str15 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str16 = node9.toString();
        org.jsoup.nodes.Node node17 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = node17.ownerDocument();
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.previousSibling();
        java.lang.String str11 = node5.baseUri();
        java.lang.String str13 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        org.jsoup.nodes.Node node20 = documentType18.parent();
        org.jsoup.nodes.Document document21 = documentType18.ownerDocument();
        org.jsoup.nodes.Node node23 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.Node node24 = documentType18.clone();
        boolean boolean25 = node5.equals((java.lang.Object) documentType18);
        org.jsoup.nodes.Document document26 = node5.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node21 = documentType20.clone();
        int int22 = node21.childNodeSize();
        org.jsoup.nodes.Node node23 = node21.previousSibling();
        org.jsoup.nodes.Node node25 = node21.removeAttr("#doctype");
        java.lang.String str26 = node25.toString();
        org.jsoup.nodes.Node node27 = node25.clone();
        java.lang.String str28 = node27.outerHtml();
        org.jsoup.nodes.Node node31 = node27.attr("#doctype", "#doctype");
        boolean boolean33 = node27.hasAttr("hi!");
        org.jsoup.nodes.Node node34 = node27.previousSibling();
        org.jsoup.nodes.Node node35 = node27.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType4.after(node35);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("hi!");
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        org.jsoup.nodes.Node node33 = documentType29.clone();
        java.lang.String str34 = node33.toString();
        int int35 = node33.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith(node33);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        int int7 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, 100, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        org.jsoup.nodes.Node node14 = node9.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.lang.String str8 = node5.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        java.lang.Class<?> wildcardClass13 = node11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        boolean boolean18 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.jsoup.nodes.Node node20 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        boolean boolean18 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.jsoup.nodes.Node node20 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node20.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node15 = node13.parent();
        int int16 = node13.siblingIndex();
        org.jsoup.nodes.Node node17 = node13.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "hi!");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str13 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        java.lang.Class<?> wildcardClass10 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (byte) 100, outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.jsoup.nodes.Node node22 = node21.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node22.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str15 = documentType4.attr("hi!");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) '4', outputSettings18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parentNode();
        java.lang.Class<?> wildcardClass11 = node9.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.lang.String str17 = node16.baseUri();
        java.lang.String str18 = node16.outerHtml();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        org.jsoup.nodes.Node node28 = documentType23.clone();
        org.jsoup.nodes.Attributes attributes29 = node28.attributes();
        java.lang.String str31 = node28.attr("#doctype");
        org.jsoup.nodes.Node node32 = node28.clone();
        org.jsoup.nodes.Node node33 = node32.parent();
        org.jsoup.nodes.Node node35 = node32.removeAttr("hi!");
        java.lang.String str37 = node35.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node16.replaceWith(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        java.lang.String str12 = node9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.jsoup.select.NodeVisitor nodeVisitor29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.traverse(nodeVisitor29);
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
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        int int7 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 0, outputSettings14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.lang.String str10 = node9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.childNodesCopy();
        org.jsoup.nodes.Node node13 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodes();
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        node9.setBaseUri("hi!");
        java.lang.String str16 = node9.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node9.childNodesCopy();
        boolean boolean19 = node9.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.childNodeSize();
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
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node9 = node8.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
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
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.lang.String str35 = documentType15.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType15.after("#doctype");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = document30.attr("", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node10 = documentType4.attr("hi!", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        org.jsoup.nodes.Node node19 = documentType15.clone();
        int int20 = node19.siblingIndex();
        java.lang.String str21 = node19.outerHtml();
        org.jsoup.nodes.Node node22 = node19.parent();
        org.jsoup.nodes.Node node23 = node19.clone();
        boolean boolean25 = node19.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node19.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        int int9 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node25.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.unwrap();
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
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType22.childNodes();
        org.jsoup.nodes.Document document30 = documentType22.ownerDocument();
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
        org.junit.Assert.assertNull(document30);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "", "", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = node14.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node15.toString();
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node27.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.lang.String str18 = node17.toString();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType23.previousSibling();
        java.lang.String str29 = documentType23.baseUri();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType23.outerHtmlTail(stringBuilder30, (int) (short) -1, outputSettings32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node17.after((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str11 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        org.jsoup.nodes.Node node11 = node8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        org.jsoup.nodes.Document document19 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = document19.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        java.lang.String str17 = node11.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.jsoup.nodes.Node node16 = node8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node8.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.Node node9 = node5.parent();
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) '#', outputSettings19);
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        java.lang.String str15 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.jsoup.nodes.Document document19 = node5.ownerDocument();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document27 = documentType24.ownerDocument();
        java.lang.String str28 = documentType24.nodeName();
        org.jsoup.nodes.Node node29 = documentType24.previousSibling();
        org.jsoup.nodes.Node node31 = documentType24.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.siblingNodes();
        java.lang.Class<?> wildcardClass33 = node31.getClass();
        boolean boolean34 = node5.equals((java.lang.Object) node31);
        java.lang.String str35 = node31.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.baseUri();
        boolean boolean12 = node5.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
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
        org.jsoup.nodes.Node node43 = node24.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str44 = node24.baseUri();
        boolean boolean46 = node24.hasAttr("#doctype");
        org.jsoup.nodes.Node node47 = node24.parent();
        java.lang.String str48 = node24.outerHtml();
        org.jsoup.nodes.Node node50 = node24.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str48, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "#doctype");
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType17);
        java.lang.String str19 = documentType17.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType17.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">" + "'", str19, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Document document10 = node5.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.siblingNodes();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType23.previousSibling();
        java.lang.String str27 = documentType23.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType23.siblingNodes();
        org.jsoup.nodes.Attributes attributes29 = documentType23.attributes();
        java.lang.String str30 = documentType23.toString();
        org.jsoup.nodes.Node node31 = documentType23.parentNode();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType23.outerHtmlTail(stringBuilder32, 1, outputSettings34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node16.before((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.Class<?> wildcardClass15 = nodeList14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "", "", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str11 = documentType9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes12 = documentType9.attributes();
        org.jsoup.nodes.Node node13 = documentType9.clone();
        org.jsoup.nodes.Node node14 = documentType9.clone();
        org.jsoup.nodes.Attributes attributes15 = node14.attributes();
        java.lang.String str17 = node14.attr("#doctype");
        org.jsoup.nodes.Node node18 = node14.clone();
        org.jsoup.nodes.Node node19 = node18.parent();
        node18.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes22 = node18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.jsoup.nodes.Node node18 = node13.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node19 = node13.previousSibling();
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = node27.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node8.childNodes();
        java.lang.String str27 = node8.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node8.after("hi!");
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        int int15 = node5.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodes();
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        org.jsoup.nodes.Node node30 = node8.parent();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        org.jsoup.nodes.Node node39 = documentType35.clone();
        org.jsoup.nodes.Node node40 = documentType35.clone();
        org.jsoup.nodes.Attributes attributes41 = node40.attributes();
        java.lang.String str43 = node40.attr("#doctype");
        org.jsoup.nodes.Node node44 = node40.clone();
        org.jsoup.nodes.Node node45 = node44.parent();
        org.jsoup.nodes.Node node47 = node44.removeAttr("hi!");
        boolean boolean49 = node44.hasAttr("");
        int int50 = node44.childNodeSize();
        org.jsoup.nodes.Node node51 = node44.nextSibling();
        org.jsoup.nodes.Node node53 = node44.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = node30.equals((java.lang.Object) node44);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        java.lang.String str17 = node16.baseUri();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node23 = documentType22.clone();
        org.jsoup.nodes.Node node24 = documentType22.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node16.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType14.previousSibling();
        java.lang.String str18 = documentType14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType14.siblingNodes();
        boolean boolean20 = node5.equals((java.lang.Object) documentType14);
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType14.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        java.lang.String str14 = node9.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.unwrap();
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
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = node28.hasAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        org.jsoup.nodes.Node node34 = documentType15.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = node34.absUrl("");
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
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        org.jsoup.nodes.Document document18 = documentType14.ownerDocument();
        documentType14.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node8.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        boolean boolean15 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        org.jsoup.nodes.Node node26 = node25.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node25.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int12 = node11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodesCopy();
        int int14 = node11.childNodeSize();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType19.outerHtmlTail(stringBuilder23, 10, outputSettings25);
        org.jsoup.nodes.Node node28 = documentType19.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node11.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node12.childNodeSize();
        org.jsoup.nodes.Node node14 = node12.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int26 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node27 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document35 = documentType32.ownerDocument();
        java.lang.String str36 = documentType32.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType32);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        int int21 = node9.siblingIndex();
        int int22 = node9.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.attr("", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str14 = documentType12.attr("hi!");
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        org.jsoup.nodes.Node node16 = documentType12.clone();
        int int17 = node16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node16.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node26 = documentType23.previousSibling();
        java.lang.String str27 = documentType23.toString();
        org.jsoup.nodes.Node node28 = documentType23.parent();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType23.outerHtmlTail(stringBuilder29, (int) (short) -1, outputSettings31);
        boolean boolean33 = node16.equals((java.lang.Object) documentType23);
        documentType23.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes36 = documentType23.attributes();
        documentType23.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node5.before((org.jsoup.nodes.Node) documentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType15.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType15.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 100, outputSettings11);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node20 = documentType17.previousSibling();
        java.lang.String str21 = documentType17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType17.siblingNodes();
        org.jsoup.nodes.Attributes attributes23 = documentType17.attributes();
        java.lang.String str24 = documentType17.toString();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType17.outerHtmlTail(stringBuilder25, 10, outputSettings27);
        java.lang.String str30 = documentType17.attr("hi!");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("hi!");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType35.outerHtmlTail(stringBuilder39, 10, outputSettings41);
        org.jsoup.nodes.Node node44 = documentType35.removeAttr("hi!");
        boolean boolean45 = documentType17.equals((java.lang.Object) documentType35);
        java.lang.String str47 = documentType35.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node50 = documentType35.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = documentType4.before((org.jsoup.nodes.Node) documentType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType15.before("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = document12.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        int int17 = node11.childNodeSize();
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
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "");
        org.jsoup.nodes.Node node10 = node8.removeAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node13 = node10.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        java.lang.String str14 = node12.attr("hi!");
        boolean boolean16 = node12.hasAttr("hi!");
        org.jsoup.nodes.Node node17 = node12.parentNode();
        org.jsoup.nodes.Node node18 = node12.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node18.remove();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        org.jsoup.nodes.Node node22 = node13.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node23 = node22.parentNode();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str30 = documentType28.attr("hi!");
        org.jsoup.nodes.Attributes attributes31 = documentType28.attributes();
        org.jsoup.nodes.Node node32 = documentType28.clone();
        int int33 = node32.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node32.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str41 = documentType39.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node42 = documentType39.previousSibling();
        java.lang.String str43 = documentType39.toString();
        org.jsoup.nodes.Node node44 = documentType39.parent();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        documentType39.outerHtmlTail(stringBuilder45, (int) (short) -1, outputSettings47);
        boolean boolean49 = node32.equals((java.lang.Object) documentType39);
        documentType39.setBaseUri("hi!");
        int int52 = documentType39.siblingIndex();
        java.lang.String str53 = documentType39.outerHtml();
        int int54 = documentType39.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceWith((org.jsoup.nodes.Node) documentType39);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str53, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.toString();
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.wrap("#doctype");
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        org.jsoup.nodes.Node node24 = node23.parent();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        int int14 = node8.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        org.jsoup.nodes.Node node31 = documentType15.parentNode();
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
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node14.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        org.jsoup.nodes.Node node31 = node8.parent();
        java.lang.String str32 = node8.outerHtml();
        org.jsoup.nodes.Node node33 = node8.previousSibling();
        java.lang.String str34 = node8.toString();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str41 = documentType39.attr("hi!");
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        int int43 = documentType39.siblingIndex();
        java.lang.String str44 = documentType39.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = documentType39.childNodesCopy();
        java.lang.String str47 = documentType39.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str48 = documentType39.outerHtml();
        java.lang.String str49 = documentType39.nodeName();
        int int50 = documentType39.childNodeSize();
        org.jsoup.nodes.Node node51 = documentType39.parentNode();
        java.lang.StringBuilder stringBuilder52 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = null;
        documentType39.outerHtmlTail(stringBuilder52, 10, outputSettings54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = node8.after((org.jsoup.nodes.Node) documentType39);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str48, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#doctype" + "'", str49, "#doctype");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
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
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        boolean boolean18 = node5.equals((java.lang.Object) node17);
        java.lang.String str20 = node17.attr("");
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node17.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        // The following exception was thrown during execution in test generation
        try {
            node30.remove();
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
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        org.jsoup.nodes.Node node30 = node14.nextSibling();
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
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.baseUri();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        int int22 = documentType18.siblingIndex();
        java.lang.String str24 = documentType18.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        org.jsoup.nodes.Node node14 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        int int13 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after((org.jsoup.nodes.Node) documentType18);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        int int19 = documentType15.siblingIndex();
        java.lang.String str20 = documentType15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType15.childNodesCopy();
        java.lang.String str22 = documentType15.nodeName();
        java.lang.String str23 = documentType15.baseUri();
        java.lang.String str24 = documentType15.baseUri();
        java.lang.String str26 = documentType15.attr("hi!");
        boolean boolean27 = documentType4.equals((java.lang.Object) documentType15);
        org.jsoup.nodes.Node node28 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        org.jsoup.nodes.Node node10 = node5.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("hi!");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        int int25 = documentType21.siblingIndex();
        java.lang.String str26 = documentType21.nodeName();
        org.jsoup.nodes.Node node27 = documentType21.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType21.siblingNodes();
        org.jsoup.nodes.Node node29 = documentType21.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node9.after(node29);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!");
        org.jsoup.nodes.Attributes attributes5 = documentType4.attributes();
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        org.jsoup.nodes.Node node30 = node8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node8.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        org.jsoup.nodes.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node13);
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
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        documentType15.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType15.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        java.lang.String str11 = node8.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.String str17 = node16.baseUri();
        java.lang.String str18 = node16.outerHtml();
        java.lang.String str20 = node16.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node16.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        java.lang.String str26 = documentType4.outerHtml();
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.traverse(nodeVisitor15);
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        int int26 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node27 = documentType4.parentNode();
        org.jsoup.nodes.Document document28 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType4.childNodesCopy();
        java.lang.String str30 = documentType4.baseUri();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        node9.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node9.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        java.lang.String str22 = documentType4.nodeName();
        int int23 = documentType4.siblingIndex();
        java.lang.String str24 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str14 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.toString();
        java.lang.String str12 = node5.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        node5.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node20 = documentType17.previousSibling();
        java.lang.String str21 = documentType17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType17.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        java.lang.String str26 = documentType4.toString();
        java.lang.Class<?> wildcardClass27 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        java.lang.String str16 = node13.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        int int21 = node20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node20.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str29 = documentType27.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node30 = documentType27.previousSibling();
        java.lang.String str31 = documentType27.toString();
        org.jsoup.nodes.Node node32 = documentType27.parent();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType27.outerHtmlTail(stringBuilder33, (int) (short) -1, outputSettings35);
        boolean boolean37 = node20.equals((java.lang.Object) documentType27);
        org.jsoup.nodes.Node node39 = node20.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str40 = node20.baseUri();
        boolean boolean42 = node20.hasAttr("#doctype");
        org.jsoup.nodes.Node node43 = node20.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node12 = documentType11.clone();
        boolean boolean14 = node12.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = node12.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node20 = node12.attr("#doctype", "");
        node12.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node12.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int int18 = node11.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str15 = node9.attr("#doctype");
        org.jsoup.nodes.Node node16 = node9.previousSibling();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node22 = documentType21.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType21.childNodes();
        java.lang.String str24 = documentType21.nodeName();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType21.outerHtmlTail(stringBuilder25, (int) (short) 10, outputSettings27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node9.before((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType10.previousSibling();
        java.lang.String str14 = documentType10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType10.siblingNodes();
        org.jsoup.nodes.Attributes attributes16 = documentType10.attributes();
        org.jsoup.nodes.Node node18 = documentType10.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        boolean boolean15 = documentType13.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = documentType13.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node8.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
            java.lang.String str25 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = node14.childNodeSize();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (-1), outputSettings7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node21 = documentType18.previousSibling();
        java.lang.String str22 = documentType18.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType18.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType18.siblingNodes();
        org.jsoup.nodes.Node node26 = documentType18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        java.lang.String str30 = documentType15.attr("");
        org.jsoup.nodes.Node node32 = documentType15.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node32.parent();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        org.jsoup.nodes.Node node18 = documentType16.parent();
        org.jsoup.nodes.Document document19 = documentType16.ownerDocument();
        org.jsoup.nodes.Node node21 = documentType16.removeAttr("hi!");
        org.jsoup.nodes.Node node22 = documentType16.clone();
        boolean boolean23 = documentType4.equals((java.lang.Object) documentType16);
        java.lang.Class<?> wildcardClass24 = documentType16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        org.jsoup.nodes.Node node34 = documentType15.clone();
        org.jsoup.nodes.Node node35 = node34.parentNode();
        org.jsoup.nodes.Attributes attributes36 = node34.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node34.remove();
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
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        java.lang.String str25 = documentType20.attr("hi!");
        documentType20.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        int int31 = node30.siblingIndex();
        org.jsoup.nodes.Node node32 = node30.parent();
        org.jsoup.nodes.Attributes attributes33 = node30.attributes();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str40 = documentType38.attr("hi!");
        org.jsoup.nodes.Attributes attributes41 = documentType38.attributes();
        java.lang.StringBuilder stringBuilder42 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        documentType38.outerHtmlTail(stringBuilder42, 10, outputSettings44);
        org.jsoup.nodes.Node node47 = documentType38.removeAttr("hi!");
        java.lang.String str48 = documentType38.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node30.after((org.jsoup.nodes.Node) documentType38);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#doctype" + "'", str48, "#doctype");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int12 = node11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.childNodesCopy();
        int int14 = node11.childNodeSize();
        java.lang.String str16 = node11.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        int int18 = node17.childNodeSize();
        org.jsoup.nodes.Node node19 = node17.previousSibling();
        int int20 = node17.siblingIndex();
        java.lang.String str21 = node17.baseUri();
        java.lang.String str22 = node17.toString();
        int int23 = node17.siblingIndex();
        org.jsoup.nodes.Document document24 = node17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node10 = documentType4.parent();
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
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str14 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (int) '4', outputSettings17);
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
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int7 = node6.childNodeSize();
        java.lang.String str9 = node6.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        org.jsoup.nodes.Node node18 = documentType14.clone();
        org.jsoup.nodes.Attributes attributes19 = documentType14.attributes();
        java.lang.String str20 = documentType14.toString();
        java.lang.String str21 = documentType14.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType14.siblingNodes();
        java.lang.String str24 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node27 = documentType14.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str28 = node27.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node27.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node6.after(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        int int12 = node9.childNodeSize();
        java.lang.String str14 = node9.attr("#doctype");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Document document23 = documentType19.ownerDocument();
        org.jsoup.nodes.Node node26 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node9.after(node26);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        java.lang.String str12 = node10.toString();
        int int13 = node10.childNodeSize();
        java.lang.String str14 = node10.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        int int20 = documentType4.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        int int13 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.childNodesCopy();
        org.jsoup.nodes.Node node15 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
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
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        java.lang.String str26 = node21.outerHtml();
        java.lang.String str28 = node21.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node21.remove();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        org.jsoup.nodes.Attributes attributes28 = node8.attributes();
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
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node10 = documentType9.clone();
        int int11 = node10.childNodeSize();
        org.jsoup.nodes.Node node12 = node10.previousSibling();
        org.jsoup.nodes.Node node14 = node10.removeAttr("#doctype");
        java.lang.String str15 = node14.toString();
        org.jsoup.nodes.Node node16 = node14.clone();
        java.lang.String str17 = node16.outerHtml();
        java.lang.String str19 = node16.attr("hi!");
        java.lang.String str20 = node16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node16.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node16.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType15.outerHtmlHead(stringBuilder32, (int) (short) 1, outputSettings34);
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
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        org.jsoup.nodes.Node node42 = node25.previousSibling();
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
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType11.previousSibling();
        java.lang.String str15 = documentType11.toString();
        org.jsoup.nodes.Node node16 = documentType11.parent();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType11.outerHtmlTail(stringBuilder17, (int) (short) -1, outputSettings19);
        org.jsoup.nodes.Node node22 = documentType11.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str23 = documentType11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.after((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        int int23 = documentType19.siblingIndex();
        org.jsoup.nodes.Node node24 = documentType19.previousSibling();
        java.lang.String str25 = documentType19.baseUri();
        org.jsoup.nodes.Node node26 = documentType19.parentNode();
        java.lang.String str27 = documentType19.nodeName();
        org.jsoup.nodes.Node node28 = documentType19.previousSibling();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType19.outerHtmlTail(stringBuilder29, (int) (byte) 100, outputSettings31);
        org.jsoup.nodes.Node node35 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        boolean boolean25 = documentType23.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType23.childNodesCopy();
        org.jsoup.nodes.Node node27 = documentType23.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node18.after((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        boolean boolean15 = node13.hasAttr("");
        java.lang.String str16 = node13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        // The following exception was thrown during execution in test generation
        try {
            node18.remove();
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
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
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
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        java.lang.String str22 = documentType4.nodeName();
        int int23 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, 1, outputSettings18);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        node14.setBaseUri("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node18 = node14.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.nodes.Document document9 = node5.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        node5.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        int int22 = node21.siblingIndex();
        org.jsoup.nodes.Node node23 = node21.nextSibling();
        org.jsoup.nodes.Node node24 = node21.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        documentType4.setBaseUri("#doctype");
        org.jsoup.nodes.Node node19 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("hi!");
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        int int28 = documentType24.siblingIndex();
        java.lang.String str29 = documentType24.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType24.childNodesCopy();
        java.lang.String str31 = documentType24.nodeName();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType24.outerHtmlTail(stringBuilder32, (int) (byte) -1, outputSettings34);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType24);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        int int23 = node22.childNodeSize();
        java.lang.String str25 = node22.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node26 = node22.parentNode();
        boolean boolean27 = documentType4.equals((java.lang.Object) node22);
        java.lang.String str29 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        node9.setBaseUri("hi!");
        java.lang.String str16 = node9.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node9.childNodesCopy();
        org.jsoup.nodes.Attributes attributes18 = node9.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.before("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (short) 10, outputSettings17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodesCopy();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        int int25 = node9.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean9 = node5.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.siblingNodes();
        java.lang.Class<?> wildcardClass11 = node5.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node13 = node12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.lang.String str24 = documentType20.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str26 = documentType20.absUrl("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("hi!");
        org.jsoup.nodes.Attributes attributes14 = documentType11.attributes();
        org.jsoup.nodes.Node node15 = documentType11.clone();
        int int16 = node15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node15.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node25 = documentType22.previousSibling();
        java.lang.String str26 = documentType22.toString();
        org.jsoup.nodes.Node node27 = documentType22.parent();
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType22.outerHtmlTail(stringBuilder28, (int) (short) -1, outputSettings30);
        boolean boolean32 = node15.equals((java.lang.Object) documentType22);
        documentType22.setBaseUri("hi!");
        org.jsoup.nodes.Node node35 = documentType22.previousSibling();
        org.jsoup.nodes.Node node37 = documentType22.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = node6.equals((java.lang.Object) node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.before(node17);
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "hi!", "#doctype");
        java.lang.String str5 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.toString();
        java.lang.String str15 = node13.baseUri();
        org.jsoup.nodes.Node node16 = node13.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        boolean boolean18 = node16.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        java.lang.String str18 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("hi!");
        boolean boolean28 = documentType24.hasAttr("");
        java.lang.String str30 = documentType24.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str31 = documentType24.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType24.childNodesCopy();
        boolean boolean33 = documentType4.equals((java.lang.Object) nodeList32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.lang.String str13 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (byte) 1, outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) (short) 100, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        java.lang.String str43 = documentType4.nodeName();
        org.jsoup.nodes.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node44);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        boolean boolean18 = node16.hasAttr("#doctype");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, 1, outputSettings7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        int int11 = documentType4.siblingIndex();
        int int12 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "#doctype");
        boolean boolean18 = documentType4.equals((java.lang.Object) documentType17);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType17.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean13 = node8.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        node8.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node24 = documentType21.previousSibling();
        java.lang.String str25 = documentType21.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType21.childNodesCopy();
        java.lang.String str27 = documentType21.outerHtml();
        java.lang.String str28 = documentType21.nodeName();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType21.outerHtmlTail(stringBuilder29, (int) (short) -1, outputSettings31);
        java.lang.String str33 = documentType21.outerHtml();
        int int34 = documentType21.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node8.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = node8.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node8.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str11 = documentType4.baseUri();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str11 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node12 = node8.previousSibling();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node20 = documentType17.previousSibling();
        java.lang.String str21 = documentType17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType17.childNodesCopy();
        java.lang.String str23 = documentType17.outerHtml();
        java.lang.String str24 = documentType17.nodeName();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType17.outerHtmlTail(stringBuilder25, (int) (short) -1, outputSettings27);
        java.lang.String str29 = documentType17.outerHtml();
        org.jsoup.nodes.Node node31 = documentType17.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        boolean boolean32 = node8.equals((java.lang.Object) documentType17);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.Node node15 = node13.previousSibling();
        org.jsoup.nodes.Document document16 = node13.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        boolean boolean36 = documentType22.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        int int11 = node5.childNodeSize();
        int int12 = node5.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.toString();
        java.lang.String str15 = node13.baseUri();
        org.jsoup.nodes.Node node16 = node13.parent();
        org.jsoup.nodes.Node node17 = node13.clone();
        org.jsoup.nodes.Node node18 = node13.nextSibling();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        java.lang.String str28 = documentType23.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType23.childNodesCopy();
        java.lang.String str31 = documentType23.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str32 = documentType23.outerHtml();
        java.lang.String str33 = documentType23.nodeName();
        org.jsoup.nodes.Node node36 = documentType23.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node37 = node36.clone();
        org.jsoup.nodes.Node node38 = node37.clone();
        org.jsoup.nodes.Node node40 = node38.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith(node40);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#doctype" + "'", str33, "#doctype");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document22 = documentType19.ownerDocument();
        java.lang.String str23 = documentType19.nodeName();
        org.jsoup.nodes.Node node24 = documentType19.previousSibling();
        org.jsoup.nodes.Node node26 = documentType19.removeAttr("#doctype");
        java.lang.String str27 = documentType19.toString();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        int int9 = node5.childNodeSize();
        org.jsoup.nodes.Node node11 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        int int9 = node5.childNodeSize();
        org.jsoup.nodes.Node node11 = node5.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        int int17 = documentType4.childNodeSize();
        java.lang.String str19 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document20 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = document20.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        int int7 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node25.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        java.lang.String str16 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node9.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node9.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        java.lang.String str21 = documentType19.baseUri();
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str28 = documentType27.baseUri();
        boolean boolean29 = documentType19.equals((java.lang.Object) str28);
        int int30 = documentType19.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.lang.String str6 = documentType4.toString();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! \"hi!\">" + "'", str6, "<!DOCTYPE hi! \"hi!\">");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean16 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, (int) 'a', outputSettings21);
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("hi!");
        org.jsoup.nodes.Attributes attributes37 = documentType34.attributes();
        int int38 = documentType34.siblingIndex();
        java.lang.String str39 = documentType34.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = documentType34.childNodesCopy();
        org.jsoup.nodes.Node node43 = documentType34.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node44 = documentType34.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType34);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        org.jsoup.nodes.Node node11 = node5.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node12.childNodeSize();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document14.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        org.jsoup.nodes.Node node24 = node9.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node26 = node9.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str27 = node26.toString();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        int int8 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype");
        java.lang.String str17 = documentType15.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node5.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        org.jsoup.nodes.Node node34 = documentType15.clone();
        int int35 = node34.siblingIndex();
        org.jsoup.nodes.Node node36 = node34.nextSibling();
        org.jsoup.nodes.Node node37 = node34.nextSibling();
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
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        java.lang.String str16 = documentType4.baseUri();
        java.lang.String str17 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        org.jsoup.nodes.Node node15 = node12.parent();
        org.jsoup.nodes.Attributes attributes16 = node12.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        boolean boolean15 = node12.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = node12.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.previousSibling();
        java.lang.String str11 = node5.baseUri();
        java.lang.String str13 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        org.jsoup.nodes.Node node20 = documentType18.parent();
        org.jsoup.nodes.Document document21 = documentType18.ownerDocument();
        org.jsoup.nodes.Node node23 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.Node node24 = documentType18.clone();
        boolean boolean25 = node5.equals((java.lang.Object) documentType18);
        org.jsoup.nodes.Node node27 = node5.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        java.lang.Class<?> wildcardClass19 = nodeList18.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        org.jsoup.nodes.Node node17 = documentType4.clone();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, 100, outputSettings20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        org.jsoup.nodes.Document document18 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes19 = document18.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType4.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node13 = documentType12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        boolean boolean15 = node5.equals((java.lang.Object) nodeList14);
        org.jsoup.nodes.Node node17 = node5.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node9.unwrap();
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
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node11 = node9.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType16.previousSibling();
        java.lang.String str20 = documentType16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType16.siblingNodes();
        org.jsoup.nodes.Attributes attributes22 = documentType16.attributes();
        java.lang.String str23 = documentType16.toString();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType16.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        java.lang.String str28 = documentType16.toString();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        node13.setBaseUri("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.lang.String str27 = node8.attr("hi!");
        org.jsoup.nodes.Node node29 = node8.removeAttr("hi!");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) ' ', outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        int int34 = documentType15.childNodeSize();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str41 = documentType39.attr("hi!");
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        int int43 = documentType39.siblingIndex();
        org.jsoup.nodes.Node node44 = documentType39.previousSibling();
        int int45 = documentType39.childNodeSize();
        org.jsoup.nodes.Document document46 = documentType39.ownerDocument();
        org.jsoup.nodes.DocumentType documentType51 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str53 = documentType51.attr("hi!");
        java.lang.String str54 = documentType51.nodeName();
        org.jsoup.nodes.Node node56 = documentType51.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean57 = documentType39.equals((java.lang.Object) documentType51);
        java.lang.String str59 = documentType39.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str60 = documentType39.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node61 = documentType15.after((org.jsoup.nodes.Node) documentType39);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#doctype" + "'", str54, "#doctype");
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#doctype" + "'", str60, "#doctype");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node5.after("<!DOCTYPE hi! \"hi!\">");
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
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = node9.nextSibling();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        int int18 = node17.siblingIndex();
        org.jsoup.nodes.Node node19 = node17.clone();
        org.jsoup.nodes.Node node21 = node19.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node21.setBaseUri("#doctype");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) 0, outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        org.jsoup.nodes.Node node21 = node19.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node22 = node19.parent();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node31 = documentType30.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType30.childNodesCopy();
        java.lang.String str33 = documentType30.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) documentType30);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#doctype" + "'", str33, "#doctype");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        org.jsoup.nodes.Node node16 = node8.nextSibling();
        org.jsoup.nodes.Node node17 = node8.parentNode();
        java.lang.String str18 = node8.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) ' ', outputSettings12);
        java.lang.Class<?> wildcardClass14 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        org.jsoup.nodes.Node node18 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str16 = documentType4.absUrl("#doctype");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (byte) 0, outputSettings19);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = node22.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node10.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType15.outerHtmlTail(stringBuilder35, (-1), outputSettings37);
        java.lang.String str39 = documentType15.nodeName();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#doctype" + "'", str39, "#doctype");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.childNodes();
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType15.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        org.jsoup.nodes.Node node10 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.removeAttr("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("hi!");
        org.jsoup.nodes.Attributes attributes14 = documentType11.attributes();
        int int15 = documentType11.siblingIndex();
        java.lang.String str16 = documentType11.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType11.childNodesCopy();
        org.jsoup.nodes.Node node20 = documentType11.attr("#doctype", "#doctype");
        boolean boolean21 = node5.equals((java.lang.Object) node20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node5.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) (byte) -1, outputSettings21);
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str29 = documentType27.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node30 = documentType27.previousSibling();
        java.lang.String str31 = documentType27.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType27.siblingNodes();
        org.jsoup.nodes.Attributes attributes33 = documentType27.attributes();
        java.lang.String str34 = documentType27.toString();
        org.jsoup.nodes.Node node35 = documentType27.nextSibling();
        java.lang.String str37 = documentType27.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean39 = documentType27.hasAttr("");
        documentType27.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.before((org.jsoup.nodes.Node) documentType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str11 = documentType9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType9.previousSibling();
        java.lang.String str13 = documentType9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType9.siblingNodes();
        org.jsoup.nodes.Attributes attributes15 = documentType9.attributes();
        java.lang.String str16 = documentType9.toString();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType9.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType25.childNodesCopy();
        boolean boolean27 = documentType9.equals((java.lang.Object) documentType25);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType25.childNodes();
        boolean boolean29 = documentType4.equals((java.lang.Object) documentType25);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document13 = node5.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        java.lang.String str5 = documentType4.baseUri();
        int int6 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 0, outputSettings9);
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        int int16 = documentType15.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node13 = node12.previousSibling();
        boolean boolean15 = node12.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document16 = node12.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        java.lang.String str19 = node17.baseUri();
        node17.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document22 = node17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = document22.baseUri();
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        java.lang.String str18 = node8.absUrl("<!DOCTYPE hi! \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        documentType4.setBaseUri("");
        java.lang.Class<?> wildcardClass14 = documentType4.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        java.lang.String str24 = documentType20.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str26 = documentType20.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        java.lang.String str20 = documentType15.attr("hi!");
        boolean boolean21 = node8.equals((java.lang.Object) str20);
        org.jsoup.nodes.Node node22 = node8.nextSibling();
        java.lang.String str24 = node8.absUrl("#doctype");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType29.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType29.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) documentType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        java.lang.String str5 = documentType4.baseUri();
        int int6 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 0, outputSettings9);
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) (byte) 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
            org.jsoup.nodes.Document document28 = node26.ownerDocument();
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
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        org.jsoup.nodes.Node node21 = documentType4.parent();
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        java.lang.String str15 = node9.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean17 = node9.hasAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node18 = node9.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = document14.toString();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
            documentType4.outerHtmlHead(stringBuilder14, (int) '#', outputSettings16);
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
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.attr("");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType16.previousSibling();
        java.lang.String str20 = documentType16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType16.siblingNodes();
        org.jsoup.nodes.Attributes attributes22 = documentType16.attributes();
        java.lang.String str23 = documentType16.toString();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType16.outerHtmlTail(stringBuilder24, 10, outputSettings26);
        java.lang.String str28 = documentType16.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int13 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        int int24 = documentType20.siblingIndex();
        java.lang.String str25 = documentType20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType20.childNodesCopy();
        java.lang.String str27 = documentType20.nodeName();
        org.jsoup.nodes.Node node30 = documentType20.attr("#doctype", "hi!");
        java.lang.String str31 = documentType20.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType4.after((org.jsoup.nodes.Node) documentType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        int int11 = documentType4.childNodeSize();
        int int12 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (byte) 0, outputSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("hi!");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        int int39 = documentType35.siblingIndex();
        java.lang.String str40 = documentType35.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType35.childNodesCopy();
        java.lang.String str43 = documentType35.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str44 = documentType35.outerHtml();
        java.lang.String str45 = documentType35.nodeName();
        org.jsoup.nodes.Node node48 = documentType35.attr("#doctype", "#doctype");
        java.lang.StringBuilder stringBuilder49 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = null;
        documentType35.outerHtmlTail(stringBuilder49, (int) (short) 10, outputSettings51);
        java.lang.String str53 = documentType35.nodeName();
        int int54 = documentType35.siblingIndex();
        java.lang.String str55 = documentType35.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) documentType35);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str44, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#doctype" + "'", str45, "#doctype");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#doctype" + "'", str53, "#doctype");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        java.lang.String str17 = node16.baseUri();
        org.jsoup.nodes.Node node18 = node16.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.childNode((int) (byte) 0);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.clone();
        java.lang.String str9 = node7.absUrl("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str11 = node7.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
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
        int int40 = documentType26.siblingIndex();
        java.lang.String str41 = documentType26.outerHtml();
        java.lang.String str42 = documentType26.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType26.childNodesCopy();
        org.jsoup.nodes.Node node45 = documentType26.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = documentType4.before((org.jsoup.nodes.Node) documentType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str41, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#doctype" + "'", str42, "#doctype");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        int int28 = documentType15.siblingIndex();
        java.lang.String str29 = documentType15.outerHtml();
        java.lang.String str30 = documentType15.nodeName();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType15.outerHtmlHead(stringBuilder31, 0, outputSettings33);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        org.jsoup.nodes.Node node20 = documentType18.parent();
        org.jsoup.nodes.Document document21 = documentType18.ownerDocument();
        java.lang.String str22 = documentType18.nodeName();
        java.lang.String str23 = documentType18.baseUri();
        boolean boolean24 = node13.equals((java.lang.Object) str23);
        org.jsoup.nodes.Node node25 = node13.nextSibling();
        boolean boolean27 = node13.hasAttr("");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        org.jsoup.nodes.Node node12 = node11.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.removeAttr("hi!");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        int int27 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.String str13 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) 'a', outputSettings16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        node8.setBaseUri("");
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        java.lang.String str12 = node8.outerHtml();
        java.lang.String str13 = node8.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = documentType4.outerHtml();
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node9.baseUri();
        java.lang.String str15 = node9.toString();
        org.jsoup.nodes.Node node16 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.parent();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.parentNode();
        java.lang.Class<?> wildcardClass6 = documentType4.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        int int17 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Node node8 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        org.jsoup.nodes.Node node19 = documentType4.previousSibling();
        java.lang.Class<?> wildcardClass20 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        org.jsoup.nodes.Node node19 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node14.attr("", "<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node22.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node9.childNodes();
        org.jsoup.nodes.Node node18 = node9.previousSibling();
        java.lang.String str20 = node9.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node9.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, 10, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        boolean boolean8 = documentType4.hasAttr("hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType16.previousSibling();
        java.lang.String str20 = documentType16.toString();
        org.jsoup.nodes.Node node21 = documentType16.parent();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType16.outerHtmlTail(stringBuilder22, (int) (short) -1, outputSettings24);
        org.jsoup.nodes.Document document26 = documentType16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node11.before((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.unwrap();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node10.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) '4', outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        documentType15.setBaseUri("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType15.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        int int25 = node21.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        org.jsoup.nodes.Node node10 = node5.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType15.previousSibling();
        int int19 = documentType15.childNodeSize();
        org.jsoup.nodes.Node node20 = documentType15.clone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = node10.equals((java.lang.Object) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.String str13 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) 'a', outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        int int13 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        int int23 = node22.siblingIndex();
        java.lang.String str24 = node22.outerHtml();
        org.jsoup.nodes.Node node25 = node22.parent();
        org.jsoup.nodes.Node node26 = node22.clone();
        boolean boolean28 = node22.hasAttr("#doctype");
        org.jsoup.nodes.Node node29 = node22.parent();
        org.jsoup.nodes.Node node30 = node22.clone();
        java.lang.String str31 = node30.baseUri();
        org.jsoup.nodes.Node node32 = node30.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.clone();
        org.jsoup.nodes.Node node25 = documentType20.clone();
        org.jsoup.nodes.Attributes attributes26 = node25.attributes();
        org.jsoup.nodes.Node node29 = node25.attr("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node15 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        int int19 = documentType15.siblingIndex();
        java.lang.String str20 = documentType15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType15.childNodesCopy();
        org.jsoup.nodes.Node node24 = documentType15.attr("#doctype", "#doctype");
        java.lang.String str25 = documentType15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node10.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        node18.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node18.childNodesCopy();
        int int22 = node18.childNodeSize();
        boolean boolean23 = documentType4.equals((java.lang.Object) int22);
        java.lang.String str25 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        java.lang.String str26 = documentType23.toString();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = node13.childNodeSize();
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
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node9 = node6.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node8.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str14 = documentType4.baseUri();
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        boolean boolean12 = node5.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node25.traverse(nodeVisitor26);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, 100, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str38 = documentType36.attr("hi!");
        org.jsoup.nodes.Attributes attributes39 = documentType36.attributes();
        int int40 = documentType36.siblingIndex();
        int int41 = documentType36.childNodeSize();
        org.jsoup.nodes.Document document42 = documentType36.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType36.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType48 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str50 = documentType48.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes51 = documentType48.attributes();
        org.jsoup.nodes.Document document52 = documentType48.ownerDocument();
        org.jsoup.nodes.Node node55 = documentType48.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.lang.String str57 = documentType48.attr("#doctype");
        boolean boolean58 = documentType36.equals((java.lang.Object) str57);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = documentType15.after((org.jsoup.nodes.Node) documentType36);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNull(document52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str38 = documentType36.attr("hi!");
        org.jsoup.nodes.Attributes attributes39 = documentType36.attributes();
        int int40 = documentType36.siblingIndex();
        java.lang.String str41 = documentType36.baseUri();
        boolean boolean43 = documentType36.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean44 = documentType15.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\">");
        documentType15.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }
}

