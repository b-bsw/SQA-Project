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
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean9 = node5.hasAttr("");
        org.jsoup.nodes.Document document10 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        node13.setBaseUri("hi!");
        java.lang.String str23 = node13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        org.jsoup.nodes.Attributes attributes19 = node18.attributes();
        java.lang.String str21 = node18.attr("#doctype");
        org.jsoup.nodes.Node node22 = node18.clone();
        org.jsoup.nodes.Node node23 = node18.parent();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node29 = documentType28.clone();
        boolean boolean30 = node18.equals((java.lang.Object) documentType28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        java.lang.String str12 = node10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodes();
        org.jsoup.nodes.Node node14 = node10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.previousSibling();
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
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList32 = node31.childNodesCopy();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass15 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.attr("hi!");
        java.lang.Class<?> wildcardClass15 = node11.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.jsoup.nodes.Node node18 = node17.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
            java.lang.String str22 = node20.attr("#doctype");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node12.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        java.lang.String str11 = node10.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType16.siblingNodes();
        org.jsoup.nodes.Node node24 = documentType16.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.String str25 = documentType16.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node10.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
            org.jsoup.nodes.Node node16 = node13.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
            node12.remove();
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.lang.String str30 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node31 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node31.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node8.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str30 = documentType28.attr("hi!");
        org.jsoup.nodes.Attributes attributes31 = documentType28.attributes();
        int int32 = documentType28.siblingIndex();
        java.lang.String str33 = documentType28.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType28.childNodesCopy();
        java.lang.String str36 = documentType28.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str37 = documentType28.outerHtml();
        java.lang.String str38 = documentType28.nodeName();
        org.jsoup.nodes.Node node41 = documentType28.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node42 = node41.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node21.before(node42);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str37, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#doctype" + "'", str38, "#doctype");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node13.unwrap();
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.outerHtml();
        java.lang.String str13 = documentType4.outerHtml();
        boolean boolean15 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        boolean boolean40 = node37.hasAttr("hi!");
        node37.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node8.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        boolean boolean11 = documentType4.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) '4', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.clone();
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = document17.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        boolean boolean24 = node9.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node9.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        org.jsoup.nodes.Node node26 = node9.parent();
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.jsoup.nodes.Node node34 = node8.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node8.traverse(nodeVisitor35);
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
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Document document7 = node5.ownerDocument();
        int int8 = node5.siblingIndex();
        org.jsoup.nodes.Node node9 = node5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        org.jsoup.nodes.Node node12 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = node12.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.after("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
            int int15 = node14.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        java.lang.String str16 = documentType4.attr("");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) 10, outputSettings19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.unwrap();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType4.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        org.jsoup.nodes.Node node30 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node30.previousSibling();
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        java.lang.String str12 = node10.toString();
        org.jsoup.nodes.Document document13 = node10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        java.lang.String str31 = documentType15.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType15.unwrap();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.nodes.Document document9 = node5.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        java.lang.String str11 = node5.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        int int35 = documentType15.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = documentType15.after("");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        int int28 = node27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node27.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node37 = documentType34.previousSibling();
        java.lang.String str38 = documentType34.toString();
        org.jsoup.nodes.Node node39 = documentType34.parent();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        documentType34.outerHtmlTail(stringBuilder40, (int) (short) -1, outputSettings42);
        boolean boolean44 = node27.equals((java.lang.Object) documentType34);
        documentType34.setBaseUri("hi!");
        org.jsoup.nodes.Node node47 = documentType34.previousSibling();
        int int48 = documentType34.siblingIndex();
        java.lang.String str49 = documentType34.outerHtml();
        int int50 = documentType34.childNodeSize();
        java.lang.String str51 = documentType34.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = node18.after((org.jsoup.nodes.Node) documentType34);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str38, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str49, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#doctype" + "'", str51, "#doctype");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str15 = documentType4.attr("hi!");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        int int24 = documentType20.siblingIndex();
        java.lang.String str25 = documentType20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType20.childNodesCopy();
        org.jsoup.nodes.Node node29 = documentType20.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node30 = documentType20.parentNode();
        org.jsoup.nodes.Node node31 = documentType20.previousSibling();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType20.outerHtmlTail(stringBuilder32, (int) (byte) 1, outputSettings34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType4.before((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.jsoup.nodes.Attributes attributes23 = documentType16.attributes();
        documentType16.setBaseUri("#doctype");
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
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node10.clone();
        boolean boolean15 = node10.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node10.unwrap();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        java.lang.String str13 = node9.toString();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.traverse(nodeVisitor14);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        int int14 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str14 = node13.baseUri();
        org.jsoup.nodes.Node node15 = node13.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node24 = documentType23.clone();
        int int25 = node24.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node24.childNodes();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node32 = documentType31.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.siblingNodes();
        boolean boolean34 = node24.equals((java.lang.Object) nodeList33);
        org.jsoup.nodes.Node node35 = node24.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node18.before(node35);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.clone();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node21 = documentType20.clone();
        org.jsoup.nodes.Node node22 = documentType20.parent();
        org.jsoup.nodes.Document document23 = documentType20.ownerDocument();
        java.lang.String str24 = documentType20.nodeName();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType20.outerHtmlTail(stringBuilder25, (int) (short) 10, outputSettings27);
        boolean boolean29 = node15.equals((java.lang.Object) outputSettings27);
        java.lang.String str30 = node15.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("hi!");
        boolean boolean36 = documentType32.hasAttr("");
        java.lang.String str38 = documentType32.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node40 = documentType32.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType32);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (short) 100, outputSettings15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        java.lang.String str12 = node10.toString();
        org.jsoup.nodes.Document document13 = node10.ownerDocument();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        java.lang.String str23 = node22.toString();
        org.jsoup.nodes.Node node25 = node22.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = document13.equals((java.lang.Object) node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType15.outerHtmlTail(stringBuilder34, (int) '#', outputSettings36);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = documentType15.before("");
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
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        java.lang.String str18 = documentType4.attr("");
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.traverse(nodeVisitor19);
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
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Node node14 = documentType10.clone();
        org.jsoup.nodes.Node node15 = documentType10.clone();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        java.lang.String str18 = node15.attr("#doctype");
        org.jsoup.nodes.Node node19 = node15.clone();
        java.lang.String str20 = node19.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node19.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        org.jsoup.nodes.Attributes attributes48 = documentType17.attributes();
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
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        java.lang.String str17 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 0, outputSettings12);
        java.lang.String str14 = documentType4.outerHtml();
        java.lang.Class<?> wildcardClass15 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        int int7 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        int int11 = node5.childNodeSize();
        org.jsoup.nodes.Attributes attributes12 = node5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node5.unwrap();
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
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 1, outputSettings15);
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (short) 10, outputSettings19);
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
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.jsoup.nodes.Node node16 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Node node14 = documentType10.clone();
        org.jsoup.nodes.Node node15 = documentType10.clone();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        java.lang.String str18 = node15.attr("#doctype");
        org.jsoup.nodes.Node node19 = node15.clone();
        org.jsoup.nodes.Node node20 = node19.parent();
        org.jsoup.nodes.Node node22 = node19.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        boolean boolean13 = node8.hasAttr("");
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        int int12 = node9.childNodeSize();
        org.jsoup.nodes.Node node13 = node9.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.String str14 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) ' ', outputSettings17);
        java.lang.String str19 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes20 = documentType4.attributes();
        java.lang.String str22 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder30, 100, outputSettings32);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        java.lang.String str12 = node10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodes();
        org.jsoup.nodes.Node node14 = node10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
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
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        org.jsoup.nodes.Node node24 = documentType19.clone();
        org.jsoup.nodes.Attributes attributes25 = node24.attributes();
        int int26 = node24.siblingIndex();
        java.lang.String str27 = node24.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node14.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.nodes.Document document9 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 10, outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 0, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = documentType19.previousSibling();
        java.lang.String str23 = documentType19.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType19.siblingNodes();
        org.jsoup.nodes.Attributes attributes25 = documentType19.attributes();
        java.lang.String str26 = documentType19.toString();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType19.outerHtmlTail(stringBuilder27, 10, outputSettings29);
        java.lang.String str32 = documentType19.attr("hi!");
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str39 = documentType37.attr("hi!");
        org.jsoup.nodes.Attributes attributes40 = documentType37.attributes();
        java.lang.StringBuilder stringBuilder41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        documentType37.outerHtmlTail(stringBuilder41, 10, outputSettings43);
        org.jsoup.nodes.Node node46 = documentType37.removeAttr("hi!");
        boolean boolean47 = documentType19.equals((java.lang.Object) documentType37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = documentType4.after((org.jsoup.nodes.Node) documentType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        documentType4.outerHtmlTail(stringBuilder19, (int) (byte) 10, outputSettings21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.String str24 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.wrap("#doctype");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.Class<?> wildcardClass14 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.parent();
        org.jsoup.nodes.Document document15 = node9.ownerDocument();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.clone();
        int int25 = node24.siblingIndex();
        java.lang.String str26 = node24.outerHtml();
        org.jsoup.nodes.Node node27 = node24.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document15.after(node24);
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
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.siblingIndex();
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node27 = documentType26.clone();
        int int28 = node27.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node27.childNodes();
        org.jsoup.nodes.Node node30 = node27.parent();
        org.jsoup.nodes.Attributes attributes31 = node27.attributes();
        org.jsoup.nodes.Document document32 = node27.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node9.before(node27);
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNull(document32);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        // The following exception was thrown during execution in test generation
        try {
            node7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType14.previousSibling();
        java.lang.String str18 = documentType14.toString();
        org.jsoup.nodes.Node node19 = documentType14.parent();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType14.outerHtmlTail(stringBuilder20, (int) (short) -1, outputSettings22);
        org.jsoup.nodes.Node node25 = documentType14.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str26 = documentType14.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node8.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.jsoup.nodes.Node node28 = node8.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes12 = node11.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.lang.String str11 = node5.outerHtml();
        java.lang.String str12 = node5.toString();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        boolean boolean18 = node5.equals((java.lang.Object) node17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node5.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("hi!");
        org.jsoup.nodes.Attributes attributes14 = documentType11.attributes();
        int int15 = documentType11.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType11.previousSibling();
        java.lang.String str17 = documentType11.baseUri();
        org.jsoup.nodes.Node node18 = documentType11.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType11.childNodesCopy();
        org.jsoup.nodes.Node node21 = documentType11.removeAttr("hi!");
        int int22 = node21.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        boolean boolean11 = documentType4.hasAttr("");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str11 = documentType9.attr("hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType9.attributes();
        org.jsoup.nodes.Node node13 = documentType9.clone();
        int int14 = node13.siblingIndex();
        java.lang.String str15 = node13.outerHtml();
        org.jsoup.nodes.Node node16 = node13.parent();
        org.jsoup.nodes.Node node17 = node13.clone();
        boolean boolean18 = documentType4.equals((java.lang.Object) node13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node13.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder8, 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        org.jsoup.nodes.Node node13 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = node13.childNodeSize();
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        java.lang.String str34 = documentType15.outerHtml();
        org.jsoup.nodes.Node node35 = documentType15.nextSibling();
        org.jsoup.nodes.Node node36 = documentType15.parent();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.parent();
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
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        int int13 = node8.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node21 = documentType20.clone();
        org.jsoup.nodes.Node node22 = documentType20.parent();
        org.jsoup.nodes.Document document23 = documentType20.ownerDocument();
        org.jsoup.nodes.Node node25 = documentType20.removeAttr("hi!");
        org.jsoup.nodes.Node node26 = documentType20.parent();
        int int27 = documentType20.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        org.jsoup.nodes.Node node18 = documentType14.clone();
        org.jsoup.nodes.Node node19 = documentType14.clone();
        int int20 = node19.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node19.siblingNodes();
        org.jsoup.nodes.Document document22 = node19.ownerDocument();
        node19.setBaseUri("hi!");
        java.lang.String str26 = node19.absUrl("#doctype");
        node19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean30 = node19.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node9.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        java.lang.String str17 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.traverse(nodeVisitor14);
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
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType15.remove();
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
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.removeAttr("");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        java.lang.String str14 = node9.baseUri();
        org.jsoup.nodes.Node node15 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.parentNode();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
            org.jsoup.nodes.Node node34 = node26.unwrap();
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.traverse(nodeVisitor28);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.Node node13 = node9.attr("hi!", "");
        java.lang.String str14 = node9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node12.setBaseUri("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node12.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        org.jsoup.nodes.Node node24 = documentType23.clone();
        int int25 = node24.childNodeSize();
        org.jsoup.nodes.Node node26 = node24.previousSibling();
        org.jsoup.nodes.Node node28 = node24.removeAttr("#doctype");
        java.lang.String str29 = node28.toString();
        org.jsoup.nodes.Node node30 = node28.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node17.before(node30);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document35 = documentType32.ownerDocument();
        java.lang.String str36 = documentType32.baseUri();
        java.lang.String str37 = documentType32.baseUri();
        java.lang.String str38 = documentType32.nodeName();
        org.jsoup.nodes.Node node39 = documentType32.previousSibling();
        org.jsoup.nodes.Node node40 = documentType32.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node40);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#doctype" + "'", str38, "#doctype");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.String str27 = documentType4.baseUri();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((-1));
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        java.lang.String str25 = node23.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node31 = documentType30.clone();
        org.jsoup.nodes.Document document32 = documentType30.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType30.childNodesCopy();
        java.lang.String str34 = documentType30.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node23.after((org.jsoup.nodes.Node) documentType30);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Attributes attributes11 = node9.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str10, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.traverse(nodeVisitor25);
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
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str14 = node13.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = node5.outerHtml();
        org.jsoup.nodes.Node node9 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int10 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Node node15 = node12.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        int int13 = node12.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType4.outerHtmlTail(stringBuilder26, 10, outputSettings28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
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
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Node node14 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        java.lang.String str23 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str25 = documentType19.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node9.after((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.Class<?> wildcardClass10 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        int int19 = node17.siblingIndex();
        int int20 = node17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node17.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node17.childNodes();
        boolean boolean23 = documentType4.equals((java.lang.Object) nodeList22);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        // The following exception was thrown during execution in test generation
        try {
            node15.remove();
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
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        int int23 = node22.childNodeSize();
        java.lang.String str25 = node22.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document26 = node22.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        java.lang.Class<?> wildcardClass21 = documentType4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.String str34 = documentType4.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.lang.Class<?> wildcardClass26 = node25.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        java.lang.String str15 = documentType4.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.jsoup.nodes.Node node16 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        int int19 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after(node20);
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
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">" + "'", str5, "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document14.after("#doctype");
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
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        java.lang.String str23 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node24 = documentType19.parentNode();
        boolean boolean26 = documentType19.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes27 = documentType19.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType19.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        java.lang.Class<?> wildcardClass15 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node14 = documentType13.clone();
        int int15 = node14.childNodeSize();
        boolean boolean16 = node8.equals((java.lang.Object) int15);
        org.jsoup.nodes.Document document17 = node8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node8.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (short) -1, outputSettings15);
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        boolean boolean11 = documentType4.hasAttr("");
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.nodeName();
        java.lang.String str14 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        int int21 = node20.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node20.childNodes();
        org.jsoup.nodes.Node node23 = node20.parent();
        node20.setBaseUri("hi!");
        boolean boolean26 = documentType4.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int14 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.lang.String str11 = node5.outerHtml();
        node5.setBaseUri("#doctype");
        java.lang.String str14 = node5.toString();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.childNode((-1));
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
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = node9.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        int int23 = node22.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node8.after(node22);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
            node20.remove();
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
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.previousSibling();
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        org.jsoup.nodes.Node node24 = documentType20.clone();
        org.jsoup.nodes.Node node25 = documentType20.clone();
        org.jsoup.nodes.Attributes attributes26 = node25.attributes();
        java.lang.String str28 = node25.attr("#doctype");
        org.jsoup.nodes.Node node29 = node25.clone();
        java.lang.String str30 = node29.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node29.childNodesCopy();
        org.jsoup.nodes.Node node33 = node29.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str15 = node9.attr("#doctype");
        org.jsoup.nodes.Node node17 = node9.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node9.childNodes();
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
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.previousSibling();
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
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        boolean boolean17 = node11.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = node11.previousSibling();
        org.jsoup.nodes.Node node19 = node11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node11.unwrap();
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node13.childNodes();
        org.jsoup.nodes.Document document18 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        documentType4.setBaseUri("#doctype");
        int int13 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, 0, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        int int19 = node17.siblingIndex();
        int int20 = node17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node17.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node17.childNodes();
        boolean boolean23 = documentType4.equals((java.lang.Object) nodeList22);
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str30 = documentType28.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node31 = documentType28.previousSibling();
        java.lang.String str33 = documentType28.absUrl("hi!");
        int int34 = documentType28.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = documentType4.before((org.jsoup.nodes.Node) documentType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document14.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = node9.attributes();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Node node21 = documentType17.clone();
        org.jsoup.nodes.Node node22 = documentType17.clone();
        org.jsoup.nodes.Attributes attributes23 = node22.attributes();
        java.lang.String str25 = node22.attr("#doctype");
        org.jsoup.nodes.Node node26 = node22.clone();
        org.jsoup.nodes.Node node27 = node26.parent();
        org.jsoup.nodes.Node node29 = node26.removeAttr("hi!");
        boolean boolean30 = node9.equals((java.lang.Object) node26);
        java.lang.Object obj31 = null;
        boolean boolean32 = node9.equals(obj31);
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str38 = documentType37.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node9.after((org.jsoup.nodes.Node) documentType37);
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
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">" + "'", str38, "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        int int7 = node5.childNodeSize();
        java.lang.String str9 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node13.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "hi!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.String str21 = documentType14.baseUri();
        org.jsoup.nodes.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType14.after(node22);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        int int22 = documentType18.siblingIndex();
        java.lang.String str23 = documentType18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodesCopy();
        org.jsoup.nodes.Node node27 = documentType18.attr("#doctype", "#doctype");
        java.lang.String str29 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node30 = documentType18.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith(node30);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        documentType4.setBaseUri("hi!");
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.parentNode();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str24 = documentType23.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType23.siblingNodes();
        org.jsoup.nodes.Node node27 = documentType23.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node28 = node27.clone();
        int int29 = node28.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node18.before(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str24, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.unwrap();
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
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node8.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.Node node13 = node9.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.attr("", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.before("hi!");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.jsoup.nodes.Document document26 = node8.ownerDocument();
        java.lang.String str28 = node8.absUrl("#doctype");
        boolean boolean30 = node8.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node8.removeAttr("");
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
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("hi!");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Node node14 = documentType10.clone();
        int int15 = node14.siblingIndex();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node17 = node14.parent();
        org.jsoup.nodes.Node node18 = node14.clone();
        boolean boolean20 = node14.hasAttr("#doctype");
        org.jsoup.nodes.Node node22 = node14.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str13 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (byte) -1, outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        int int12 = node11.childNodeSize();
        java.lang.String str13 = node11.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node11.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node13.setBaseUri("hi!");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        org.jsoup.nodes.Node node23 = node13.previousSibling();
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
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        boolean boolean14 = node8.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        int int18 = documentType14.siblingIndex();
        java.lang.String str19 = documentType14.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType14.childNodesCopy();
        java.lang.String str21 = documentType14.nodeName();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType14.outerHtmlTail(stringBuilder22, (int) (byte) -1, outputSettings24);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType14.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        int int26 = documentType22.siblingIndex();
        org.jsoup.nodes.Node node27 = documentType22.previousSibling();
        java.lang.String str28 = documentType22.baseUri();
        org.jsoup.nodes.Node node29 = documentType22.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType22.childNodesCopy();
        java.lang.String str31 = documentType22.toString();
        java.lang.String str33 = documentType22.absUrl("#doctype");
        int int34 = documentType22.childNodeSize();
        int int35 = documentType22.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith((org.jsoup.nodes.Node) documentType22);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int15 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str15 = node9.attr("#doctype");
        org.jsoup.nodes.Node node16 = node9.parentNode();
        java.lang.Class<?> wildcardClass17 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node13.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        org.jsoup.nodes.Node node16 = node8.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node18 = node16.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("hi!");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        org.jsoup.nodes.Document document26 = documentType22.ownerDocument();
        org.jsoup.nodes.Node node28 = documentType22.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType22.childNodesCopy();
        org.jsoup.nodes.Node node31 = documentType22.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int32 = documentType22.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        org.jsoup.nodes.Attributes attributes17 = node8.attributes();
        org.jsoup.nodes.Node node20 = node8.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.before("");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("hi!");
        org.jsoup.nodes.Attributes attributes14 = documentType11.attributes();
        int int15 = documentType11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType11.siblingNodes();
        org.jsoup.nodes.Node node19 = documentType11.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.String str20 = documentType11.outerHtml();
        org.jsoup.nodes.Node node21 = documentType11.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.previousSibling();
        java.lang.String str15 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = node8.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.lang.Class<?> wildcardClass13 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType4.childNodes();
        java.lang.String str27 = documentType4.baseUri();
        org.jsoup.nodes.Node node28 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = node28.childNodeSize();
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        org.jsoup.nodes.Node node19 = documentType15.clone();
        org.jsoup.nodes.Node node20 = documentType15.clone();
        int int21 = node20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node20.siblingNodes();
        org.jsoup.nodes.Node node23 = node20.clone();
        org.jsoup.nodes.Node node24 = node20.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        java.lang.String str10 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        org.jsoup.nodes.Node node18 = documentType16.parent();
        org.jsoup.nodes.Document document19 = documentType16.ownerDocument();
        org.jsoup.nodes.Node node21 = documentType16.removeAttr("hi!");
        org.jsoup.nodes.Document document22 = documentType16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node25 = documentType24.clone();
        node25.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes28 = node25.attributes();
        boolean boolean30 = node25.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes31 = node25.attributes();
        org.jsoup.nodes.Node node32 = node25.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType4.after(node25);
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        node9.setBaseUri("#doctype");
        org.jsoup.nodes.Document document14 = node9.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
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
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.jsoup.select.NodeVisitor nodeVisitor29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType15.traverse(nodeVisitor29);
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
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node8.attr("#doctype", "#doctype");
        java.lang.String str17 = node16.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node16.after("#doctype");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        java.lang.String str14 = node9.baseUri();
        org.jsoup.nodes.Node node15 = node9.nextSibling();
        java.lang.String str16 = node9.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node15 = documentType14.clone();
        node15.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node15.childNodesCopy();
        node15.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.before(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        java.lang.String str24 = documentType4.baseUri();
        java.lang.String str25 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node12.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType10.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder13, (int) (byte) 10, outputSettings15);
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
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int14 = documentType4.childNodeSize();
        documentType4.setBaseUri("");
        java.lang.Object obj17 = null;
        boolean boolean18 = documentType4.equals(obj17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        int int14 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder15, (int) '#', outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        java.lang.String str17 = node9.outerHtml();
        java.lang.String str19 = node9.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
            java.lang.String str21 = node20.outerHtml();
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
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        java.lang.Class<?> wildcardClass25 = node13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.wrap("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        org.jsoup.nodes.Node node34 = node33.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = node33.childNodesCopy();
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
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.jsoup.nodes.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node27.after(node28);
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.lang.Class<?> wildcardClass43 = node9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node8.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        java.lang.String str16 = node11.baseUri();
        java.lang.String str17 = node11.toString();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str24 = documentType22.attr("");
        boolean boolean26 = documentType22.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith((org.jsoup.nodes.Node) documentType22);
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.previousSibling();
        java.lang.String str11 = node5.baseUri();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str20 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str22 = documentType16.attr("");
        org.jsoup.nodes.Node node24 = documentType16.removeAttr("#doctype");
        org.jsoup.nodes.Document document25 = documentType16.ownerDocument();
        boolean boolean26 = node5.equals((java.lang.Object) document25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node5.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        int int15 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.lang.String str14 = documentType4.toString();
        org.jsoup.nodes.Node node15 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        boolean boolean13 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        org.jsoup.nodes.Attributes attributes23 = documentType16.attributes();
        org.jsoup.nodes.Node node24 = documentType16.parentNode();
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
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType4.childNodes();
        java.lang.String str27 = documentType4.baseUri();
        org.jsoup.nodes.Node node28 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder29, 0, outputSettings31);
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (short) -1, outputSettings19);
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
            java.util.List<org.jsoup.nodes.Node> nodeList15 = document14.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str7 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        boolean boolean13 = documentType4.hasAttr("hi!");
        java.lang.String str14 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "", "", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean17 = documentType4.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        java.lang.String str19 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, (int) (short) 100, outputSettings22);
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node29 = documentType28.clone();
        org.jsoup.nodes.Node node30 = documentType28.parent();
        org.jsoup.nodes.Document document31 = documentType28.ownerDocument();
        org.jsoup.nodes.Node node33 = documentType28.removeAttr("hi!");
        org.jsoup.nodes.Node node34 = documentType28.parent();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node34);
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) ' ', outputSettings14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 0, outputSettings18);
        java.lang.String str20 = documentType4.nodeName();
        org.jsoup.nodes.Node node21 = documentType4.parent();
        org.jsoup.nodes.Node node22 = documentType4.clone();
        java.lang.String str24 = node22.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document13 = documentType10.ownerDocument();
        java.lang.String str14 = documentType10.nodeName();
        org.jsoup.nodes.Node node15 = documentType10.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType10.childNodesCopy();
        int int17 = documentType10.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        org.jsoup.nodes.Node node12 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node8.before("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (short) 1, outputSettings19);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.before("#doctype");
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node24 = documentType23.clone();
        int int25 = node24.childNodeSize();
        org.jsoup.nodes.Node node26 = node24.previousSibling();
        int int27 = node24.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node24.siblingNodes();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node34 = documentType33.clone();
        int int35 = node34.childNodeSize();
        boolean boolean36 = node24.equals((java.lang.Object) int35);
        org.jsoup.nodes.Node node37 = node24.parentNode();
        org.jsoup.nodes.Node node39 = node24.removeAttr("hi!");
        boolean boolean41 = node39.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node39.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node39);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        documentType4.setBaseUri("");
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document22 = documentType19.ownerDocument();
        java.lang.String str23 = documentType19.nodeName();
        org.jsoup.nodes.Node node24 = documentType19.previousSibling();
        org.jsoup.nodes.Node node26 = documentType19.removeAttr("#doctype");
        boolean boolean28 = documentType19.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean29 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("hi!");
        java.lang.String str38 = documentType34.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str40 = documentType34.attr("");
        org.jsoup.nodes.Node node42 = documentType34.removeAttr("#doctype");
        org.jsoup.nodes.Document document43 = documentType34.ownerDocument();
        org.jsoup.nodes.Node node44 = documentType34.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = documentType19.after(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        int int14 = documentType4.childNodeSize();
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = node13.parent();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Document document23 = documentType19.ownerDocument();
        org.jsoup.nodes.Node node25 = documentType19.removeAttr("#doctype");
        org.jsoup.nodes.Node node27 = node25.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = node14.equals((java.lang.Object) node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node30.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        org.jsoup.nodes.Node node17 = documentType4.parentNode();
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        java.lang.String str32 = documentType15.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType15.outerHtmlTail(stringBuilder33, 100, outputSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = documentType15.childNodesCopy();
        java.lang.String str38 = documentType15.nodeName();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#doctype" + "'", str38, "#doctype");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) ' ', outputSettings13);
        java.lang.String str15 = documentType4.toString();
        int int16 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node19.after("hi!");
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.nextSibling();
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
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        node17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int20 = node17.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) ' ', outputSettings14);
        boolean boolean17 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        int int16 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.unwrap();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.jsoup.nodes.Node node34 = node33.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document35 = node34.ownerDocument();
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
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "#doctype");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        java.lang.String str34 = documentType15.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType15.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        int int8 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodes();
        java.lang.Class<?> wildcardClass12 = node5.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.childNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!");
        org.jsoup.nodes.Document document15 = documentType14.ownerDocument();
        boolean boolean16 = node7.equals((java.lang.Object) document15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = document15.attr("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        int int23 = node22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node22.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node32 = documentType29.previousSibling();
        java.lang.String str33 = documentType29.toString();
        org.jsoup.nodes.Node node34 = documentType29.parent();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType29.outerHtmlTail(stringBuilder35, (int) (short) -1, outputSettings37);
        boolean boolean39 = node22.equals((java.lang.Object) documentType29);
        org.jsoup.nodes.Node node41 = node22.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str42 = node22.baseUri();
        boolean boolean44 = node22.hasAttr("#doctype");
        org.jsoup.nodes.Node node45 = node22.parent();
        java.lang.String str46 = node22.outerHtml();
        org.jsoup.nodes.Node node47 = node22.previousSibling();
        java.lang.String str48 = node22.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node22);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str46, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str48, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        java.lang.Class<?> wildcardClass17 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = node12.ownerDocument();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        int int28 = node27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node27.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node37 = documentType34.previousSibling();
        java.lang.String str38 = documentType34.toString();
        org.jsoup.nodes.Node node39 = documentType34.parent();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        documentType34.outerHtmlTail(stringBuilder40, (int) (short) -1, outputSettings42);
        boolean boolean44 = node27.equals((java.lang.Object) documentType34);
        documentType34.setBaseUri("hi!");
        org.jsoup.nodes.Node node47 = documentType34.previousSibling();
        int int48 = documentType34.siblingIndex();
        java.lang.String str49 = documentType34.toString();
        java.lang.StringBuilder stringBuilder50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        documentType34.outerHtmlTail(stringBuilder50, 0, outputSettings52);
        java.lang.String str54 = documentType34.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = documentType34.childNodesCopy();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str38, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str49, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(nodeList55);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean9 = node5.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.siblingNodes();
        java.lang.String str12 = node5.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        org.jsoup.nodes.Attributes attributes35 = documentType15.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType15.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType15.remove();
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
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder27, 1, outputSettings29);
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
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        documentType4.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        org.jsoup.nodes.Attributes attributes17 = node14.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str14 = node8.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        node13.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node13.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node8.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node13 = node12.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) ' ', outputSettings14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 0, outputSettings18);
        java.lang.String str20 = documentType4.nodeName();
        org.jsoup.nodes.Node node21 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str28 = documentType26.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        org.jsoup.nodes.Node node30 = documentType26.clone();
        org.jsoup.nodes.Node node32 = documentType26.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str40 = documentType38.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document41 = documentType38.ownerDocument();
        java.lang.String str42 = documentType38.nodeName();
        java.lang.String str43 = documentType38.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType38.siblingNodes();
        boolean boolean45 = node32.equals((java.lang.Object) documentType38);
        org.jsoup.nodes.Node node46 = node32.parent();
        java.lang.String str47 = node32.toString();
        // The following exception was thrown during execution in test generation
        try {
            node21.replaceWith(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#doctype" + "'", str42, "#doctype");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str47, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        java.lang.String str26 = documentType16.baseUri();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        boolean boolean13 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("#doctype");
        int int17 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        boolean boolean14 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        java.lang.String str25 = documentType4.attr("");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node25 = documentType22.previousSibling();
        java.lang.String str26 = documentType22.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType22.siblingNodes();
        org.jsoup.nodes.Attributes attributes28 = documentType22.attributes();
        java.lang.String str29 = documentType22.toString();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType22.outerHtmlTail(stringBuilder30, 10, outputSettings32);
        java.lang.String str34 = documentType22.toString();
        int int35 = documentType22.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith((org.jsoup.nodes.Node) documentType22);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        int int8 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        org.jsoup.nodes.Node node18 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node18.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "#doctype");
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Document document7 = node5.ownerDocument();
        int int8 = node5.siblingIndex();
        org.jsoup.nodes.Node node9 = node5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node8.attr("#doctype", "#doctype");
        java.lang.String str17 = node16.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        org.jsoup.nodes.Node node23 = node9.nextSibling();
        org.jsoup.nodes.Node node24 = node9.clone();
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        int int28 = node27.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node27.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str36 = documentType34.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node37 = documentType34.previousSibling();
        java.lang.String str38 = documentType34.toString();
        org.jsoup.nodes.Node node39 = documentType34.parent();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        documentType34.outerHtmlTail(stringBuilder40, (int) (short) -1, outputSettings42);
        boolean boolean44 = node27.equals((java.lang.Object) documentType34);
        documentType34.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes47 = documentType34.attributes();
        java.lang.String str49 = documentType34.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean51 = documentType34.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str52 = documentType34.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = node18.after((org.jsoup.nodes.Node) documentType34);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str38, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        java.lang.String str10 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) (byte) 1, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        java.lang.Class<?> wildcardClass12 = node10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.childNode(100);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, (int) (short) -1, outputSettings16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        org.jsoup.nodes.Node node33 = documentType29.clone();
        org.jsoup.nodes.Node node34 = documentType29.parentNode();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType29.outerHtmlTail(stringBuilder35, (int) (byte) -1, outputSettings37);
        int int39 = documentType29.siblingIndex();
        boolean boolean40 = documentType10.equals((java.lang.Object) documentType29);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.clone();
        org.jsoup.nodes.Document document8 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = document8.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        java.lang.String str15 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (int) (byte) 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.clone();
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = document17.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node13 = node9.previousSibling();
        java.lang.String str15 = node9.attr("");
        org.jsoup.nodes.Node node16 = node9.parentNode();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("hi!");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        int int25 = documentType21.siblingIndex();
        java.lang.String str26 = documentType21.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodesCopy();
        org.jsoup.nodes.Node node30 = documentType21.attr("#doctype", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node9.after((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document26 = node9.ownerDocument();
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
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        int int12 = node9.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        java.lang.String str15 = node14.baseUri();
        org.jsoup.nodes.Node node16 = node14.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node16.parent();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
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
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node14.attr("#doctype");
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document20 = documentType17.ownerDocument();
        java.lang.String str21 = documentType17.nodeName();
        org.jsoup.nodes.Node node22 = documentType17.previousSibling();
        org.jsoup.nodes.Node node24 = documentType17.removeAttr("#doctype");
        int int25 = node24.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#doctype" + "'", str21, "#doctype");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node17.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.Class<?> wildcardClass8 = attributes7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean11 = documentType4.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType16.outerHtmlTail(stringBuilder28, (int) (byte) -1, outputSettings30);
        org.jsoup.nodes.Node node32 = documentType16.nextSibling();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType16.outerHtmlTail(stringBuilder33, (int) (short) 0, outputSettings35);
        int int37 = documentType16.childNodeSize();
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
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        java.lang.String str19 = documentType4.outerHtml();
        int int20 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node10.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node10.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node37.wrap("hi!");
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
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.jsoup.nodes.Attributes attributes23 = documentType16.attributes();
        documentType16.setBaseUri("");
        java.lang.String str26 = documentType16.toString();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        org.jsoup.nodes.Attributes attributes34 = documentType31.attributes();
        org.jsoup.nodes.Node node35 = documentType31.clone();
        int int36 = node35.siblingIndex();
        java.lang.String str37 = node35.outerHtml();
        org.jsoup.nodes.Node node38 = node35.parent();
        org.jsoup.nodes.Node node39 = node35.clone();
        boolean boolean41 = node35.hasAttr("#doctype");
        org.jsoup.nodes.Node node42 = node35.parent();
        org.jsoup.nodes.Node node43 = node35.nextSibling();
        org.jsoup.nodes.Node node44 = node35.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = documentType16.after(node44);
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
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str37, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node17.unwrap();
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
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        node13.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass16 = node13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.unwrap();
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
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.util.List<org.jsoup.nodes.Node> nodeList35 = node8.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        boolean boolean18 = node5.equals((java.lang.Object) node17);
        org.jsoup.nodes.Document document19 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = document19.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        java.lang.String str12 = node11.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        org.jsoup.nodes.Node node13 = node8.parent();
        org.jsoup.nodes.Document document14 = node8.ownerDocument();
        org.jsoup.nodes.Attributes attributes15 = node8.attributes();
        org.jsoup.nodes.Node node18 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        java.lang.Class<?> wildcardClass19 = node18.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        boolean boolean13 = documentType4.hasAttr("hi!");
        java.lang.String str14 = documentType4.baseUri();
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.after("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node30 = documentType29.clone();
        int int31 = node30.childNodeSize();
        org.jsoup.nodes.Node node32 = node30.previousSibling();
        org.jsoup.nodes.Node node34 = node30.removeAttr("#doctype");
        java.lang.String str35 = node34.toString();
        org.jsoup.nodes.Node node36 = node34.clone();
        java.lang.String str38 = node34.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node17.before(node34);
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.Node node13 = node9.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        int int9 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Document document11 = node5.ownerDocument();
        boolean boolean13 = node5.hasAttr("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node5.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = node13.clone();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        int int24 = node23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node23.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str32 = documentType30.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node33 = documentType30.previousSibling();
        java.lang.String str34 = documentType30.toString();
        org.jsoup.nodes.Node node35 = documentType30.parent();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType30.outerHtmlTail(stringBuilder36, (int) (short) -1, outputSettings38);
        boolean boolean40 = node23.equals((java.lang.Object) documentType30);
        java.lang.String str41 = node23.baseUri();
        java.lang.String str43 = node23.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node13.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (-1), outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node10.before("#doctype");
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
            documentType4.outerHtmlHead(stringBuilder17, (int) (byte) 10, outputSettings19);
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        java.lang.String str22 = documentType20.attr("hi!");
        java.lang.String str24 = documentType20.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node25 = documentType20.parentNode();
        java.lang.String str26 = documentType20.nodeName();
        java.lang.String str27 = documentType20.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.after((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        java.lang.String str10 = node5.toString();
        int int11 = node5.siblingIndex();
        org.jsoup.nodes.Document document12 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node5.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        boolean boolean21 = documentType17.hasAttr("");
        java.lang.String str23 = documentType17.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node24 = documentType17.clone();
        org.jsoup.nodes.Node node25 = documentType17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node12.after((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        java.lang.String str18 = node16.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = node16.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        int int7 = documentType4.siblingIndex();
        boolean boolean9 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        documentType4.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        java.lang.String str14 = node12.attr("hi!");
        boolean boolean16 = node12.hasAttr("");
        int int17 = node12.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node12.childNode(0);
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
            org.jsoup.nodes.Node node14 = node12.childNode((int) 'a');
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        org.jsoup.nodes.Node node30 = documentType16.previousSibling();
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
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("hi!");
        java.lang.String str16 = documentType4.attr("");
        java.lang.Class<?> wildcardClass17 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        org.jsoup.nodes.Document document23 = node22.ownerDocument();
        int int24 = node22.siblingIndex();
        node22.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes27 = node22.attributes();
        org.jsoup.nodes.Node node30 = node22.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean31 = node9.equals((java.lang.Object) node22);
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.Class<?> wildcardClass10 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node13.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node12.absUrl("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
            int int15 = document14.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        org.jsoup.nodes.Node node23 = node18.clone();
        org.jsoup.nodes.Node node25 = node23.removeAttr("hi!");
        org.jsoup.nodes.Node node26 = node23.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.before(node26);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.Node node13 = node9.attr("hi!", "");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        int int20 = node19.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node19.childNodes();
        java.lang.String str22 = node19.baseUri();
        node19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node9.before(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        org.jsoup.nodes.Node node39 = documentType35.clone();
        org.jsoup.nodes.Node node40 = documentType35.clone();
        java.lang.String str42 = documentType35.absUrl("hi!");
        java.lang.String str43 = documentType35.nodeName();
        java.lang.String str44 = documentType35.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node8.after((org.jsoup.nodes.Node) documentType35);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#doctype" + "'", str44, "#doctype");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        org.jsoup.nodes.Node node18 = documentType4.parent();
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.traverse(nodeVisitor19);
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.lang.String str21 = node5.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str21, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        org.jsoup.nodes.Node node28 = documentType4.clone();
        org.jsoup.nodes.Node node29 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType4.childNodesCopy();
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
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.lang.String str7 = node5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.Node node10 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean12 = node5.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str7, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        int int25 = node23.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node23.traverse(nodeVisitor26);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node38 = documentType37.clone();
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str45 = documentType43.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document46 = documentType43.ownerDocument();
        java.lang.String str47 = documentType43.nodeName();
        java.lang.String str48 = documentType43.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = documentType43.siblingNodes();
        java.lang.String str50 = documentType43.nodeName();
        org.jsoup.nodes.Node node51 = documentType43.parent();
        java.lang.String str52 = documentType43.nodeName();
        boolean boolean53 = node38.equals((java.lang.Object) documentType43);
        org.jsoup.nodes.Node node56 = documentType43.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = documentType15.before(node56);
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
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#doctype" + "'", str47, "#doctype");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#doctype" + "'", str50, "#doctype");
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#doctype" + "'", str52, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        org.jsoup.nodes.Document document26 = node8.ownerDocument();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        boolean boolean35 = documentType31.hasAttr("");
        java.lang.String str37 = documentType31.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node38 = documentType31.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node8.after(node38);
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
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str19 = node18.outerHtml();
        java.lang.String str20 = node18.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node27 = documentType24.previousSibling();
        java.lang.String str28 = documentType24.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType24.siblingNodes();
        org.jsoup.nodes.Attributes attributes30 = documentType24.attributes();
        java.lang.String str31 = documentType24.toString();
        org.jsoup.nodes.Node node34 = documentType24.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document35 = node34.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceWith(node34);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(document35);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node10.clone();
        java.lang.String str14 = node13.outerHtml();
        boolean boolean16 = node13.hasAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType13.previousSibling();
        java.lang.String str17 = documentType13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType13.siblingNodes();
        org.jsoup.nodes.Attributes attributes19 = documentType13.attributes();
        java.lang.String str20 = documentType13.toString();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType13.outerHtmlTail(stringBuilder21, 10, outputSettings23);
        java.lang.String str26 = documentType13.attr("hi!");
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        org.jsoup.nodes.Attributes attributes34 = documentType31.attributes();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        documentType31.outerHtmlTail(stringBuilder35, 10, outputSettings37);
        org.jsoup.nodes.Node node40 = documentType31.removeAttr("hi!");
        boolean boolean41 = documentType13.equals((java.lang.Object) documentType31);
        java.lang.String str43 = documentType31.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node46 = documentType31.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "hi!");
        java.lang.String str48 = node46.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = documentType4.before(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, 10, outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        org.jsoup.nodes.Node node35 = node8.parentNode();
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
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node10.clone();
        java.lang.String str14 = node13.outerHtml();
        org.jsoup.nodes.Node node15 = node13.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        int int10 = node9.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (short) 100, outputSettings15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        java.lang.String str19 = documentType4.nodeName();
        java.lang.String str21 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.nodes.Document document9 = node5.ownerDocument();
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodes();
        int int12 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        int int11 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int17 = documentType16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = node10.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        java.lang.String str10 = node5.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodesCopy();
        org.jsoup.nodes.Node node19 = node17.parentNode();
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        int int17 = documentType4.siblingIndex();
        documentType4.setBaseUri("hi!");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        org.jsoup.nodes.Node node18 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.wrap("");
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
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Document document20 = documentType16.ownerDocument();
        org.jsoup.nodes.Node node23 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.lang.String str25 = documentType16.attr("#doctype");
        boolean boolean26 = documentType4.equals((java.lang.Object) str25);
        boolean boolean28 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        node11.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        int int13 = node12.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node12.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.before("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType15.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        int int18 = documentType14.siblingIndex();
        org.jsoup.nodes.Node node19 = documentType14.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node8.after(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Document document11 = node5.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node21 = documentType16.previousSibling();
        java.lang.String str22 = documentType16.baseUri();
        org.jsoup.nodes.Node node23 = documentType16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType16.childNodesCopy();
        org.jsoup.nodes.Node node26 = documentType16.removeAttr("hi!");
        java.lang.Class<?> wildcardClass27 = node26.getClass();
        boolean boolean28 = node5.equals((java.lang.Object) wildcardClass27);
        java.lang.String str29 = node5.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        java.lang.String str34 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder35, (int) 'a', outputSettings37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        int int11 = node5.childNodeSize();
        org.jsoup.nodes.Attributes attributes12 = node5.attributes();
        org.jsoup.nodes.Node node13 = node5.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node5.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        java.lang.String str18 = node15.attr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node20.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = node5.outerHtml();
        org.jsoup.nodes.Node node9 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = node5.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) 1, outputSettings14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.lang.String str11 = node5.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str20 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node21 = documentType16.parentNode();
        java.lang.String str22 = documentType16.nodeName();
        org.jsoup.nodes.Node node23 = documentType16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType16.siblingNodes();
        boolean boolean25 = node5.equals((java.lang.Object) nodeList24);
        boolean boolean27 = node5.hasAttr("");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType11.attr("hi!");
        org.jsoup.nodes.Attributes attributes14 = documentType11.attributes();
        int int15 = documentType11.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType11.previousSibling();
        java.lang.String str17 = documentType11.baseUri();
        org.jsoup.nodes.Node node18 = documentType11.parentNode();
        org.jsoup.nodes.Attributes attributes19 = documentType11.attributes();
        int int20 = documentType11.siblingIndex();
        boolean boolean22 = documentType11.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType19.childNodesCopy();
        boolean boolean26 = documentType19.hasAttr("hi!");
        java.lang.String str27 = documentType19.nodeName();
        int int28 = documentType19.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node14.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
            org.jsoup.nodes.Node node17 = node11.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        org.jsoup.nodes.Node node11 = node8.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str12 = node8.outerHtml();
        boolean boolean14 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        java.lang.String str16 = node11.baseUri();
        java.lang.String str17 = node11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node11.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str19 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int5 = documentType4.siblingIndex();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str12 = documentType4.attr("");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        int int21 = documentType17.siblingIndex();
        java.lang.String str22 = documentType17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType17.childNodesCopy();
        java.lang.String str25 = documentType17.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str26 = documentType17.outerHtml();
        java.lang.String str27 = documentType17.nodeName();
        int int28 = documentType17.childNodeSize();
        org.jsoup.nodes.Node node29 = documentType17.parentNode();
        java.lang.StringBuilder stringBuilder30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        documentType17.outerHtmlTail(stringBuilder30, 10, outputSettings32);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">" + "'", str5, "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node14.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
            org.jsoup.nodes.Node node21 = node9.unwrap();
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType13.traverse(nodeVisitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str15 = node9.attr("#doctype");
        java.lang.String str16 = node9.toString();
        org.jsoup.nodes.Attributes attributes17 = node9.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Node node21 = documentType17.clone();
        org.jsoup.nodes.Node node22 = documentType17.clone();
        org.jsoup.nodes.Attributes attributes23 = node22.attributes();
        int int24 = node22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node22.childNodesCopy();
        java.lang.String str26 = node22.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = documentType4.after(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }
}

