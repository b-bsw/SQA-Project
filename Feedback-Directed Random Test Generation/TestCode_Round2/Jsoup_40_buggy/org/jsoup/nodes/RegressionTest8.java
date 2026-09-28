package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node5.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        boolean boolean15 = node13.hasAttr("");
        java.lang.String str16 = node13.outerHtml();
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        java.lang.String str18 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder20, (int) '4', outputSettings22);
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.nextSibling();
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
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (int) (short) 10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        org.jsoup.nodes.Node node12 = node8.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        java.lang.String str49 = documentType47.attr("hi!");
        org.jsoup.nodes.Attributes attributes50 = documentType47.attributes();
        org.jsoup.nodes.Node node51 = documentType47.clone();
        int int52 = node51.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = node51.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType58 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str60 = documentType58.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node61 = documentType58.previousSibling();
        java.lang.String str62 = documentType58.toString();
        org.jsoup.nodes.Node node63 = documentType58.parent();
        java.lang.StringBuilder stringBuilder64 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = null;
        documentType58.outerHtmlTail(stringBuilder64, (int) (short) -1, outputSettings66);
        boolean boolean68 = node51.equals((java.lang.Object) documentType58);
        org.jsoup.nodes.Node node70 = node51.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str71 = node51.baseUri();
        boolean boolean73 = node51.hasAttr("#doctype");
        org.jsoup.nodes.Node node74 = node51.parent();
        int int75 = node51.childNodeSize();
        java.lang.String str76 = node51.outerHtml();
        org.jsoup.nodes.Attributes attributes77 = node51.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str62, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str76, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes77);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType16.parent();
        boolean boolean18 = node5.equals((java.lang.Object) documentType16);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        org.jsoup.nodes.Node node28 = documentType24.clone();
        java.lang.String str29 = documentType24.outerHtml();
        org.jsoup.nodes.Node node30 = documentType24.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType24.siblingNodes();
        documentType24.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int34 = documentType24.childNodeSize();
        org.jsoup.nodes.Node node37 = documentType24.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node11 = node9.clone();
        org.jsoup.nodes.Node node12 = node9.clone();
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        java.lang.String str16 = node14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = node14.attributes();
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
        java.lang.String str44 = node26.baseUri();
        java.lang.String str46 = node26.attr("");
        java.lang.String str47 = node26.outerHtml();
        int int48 = node26.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith(node26);
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
        org.junit.Assert.assertNotNull(attributes17);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str47, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        boolean boolean20 = node18.hasAttr("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.siblingNodes();
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
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        int int30 = node14.siblingIndex();
        org.jsoup.nodes.Node node33 = node14.attr("<!DOCTYPE hi! \"hi!\">", "#doctype");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        int int14 = documentType4.childNodeSize();
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
        int int42 = node23.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = documentType4.before(node23);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        org.jsoup.nodes.Node node18 = node9.previousSibling();
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
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.after("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 1, outputSettings17);
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
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        int int13 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        java.lang.String str12 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str13 = documentType4.baseUri();
        int int14 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        org.jsoup.nodes.Document document21 = node20.ownerDocument();
        int int22 = node20.siblingIndex();
        org.jsoup.nodes.Node node23 = node20.nextSibling();
        int int24 = node20.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.after(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.lang.String str20 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        int int11 = documentType4.childNodeSize();
        java.lang.String str12 = documentType4.nodeName();
        int int13 = documentType4.siblingIndex();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        org.jsoup.nodes.Node node23 = documentType18.clone();
        org.jsoup.nodes.Attributes attributes24 = node23.attributes();
        java.lang.String str26 = node23.attr("#doctype");
        org.jsoup.nodes.Node node27 = node23.clone();
        org.jsoup.nodes.Node node28 = node27.parent();
        org.jsoup.nodes.Node node30 = node27.removeAttr("hi!");
        boolean boolean32 = node27.hasAttr("");
        int int33 = node27.childNodeSize();
        org.jsoup.nodes.Node node34 = node27.nextSibling();
        org.jsoup.nodes.Node node36 = node27.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node37 = node36.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node36.siblingNodes();
        java.lang.String str39 = node36.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str39, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.before("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        java.lang.String str32 = documentType16.baseUri();
        org.jsoup.nodes.Node node34 = documentType16.removeAttr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
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
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        java.lang.String str36 = documentType15.attr("hi!");
        documentType15.setBaseUri("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.lang.String str10 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = node5.toString();
        java.lang.String str12 = node5.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node14.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.after(node14);
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
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes18 = node17.attributes();
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        org.jsoup.nodes.Node node32 = node8.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) documentType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        java.lang.String str19 = node14.baseUri();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        boolean boolean28 = node26.hasAttr("<!DOCTYPE hi! \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str15 = node8.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        int int24 = documentType20.siblingIndex();
        org.jsoup.nodes.Node node25 = documentType20.previousSibling();
        java.lang.String str26 = documentType20.baseUri();
        org.jsoup.nodes.Node node27 = documentType20.parentNode();
        java.lang.String str28 = documentType20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType20.childNodesCopy();
        boolean boolean30 = node8.equals((java.lang.Object) documentType20);
        org.jsoup.nodes.Document document31 = documentType20.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(document31);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        java.lang.String str27 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.unwrap();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        int int18 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, 100, outputSettings21);
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
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = documentType4.absUrl("");
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
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        java.lang.String str20 = node18.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str21 = node18.toString();
        java.lang.String str23 = node18.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str24 = node18.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        boolean boolean15 = node5.hasAttr("#doctype");
        boolean boolean17 = node5.hasAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        org.jsoup.nodes.Node node11 = node8.removeAttr("hi!");
        java.lang.String str12 = node8.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean13 = node8.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "");
        int int9 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        int int13 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = node8.absUrl("hi!");
        java.lang.String str12 = node8.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        int int21 = documentType17.siblingIndex();
        java.lang.String str22 = documentType17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType17.childNodesCopy();
        java.lang.String str24 = documentType17.nodeName();
        org.jsoup.nodes.Node node27 = documentType17.attr("#doctype", "hi!");
        int int28 = node27.siblingIndex();
        node27.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("hi!");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        int int39 = documentType35.siblingIndex();
        int int40 = documentType35.childNodeSize();
        boolean boolean41 = node27.equals((java.lang.Object) documentType35);
        boolean boolean42 = node8.equals((java.lang.Object) documentType35);
        java.lang.String str43 = documentType35.nodeName();
        java.lang.String str44 = documentType35.nodeName();
        org.jsoup.nodes.Node node45 = documentType35.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#doctype" + "'", str44, "#doctype");
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        java.lang.String str23 = documentType18.attr("hi!");
        java.lang.String str25 = documentType18.attr("#doctype");
        org.jsoup.nodes.Node node27 = documentType18.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str28 = documentType18.nodeName();
        boolean boolean30 = documentType18.hasAttr("hi!");
        java.lang.String str32 = documentType18.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        boolean boolean33 = documentType4.equals((java.lang.Object) str32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node14 = node13.clone();
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) '4', outputSettings13);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        int int18 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.previousSibling();
        org.jsoup.nodes.Attributes attributes13 = node9.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.childNodesCopy();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        java.lang.String str12 = node8.toString();
        org.jsoup.nodes.Node node15 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = node8.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node8.setBaseUri("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node33 = documentType32.clone();
        org.jsoup.nodes.Node node34 = documentType32.parent();
        org.jsoup.nodes.Document document35 = documentType32.ownerDocument();
        java.lang.StringBuilder stringBuilder36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        documentType32.outerHtmlTail(stringBuilder36, (int) (byte) 0, outputSettings38);
        java.lang.String str41 = documentType32.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str42 = documentType32.nodeName();
        java.lang.String str43 = documentType32.nodeName();
        org.jsoup.nodes.Node node44 = documentType32.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = documentType4.before(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#doctype" + "'", str42, "#doctype");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#doctype" + "'", str43, "#doctype");
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        java.lang.String str17 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.childNodesCopy();
        java.lang.String str13 = node9.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = node9.absUrl("#doctype");
        int int16 = node9.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        documentType15.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType15.childNodesCopy();
        java.lang.Class<?> wildcardClass34 = nodeList33.getClass();
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
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        java.lang.String str17 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 1, outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.parentNode();
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
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str15 = documentType4.absUrl("#doctype");
        int int16 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node17 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        org.jsoup.nodes.Node node20 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        int int17 = documentType13.siblingIndex();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        boolean boolean19 = documentType4.equals((java.lang.Object) node18);
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, 0, outputSettings22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        java.lang.String str15 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node34 = documentType33.clone();
        org.jsoup.nodes.Node node35 = documentType33.parent();
        org.jsoup.nodes.Document document36 = documentType33.ownerDocument();
        org.jsoup.nodes.Node node38 = documentType33.removeAttr("hi!");
        java.lang.String str39 = node38.outerHtml();
        java.lang.String str40 = node38.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = node28.before(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str39, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType4.outerHtmlTail(stringBuilder20, (int) (byte) 100, outputSettings22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        int int31 = documentType15.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = documentType15.before("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) '4', outputSettings18);
        org.jsoup.nodes.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node20);
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
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node15 = node11.attr("#doctype", "#doctype");
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node11.before((org.jsoup.nodes.Node) documentType20);
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
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str41 = documentType39.attr("hi!");
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        java.lang.StringBuilder stringBuilder43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        documentType39.outerHtmlTail(stringBuilder43, 10, outputSettings45);
        org.jsoup.nodes.Node node48 = documentType39.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = documentType39.siblingNodes();
        int int50 = documentType39.siblingIndex();
        boolean boolean51 = documentType22.equals((java.lang.Object) documentType39);
        org.jsoup.nodes.Node node52 = documentType39.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node52.remove();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 0, outputSettings15);
        int int17 = documentType4.childNodeSize();
        java.lang.String str19 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        int int20 = node14.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node14.childNode(0);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) 'a', outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str13 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node14 = documentType4.parent();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        java.lang.String str27 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes28 = documentType4.attributes();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        int int20 = documentType4.siblingIndex();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder21, (int) (short) 0, outputSettings23);
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node14.parentNode();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        int int24 = documentType20.siblingIndex();
        java.lang.String str25 = documentType20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType20.childNodesCopy();
        org.jsoup.nodes.Node node29 = documentType20.attr("#doctype", "#doctype");
        java.lang.String str30 = documentType20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType20.childNodes();
        int int32 = documentType20.siblingIndex();
        boolean boolean33 = node14.equals((java.lang.Object) documentType20);
        org.jsoup.nodes.Node node34 = documentType20.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        java.lang.String str28 = documentType23.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType23.childNodesCopy();
        java.lang.String str30 = documentType23.nodeName();
        java.lang.String str31 = documentType23.baseUri();
        java.lang.String str32 = documentType23.outerHtml();
        org.jsoup.nodes.Node node33 = documentType23.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node13.after(node33);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.nodeName();
        java.lang.String str15 = documentType4.toString();
        org.jsoup.nodes.Node node16 = documentType4.parent();
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
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        java.lang.String str15 = documentType4.baseUri();
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = node10.childNodeSize();
        org.jsoup.nodes.Node node14 = node10.attr("#doctype", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str16 = node10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = node10.removeAttr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean16 = node14.hasAttr("#doctype");
        java.lang.String str17 = node14.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.attr("");
        org.jsoup.nodes.Node node15 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        int int18 = documentType4.childNodeSize();
        boolean boolean20 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str21 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        node13.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        int int8 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.childNodesCopy();
        org.jsoup.nodes.Document document10 = node5.ownerDocument();
        org.jsoup.nodes.Node node11 = node5.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (byte) -1, outputSettings14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) (short) -1, outputSettings18);
        java.lang.String str21 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = node5.wrap("<!DOCTYPE hi! \"hi!\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        org.jsoup.nodes.Node node25 = documentType21.clone();
        org.jsoup.nodes.Node node26 = documentType21.clone();
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        int int28 = node26.siblingIndex();
        java.lang.String str29 = node26.outerHtml();
        java.lang.String str31 = node26.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node32 = node26.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node16.before(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) 100, outputSettings17);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        int int24 = node23.siblingIndex();
        java.lang.String str25 = node23.outerHtml();
        org.jsoup.nodes.Node node26 = node23.parent();
        org.jsoup.nodes.Node node27 = node23.clone();
        boolean boolean29 = node23.hasAttr("#doctype");
        org.jsoup.nodes.Node node30 = node23.parent();
        org.jsoup.nodes.Node node31 = node23.clone();
        java.lang.String str32 = node31.baseUri();
        boolean boolean33 = documentType4.equals((java.lang.Object) str32);
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType4.outerHtmlTail(stringBuilder34, (int) (short) -1, outputSettings36);
        java.lang.StringBuilder stringBuilder38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        documentType4.outerHtmlTail(stringBuilder38, (int) (byte) 1, outputSettings40);
        java.lang.String str43 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str44 = documentType4.nodeName();
        org.jsoup.nodes.Node node46 = documentType4.wrap("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#doctype" + "'", str44, "#doctype");
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        int int5 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) 'a', outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes36 = documentType33.attributes();
        org.jsoup.nodes.Node node39 = documentType33.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.lang.String str9 = node5.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) -1, outputSettings19);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        org.jsoup.nodes.Node node30 = node14.parent();
        int int31 = node14.childNodeSize();
        org.jsoup.nodes.Node node32 = node14.previousSibling();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        org.jsoup.nodes.Node node29 = node14.previousSibling();
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
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.toString();
        java.lang.String str12 = node5.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node5.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node18 = node5.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node19 = node5.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = node19.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            node11.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str7 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.nodes.Node node9 = node5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) (short) 0, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        org.jsoup.nodes.Attributes attributes17 = node16.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        java.lang.String str19 = documentType4.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        java.lang.String str10 = node5.toString();
        int int11 = node5.siblingIndex();
        int int12 = node5.childNodeSize();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        java.lang.String str23 = node22.toString();
        org.jsoup.nodes.Node node24 = node22.clone();
        java.lang.String str25 = node24.outerHtml();
        java.lang.String str27 = node24.attr("hi!");
        java.lang.String str28 = node24.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node24.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node24.siblingNodes();
        int int31 = node24.childNodeSize();
        java.lang.String str32 = node24.outerHtml();
        boolean boolean33 = node5.equals((java.lang.Object) node24);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
            java.lang.String str17 = node16.outerHtml();
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
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        int int11 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node21 = documentType16.previousSibling();
        java.lang.String str22 = documentType16.baseUri();
        org.jsoup.nodes.Node node23 = documentType16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType16.childNodesCopy();
        org.jsoup.nodes.Node node26 = documentType16.removeAttr("hi!");
        java.lang.String str28 = documentType16.attr("");
        boolean boolean30 = documentType16.hasAttr("#doctype");
        int int31 = documentType16.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType16.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        java.lang.String str27 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node28 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node28.clone();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = document15.removeAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) -1, outputSettings19);
        boolean boolean22 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str23 = documentType4.outerHtml();
        org.jsoup.nodes.Node node24 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node17.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.lang.String str14 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 10, outputSettings18);
        java.lang.Class<?> wildcardClass20 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        node19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node19.childNodesCopy();
        int int23 = node19.childNodeSize();
        org.jsoup.nodes.Node node25 = node19.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean26 = documentType4.equals((java.lang.Object) node19);
        java.lang.String str28 = node19.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node14 = node12.wrap("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = node11.parentNode();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        java.lang.String str23 = node22.toString();
        org.jsoup.nodes.Node node24 = node22.clone();
        java.lang.String str25 = node24.outerHtml();
        java.lang.String str27 = node24.attr("hi!");
        java.lang.String str28 = node24.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node24.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node12.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "#doctype");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        int int11 = documentType4.childNodeSize();
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        int int12 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) -1, outputSettings17);
        java.lang.String str20 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        int int10 = node8.siblingIndex();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 0, outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
            org.jsoup.nodes.Node node24 = node9.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        java.lang.String str14 = documentType4.outerHtml();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) (byte) 100, outputSettings20);
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str11 = documentType4.attr("hi!");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.jsoup.nodes.Node node42 = node23.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str43 = node23.baseUri();
        boolean boolean45 = node23.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = node23.childNodes();
        org.jsoup.nodes.Node node48 = node23.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = node48.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
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
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeList49);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">" + "'", str6, "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "#doctype", "", "");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Node node14 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = document15.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        int int14 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) 'a', outputSettings18);
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        java.lang.String str26 = documentType4.outerHtml();
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
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "hi!");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.nodes.Attributes attributes14 = documentType4.attributes();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        documentType4.setBaseUri("");
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder11, (int) (byte) 0, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        documentType4.setBaseUri("hi!");
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Node node15 = node12.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document16 = node12.ownerDocument();
        java.lang.String str18 = node12.attr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        java.lang.String str29 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        org.jsoup.nodes.Node node38 = node37.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = node37.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList39);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Node node11 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int12 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node5.childNodesCopy();
        int int14 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node5.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "#doctype");
        documentType4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str9 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int10 = node5.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) '#', outputSettings7);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.baseUri();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType14.previousSibling();
        java.lang.String str18 = documentType14.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType14.siblingNodes();
        org.jsoup.nodes.Attributes attributes20 = documentType14.attributes();
        org.jsoup.nodes.Node node22 = documentType14.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        org.jsoup.nodes.Node node11 = node8.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node13 = node8.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node13.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.lang.String str29 = node28.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node28.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        java.lang.String str18 = node17.baseUri();
        java.lang.String str20 = node17.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.String str22 = node17.attr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.String str15 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.parent();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        int int5 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 0, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        java.lang.String str12 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes13 = node8.attributes();
        org.jsoup.nodes.Document document14 = node8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.unwrap();
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
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        int int11 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        int int13 = node8.childNodeSize();
        java.lang.String str14 = node8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node8.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.toString();
        int int11 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node9 = node5.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = node5.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        java.lang.String str18 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType14.parentNode();
        boolean boolean21 = documentType14.hasAttr("#doctype");
        org.jsoup.nodes.Node node22 = documentType14.parent();
        org.jsoup.nodes.Node node23 = documentType14.nextSibling();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node29 = documentType28.clone();
        node29.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        node29.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass34 = node29.getClass();
        boolean boolean35 = documentType14.equals((java.lang.Object) node29);
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Document document13 = node9.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        org.jsoup.nodes.Node node18 = node11.parent();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        org.jsoup.nodes.Node node28 = documentType23.clone();
        org.jsoup.nodes.Node node30 = node28.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int31 = node30.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node30.childNodesCopy();
        boolean boolean33 = node11.equals((java.lang.Object) node30);
        int int34 = node11.siblingIndex();
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        org.jsoup.nodes.Node node18 = node11.nextSibling();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        org.jsoup.nodes.Node node28 = documentType23.clone();
        org.jsoup.nodes.Attributes attributes29 = node28.attributes();
        java.lang.String str31 = node28.attr("#doctype");
        node28.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean35 = node28.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node11.after(node28);
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node10 = documentType9.clone();
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        boolean boolean12 = documentType4.equals((java.lang.Object) node10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        boolean boolean32 = documentType15.hasAttr("#doctype");
        int int33 = documentType15.siblingIndex();
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        int int11 = node5.childNodeSize();
        org.jsoup.nodes.Attributes attributes12 = node5.attributes();
        org.jsoup.nodes.Node node13 = node5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        boolean boolean21 = node13.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType12.baseUri();
        boolean boolean14 = documentType4.equals((java.lang.Object) str13);
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document22 = documentType19.ownerDocument();
        java.lang.String str23 = documentType19.baseUri();
        java.lang.String str24 = documentType19.baseUri();
        java.lang.String str25 = documentType19.nodeName();
        int int26 = documentType19.siblingIndex();
        org.jsoup.nodes.Node node27 = documentType19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        int int58 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = documentType4.before("");
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        node7.setBaseUri("");
        java.lang.String str10 = node7.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        org.jsoup.nodes.Document document26 = documentType16.ownerDocument();
        int int27 = documentType16.siblingIndex();
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
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        java.lang.String str27 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node33 = documentType32.clone();
        node33.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node36 = node33.nextSibling();
        org.jsoup.nodes.Node node39 = node33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node40 = node33.clone();
        org.jsoup.nodes.Node node41 = node40.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node41);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        // The following exception was thrown during execution in test generation
        try {
            node20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.previousSibling();
        java.lang.String str11 = node5.baseUri();
        java.lang.String str13 = node5.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node14 = node5.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node15 = documentType14.clone();
        org.jsoup.nodes.Node node18 = documentType14.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node8.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int12 = node8.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node8.childNode((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
            org.jsoup.nodes.Node node14 = document12.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.attr("#doctype");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) ' ', outputSettings12);
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 100, outputSettings16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node14 = documentType4.clone();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node10 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.toString();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.String str15 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        documentType4.setBaseUri("#doctype");
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, (int) (byte) 1, outputSettings17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        org.jsoup.nodes.Node node21 = node13.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node13.after("");
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        org.jsoup.nodes.Node node11 = node9.parentNode();
        org.jsoup.nodes.Node node12 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        org.jsoup.nodes.Node node33 = node8.parentNode();
        java.lang.String str35 = node8.absUrl("<!DOCTYPE hi! \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node8.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        java.lang.String str29 = node27.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.clone();
        int int15 = node14.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        int int30 = node14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node14.childNodes();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node24.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        org.jsoup.nodes.Node node15 = node13.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = node13.removeAttr("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.lang.String str15 = documentType4.nodeName();
        boolean boolean17 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str18 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        java.lang.String str13 = node8.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node8.traverse(nodeVisitor14);
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
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        java.lang.String str32 = documentType15.toString();
        java.lang.StringBuilder stringBuilder33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        documentType15.outerHtmlTail(stringBuilder33, (int) 'a', outputSettings35);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        boolean boolean11 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = documentType16.previousSibling();
        java.lang.String str20 = documentType16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType16.siblingNodes();
        org.jsoup.nodes.Attributes attributes22 = documentType16.attributes();
        java.lang.String str23 = documentType16.toString();
        org.jsoup.nodes.Node node26 = documentType16.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node27 = node26.previousSibling();
        java.lang.String str29 = node26.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node5.before(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        node11.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node41 = node11.previousSibling();
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
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType13.previousSibling();
        java.lang.String str17 = documentType13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType13.siblingNodes();
        org.jsoup.nodes.Attributes attributes19 = documentType13.attributes();
        org.jsoup.nodes.Node node21 = documentType13.removeAttr("hi!");
        documentType13.setBaseUri("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node7.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.clone();
        org.jsoup.nodes.Document document8 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document8.previousSibling();
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
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Document document7 = node5.ownerDocument();
        java.lang.String str8 = node5.outerHtml();
        java.lang.String str9 = node5.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node5.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node9.unwrap();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str16 = documentType4.nodeName();
        org.jsoup.nodes.Node node17 = documentType4.parent();
        org.jsoup.nodes.Document document18 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node13 = node9.parent();
        org.jsoup.nodes.Node node14 = node9.clone();
        java.lang.String str15 = node9.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        int int11 = documentType4.childNodeSize();
        int int12 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Node node21 = documentType17.clone();
        org.jsoup.nodes.Node node22 = documentType17.clone();
        org.jsoup.nodes.Attributes attributes23 = node22.attributes();
        java.lang.String str25 = node22.attr("#doctype");
        org.jsoup.nodes.Node node26 = node22.clone();
        java.lang.String str27 = node22.toString();
        java.lang.String str28 = node22.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node22);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node16 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str17 = node9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.Node node10 = node8.removeAttr("#doctype");
        int int11 = node8.childNodeSize();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        java.lang.String str20 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str22 = documentType16.attr("");
        org.jsoup.nodes.Node node24 = documentType16.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType16.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node8.after((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node13 = node9.parent();
        java.lang.String str14 = node9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        java.lang.String str30 = documentType15.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType15.traverse(nodeVisitor31);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str7, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.baseUri();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">" + "'", str7, "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        org.jsoup.nodes.Node node17 = documentType4.clone();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.baseUri();
        int int10 = documentType4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.before("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        org.jsoup.nodes.Node node24 = node9.clone();
        org.jsoup.nodes.Node node25 = node24.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node24.before("");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = node8.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node18 = node16.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.Node node15 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = node8.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        org.jsoup.nodes.Attributes attributes57 = node25.attributes();
        java.lang.String str58 = node25.outerHtml();
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
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str58, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "#doctype");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str7 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("hi!");
        java.lang.String str17 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType13.parentNode();
        java.lang.String str19 = documentType13.nodeName();
        java.lang.String str20 = documentType13.toString();
        java.lang.String str21 = documentType13.toString();
        org.jsoup.nodes.Node node23 = documentType13.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.after(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        org.jsoup.nodes.Document document24 = documentType20.ownerDocument();
        org.jsoup.nodes.Node node26 = documentType20.removeAttr("#doctype");
        java.lang.String str27 = documentType20.baseUri();
        org.jsoup.nodes.Attributes attributes28 = documentType20.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        java.lang.String str15 = node9.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str17 = node9.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        int int7 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodes();
        int int9 = node5.childNodeSize();
        java.lang.String str11 = node5.attr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
        int int27 = documentType16.siblingIndex();
        org.jsoup.nodes.Node node28 = documentType16.nextSibling();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        java.lang.String str29 = documentType15.attr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        org.jsoup.nodes.Node node13 = node12.previousSibling();
        boolean boolean15 = node12.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = node12.nextSibling();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = node16.equals((java.lang.Object) "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str14 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType10.previousSibling();
        java.lang.String str15 = documentType10.absUrl("hi!");
        java.lang.String str16 = documentType10.nodeName();
        int int17 = documentType10.childNodeSize();
        int int18 = documentType10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType10.childNodes();
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        documentType10.outerHtmlTail(stringBuilder20, (int) (short) 0, outputSettings22);
        int int24 = documentType10.childNodeSize();
        java.lang.String str25 = documentType10.outerHtml();
        org.jsoup.nodes.Node node26 = documentType10.parentNode();
        boolean boolean27 = documentType4.equals((java.lang.Object) node26);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        org.jsoup.nodes.Attributes attributes18 = node9.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node9.unwrap();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        java.lang.String str28 = documentType23.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType23.childNodesCopy();
        java.lang.String str30 = documentType23.nodeName();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType23.outerHtmlTail(stringBuilder31, (int) (byte) -1, outputSettings33);
        java.lang.String str35 = documentType23.baseUri();
        java.lang.String str37 = documentType23.attr("");
        org.jsoup.nodes.Node node38 = documentType23.clone();
        java.lang.StringBuilder stringBuilder39 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = null;
        documentType23.outerHtmlTail(stringBuilder39, (int) (short) -1, outputSettings41);
        org.jsoup.nodes.Node node43 = documentType23.parent();
        org.jsoup.nodes.Node node44 = documentType23.nextSibling();
        boolean boolean45 = node18.equals((java.lang.Object) documentType23);
        int int46 = documentType23.childNodeSize();
        java.lang.StringBuilder stringBuilder47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType23.outerHtmlHead(stringBuilder47, (int) (short) 10, outputSettings49);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        node9.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node36 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node36.traverse(nodeVisitor37);
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
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        node5.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        org.jsoup.nodes.Node node23 = documentType19.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node23.previousSibling();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = node8.absUrl("hi!");
        java.lang.String str12 = node8.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        int int21 = documentType17.siblingIndex();
        java.lang.String str22 = documentType17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType17.childNodesCopy();
        java.lang.String str24 = documentType17.nodeName();
        org.jsoup.nodes.Node node27 = documentType17.attr("#doctype", "hi!");
        int int28 = node27.siblingIndex();
        node27.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("hi!");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        int int39 = documentType35.siblingIndex();
        int int40 = documentType35.childNodeSize();
        boolean boolean41 = node27.equals((java.lang.Object) documentType35);
        boolean boolean42 = node8.equals((java.lang.Object) documentType35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node8.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        int int15 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "hi!", "#doctype");
        java.lang.String str13 = documentType12.baseUri();
        org.jsoup.nodes.Node node14 = documentType12.parentNode();
        boolean boolean15 = documentType4.equals((java.lang.Object) documentType12);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        int int5 = documentType4.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.attr("");
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        int int12 = node11.siblingIndex();
        int int13 = node11.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        java.lang.String str14 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        org.jsoup.nodes.Node node38 = documentType15.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        java.lang.String str19 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        java.lang.String str18 = node17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node17.childNodes();
        node17.setBaseUri("<!DOCTYPE hi! \"hi!\">");
        java.lang.Class<?> wildcardClass23 = node17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Attributes attributes12 = node11.attributes();
        java.lang.Object obj13 = null;
        boolean boolean14 = node11.equals(obj13);
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        org.jsoup.nodes.Node node21 = documentType19.parent();
        org.jsoup.nodes.Node node22 = documentType19.parent();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType19.childNodesCopy();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType19.outerHtmlTail(stringBuilder25, 0, outputSettings27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node11.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) '#', outputSettings14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, (int) 'a', outputSettings18);
        boolean boolean21 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str8 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (byte) 100, outputSettings11);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        java.lang.String str14 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.jsoup.nodes.Node node16 = documentType4.parent();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, 10, outputSettings19);
        int int21 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        java.lang.String str20 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        int int12 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType4.outerHtmlTail(stringBuilder18, (int) (byte) 1, outputSettings20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        boolean boolean11 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            node5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        int int7 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("#doctype");
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
        documentType30.setBaseUri("hi!");
        org.jsoup.nodes.Node node43 = documentType30.previousSibling();
        int int44 = documentType30.siblingIndex();
        java.lang.String str45 = documentType30.outerHtml();
        java.lang.String str46 = documentType30.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = documentType30.childNodesCopy();
        org.jsoup.nodes.Node node49 = documentType30.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str51 = documentType30.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = node14.after((org.jsoup.nodes.Node) documentType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str45, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#doctype" + "'", str46, "#doctype");
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 1, outputSettings11);
        int int13 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = document14.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
            org.jsoup.nodes.Node node20 = node17.after("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        int int13 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        node19.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node19.childNodesCopy();
        int int23 = node19.childNodeSize();
        org.jsoup.nodes.Node node25 = node19.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        boolean boolean26 = documentType4.equals((java.lang.Object) node19);
        org.jsoup.nodes.Node node27 = node19.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        java.lang.String str9 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) 100, outputSettings12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str9, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        java.lang.String str38 = documentType15.absUrl("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int39 = documentType15.childNodeSize();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        java.lang.String str17 = node13.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        org.jsoup.nodes.Node node18 = documentType14.clone();
        int int19 = node18.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node18.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str27 = documentType25.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node28 = documentType25.previousSibling();
        java.lang.String str29 = documentType25.toString();
        org.jsoup.nodes.Node node30 = documentType25.parent();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType25.outerHtmlTail(stringBuilder31, (int) (short) -1, outputSettings33);
        boolean boolean35 = node18.equals((java.lang.Object) documentType25);
        int int36 = node18.siblingIndex();
        boolean boolean37 = documentType4.equals((java.lang.Object) int36);
        int int38 = documentType4.childNodeSize();
        documentType4.setBaseUri("");
        org.jsoup.select.NodeVisitor nodeVisitor41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.traverse(nodeVisitor41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        java.lang.String str35 = documentType22.attr("hi!");
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str42 = documentType40.attr("hi!");
        org.jsoup.nodes.Attributes attributes43 = documentType40.attributes();
        java.lang.StringBuilder stringBuilder44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        documentType40.outerHtmlTail(stringBuilder44, 10, outputSettings46);
        org.jsoup.nodes.Node node49 = documentType40.removeAttr("hi!");
        boolean boolean50 = documentType22.equals((java.lang.Object) documentType40);
        java.lang.String str52 = documentType40.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node53 = documentType40.nextSibling();
        org.jsoup.nodes.Node node54 = documentType40.clone();
        // The following exception was thrown during execution in test generation
        try {
            node13.replaceWith((org.jsoup.nodes.Node) documentType40);
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
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        boolean boolean10 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes11 = node5.attributes();
        org.jsoup.nodes.Node node12 = node5.clone();
        java.lang.String str14 = node12.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        int int15 = documentType4.siblingIndex();
        boolean boolean17 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) (short) 100, outputSettings20);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        boolean boolean13 = node8.hasAttr("");
        org.jsoup.nodes.Node node14 = node8.previousSibling();
        java.lang.String str16 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node8.childNodesCopy();
        org.jsoup.nodes.Node node18 = node8.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.jsoup.nodes.Document document10 = node8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.String str15 = documentType4.nodeName();
        int int16 = documentType4.siblingIndex();
        int int17 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.clone();
        java.lang.String str12 = node5.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = node5.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        documentType4.outerHtmlTail(stringBuilder6, (int) '4', outputSettings8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = documentType4.nodeName();
        boolean boolean16 = documentType4.hasAttr("hi!");
        java.lang.String str17 = documentType4.nodeName();
        java.lang.String str19 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.after("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        int int19 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node20 = documentType15.previousSibling();
        java.lang.String str21 = documentType15.baseUri();
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType15.outerHtmlTail(stringBuilder22, (int) (short) -1, outputSettings24);
        java.lang.StringBuilder stringBuilder26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        documentType15.outerHtmlTail(stringBuilder26, (int) (short) 10, outputSettings28);
        int int30 = documentType15.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before((org.jsoup.nodes.Node) documentType15);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, 1, outputSettings19);
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
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        java.lang.String str12 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str13 = documentType4.baseUri();
        int int14 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.nodeName();
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.lang.String str10 = node5.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = node5.toString();
        java.lang.String str12 = node5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node5.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.nodes.Node node11 = node9.clone();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node14 = node12.wrap("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.lang.String str12 = node5.absUrl("hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        node5.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Attributes attributes20 = node5.attributes();
        boolean boolean22 = node5.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str24 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        java.lang.String str36 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType14.previousSibling();
        java.lang.String str19 = documentType14.absUrl("hi!");
        org.jsoup.nodes.Node node21 = documentType14.removeAttr("#doctype");
        boolean boolean22 = documentType4.equals((java.lang.Object) "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node14.parentNode();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        int int24 = documentType20.siblingIndex();
        java.lang.String str25 = documentType20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType20.childNodesCopy();
        org.jsoup.nodes.Node node29 = documentType20.attr("#doctype", "#doctype");
        java.lang.String str30 = documentType20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType20.childNodes();
        int int32 = documentType20.siblingIndex();
        boolean boolean33 = node14.equals((java.lang.Object) documentType20);
        org.jsoup.nodes.Node node34 = node14.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = documentType4.parent();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder14, (int) (short) 10, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.previousSibling();
        java.lang.String str14 = node8.toString();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document22 = documentType19.ownerDocument();
        java.lang.String str23 = documentType19.nodeName();
        org.jsoup.nodes.Node node24 = documentType19.previousSibling();
        org.jsoup.nodes.Node node26 = documentType19.removeAttr("#doctype");
        java.lang.String str28 = documentType19.attr("");
        int int29 = documentType19.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType19.siblingNodes();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType19.outerHtmlTail(stringBuilder31, (int) 'a', outputSettings33);
        org.jsoup.nodes.Node node35 = documentType19.parentNode();
        boolean boolean36 = node8.equals((java.lang.Object) node35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        int int7 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.siblingIndex();
        java.lang.String str16 = node9.attr("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        java.lang.String str30 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType32.childNodesCopy();
        org.jsoup.nodes.Node node36 = documentType32.previousSibling();
        boolean boolean38 = documentType32.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = documentType32.childNodes();
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node45 = documentType44.clone();
        org.jsoup.nodes.Document document46 = node45.ownerDocument();
        int int47 = node45.siblingIndex();
        int int48 = node45.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = node45.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = node45.childNodes();
        boolean boolean51 = documentType32.equals((java.lang.Object) nodeList50);
        boolean boolean52 = node25.equals((java.lang.Object) documentType32);
        org.jsoup.nodes.Node node54 = documentType32.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node54);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 0, outputSettings12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.childNodeSize();
        java.lang.String str15 = node9.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        org.jsoup.nodes.Node node26 = documentType22.clone();
        java.lang.String str27 = documentType22.outerHtml();
        org.jsoup.nodes.Node node28 = documentType22.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType22.siblingNodes();
        documentType22.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int32 = documentType22.childNodeSize();
        org.jsoup.nodes.Node node35 = documentType22.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node41 = documentType40.clone();
        int int42 = documentType40.siblingIndex();
        boolean boolean43 = documentType22.equals((java.lang.Object) int42);
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType22.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeList44);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node21 = documentType19.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType19.outerHtmlTail(stringBuilder22, (int) (short) 10, outputSettings24);
        boolean boolean27 = documentType19.hasAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node28 = documentType19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.before((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.outerHtml();
        java.lang.String str14 = node11.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = node11.baseUri();
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
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
        org.jsoup.nodes.Node node14 = node9.parentNode();
        java.lang.Class<?> wildcardClass15 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        org.jsoup.nodes.Document document41 = node37.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = document41.childNode((int) (byte) 0);
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
        org.junit.Assert.assertNull(document41);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        org.jsoup.nodes.Node node25 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node28 = documentType16.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node8 = documentType4.wrap("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("hi!");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        int int17 = documentType13.siblingIndex();
        java.lang.String str18 = documentType13.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType13.childNodesCopy();
        java.lang.String str21 = documentType13.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str22 = documentType13.outerHtml();
        java.lang.String str23 = documentType13.nodeName();
        java.lang.String str24 = documentType13.toString();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node32 = documentType29.previousSibling();
        java.lang.String str33 = documentType29.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType29.siblingNodes();
        org.jsoup.nodes.Attributes attributes35 = documentType29.attributes();
        java.lang.String str36 = documentType29.toString();
        org.jsoup.nodes.Node node37 = documentType29.parentNode();
        java.lang.String str39 = documentType29.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node41 = documentType29.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        boolean boolean42 = documentType13.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType13.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node8.after((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str36, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        org.jsoup.nodes.Attributes attributes25 = node9.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node9.unwrap();
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
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        int int31 = documentType15.siblingIndex();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node37 = documentType36.clone();
        node37.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node40 = node37.nextSibling();
        boolean boolean41 = documentType15.equals((java.lang.Object) node37);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType15.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType15.childNodesCopy();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        node5.setBaseUri("");
        org.jsoup.nodes.Node node13 = node5.attr("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str14 = node5.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str14 = documentType12.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document15 = documentType12.ownerDocument();
        java.lang.String str16 = documentType12.nodeName();
        org.jsoup.nodes.Attributes attributes17 = documentType12.attributes();
        java.lang.String str18 = documentType12.baseUri();
        java.lang.String str19 = documentType12.nodeName();
        org.jsoup.nodes.Attributes attributes20 = documentType12.attributes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType12.outerHtmlTail(stringBuilder21, 0, outputSettings23);
        org.jsoup.nodes.Node node25 = documentType12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.before(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        documentType4.outerHtmlTail(stringBuilder14, (int) (short) 100, outputSettings16);
        java.lang.String str19 = documentType4.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        java.lang.StringBuilder stringBuilder20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder20, (int) (byte) 0, outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        java.util.List<org.jsoup.nodes.Node> nodeList31 = documentType15.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) -1, outputSettings14);
        java.lang.String str16 = documentType4.nodeName();
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node22 = documentType21.clone();
        java.lang.String str23 = node22.outerHtml();
        boolean boolean24 = node16.equals((java.lang.Object) node22);
        java.lang.String str25 = node22.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        java.lang.String str17 = documentType4.attr("");
        java.lang.Class<?> wildcardClass18 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document13.after("<!DOCTYPE hi! \"hi!\">");
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
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node19 = node9.parent();
        boolean boolean21 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = node15.attr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        documentType4.outerHtmlTail(stringBuilder14, (int) '4', outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder16, (int) (byte) 100, outputSettings18);
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
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        org.jsoup.nodes.Node node25 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType16.remove();
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
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.String str10 = documentType4.attr("hi!");
        documentType4.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        int int6 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        org.jsoup.nodes.Document document25 = documentType13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = document25.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType4.outerHtmlTail(stringBuilder27, 10, outputSettings29);
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
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        org.jsoup.nodes.Node node23 = documentType19.clone();
        int int24 = node23.siblingIndex();
        java.lang.String str25 = node23.outerHtml();
        org.jsoup.nodes.Node node26 = node23.parent();
        org.jsoup.nodes.Node node27 = node23.clone();
        boolean boolean29 = node23.hasAttr("#doctype");
        org.jsoup.nodes.Node node30 = node23.parent();
        org.jsoup.nodes.Node node31 = node23.clone();
        java.lang.String str32 = node31.baseUri();
        boolean boolean33 = documentType4.equals((java.lang.Object) str32);
        java.lang.StringBuilder stringBuilder34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        documentType4.outerHtmlTail(stringBuilder34, (int) (short) -1, outputSettings36);
        org.jsoup.nodes.Node node38 = documentType4.nextSibling();
        int int39 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str6 = documentType4.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.jsoup.nodes.Node node9 = node7.nextSibling();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str31 = documentType30.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node9.after((org.jsoup.nodes.Node) documentType30);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        org.jsoup.nodes.Node node17 = node16.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (short) 0);
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
        node5.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        java.lang.String str20 = node5.baseUri();
        org.jsoup.nodes.Document document21 = node5.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">" + "'", str20, "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        java.lang.String str13 = node9.toString();
        java.lang.String str15 = node9.attr("#doctype");
        org.jsoup.nodes.Node node16 = node9.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node11.before("");
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str32 = documentType30.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes33 = documentType30.attributes();
        org.jsoup.nodes.Document document34 = documentType30.ownerDocument();
        org.jsoup.nodes.Node node37 = documentType30.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.lang.String str38 = node37.toString();
        boolean boolean39 = documentType18.equals((java.lang.Object) str38);
        org.jsoup.nodes.Node node40 = documentType18.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str38, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.previousSibling();
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
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node11.before("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
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
        int int26 = documentType18.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            documentType18.remove();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        java.lang.Class<?> wildcardClass26 = documentType4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.clone();
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        org.jsoup.nodes.Node node20 = documentType18.parent();
        org.jsoup.nodes.Node node21 = documentType18.parent();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType18.childNodesCopy();
        java.lang.String str24 = documentType18.nodeName();
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        documentType18.outerHtmlTail(stringBuilder25, (int) (short) 0, outputSettings27);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = node13.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
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
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        org.jsoup.nodes.Node node26 = documentType22.clone();
        org.jsoup.nodes.Node node27 = documentType22.clone();
        org.jsoup.nodes.Attributes attributes28 = node27.attributes();
        java.lang.String str30 = node27.attr("#doctype");
        org.jsoup.nodes.Node node31 = node27.clone();
        org.jsoup.nodes.Node node32 = node27.clone();
        org.jsoup.nodes.Node node33 = node27.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node27.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = node27.childNodes();
        boolean boolean36 = documentType4.equals((java.lang.Object) nodeList35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, (int) (short) 10, outputSettings11);
        org.jsoup.nodes.Node node13 = documentType4.parentNode();
        int int14 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "#doctype");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node8.childNodes();
        org.jsoup.nodes.Node node19 = node8.clone();
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.outerHtml();
        boolean boolean11 = node8.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int12 = node8.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.String str14 = documentType4.baseUri();
        java.lang.String str16 = documentType4.attr("hi!");
        java.lang.Class<?> wildcardClass17 = documentType4.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
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
        org.jsoup.nodes.Node node38 = documentType15.clone();
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
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node11 = node5.parent();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        int int21 = node20.siblingIndex();
        java.lang.String str22 = node20.outerHtml();
        org.jsoup.nodes.Node node23 = node20.parent();
        org.jsoup.nodes.Node node24 = node20.clone();
        boolean boolean26 = node20.hasAttr("#doctype");
        org.jsoup.nodes.Node node28 = node20.removeAttr("#doctype");
        org.jsoup.nodes.Attributes attributes29 = node20.attributes();
        org.jsoup.nodes.Node node30 = node20.parent();
        // The following exception was thrown during execution in test generation
        try {
            node11.replaceWith(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = node10.outerHtml();
        java.lang.String str12 = node10.outerHtml();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType17.outerHtmlTail(stringBuilder21, (int) '4', outputSettings23);
        documentType17.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document27 = documentType17.ownerDocument();
        boolean boolean28 = node10.equals((java.lang.Object) documentType17);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType17.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType17.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str6 = documentType4.attr("");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str8 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = node5.attr("<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        org.jsoup.nodes.Node node21 = node5.nextSibling();
        node5.setBaseUri("");
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        java.lang.String str34 = documentType31.toString();
        org.jsoup.nodes.Node node35 = documentType31.clone();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str42 = documentType40.attr("hi!");
        org.jsoup.nodes.Attributes attributes43 = documentType40.attributes();
        java.lang.StringBuilder stringBuilder44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = null;
        documentType40.outerHtmlTail(stringBuilder44, (int) '#', outputSettings46);
        int int48 = documentType40.childNodeSize();
        int int49 = documentType40.childNodeSize();
        org.jsoup.nodes.Node node50 = documentType40.clone();
        boolean boolean51 = documentType31.equals((java.lang.Object) node50);
        boolean boolean52 = documentType4.equals((java.lang.Object) boolean51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node10 = node8.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        int int11 = node10.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        java.lang.String str20 = node9.baseUri();
        org.jsoup.nodes.Node node21 = node9.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.before("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, 0, outputSettings12);
        java.lang.String str14 = documentType4.outerHtml();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str14 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        java.lang.String str14 = node10.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node10.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        org.jsoup.nodes.Document document24 = node17.ownerDocument();
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
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodesCopy();
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        java.lang.String str12 = node10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node10.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node10.childNodes();
        int int15 = node10.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node10.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
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
            org.jsoup.nodes.Node node14 = node8.unwrap();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int14 = documentType4.childNodeSize();
        java.lang.String str15 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 1, outputSettings18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        org.jsoup.nodes.Node node33 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = node33.baseUri();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
        java.lang.String str17 = documentType4.outerHtml();
        org.jsoup.nodes.Node node19 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        org.jsoup.nodes.Node node23 = node22.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node23.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        documentType4.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.lang.String str7 = node5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        java.lang.String str9 = node5.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str7, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
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
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node32 = documentType31.clone();
        int int33 = node32.childNodeSize();
        org.jsoup.nodes.Node node34 = node32.previousSibling();
        int int35 = node32.siblingIndex();
        java.lang.String str36 = node32.baseUri();
        java.lang.String str37 = node32.toString();
        int int38 = node32.siblingIndex();
        int int39 = node32.childNodeSize();
        node32.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = documentType4.after(node32);
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str37, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.absUrl("hi!");
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.attr("#doctype");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        int int18 = node17.childNodeSize();
        org.jsoup.nodes.Node node19 = node17.previousSibling();
        int int20 = node17.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node17.siblingNodes();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node27 = documentType26.clone();
        int int28 = node27.childNodeSize();
        boolean boolean29 = node17.equals((java.lang.Object) int28);
        node17.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Attributes attributes32 = node17.attributes();
        boolean boolean34 = node17.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str35 = node17.outerHtml();
        boolean boolean36 = documentType4.equals((java.lang.Object) node17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        int int15 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        org.jsoup.nodes.Node node34 = node8.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document35 = node8.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node8.childNodesCopy();
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
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 0, outputSettings16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE hi! \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        boolean boolean29 = node8.hasAttr("#doctype");
        java.lang.String str31 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass32 = node8.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        java.lang.Object obj18 = null;
        boolean boolean19 = documentType4.equals(obj18);
        org.jsoup.nodes.Node node20 = documentType4.previousSibling();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str16 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "#doctype", "hi!", "");
        java.lang.String str5 = documentType4.baseUri();
        documentType4.setBaseUri("<!DOCTYPE hi! \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        org.jsoup.nodes.Document document18 = node17.ownerDocument();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        java.lang.String str28 = documentType23.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType23.childNodesCopy();
        org.jsoup.nodes.Node node32 = documentType23.attr("#doctype", "#doctype");
        boolean boolean33 = node17.equals((java.lang.Object) node32);
        boolean boolean35 = node32.hasAttr("#doctype");
        boolean boolean36 = documentType4.equals((java.lang.Object) node32);
        java.lang.String str37 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
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
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str13 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
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
        org.jsoup.nodes.Node node34 = documentType15.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        org.jsoup.nodes.Node node20 = node18.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.toString();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, 1, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node17 = documentType4.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
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
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder17, (int) (byte) 1, outputSettings19);
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
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
            org.jsoup.nodes.Node node17 = node13.unwrap();
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
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 0, outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.Node node19 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node11.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        int int13 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node16 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = node17.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
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
        java.lang.String str27 = documentType16.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        java.util.List<org.jsoup.nodes.Node> nodeList43 = documentType4.childNodesCopy();
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
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder6, (int) (byte) -1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        int int31 = documentType15.siblingIndex();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node37 = documentType36.clone();
        node37.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node40 = node37.nextSibling();
        boolean boolean41 = documentType15.equals((java.lang.Object) node37);
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType15.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType47 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str49 = documentType47.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes50 = documentType47.attributes();
        org.jsoup.nodes.Node node51 = documentType47.clone();
        org.jsoup.nodes.Node node52 = documentType47.clone();
        org.jsoup.nodes.Attributes attributes53 = node52.attributes();
        org.jsoup.nodes.Node node56 = node52.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList57 = node52.childNodesCopy();
        boolean boolean58 = documentType15.equals((java.lang.Object) nodeList57);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = documentType15.unwrap();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
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
        int int27 = documentType16.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType16.before("");
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
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node13.before("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        org.jsoup.nodes.Node node10 = node8.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node8.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node12.toString();
        org.jsoup.nodes.Node node15 = node12.wrap("<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document15 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node21 = documentType18.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        documentType18.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node13.after((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        java.lang.String str10 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        node8.setBaseUri("");
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        org.jsoup.nodes.Node node12 = node8.clone();
        int int13 = node12.childNodeSize();
        java.lang.String str14 = node12.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#doctype" + "'", str37, "#doctype");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
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
        org.jsoup.nodes.Node node32 = documentType15.wrap("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
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
        org.jsoup.nodes.Node node34 = node30.clone();
        node34.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str37 = node34.toString();
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
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str37, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        org.jsoup.nodes.Node node38 = node37.nextSibling();
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
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        org.jsoup.nodes.Attributes attributes24 = documentType16.attributes();
        int int25 = documentType16.childNodeSize();
        org.jsoup.nodes.Node node26 = documentType16.clone();
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
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        java.lang.String str15 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        java.lang.String str27 = documentType4.outerHtml();
        java.lang.String str28 = documentType4.outerHtml();
        org.jsoup.nodes.Node node29 = documentType4.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.traverse(nodeVisitor30);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str13 = documentType4.attr("");
        int int14 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        int int23 = documentType19.siblingIndex();
        java.lang.String str24 = documentType19.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType19.childNodesCopy();
        java.lang.String str26 = documentType19.nodeName();
        org.jsoup.nodes.Node node27 = documentType19.nextSibling();
        int int28 = documentType19.siblingIndex();
        boolean boolean29 = documentType4.equals((java.lang.Object) int28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        org.jsoup.nodes.Attributes attributes23 = node8.attributes();
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
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder9, (int) 'a', outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        int int9 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str13 = documentType4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str16 = node15.baseUri();
        org.jsoup.nodes.Node node18 = node15.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node15 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Document document7 = node5.ownerDocument();
        int int8 = node5.siblingIndex();
        java.lang.String str10 = node5.attr("<!DOCTYPE hi! \"hi!\">");
        org.jsoup.nodes.Node node11 = node5.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
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
        org.jsoup.nodes.Attributes attributes25 = documentType20.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
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
            int int15 = node14.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node17 = documentType16.clone();
        int int18 = node17.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node17.childNodes();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node25 = documentType24.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.siblingNodes();
        boolean boolean27 = node17.equals((java.lang.Object) nodeList26);
        org.jsoup.nodes.Node node28 = node17.clone();
        java.lang.String str30 = node17.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes31 = node17.attributes();
        org.jsoup.nodes.Attributes attributes32 = node17.attributes();
        org.jsoup.nodes.Node node33 = node17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node11.before(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        org.jsoup.nodes.Node node23 = documentType18.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodesCopy();
        boolean boolean25 = documentType4.equals((java.lang.Object) documentType18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = documentType4.unwrap();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
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
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean20 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node9.childNodesCopy();
        org.jsoup.nodes.Node node22 = node9.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 0, outputSettings7);
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node13.childNodes();
        org.jsoup.nodes.Document document24 = node13.ownerDocument();
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
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
            org.jsoup.nodes.Node node14 = node13.parentNode();
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
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        org.jsoup.nodes.Node node15 = node14.clone();
        org.jsoup.nodes.Node node16 = node14.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\"> PUBLIC \"#doctype\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        int int11 = documentType4.siblingIndex();
        java.lang.String str13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        documentType4.setBaseUri("");
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        org.jsoup.nodes.Node node13 = node9.attr("hi!", "");
        org.jsoup.nodes.Node node14 = node13.parentNode();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node20 = documentType19.clone();
        java.lang.String str21 = node20.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node13.after(node20);
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        org.jsoup.nodes.Node node19 = node18.parentNode();
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node34 = documentType33.clone();
        int int35 = documentType33.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node24.before((org.jsoup.nodes.Node) documentType33);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 0, outputSettings7);
        java.lang.StringBuilder stringBuilder9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        documentType4.outerHtmlTail(stringBuilder9, 100, outputSettings11);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
        documentType4.setBaseUri("hi!");
        java.lang.String str25 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.String str9 = documentType4.nodeName();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
    }
}

