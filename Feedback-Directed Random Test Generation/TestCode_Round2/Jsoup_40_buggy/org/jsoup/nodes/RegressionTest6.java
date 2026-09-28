package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        org.jsoup.nodes.Node node20 = node13.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node26 = documentType25.clone();
        org.jsoup.nodes.Node node29 = documentType25.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node20.before((org.jsoup.nodes.Node) documentType25);
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        int int12 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (short) 0, outputSettings10);
        java.lang.String str12 = documentType4.toString();
        java.lang.String str13 = documentType4.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        java.lang.String str29 = node24.attr("#doctype");
        org.jsoup.nodes.Node node30 = node24.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.traverse(nodeVisitor20);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str14 = documentType12.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        org.jsoup.nodes.Node node16 = documentType12.clone();
        java.lang.String str17 = documentType12.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType12.siblingNodes();
        java.lang.String str19 = documentType12.toString();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        org.jsoup.nodes.Node node28 = documentType24.clone();
        org.jsoup.nodes.Node node29 = documentType24.clone();
        org.jsoup.nodes.Node node32 = documentType24.attr("#doctype", "#doctype");
        boolean boolean33 = documentType12.equals((java.lang.Object) documentType24);
        org.jsoup.nodes.Node node34 = documentType24.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType24.siblingNodes();
        org.jsoup.nodes.Node node37 = documentType24.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        documentType24.setBaseUri("#doctype");
        java.lang.String str41 = documentType24.attr("<!DOCTYPE hi! \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node7.before((org.jsoup.nodes.Node) documentType24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.jsoup.nodes.Node node18 = node13.clone();
        java.lang.String str19 = node13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        documentType4.setBaseUri("hi!");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        java.lang.String str29 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.siblingNodes();
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
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document9 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        int int12 = node11.siblingIndex();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        java.lang.String str21 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node22 = documentType17.parentNode();
        java.lang.String str23 = documentType17.nodeName();
        java.lang.String str24 = documentType17.toString();
        java.lang.String str25 = documentType17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node11.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        java.lang.String str8 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        java.lang.String str18 = documentType13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType13.siblingNodes();
        java.lang.String str20 = documentType13.toString();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str27 = documentType25.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        org.jsoup.nodes.Node node29 = documentType25.clone();
        org.jsoup.nodes.Node node30 = documentType25.clone();
        org.jsoup.nodes.Node node33 = documentType25.attr("#doctype", "#doctype");
        boolean boolean34 = documentType13.equals((java.lang.Object) documentType25);
        org.jsoup.nodes.Node node35 = documentType25.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType25.siblingNodes();
        org.jsoup.nodes.Node node38 = documentType25.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        documentType25.setBaseUri("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = documentType4.before((org.jsoup.nodes.Node) documentType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        org.jsoup.nodes.Node node14 = node5.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node5.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        java.lang.StringBuilder stringBuilder43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder43, (int) (short) -1, outputSettings45);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#doctype" + "'", str39, "#doctype");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        boolean boolean32 = node26.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node33 = node26.previousSibling();
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
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("hi!");
        org.jsoup.nodes.Attributes attributes36 = documentType33.attributes();
        int int37 = documentType33.siblingIndex();
        java.lang.String str38 = documentType33.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = documentType33.childNodesCopy();
        java.lang.String str41 = documentType33.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str42 = documentType33.outerHtml();
        org.jsoup.nodes.Node node43 = documentType33.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = documentType4.after(node43);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str42, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        int int18 = documentType14.siblingIndex();
        java.lang.String str19 = documentType14.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType14.childNodesCopy();
        java.lang.String str22 = documentType14.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType14.clone();
        org.jsoup.nodes.Document document24 = node23.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, 0, outputSettings9);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.unwrap();
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
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        int int12 = node11.childNodeSize();
        org.jsoup.nodes.Attributes attributes13 = node11.attributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node11.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document19 = documentType16.ownerDocument();
        java.lang.String str20 = documentType16.nodeName();
        java.lang.String str21 = documentType16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType16.siblingNodes();
        boolean boolean23 = node10.equals((java.lang.Object) documentType16);
        org.jsoup.nodes.Node node24 = node10.parent();
        org.jsoup.nodes.Node node25 = node10.nextSibling();
        int int26 = node10.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.lang.String str29 = documentType4.nodeName();
        org.jsoup.nodes.Node node30 = documentType4.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node5.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        boolean boolean7 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        java.lang.String str13 = documentType4.nodeName();
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str16 = node15.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.traverse(nodeVisitor17);
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        int int15 = node8.siblingIndex();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node21 = documentType20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType20.childNodes();
        org.jsoup.nodes.Document document23 = documentType20.ownerDocument();
        java.lang.String str24 = documentType20.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node8.after((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#doctype" + "'", str24, "#doctype");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (short) 10, outputSettings19);
        org.jsoup.nodes.Node node21 = documentType4.parent();
        java.lang.Class<?> wildcardClass22 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        java.lang.Class<?> wildcardClass19 = nodeList18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str13 = documentType4.outerHtml();
        int int14 = documentType4.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        java.lang.String str19 = documentType4.toString();
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node18.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.String str13 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        documentType16.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str30 = documentType16.nodeName();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node36 = documentType35.clone();
        int int37 = node36.childNodeSize();
        org.jsoup.nodes.Node node38 = node36.previousSibling();
        int int39 = node36.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node36.siblingNodes();
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node46 = documentType45.clone();
        int int47 = node46.childNodeSize();
        boolean boolean48 = node36.equals((java.lang.Object) int47);
        org.jsoup.nodes.Node node49 = node36.parentNode();
        org.jsoup.nodes.Node node51 = node36.removeAttr("hi!");
        boolean boolean53 = node51.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            documentType16.replaceWith(node51);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        org.jsoup.nodes.Node node10 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node37.unwrap();
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
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.String str13 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str17 = documentType4.attr("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        org.jsoup.nodes.Node node12 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node13 = node5.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.before("hi!");
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        node15.setBaseUri("hi!");
        org.jsoup.nodes.Node node19 = node15.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 100, outputSettings13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        int int17 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node18 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        boolean boolean30 = documentType22.hasAttr("<!DOCTYPE hi! \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) (short) 100, outputSettings15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node18.siblingNodes();
        java.lang.Class<?> wildcardClass21 = nodeList20.getClass();
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        java.lang.String str11 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = node8.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = node5.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (-1), outputSettings7);
        org.jsoup.nodes.Node node9 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "hi!");
        java.lang.String str16 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node18 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, 1, outputSettings21);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node11.childNodes();
        boolean boolean18 = node11.hasAttr("hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        node8.setBaseUri("");
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = document11.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, (int) (short) 1, outputSettings14);
        java.lang.String str16 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        org.jsoup.nodes.Node node25 = documentType21.clone();
        org.jsoup.nodes.Node node26 = documentType21.clone();
        org.jsoup.nodes.Attributes attributes27 = node26.attributes();
        int int28 = node26.siblingIndex();
        java.lang.String str29 = node26.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node26.siblingNodes();
        java.lang.String str32 = node26.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str33 = node26.toString();
        boolean boolean34 = documentType4.equals((java.lang.Object) node26);
        org.jsoup.nodes.Node node35 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType4.siblingNodes();
        java.lang.String str18 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        node8.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean31 = node8.hasAttr("");
        java.lang.String str32 = node8.outerHtml();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
            org.jsoup.nodes.Node node19 = node17.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.nodeName();
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
            org.jsoup.nodes.Node node25 = node23.after("");
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
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.lang.String str11 = node5.outerHtml();
        node5.setBaseUri("#doctype");
        int int14 = node5.childNodeSize();
        java.lang.String str15 = node5.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        documentType4.outerHtmlTail(stringBuilder14, 1, outputSettings16);
        int int18 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        java.lang.String str19 = node16.toString();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        org.jsoup.nodes.Node node28 = documentType24.clone();
        org.jsoup.nodes.Node node29 = documentType24.clone();
        org.jsoup.nodes.Attributes attributes30 = node29.attributes();
        java.lang.String str32 = node29.attr("#doctype");
        org.jsoup.nodes.Node node33 = node29.clone();
        java.lang.String str34 = node29.baseUri();
        java.lang.String str35 = node29.toString();
        org.jsoup.nodes.Node node36 = node29.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node16.before(node29);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Node node7 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int8 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.jsoup.nodes.Node node34 = documentType15.parent();
        java.lang.String str35 = documentType15.nodeName();
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
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#doctype" + "'", str35, "#doctype");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str14 = node9.toString();
        java.lang.String str16 = node9.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.String str23 = documentType21.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        org.jsoup.nodes.Node node25 = documentType21.clone();
        org.jsoup.nodes.Node node26 = documentType21.clone();
        org.jsoup.nodes.Node node29 = documentType21.attr("#doctype", "#doctype");
        java.lang.String str30 = documentType21.outerHtml();
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        documentType21.outerHtmlTail(stringBuilder31, 1, outputSettings33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node9.after((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        org.jsoup.nodes.Node node18 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        documentType4.outerHtmlTail(stringBuilder12, 0, outputSettings14);
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node16.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.clone();
        org.jsoup.nodes.Document document16 = node9.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        int int15 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) 0, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        java.lang.String str15 = documentType4.baseUri();
        java.lang.String str16 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#doctype" + "'", str16, "#doctype");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        org.jsoup.nodes.Node node12 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node13 = node12.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '4', outputSettings10);
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node13.toString();
        java.lang.String str16 = node13.absUrl("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str17 = node13.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.lang.StringBuilder stringBuilder28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        documentType27.outerHtmlTail(stringBuilder28, (int) (byte) 0, outputSettings30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = documentType16.before((org.jsoup.nodes.Node) documentType27);
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
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (byte) 1, outputSettings7);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node5.childNodes();
        java.lang.Class<?> wildcardClass12 = nodeList11.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        org.jsoup.nodes.Node node27 = documentType23.clone();
        java.lang.String str28 = documentType23.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType23.siblingNodes();
        java.lang.String str30 = documentType23.toString();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        org.jsoup.nodes.Node node39 = documentType35.clone();
        org.jsoup.nodes.Node node40 = documentType35.clone();
        org.jsoup.nodes.Node node43 = documentType35.attr("#doctype", "#doctype");
        boolean boolean44 = documentType23.equals((java.lang.Object) documentType35);
        int int45 = documentType23.childNodeSize();
        org.jsoup.nodes.Node node46 = documentType23.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType4.after(node46);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = documentType4.unwrap();
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
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        java.lang.String str12 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str13 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node18 = documentType4.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
            org.jsoup.nodes.Node node16 = documentType4.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = node9.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        int int12 = documentType4.childNodeSize();
        int int13 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node14 = documentType4.clone();
        java.lang.String str16 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str18 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.traverse(nodeVisitor16);
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
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.lang.StringBuilder stringBuilder31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder31, (int) (short) 1, outputSettings33);
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
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        int int8 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        org.jsoup.nodes.Node node20 = documentType4.parentNode();
        org.jsoup.nodes.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node21);
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, 1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int13 = documentType4.siblingIndex();
        boolean boolean15 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        boolean boolean18 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node13.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        int int13 = node12.childNodeSize();
        org.jsoup.nodes.Attributes attributes14 = node12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.unwrap();
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
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        org.jsoup.nodes.Attributes attributes37 = node34.attributes();
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
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node24 = documentType23.clone();
        int int25 = node24.childNodeSize();
        org.jsoup.nodes.Node node26 = node24.previousSibling();
        org.jsoup.nodes.Node node28 = node24.removeAttr("#doctype");
        java.lang.String str29 = node28.toString();
        org.jsoup.nodes.Node node30 = node28.clone();
        java.lang.String str31 = node30.outerHtml();
        org.jsoup.nodes.Node node34 = node30.attr("#doctype", "#doctype");
        java.lang.String str35 = node30.baseUri();
        boolean boolean36 = documentType4.equals((java.lang.Object) str35);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Node node12 = node9.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        java.lang.String str28 = documentType23.baseUri();
        boolean boolean30 = documentType23.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node11.before((org.jsoup.nodes.Node) documentType23);
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
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        boolean boolean11 = documentType4.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Node node12 = node9.parent();
        org.jsoup.nodes.Node node13 = node9.clone();
        org.jsoup.nodes.Node node14 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodes();
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
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        org.jsoup.nodes.Node node23 = node20.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node23.wrap("<!DOCTYPE hi! \"hi!\">");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        int int11 = node10.childNodeSize();
        org.jsoup.nodes.Node node14 = node10.attr("#doctype", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        node10.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.clone();
        org.jsoup.nodes.Node node14 = node8.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node15 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node8.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
            org.jsoup.nodes.Document document29 = node28.ownerDocument();
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
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        org.jsoup.nodes.Document document35 = documentType4.ownerDocument();
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
        org.junit.Assert.assertNull(document35);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "hi!", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node13.siblingNodes();
        int int33 = node13.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node13.traverse(nodeVisitor34);
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
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        java.lang.String str17 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = documentType4.siblingIndex();
        int int7 = documentType4.childNodeSize();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        boolean boolean11 = documentType4.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str15 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        int int10 = documentType4.childNodeSize();
        java.lang.Class<?> wildcardClass11 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
            int int15 = node14.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 10, outputSettings17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str37 = documentType35.attr("hi!");
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        int int39 = documentType35.siblingIndex();
        java.lang.String str40 = documentType35.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType35.childNodesCopy();
        java.lang.String str43 = documentType35.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType35.childNodes();
        java.lang.String str45 = documentType35.toString();
        org.jsoup.nodes.Node node46 = documentType35.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node46);
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str45, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
            org.jsoup.nodes.Node node38 = documentType15.before("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node24.before("");
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
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        boolean boolean15 = documentType4.hasAttr("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        org.jsoup.nodes.Node node17 = node13.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (short) 1);
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass9 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "hi!", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        int int6 = documentType4.siblingIndex();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
            int int14 = node13.childNodeSize();
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.unwrap();
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
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = node8.nextSibling();
        org.jsoup.nodes.Node node16 = node8.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node17 = node8.parent();
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.traverse(nodeVisitor18);
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        node13.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node13.before("<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        java.util.List<org.jsoup.nodes.Node> nodeList21 = documentType19.childNodes();
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
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        java.lang.Class<?> wildcardClass13 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        org.jsoup.nodes.Attributes attributes32 = node13.attributes();
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
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        documentType4.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) 0, outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node36 = documentType33.previousSibling();
        java.lang.String str38 = documentType33.absUrl("hi!");
        int int39 = documentType33.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node5.before((org.jsoup.nodes.Node) documentType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node14 = documentType13.clone();
        node14.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node14.childNodesCopy();
        int int18 = node14.childNodeSize();
        org.jsoup.nodes.Node node20 = node14.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) 'a', outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.after("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType20.childNodes();
        java.lang.String str25 = documentType20.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.outerHtml();
        java.lang.String str10 = documentType4.outerHtml();
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        int int9 = node5.childNodeSize();
        org.jsoup.nodes.Node node11 = node5.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = node5.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "", "", "#doctype");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        org.jsoup.nodes.Document document26 = node20.ownerDocument();
        org.jsoup.nodes.Node node27 = node20.parentNode();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str34 = documentType32.attr("hi!");
        org.jsoup.nodes.Attributes attributes35 = documentType32.attributes();
        int int36 = documentType32.siblingIndex();
        java.lang.String str37 = documentType32.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType32.childNodesCopy();
        java.lang.String str39 = documentType32.nodeName();
        java.lang.StringBuilder stringBuilder40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        documentType32.outerHtmlTail(stringBuilder40, (int) (byte) -1, outputSettings42);
        java.lang.String str44 = documentType32.baseUri();
        boolean boolean46 = documentType32.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes47 = documentType32.attributes();
        org.jsoup.nodes.Node node48 = documentType32.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node20.before(node48);
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
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#doctype" + "'", str39, "#doctype");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes13 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        int int19 = node17.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node17.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        org.jsoup.nodes.Node node24 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        boolean boolean13 = documentType4.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = document16.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.String str13 = documentType4.nodeName();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        documentType4.setBaseUri("#doctype");
        int int28 = documentType4.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node9.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str12 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.lang.String str9 = node5.baseUri();
        java.lang.String str10 = node5.toString();
        int int11 = node5.siblingIndex();
        org.jsoup.nodes.Document document12 = node5.ownerDocument();
        node5.setBaseUri("<!DOCTYPE hi! \"hi!\">");
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
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        int int10 = node9.childNodeSize();
        java.lang.String str12 = node9.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node9.previousSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        org.jsoup.nodes.Node node23 = documentType18.clone();
        int int24 = node23.siblingIndex();
        boolean boolean26 = node23.equals((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node23.childNodesCopy();
        boolean boolean29 = node23.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node9.before(node23);
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        node9.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = node9.clone();
        org.jsoup.nodes.Attributes attributes16 = node9.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.lang.String str20 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "hi!", "#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.lang.String str23 = node8.absUrl("hi!");
        java.lang.String str24 = node8.baseUri();
        int int25 = node8.siblingIndex();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.childNodeSize();
        org.jsoup.nodes.Node node15 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            node15.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        boolean boolean35 = documentType15.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        org.jsoup.nodes.Node node13 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.attr("#doctype", "#doctype");
        java.lang.String str15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str10 = documentType4.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        java.lang.String str21 = documentType16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType16.childNodesCopy();
        java.lang.String str24 = documentType16.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str25 = documentType16.outerHtml();
        java.lang.String str26 = documentType16.toString();
        org.jsoup.nodes.Node node27 = documentType16.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType4.before((org.jsoup.nodes.Node) documentType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        documentType16.setBaseUri("#doctype");
        java.lang.String str33 = documentType16.attr("<!DOCTYPE hi! \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType16.remove();
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
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node16.traverse(nodeVisitor19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.lang.String str14 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node15 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        org.jsoup.nodes.Node node19 = documentType4.parentNode();
        org.jsoup.nodes.Node node21 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        documentType4.outerHtmlTail(stringBuilder22, (-1), outputSettings24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        boolean boolean14 = documentType4.hasAttr("#doctype");
        java.lang.String str15 = documentType4.nodeName();
        java.lang.String str16 = documentType4.toString();
        org.jsoup.nodes.Node node19 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node21 = documentType4.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.before("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = documentType4.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.toString();
        java.lang.String str12 = node8.attr("hi!");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node18 = documentType17.clone();
        int int19 = node18.childNodeSize();
        org.jsoup.nodes.Node node20 = node18.previousSibling();
        org.jsoup.nodes.Node node22 = node18.removeAttr("#doctype");
        int int23 = node22.childNodeSize();
        int int24 = node22.siblingIndex();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str31 = documentType29.attr("hi!");
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        int int33 = documentType29.siblingIndex();
        org.jsoup.nodes.Node node34 = documentType29.previousSibling();
        java.lang.String str35 = documentType29.baseUri();
        org.jsoup.nodes.Node node37 = documentType29.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean38 = node22.equals((java.lang.Object) node37);
        org.jsoup.nodes.Node node41 = node22.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node42 = node22.parentNode();
        boolean boolean43 = node8.equals((java.lang.Object) node42);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        org.jsoup.nodes.Document document9 = node5.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = document9.attr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node10 = node8.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        // The following exception was thrown during execution in test generation
        try {
            node18.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        org.jsoup.nodes.Node node28 = documentType15.previousSibling();
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
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        java.lang.String str32 = node8.toString();
        java.lang.String str33 = node8.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node8.unwrap();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        int int18 = documentType14.siblingIndex();
        java.lang.String str19 = documentType14.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType14.childNodesCopy();
        java.lang.String str22 = documentType14.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node23 = documentType14.clone();
        java.lang.StringBuilder stringBuilder24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        documentType14.outerHtmlTail(stringBuilder24, (int) (short) -1, outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            node5.replaceWith((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        org.jsoup.nodes.Node node49 = documentType34.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = documentType34.siblingNodes();
        java.lang.String str51 = documentType34.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = documentType4.before((org.jsoup.nodes.Node) documentType34);
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
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#doctype" + "'", str51, "#doctype");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        org.jsoup.nodes.Node node11 = node8.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.absUrl("#doctype");
        java.lang.String str13 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node9.toString();
        org.jsoup.nodes.Node node11 = node9.clone();
        java.lang.String str12 = node11.baseUri();
        org.jsoup.nodes.Node node13 = node11.previousSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node19 = documentType18.clone();
        org.jsoup.nodes.Node node20 = documentType18.parent();
        org.jsoup.nodes.Document document21 = documentType18.ownerDocument();
        org.jsoup.nodes.Node node23 = documentType18.removeAttr("hi!");
        org.jsoup.nodes.Node node24 = documentType18.parent();
        java.lang.String str25 = documentType18.baseUri();
        int int26 = documentType18.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = node13.equals((java.lang.Object) documentType18);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        org.jsoup.nodes.Attributes attributes31 = documentType15.attributes();
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType15.outerHtmlHead(stringBuilder32, 0, outputSettings34);
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
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        org.jsoup.nodes.Node node17 = node8.parentNode();
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
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        java.lang.String str13 = node11.baseUri();
        org.jsoup.nodes.Node node14 = node11.clone();
        // The following exception was thrown during execution in test generation
        try {
            node14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        java.lang.StringBuilder stringBuilder27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        documentType23.outerHtmlTail(stringBuilder27, (int) '4', outputSettings29);
        documentType23.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str33 = documentType23.baseUri();
        boolean boolean34 = node16.equals((java.lang.Object) documentType23);
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
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        documentType4.setBaseUri("#doctype");
        int int13 = documentType4.siblingIndex();
        java.lang.String str14 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        java.lang.String str23 = node8.absUrl("hi!");
        java.lang.String str24 = node8.baseUri();
        org.jsoup.nodes.Node node26 = node8.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        org.jsoup.nodes.Document document53 = documentType4.ownerDocument();
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
        org.junit.Assert.assertNull(document53);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        int int11 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
            org.jsoup.nodes.Node node44 = node8.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Document document12 = documentType4.ownerDocument();
        java.lang.String str13 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        int int10 = documentType4.childNodeSize();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        java.lang.String str20 = node19.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str20, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        java.lang.String str14 = node9.baseUri();
        org.jsoup.nodes.Document document15 = node9.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.toString();
        java.lang.String str12 = documentType4.toString();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        java.lang.String str15 = documentType4.toString();
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        org.jsoup.nodes.Node node22 = documentType19.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
        java.lang.String str23 = node22.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node14.before(node22);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        int int12 = documentType4.childNodeSize();
        int int13 = documentType4.childNodeSize();
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node16 = documentType4.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.absUrl("#doctype");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = node21.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.baseUri();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("hi!");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        int int22 = documentType18.siblingIndex();
        java.lang.String str23 = documentType18.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType18.childNodesCopy();
        org.jsoup.nodes.Node node27 = documentType18.attr("#doctype", "#doctype");
        java.lang.String str28 = documentType18.nodeName();
        java.lang.String str29 = documentType18.nodeName();
        java.lang.String str30 = documentType18.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before((org.jsoup.nodes.Node) documentType18);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.lang.String str18 = node9.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        org.jsoup.nodes.Node node23 = node22.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node22.before("<!DOCTYPE hi! \"hi!\">");
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node9.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str7 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node8.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        org.jsoup.nodes.Node node17 = documentType4.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        documentType4.outerHtmlTail(stringBuilder17, (int) ' ', outputSettings19);
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
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        org.jsoup.nodes.Node node14 = node5.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.nextSibling();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        java.lang.String str23 = documentType18.outerHtml();
        org.jsoup.nodes.Node node24 = documentType18.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType18.siblingNodes();
        boolean boolean26 = node13.equals((java.lang.Object) documentType18);
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str23, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        org.jsoup.nodes.Node node12 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = node12.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node24 = documentType23.clone();
        node24.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node27 = node24.nextSibling();
        org.jsoup.nodes.Node node30 = node24.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int31 = node24.siblingIndex();
        java.lang.String str32 = node24.outerHtml();
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str39 = documentType37.attr("hi!");
        org.jsoup.nodes.Attributes attributes40 = documentType37.attributes();
        int int41 = documentType37.siblingIndex();
        java.lang.String str42 = documentType37.baseUri();
        org.jsoup.nodes.Attributes attributes43 = documentType37.attributes();
        boolean boolean44 = node24.equals((java.lang.Object) documentType37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node13.after(node24);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node27 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
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
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        int int29 = node24.siblingIndex();
        org.jsoup.nodes.Node node30 = node24.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = node30.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
            org.jsoup.nodes.Node node18 = document17.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        boolean boolean13 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str14 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) 0, outputSettings19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        org.jsoup.nodes.Node node15 = node13.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str16 = node13.outerHtml();
        org.jsoup.nodes.Node node17 = node13.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        int int13 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = documentType4.nodeName();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder5, (int) (byte) 1, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        org.jsoup.nodes.Node node26 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = node26.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Document document14 = node12.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document14.traverse(nodeVisitor15);
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
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        org.jsoup.nodes.Node node25 = documentType16.wrap("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        java.lang.String str26 = documentType16.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = documentType16.after("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.String str5 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str10 = node9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str10, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        int int21 = documentType17.siblingIndex();
        java.lang.String str22 = documentType17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType17.childNodesCopy();
        java.lang.String str25 = documentType17.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str26 = documentType17.outerHtml();
        java.lang.String str27 = documentType17.nodeName();
        java.lang.String str28 = documentType17.toString();
        org.jsoup.nodes.Node node29 = documentType17.nextSibling();
        java.lang.String str30 = documentType17.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType4.before((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#doctype" + "'", str27, "#doctype");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str28, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.Class<?> wildcardClass5 = documentType4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        boolean boolean21 = node19.hasAttr("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str14 = node13.baseUri();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str21 = documentType19.attr("hi!");
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        int int23 = documentType19.siblingIndex();
        int int24 = documentType19.childNodeSize();
        org.jsoup.nodes.Document document25 = documentType19.ownerDocument();
        java.lang.String str26 = documentType19.baseUri();
        boolean boolean28 = documentType19.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        boolean boolean29 = node13.equals((java.lang.Object) "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        org.jsoup.nodes.Node node26 = node21.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = node26.absUrl("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Document document14 = documentType10.ownerDocument();
        boolean boolean15 = documentType4.equals((java.lang.Object) document14);
        java.lang.StringBuilder stringBuilder16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        documentType4.outerHtmlTail(stringBuilder16, 10, outputSettings18);
        org.jsoup.nodes.Node node20 = documentType4.parentNode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        org.jsoup.nodes.Node node19 = documentType4.clone();
        java.lang.String str21 = node19.absUrl("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node12 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = documentType4.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node16.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodesCopy();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node10 = node5.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        java.lang.String str31 = documentType15.nodeName();
        java.lang.String str32 = documentType15.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType15.childNodes();
        int int34 = documentType15.siblingIndex();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        org.jsoup.nodes.Document document14 = node13.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.siblingNodes();
        java.lang.String str16 = node13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Node node11 = node9.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int12 = node11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node11.siblingNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node13.after("#doctype");
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.lang.Class<?> wildcardClass20 = node19.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        org.jsoup.nodes.Node node33 = node30.attr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "#doctype");
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
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.parent();
        org.jsoup.nodes.Node node12 = node8.clone();
        boolean boolean14 = node8.hasAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node8.childNodes();
        org.jsoup.nodes.Node node17 = node8.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = node6.clone();
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        java.lang.String str9 = node7.baseUri();
        int int10 = node7.childNodeSize();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        boolean boolean31 = node8.hasAttr("");
        java.lang.String str33 = node8.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node8.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        org.jsoup.nodes.Node node30 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
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
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        boolean boolean18 = documentType4.hasAttr("#doctype");
        int int19 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType4.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (byte) -1, outputSettings12);
        java.lang.String str14 = documentType4.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node33.nextSibling();
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
            java.lang.String str18 = node16.absUrl("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
            org.jsoup.nodes.Node node29 = node26.removeAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str16 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "#doctype", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str26 = documentType24.attr("hi!");
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        int int28 = documentType24.siblingIndex();
        org.jsoup.nodes.Node node29 = documentType24.previousSibling();
        java.lang.String str30 = documentType24.baseUri();
        org.jsoup.nodes.Node node31 = documentType24.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType24.childNodesCopy();
        org.jsoup.nodes.Node node34 = documentType24.removeAttr("hi!");
        int int35 = node34.childNodeSize();
        node34.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document38 = node34.ownerDocument();
        org.jsoup.nodes.Node node39 = node34.clone();
        org.jsoup.nodes.Node node42 = node34.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = documentType17.before(node34);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        org.jsoup.nodes.Node node20 = node17.nextSibling();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.clone();
        org.jsoup.nodes.Node node12 = node10.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.Node node14 = node12.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) '#', outputSettings13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node5.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        org.jsoup.nodes.Node node21 = node8.nextSibling();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str28 = documentType26.attr("hi!");
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        int int30 = documentType26.siblingIndex();
        java.lang.String str31 = documentType26.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = documentType26.childNodesCopy();
        java.lang.String str33 = documentType26.nodeName();
        org.jsoup.nodes.Node node34 = documentType26.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType26.childNodesCopy();
        java.lang.String str37 = documentType26.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = node21.equals((java.lang.Object) str37);
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
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#doctype" + "'", str33, "#doctype");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        org.jsoup.nodes.Node node29 = node21.parent();
        org.jsoup.select.NodeVisitor nodeVisitor30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.traverse(nodeVisitor30);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node8.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        org.jsoup.nodes.Node node11 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node8.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        org.jsoup.nodes.Document document42 = node37.ownerDocument();
        org.jsoup.nodes.Node node43 = node37.previousSibling();
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
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        java.lang.String str14 = documentType4.attr("");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document17 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType4.childNodesCopy();
        java.lang.StringBuilder stringBuilder19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder19, (int) (byte) 0, outputSettings21);
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
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node15 = documentType4.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = documentType4.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node35 = documentType34.clone();
        int int36 = node35.childNodeSize();
        org.jsoup.nodes.Node node37 = node35.previousSibling();
        org.jsoup.nodes.Node node39 = node35.removeAttr("#doctype");
        java.lang.String str40 = node39.toString();
        org.jsoup.nodes.Node node41 = node39.clone();
        java.lang.String str42 = node41.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = node41.childNodes();
        org.jsoup.nodes.Node node45 = node41.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = node41.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = documentType4.before(node41);
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
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str40, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str42, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeList46);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) '#', outputSettings10);
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 10, outputSettings15);
        java.lang.String str17 = documentType4.outerHtml();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.toString();
        java.lang.String str12 = node5.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node5.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        boolean boolean11 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        documentType4.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.childNodesCopy();
        java.lang.String str17 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "hi!", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        int int5 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str12 = documentType4.baseUri();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        org.jsoup.nodes.Node node23 = documentType18.clone();
        org.jsoup.nodes.Node node26 = documentType18.attr("#doctype", "#doctype");
        boolean boolean27 = documentType4.equals((java.lang.Object) "#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        org.jsoup.nodes.Node node25 = documentType14.previousSibling();
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.siblingNodes();
        boolean boolean15 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, 1, outputSettings19);
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
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType20.childNodes();
        java.lang.Class<?> wildcardClass26 = nodeList25.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
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
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        documentType16.setBaseUri("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str35 = documentType16.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        java.lang.String str10 = documentType4.attr("hi!");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">", "hi!", "hi!", "<!DOCTYPE hi! \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        org.jsoup.nodes.Node node23 = documentType20.clone();
        java.lang.String str25 = documentType20.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        org.jsoup.nodes.Node node11 = node8.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str12 = node8.outerHtml();
        org.jsoup.nodes.Node node15 = node8.attr("#doctype", "#doctype");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.lang.String str10 = node9.outerHtml();
        java.lang.String str11 = node9.baseUri();
        org.jsoup.nodes.Node node12 = node9.parent();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("hi!");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        documentType17.setBaseUri("hi!");
        java.lang.StringBuilder stringBuilder23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        documentType17.outerHtmlTail(stringBuilder23, (int) (short) 0, outputSettings25);
        org.jsoup.nodes.Document document27 = documentType17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) document27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes11 = node5.attributes();
        org.jsoup.nodes.Node node13 = node5.wrap("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.Node node9 = node5.clone();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str16 = documentType14.attr("hi!");
        org.jsoup.nodes.Attributes attributes17 = documentType14.attributes();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        documentType14.outerHtmlTail(stringBuilder18, (int) '4', outputSettings20);
        documentType14.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str24 = documentType14.baseUri();
        java.lang.String str25 = documentType14.nodeName();
        java.lang.String str26 = documentType14.nodeName();
        boolean boolean27 = node9.equals((java.lang.Object) str26);
        org.jsoup.nodes.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node9.after(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        java.lang.String str16 = node9.baseUri();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "hi!");
        boolean boolean6 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.jsoup.nodes.Node node10 = node8.parentNode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node14 = documentType4.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        java.lang.String str10 = node5.baseUri();
        java.lang.String str11 = node5.outerHtml();
        java.lang.String str12 = node5.toString();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node5.traverse(nodeVisitor13);
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
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        org.jsoup.nodes.Node node20 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.StringBuilder stringBuilder21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        documentType4.outerHtmlTail(stringBuilder21, 0, outputSettings23);
        org.jsoup.nodes.Node node25 = documentType4.previousSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        documentType4.outerHtmlTail(stringBuilder17, (int) (byte) 1, outputSettings19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        java.lang.String str33 = documentType16.nodeName();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#doctype" + "'", str33, "#doctype");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.outerHtml();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        node5.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes10 = node5.attributes();
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str15 = node5.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
            java.lang.String str22 = node21.baseUri();
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str10 = node8.absUrl("hi!");
        org.jsoup.nodes.Document document11 = node8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        org.jsoup.nodes.Node node21 = node20.parentNode();
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.unwrap();
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.siblingNodes();
        org.jsoup.nodes.Document document12 = node9.ownerDocument();
        java.lang.String str13 = node9.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        java.lang.String str21 = documentType16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType16.childNodesCopy();
        org.jsoup.nodes.Node node25 = documentType16.attr("#doctype", "#doctype");
        boolean boolean27 = node25.hasAttr("");
        boolean boolean28 = documentType4.equals((java.lang.Object) boolean27);
        org.jsoup.nodes.Node node29 = documentType4.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.lang.Class<?> wildcardClass26 = node23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        int int12 = documentType4.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        java.lang.StringBuilder stringBuilder12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder12, (int) (short) 10, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        boolean boolean34 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str41 = documentType39.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        org.jsoup.nodes.Node node43 = documentType39.clone();
        org.jsoup.nodes.Node node44 = documentType39.parentNode();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        documentType39.outerHtmlTail(stringBuilder45, (int) (byte) -1, outputSettings47);
        org.jsoup.nodes.Node node50 = documentType39.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str57 = documentType55.attr("hi!");
        java.lang.String str58 = documentType55.nodeName();
        org.jsoup.nodes.Node node60 = documentType55.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str61 = documentType55.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = documentType55.childNodes();
        boolean boolean63 = documentType39.equals((java.lang.Object) documentType55);
        boolean boolean64 = node9.equals((java.lang.Object) documentType55);
        node9.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#doctype" + "'", str58, "#doctype");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node35 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes36 = node35.attributes();
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
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "hi!", "#doctype");
        org.jsoup.nodes.Node node6 = documentType4.wrap("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (int) (byte) 1, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        java.lang.String str23 = node9.baseUri();
        java.lang.String str24 = node9.baseUri();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        java.lang.String str11 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        org.jsoup.nodes.Node node11 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        node5.setBaseUri("");
        org.jsoup.nodes.Node node13 = node5.attr("hi!", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        node13.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.Class<?> wildcardClass16 = node13.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        documentType4.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = documentType4.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        node5.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        java.lang.String str13 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        java.lang.String str15 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node9.childNodes();
        int int18 = node9.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node9.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node8.childNodes();
        node8.setBaseUri("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, (int) ' ', outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        boolean boolean24 = documentType20.hasAttr("");
        java.lang.String str26 = documentType20.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node28 = documentType20.removeAttr("#doctype");
        java.lang.String str30 = documentType20.absUrl("#doctype");
        boolean boolean31 = documentType4.equals((java.lang.Object) documentType20);
        org.jsoup.nodes.Node node32 = documentType20.parent();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.baseUri();
        org.jsoup.nodes.Node node14 = node9.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node14.before((org.jsoup.nodes.Node) documentType19);
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
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.previousSibling();
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
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, (int) (byte) 0, outputSettings10);
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        org.jsoup.nodes.Node node20 = documentType16.clone();
        org.jsoup.nodes.Node node21 = documentType16.clone();
        org.jsoup.nodes.Attributes attributes22 = node21.attributes();
        int int23 = node21.siblingIndex();
        java.lang.String str24 = node21.outerHtml();
        org.jsoup.nodes.Node node26 = node21.removeAttr("#doctype");
        org.jsoup.nodes.Node node28 = node21.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node34 = documentType33.clone();
        org.jsoup.nodes.Node node35 = documentType33.parent();
        org.jsoup.nodes.Document document36 = documentType33.ownerDocument();
        org.jsoup.nodes.Node node38 = documentType33.removeAttr("hi!");
        org.jsoup.nodes.Document document39 = documentType33.ownerDocument();
        org.jsoup.nodes.Document document40 = documentType33.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = documentType33.childNodes();
        boolean boolean42 = node21.equals((java.lang.Object) nodeList41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = documentType4.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str24, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNull(document40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "hi!", "<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node10 = documentType4.attr("hi!", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        boolean boolean22 = node17.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        org.jsoup.nodes.Node node21 = node17.nextSibling();
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        org.jsoup.nodes.Node node16 = node15.parentNode();
        org.jsoup.nodes.Node node19 = node15.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node15.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str5 = documentType4.baseUri();
        java.lang.String str6 = documentType4.outerHtml();
        boolean boolean8 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node10 = documentType4.wrap("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.childNodesCopy();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
            org.jsoup.nodes.Node node19 = node17.after("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.StringBuilder stringBuilder8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        documentType4.outerHtmlTail(stringBuilder8, 10, outputSettings10);
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("hi!");
        java.lang.String str14 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.jsoup.nodes.Attributes attributes16 = documentType4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        java.lang.Class<?> wildcardClass18 = node17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
            java.lang.Class<?> wildcardClass18 = node17.getClass();
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
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        org.jsoup.nodes.Node node16 = documentType4.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = documentType4.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        boolean boolean19 = node11.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node27.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str15 = node5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node5.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str13 = node5.outerHtml();
        org.jsoup.nodes.Node node14 = node5.clone();
        org.jsoup.nodes.Node node15 = node5.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Document document14 = documentType10.ownerDocument();
        boolean boolean15 = documentType4.equals((java.lang.Object) document14);
        org.jsoup.nodes.Node node16 = documentType4.clone();
        int int17 = node16.childNodeSize();
        org.jsoup.nodes.Attributes attributes18 = node16.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parentNode();
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
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        org.jsoup.nodes.Node node53 = documentType32.nextSibling();
        org.jsoup.nodes.DocumentType documentType58 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node59 = documentType58.clone();
        int int60 = node59.childNodeSize();
        org.jsoup.nodes.Node node61 = node59.previousSibling();
        org.jsoup.nodes.Node node63 = node59.removeAttr("#doctype");
        java.lang.String str64 = node63.toString();
        org.jsoup.nodes.DocumentType documentType69 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str71 = documentType69.attr("hi!");
        org.jsoup.nodes.Attributes attributes72 = documentType69.attributes();
        int int73 = documentType69.siblingIndex();
        java.lang.String str74 = documentType69.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList75 = documentType69.childNodesCopy();
        java.lang.String str76 = documentType69.nodeName();
        org.jsoup.nodes.Node node79 = documentType69.attr("#doctype", "hi!");
        int int80 = node79.siblingIndex();
        node79.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType87 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str89 = documentType87.attr("hi!");
        org.jsoup.nodes.Attributes attributes90 = documentType87.attributes();
        int int91 = documentType87.siblingIndex();
        int int92 = documentType87.childNodeSize();
        boolean boolean93 = node79.equals((java.lang.Object) documentType87);
        java.util.List<org.jsoup.nodes.Node> nodeList94 = node79.childNodes();
        boolean boolean95 = node63.equals((java.lang.Object) node79);
        node63.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node98 = node63.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node99 = node53.after(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str64, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(nodeList75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#doctype" + "'", str76, "#doctype");
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(attributes90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(nodeList94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(node98);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        java.lang.String str13 = node11.baseUri();
        org.jsoup.nodes.Node node14 = node11.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        boolean boolean18 = node5.equals((java.lang.Object) node17);
        org.jsoup.nodes.Node node19 = node17.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
            documentType4.outerHtmlHead(stringBuilder17, 10, outputSettings19);
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
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        int int28 = documentType4.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        org.jsoup.nodes.Node node23 = documentType18.clone();
        org.jsoup.nodes.Attributes attributes24 = node23.attributes();
        java.lang.String str26 = node23.attr("#doctype");
        org.jsoup.nodes.Node node27 = node23.clone();
        org.jsoup.nodes.Node node28 = node27.parent();
        org.jsoup.nodes.Node node29 = node27.nextSibling();
        org.jsoup.nodes.Node node30 = node27.nextSibling();
        org.jsoup.nodes.Node node32 = node27.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = node13.equals((java.lang.Object) node27);
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        org.jsoup.nodes.Node node18 = documentType4.clone();
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
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        java.lang.String str12 = node9.attr("#doctype");
        org.jsoup.nodes.Node node13 = node9.clone();
        int int14 = node9.childNodeSize();
        org.jsoup.nodes.Node node15 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.unwrap();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        java.lang.String str19 = node8.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str19, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node18.siblingNodes();
        org.jsoup.nodes.Node node21 = node18.parentNode();
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
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        java.lang.String str12 = node10.toString();
        int int13 = node10.childNodeSize();
        int int14 = node10.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        java.lang.String str11 = documentType4.baseUri();
        java.lang.String str13 = documentType4.attr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str28 = documentType26.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        org.jsoup.nodes.Node node30 = documentType26.clone();
        org.jsoup.nodes.Node node31 = documentType26.clone();
        org.jsoup.nodes.Attributes attributes32 = node31.attributes();
        int int33 = node31.siblingIndex();
        java.lang.String str34 = node31.baseUri();
        boolean boolean35 = node5.equals((java.lang.Object) node31);
        java.lang.String str36 = node5.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder7, (-1), outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.traverse(nodeVisitor19);
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
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.baseUri();
        java.lang.String str11 = documentType4.outerHtml();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.lang.String str13 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        org.jsoup.nodes.Node node10 = node9.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.nextSibling();
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
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("hi!");
        org.jsoup.nodes.Attributes attributes36 = documentType33.attributes();
        org.jsoup.nodes.Node node37 = documentType33.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType33.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = documentType33.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node14.after((org.jsoup.nodes.Node) documentType33);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList39);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        org.jsoup.nodes.Node node17 = documentType4.previousSibling();
        java.lang.String str18 = documentType4.nodeName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        org.jsoup.nodes.Node node7 = documentType4.parentNode();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.StringBuilder stringBuilder7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        documentType4.outerHtmlTail(stringBuilder7, (int) (short) 10, outputSettings9);
        boolean boolean12 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.nodes.Node node13 = documentType4.parent();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "#doctype", "hi!", "");
        java.lang.String str6 = documentType4.absUrl("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        java.lang.String str29 = documentType4.toString();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.before("#doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        java.lang.String str18 = node15.absUrl("<!DOCTYPE hi! \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        int int8 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node5.siblingNodes();
        boolean boolean11 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node5.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = node9.attributes();
        org.jsoup.nodes.Node node13 = node9.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.attr("hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int13 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodesCopy();
        documentType4.setBaseUri("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node17 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) '4', outputSettings12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        org.jsoup.nodes.Node node20 = node18.previousSibling();
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
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType15.wrap("");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        org.jsoup.nodes.Node node18 = node9.parentNode();
        org.jsoup.nodes.Document document19 = node9.ownerDocument();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        org.jsoup.nodes.Node node13 = node5.attr("#doctype", "");
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node5.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
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
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str15 = documentType13.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        java.lang.String str19 = documentType13.nodeName();
        java.lang.String str21 = documentType13.attr("");
        java.lang.String str22 = documentType13.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#doctype" + "'", str19, "#doctype");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str22, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        org.jsoup.nodes.Node node43 = node8.parentNode();
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
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = documentType4.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        org.jsoup.nodes.Node node17 = documentType4.parent();
        org.jsoup.nodes.DocumentType documentType22 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str24 = documentType22.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes25 = documentType22.attributes();
        org.jsoup.nodes.Document document26 = documentType22.ownerDocument();
        documentType22.setBaseUri("hi!");
        org.jsoup.nodes.Node node31 = documentType22.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.StringBuilder stringBuilder32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        documentType22.outerHtmlTail(stringBuilder32, (int) (short) 0, outputSettings34);
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith((org.jsoup.nodes.Node) documentType22);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str18 = documentType16.attr("hi!");
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        int int20 = documentType16.siblingIndex();
        java.lang.String str21 = documentType16.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType16.childNodesCopy();
        org.jsoup.nodes.Node node25 = documentType16.attr("#doctype", "#doctype");
        boolean boolean27 = node25.hasAttr("");
        boolean boolean28 = documentType4.equals((java.lang.Object) boolean27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = documentType4.after("<!DOCTYPE hi! PUBLIC \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Node node11 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int12 = node5.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node5.childNodesCopy();
        org.jsoup.nodes.Node node14 = node5.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        org.jsoup.nodes.Document document25 = node24.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = document25.before("hi!");
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str9 = documentType4.absUrl("hi!");
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("#doctype");
        java.lang.String str12 = node11.baseUri();
        java.lang.String str13 = node11.baseUri();
        java.lang.String str15 = node11.absUrl("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        org.jsoup.nodes.Node node19 = node16.clone();
        java.lang.String str21 = node16.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.Class<?> wildcardClass22 = node16.getClass();
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = node8.toString();
        org.jsoup.nodes.Node node11 = node8.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes12 = node8.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str9 = node5.absUrl("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node5.childNodes();
        org.jsoup.nodes.Node node12 = node5.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.lang.StringBuilder stringBuilder5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        documentType4.outerHtmlTail(stringBuilder5, (int) (short) 0, outputSettings7);
        java.lang.String str9 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType14.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.before((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        java.lang.String str8 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str10 = documentType4.attr("");
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document13.traverse(nodeVisitor14);
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
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = documentType15.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
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
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        java.lang.String str16 = documentType4.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        java.lang.String str30 = node28.absUrl("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        java.lang.String str20 = documentType4.attr("#doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("hi!");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        int int25 = documentType21.siblingIndex();
        java.lang.String str26 = documentType21.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodesCopy();
        java.lang.String str29 = documentType21.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = documentType21.childNodes();
        java.lang.String str31 = documentType21.toString();
        boolean boolean32 = node8.equals((java.lang.Object) str31);
        org.jsoup.nodes.Node node33 = node8.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        java.lang.String str12 = documentType4.toString();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, (int) 'a', outputSettings15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        org.jsoup.nodes.Node node23 = node5.previousSibling();
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
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = documentType4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        java.lang.String str19 = node11.baseUri();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        org.jsoup.nodes.Node node13 = node10.wrap("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str14 = node10.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        java.lang.Class<?> wildcardClass19 = documentType4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.toString();
        java.lang.StringBuilder stringBuilder11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        documentType4.outerHtmlTail(stringBuilder11, 1, outputSettings13);
        org.jsoup.nodes.Node node15 = documentType4.parentNode();
        org.jsoup.nodes.Node node16 = documentType4.nextSibling();
        org.jsoup.nodes.Node node17 = documentType4.clone();
        java.lang.StringBuilder stringBuilder18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder18, (int) (byte) -1, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        int int17 = node16.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node16.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        java.lang.StringBuilder stringBuilder25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType20.outerHtmlHead(stringBuilder25, (int) (byte) 1, outputSettings27);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        java.lang.String str27 = node8.baseUri();
        org.jsoup.nodes.Node node29 = node8.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.jsoup.nodes.Node node30 = node8.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "hi!", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">" + "'", str5, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node26.before("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        boolean boolean18 = documentType4.hasAttr("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        int int25 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        boolean boolean34 = node9.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str41 = documentType39.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        org.jsoup.nodes.Node node43 = documentType39.clone();
        org.jsoup.nodes.Node node44 = documentType39.parentNode();
        java.lang.StringBuilder stringBuilder45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        documentType39.outerHtmlTail(stringBuilder45, (int) (byte) -1, outputSettings47);
        org.jsoup.nodes.Node node50 = documentType39.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str57 = documentType55.attr("hi!");
        java.lang.String str58 = documentType55.nodeName();
        org.jsoup.nodes.Node node60 = documentType55.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str61 = documentType55.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = documentType55.childNodes();
        boolean boolean63 = documentType39.equals((java.lang.Object) documentType55);
        boolean boolean64 = node9.equals((java.lang.Object) documentType55);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = node9.childNodes();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#doctype" + "'", str58, "#doctype");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeList65);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node5.siblingNodes();
        java.lang.String str7 = node5.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.Node node10 = node5.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        int int11 = node10.siblingIndex();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">" + "'", str7, "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        org.jsoup.nodes.Document document26 = node20.ownerDocument();
        org.jsoup.nodes.Node node27 = node20.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node20.after("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
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
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        org.jsoup.nodes.DocumentType documentType41 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node42 = documentType41.clone();
        org.jsoup.nodes.Document document43 = node42.ownerDocument();
        int int44 = node42.siblingIndex();
        org.jsoup.nodes.Node node45 = node42.nextSibling();
        org.jsoup.nodes.Attributes attributes46 = node42.attributes();
        org.jsoup.nodes.Node node47 = node42.previousSibling();
        java.lang.String str49 = node42.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = node34.before(node42);
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
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
            org.jsoup.nodes.Node node18 = documentType4.childNode((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
            org.jsoup.nodes.Node node17 = documentType4.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        org.jsoup.nodes.Node node7 = node5.previousSibling();
        org.jsoup.nodes.Node node9 = node5.removeAttr("#doctype");
        java.lang.String str10 = node5.baseUri();
        int int11 = node5.childNodeSize();
        int int12 = node5.siblingIndex();
        org.jsoup.nodes.Node node13 = node5.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        java.util.List<org.jsoup.nodes.Node> nodeList36 = documentType15.childNodesCopy();
        java.lang.StringBuilder stringBuilder37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        documentType15.outerHtmlTail(stringBuilder37, (int) '#', outputSettings39);
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
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes10 = node9.attributes();
        int int11 = node9.siblingIndex();
        java.lang.String str12 = node9.outerHtml();
        org.jsoup.nodes.Node node14 = node9.removeAttr("#doctype");
        int int15 = node9.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node9.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        java.util.List<org.jsoup.nodes.Node> nodeList35 = documentType22.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.absUrl("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        org.jsoup.nodes.Node node16 = node8.previousSibling();
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document7 = documentType4.ownerDocument();
        java.lang.String str8 = documentType4.nodeName();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.siblingNodes();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        java.lang.StringBuilder stringBuilder13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        documentType4.outerHtmlTail(stringBuilder13, 100, outputSettings15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("#doctype");
        org.jsoup.nodes.Node node12 = node10.removeAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        boolean boolean14 = node10.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node10.setBaseUri("<!DOCTYPE #doctype \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        int int13 = documentType4.childNodeSize();
        java.lang.String str14 = documentType4.nodeName();
        int int15 = documentType4.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.before("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#doctype" + "'", str14, "#doctype");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node8 = documentType4.previousSibling();
        boolean boolean10 = documentType4.hasAttr("#doctype");
        org.jsoup.nodes.Node node11 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
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
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "#doctype", "#doctype");
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
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">", "");
        boolean boolean13 = documentType4.hasAttr("hi!");
        java.lang.String str14 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes15 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        org.jsoup.nodes.Node node32 = node24.parentNode();
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        int int10 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document11 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.outerHtml();
        java.lang.String str13 = documentType4.outerHtml();
        java.lang.String str14 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        documentType4.setBaseUri("#doctype");
        java.lang.String str8 = documentType4.attr("#doctype");
        java.lang.String str9 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        org.jsoup.nodes.Node node16 = node9.nextSibling();
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
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node5.childNodesCopy();
        org.jsoup.nodes.Node node10 = node5.removeAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.lang.String str11 = node10.baseUri();
        java.lang.String str12 = node10.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "#doctype", "hi!", "");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str12 = documentType10.attr("hi!");
        org.jsoup.nodes.Attributes attributes13 = documentType10.attributes();
        org.jsoup.nodes.Node node14 = documentType10.clone();
        int int15 = node14.siblingIndex();
        java.lang.String str16 = node14.outerHtml();
        org.jsoup.nodes.Node node17 = node14.parent();
        org.jsoup.nodes.Node node18 = node14.clone();
        java.lang.String str20 = node18.attr("hi!");
        boolean boolean22 = node18.hasAttr("");
        int int23 = node18.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.before(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
        int int32 = node8.childNodeSize();
        java.lang.String str33 = node8.outerHtml();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str40 = documentType38.attr("hi!");
        java.lang.String str42 = documentType38.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str44 = documentType38.attr("");
        org.jsoup.nodes.Node node45 = documentType38.parentNode();
        org.jsoup.nodes.Node node48 = documentType38.attr("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node8.after((org.jsoup.nodes.Node) documentType38);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Document document16 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("hi!");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        int int25 = documentType21.siblingIndex();
        java.lang.String str26 = documentType21.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodesCopy();
        java.lang.String str29 = documentType21.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str30 = documentType21.outerHtml();
        java.lang.String str31 = documentType21.toString();
        org.jsoup.nodes.Node node32 = documentType21.clone();
        documentType21.setBaseUri("");
        java.lang.String str35 = documentType21.toString();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType21);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str30, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        org.jsoup.nodes.Node node8 = node5.parent();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        org.jsoup.nodes.Node node10 = node5.clone();
        java.lang.String str11 = node5.outerHtml();
        boolean boolean13 = node5.hasAttr("<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        boolean boolean7 = node5.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node10 = node5.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "#doctype");
        int int11 = node10.childNodeSize();
        node10.setBaseUri("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> \"<!DOCTYPE hi! PUBLIC \"hi!\" \"hi!\">\">");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        java.lang.String str11 = documentType4.absUrl("hi!");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        int int14 = documentType4.childNodeSize();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 1, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Document document6 = node5.ownerDocument();
        int int7 = node5.siblingIndex();
        org.jsoup.nodes.Node node8 = node5.nextSibling();
        org.jsoup.nodes.Attributes attributes9 = node5.attributes();
        java.lang.String str10 = node5.toString();
        java.lang.String str12 = node5.absUrl("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\"> PUBLIC \"#doctype\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node5.attr("", "<!DOCTYPE hi! \"hi!\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        org.jsoup.nodes.Node node24 = node5.wrap("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE #doctype PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">", "", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        int int31 = documentType15.siblingIndex();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str38 = documentType36.attr("hi!");
        org.jsoup.nodes.Attributes attributes39 = documentType36.attributes();
        org.jsoup.nodes.Node node40 = documentType36.clone();
        int int41 = node40.siblingIndex();
        java.lang.String str42 = node40.outerHtml();
        org.jsoup.nodes.Node node43 = node40.clone();
        boolean boolean45 = node40.hasAttr("");
        org.jsoup.nodes.Node node46 = node40.previousSibling();
        java.lang.String str48 = node40.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = node40.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType15.replaceWith(node40);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str42, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(nodeList49);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        documentType4.setBaseUri("");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str19 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        org.jsoup.nodes.Document document21 = documentType17.ownerDocument();
        org.jsoup.nodes.Node node24 = documentType17.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.lang.String str26 = documentType17.attr("#doctype");
        org.jsoup.nodes.Node node27 = documentType17.clone();
        boolean boolean28 = documentType4.equals((java.lang.Object) node27);
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str35 = documentType33.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document36 = documentType33.ownerDocument();
        java.lang.String str37 = documentType33.nodeName();
        java.lang.String str38 = documentType33.baseUri();
        int int39 = documentType33.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node27.before((org.jsoup.nodes.Node) documentType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#doctype" + "'", str37, "#doctype");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        org.jsoup.nodes.Node node11 = node9.nextSibling();
        boolean boolean13 = node9.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str20 = documentType18.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes21 = documentType18.attributes();
        org.jsoup.nodes.Node node22 = documentType18.clone();
        org.jsoup.nodes.Node node23 = documentType18.clone();
        org.jsoup.nodes.Node node25 = documentType18.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str26 = documentType18.nodeName();
        org.jsoup.nodes.DocumentType documentType31 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str33 = documentType31.attr("hi!");
        org.jsoup.nodes.Attributes attributes34 = documentType31.attributes();
        int int35 = documentType31.siblingIndex();
        org.jsoup.nodes.Node node36 = documentType31.previousSibling();
        java.lang.String str37 = documentType31.baseUri();
        org.jsoup.nodes.Node node38 = documentType31.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = documentType31.childNodesCopy();
        java.lang.String str40 = documentType31.baseUri();
        boolean boolean41 = documentType18.equals((java.lang.Object) documentType31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = node9.before((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#doctype" + "'", str26, "#doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
            node12.remove();
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
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str40 = documentType38.attr("hi!");
        org.jsoup.nodes.Attributes attributes41 = documentType38.attributes();
        int int42 = documentType38.siblingIndex();
        java.lang.String str43 = documentType38.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = documentType38.childNodesCopy();
        org.jsoup.nodes.Node node47 = documentType38.attr("#doctype", "#doctype");
        java.lang.String str49 = documentType38.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node50 = documentType38.parentNode();
        boolean boolean51 = documentType15.equals((java.lang.Object) node50);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document52 = node50.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str33, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "hi!");
        java.lang.String str13 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.clone();
        org.jsoup.nodes.Node node16 = node14.removeAttr("hi!");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str23 = documentType21.attr("hi!");
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        int int25 = documentType21.siblingIndex();
        java.lang.String str26 = documentType21.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType21.childNodesCopy();
        java.lang.String str28 = documentType21.nodeName();
        java.lang.StringBuilder stringBuilder29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        documentType21.outerHtmlTail(stringBuilder29, (int) (byte) -1, outputSettings31);
        java.lang.String str33 = documentType21.baseUri();
        boolean boolean35 = documentType21.hasAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Attributes attributes36 = documentType21.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node16.after((org.jsoup.nodes.Node) documentType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.parent();
        org.jsoup.nodes.Node node7 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            documentType4.outerHtmlHead(stringBuilder10, (int) '#', outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        int int10 = node9.siblingIndex();
        boolean boolean12 = node9.equals((java.lang.Object) "hi!");
        int int13 = node9.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node9.childNodes();
        java.lang.Class<?> wildcardClass15 = node9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        boolean boolean8 = documentType4.hasAttr("");
        java.lang.String str10 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node13 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">", "");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.lang.StringBuilder stringBuilder15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        documentType4.outerHtmlTail(stringBuilder15, 10, outputSettings17);
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str25 = documentType23.attr("hi!");
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        int int27 = documentType23.siblingIndex();
        java.lang.String str28 = documentType23.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = documentType23.childNodesCopy();
        java.lang.String str30 = documentType23.nodeName();
        org.jsoup.nodes.Node node33 = documentType23.attr("#doctype", "hi!");
        int int34 = node33.siblingIndex();
        node33.setBaseUri("#doctype");
        org.jsoup.nodes.DocumentType documentType41 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str43 = documentType41.attr("hi!");
        org.jsoup.nodes.Attributes attributes44 = documentType41.attributes();
        int int45 = documentType41.siblingIndex();
        int int46 = documentType41.childNodeSize();
        boolean boolean47 = node33.equals((java.lang.Object) documentType41);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = node33.childNodes();
        java.lang.String str49 = node33.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = documentType4.before(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str49, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node38.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        java.lang.String str25 = documentType13.outerHtml();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str25, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        java.lang.String str10 = node8.outerHtml();
        node8.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node8.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = document7.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        int int6 = node5.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodes();
        java.lang.String str8 = node5.baseUri();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node5.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.parent();
        java.lang.StringBuilder stringBuilder10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        documentType4.outerHtmlTail(stringBuilder10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Document document14 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node20 = documentType19.parentNode();
        int int21 = documentType19.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = documentType4.after((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes12 = documentType4.attributes();
        org.jsoup.nodes.Node node13 = documentType4.previousSibling();
        org.jsoup.nodes.Node node14 = documentType4.parentNode();
        int int15 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str22 = documentType20.attr("hi!");
        java.lang.String str23 = documentType20.nodeName();
        org.jsoup.nodes.Node node25 = documentType20.wrap("<!DOCTYPE hi! PUBLIC \"hi!\">");
        java.lang.String str26 = documentType20.baseUri();
        java.lang.String str27 = documentType20.outerHtml();
        org.jsoup.nodes.Node node28 = documentType20.parent();
        java.lang.String str29 = documentType20.toString();
        org.jsoup.nodes.Node node30 = documentType20.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType20);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#doctype" + "'", str23, "#doctype");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str29, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.lang.String str21 = node9.outerHtml();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str28 = documentType26.attr("hi!");
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        org.jsoup.nodes.Node node30 = documentType26.clone();
        int int31 = node30.siblingIndex();
        java.lang.String str32 = node30.outerHtml();
        org.jsoup.nodes.Node node33 = node30.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.childNodesCopy();
        boolean boolean35 = node9.equals((java.lang.Object) nodeList34);
        boolean boolean37 = node9.hasAttr("<!DOCTYPE hi! \"hi!\">");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str32, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str13 = documentType12.baseUri();
        boolean boolean14 = documentType4.equals((java.lang.Object) str13);
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        node5.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Attributes attributes8 = node5.attributes();
        org.jsoup.nodes.Node node9 = node5.clone();
        org.jsoup.nodes.Node node10 = node9.clone();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str17 = documentType15.attr("hi!");
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        int int19 = documentType15.siblingIndex();
        org.jsoup.nodes.Node node20 = documentType15.previousSibling();
        java.lang.String str21 = documentType15.baseUri();
        org.jsoup.nodes.Node node22 = documentType15.parentNode();
        org.jsoup.nodes.Attributes attributes23 = documentType15.attributes();
        int int24 = documentType15.siblingIndex();
        boolean boolean26 = documentType15.hasAttr("<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str27 = documentType15.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node10.before((org.jsoup.nodes.Node) documentType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str27, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        org.jsoup.nodes.Node node20 = node13.removeAttr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.childNodes();
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.lang.String str9 = documentType4.attr("hi!");
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node12 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.attr("<!DOCTYPE hi! PUBLIC \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"#doctype\" \"<!DOCTYPE #doctype PUBLIC \"hi!\" \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = documentType4.unwrap();
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
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes9 = documentType4.attributes();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("hi!");
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
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
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        java.lang.String str28 = documentType4.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = documentType4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        java.lang.String str34 = documentType16.absUrl("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = documentType16.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        org.jsoup.nodes.Node node18 = node8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.previousSibling();
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
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str6 = documentType4.attr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodesCopy();
        java.lang.String str11 = documentType4.nodeName();
        org.jsoup.nodes.Node node12 = documentType4.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodesCopy();
        java.lang.String str15 = documentType4.absUrl("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        org.jsoup.nodes.Node node16 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("#doctype", "<!DOCTYPE hi! PUBLIC \"hi!\">", "", "hi!");
        org.jsoup.nodes.Node node22 = documentType21.clone();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "");
        java.lang.String str29 = documentType27.attr("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Document document30 = documentType27.ownerDocument();
        java.lang.String str31 = documentType27.nodeName();
        java.lang.String str32 = documentType27.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = documentType27.siblingNodes();
        java.lang.String str34 = documentType27.nodeName();
        org.jsoup.nodes.Node node35 = documentType27.parent();
        java.lang.String str36 = documentType27.nodeName();
        boolean boolean37 = node22.equals((java.lang.Object) documentType27);
        org.jsoup.nodes.Node node40 = documentType27.attr("<!DOCTYPE hi! PUBLIC \"hi!\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">", "<!DOCTYPE #doctype PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node40);
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
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#doctype" + "'", str31, "#doctype");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#doctype" + "'", str36, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
    }
}

