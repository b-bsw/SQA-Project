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
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        org.jsoup.nodes.Node node16 = comment2.nextSibling();
        org.jsoup.nodes.Node node17 = comment2.nextSibling();
        java.lang.String str18 = comment2.nodeName();
        java.lang.String str19 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        comment2.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.lang.String str10 = comment2.attr("#comment");
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        java.lang.String str12 = comment2.nodeName();
        boolean boolean13 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node15 = comment2.root();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = comment2.root();
        boolean boolean13 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        java.lang.String str15 = comment2.attr("hi!");
        org.jsoup.nodes.Node node18 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        java.lang.String str21 = comment2.outerHtml();
        org.jsoup.nodes.Node node22 = comment2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment2.childNodes();
        java.lang.String str24 = comment2.nodeName();
        org.jsoup.nodes.Node node25 = comment2.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        org.jsoup.nodes.Node node16 = comment11.attr("", "");
        java.lang.String str17 = comment11.getData();
        int int18 = comment11.siblingIndex();
        boolean boolean20 = comment11.hasAttr("#comment");
        java.lang.String str21 = comment11.getData();
        boolean boolean23 = comment11.hasAttr("");
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node29 = comment26.nextSibling();
        int int30 = comment26.childNodeSize();
        boolean boolean31 = comment11.equals((java.lang.Object) int30);
        boolean boolean32 = comment2.equals((java.lang.Object) boolean31);
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        comment2.outerHtmlTail(appendable33, 100, outputSettings35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.siblingNodes();
        boolean boolean13 = comment2.equals((java.lang.Object) nodeList12);
        int int14 = comment2.childNodeSize();
        org.jsoup.nodes.Node node16 = comment2.wrap("\n<!--#comment-->");
        boolean boolean17 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.baseUri();
        int int11 = comment2.childNodeSize();
        int int12 = comment2.childNodeSize();
        java.lang.String str13 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        boolean boolean4 = comment2.hasParent();
        java.lang.String str6 = comment2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.after("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        boolean boolean22 = comment19.hasParent();
        java.lang.String str24 = comment19.absUrl("hi!");
        org.jsoup.nodes.Node node26 = comment19.removeAttr("");
        org.jsoup.nodes.Node node27 = comment19.previousSibling();
        int int28 = comment19.siblingIndex();
        org.jsoup.nodes.Node node29 = comment19.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = comment19.asXmlDeclaration();
        boolean boolean31 = comment2.hasSameValue((java.lang.Object) comment19);
        org.jsoup.nodes.Node node32 = comment19.shallowClone();
        org.jsoup.nodes.Node node33 = comment19.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, 0, outputSettings13);
        org.jsoup.nodes.Node node15 = comment8.clone();
        org.jsoup.nodes.Node node16 = node15.shallowClone();
        java.lang.String str17 = node16.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--#comment-->" + "'", str17, "\n<!--#comment-->");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str6 = comment2.attr("hi!");
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node10 = comment2.removeAttr("hi!");
        int int11 = comment2.childNodeSize();
        org.jsoup.nodes.Node node12 = comment2.root();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        java.lang.String str14 = comment2.outerHtml();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        boolean boolean22 = comment19.hasParent();
        org.jsoup.nodes.Node node25 = comment19.attr("", "hi!");
        java.lang.String str27 = comment19.attr("");
        org.jsoup.nodes.Document document28 = comment19.ownerDocument();
        java.lang.String str29 = comment19.getData();
        java.lang.String str30 = comment19.getData();
        org.jsoup.nodes.Node node33 = comment19.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        boolean boolean34 = node16.equals((java.lang.Object) node33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!---->" + "'", str14, "\n<!---->");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        int int17 = comment2.siblingIndex();
        boolean boolean18 = comment2.hasParent();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment2.outerHtmlTail(appendable19, (-1), outputSettings21);
        org.jsoup.nodes.Node node23 = comment2.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        java.lang.String str13 = comment2.nodeName();
        java.lang.String str14 = comment2.nodeName();
        java.lang.String str15 = comment2.getData();
        org.jsoup.nodes.Node node17 = comment2.removeAttr("");
        java.lang.String str18 = comment2.nodeName();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        int int24 = comment21.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment21.siblingNodes();
        comment21.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = comment21.nextSibling();
        java.lang.String str29 = comment21.nodeName();
        boolean boolean30 = comment21.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment2.before((org.jsoup.nodes.Node) comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#comment" + "'", str29, "#comment");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node11 = comment2.previousSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        boolean boolean11 = node8.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
        java.lang.String str13 = node8.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node8.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        int int17 = comment2.siblingIndex();
        org.jsoup.nodes.Node node19 = comment2.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment2.childNodes();
        org.jsoup.nodes.Node node24 = comment2.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str28 = comment27.getData();
        org.jsoup.nodes.Document document29 = comment27.ownerDocument();
        org.jsoup.nodes.Node node32 = comment27.attr("", "");
        java.lang.String str33 = comment27.getData();
        int int34 = comment27.siblingIndex();
        boolean boolean36 = comment27.hasAttr("#comment");
        java.lang.String str37 = comment27.getData();
        java.lang.String str38 = comment27.toString();
        boolean boolean39 = comment27.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = comment2.before((org.jsoup.nodes.Node) comment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\n<!--hi!-->" + "'", str38, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node11 = comment10.root();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment10.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment10.asXmlDeclaration();
        comment10.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node16 = comment10.shallowClone();
        boolean boolean17 = node7.hasSameValue((java.lang.Object) node16);
        node7.setBaseUri("\n<!---->");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Document document24 = comment22.ownerDocument();
        org.jsoup.nodes.Node node27 = comment22.attr("", "");
        boolean boolean28 = comment22.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes29 = comment22.attributes();
        int int30 = comment22.childNodeSize();
        boolean boolean31 = node7.hasSameValue((java.lang.Object) comment22);
        org.jsoup.nodes.Comment comment33 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node34 = comment33.shallowClone();
        boolean boolean36 = comment33.hasAttr("\n<!---->");
        java.lang.String str37 = comment33.baseUri();
        boolean boolean38 = comment22.equals((java.lang.Object) comment33);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = comment22.asXmlDeclaration();
        boolean boolean40 = comment22.isXmlDeclaration();
        boolean boolean42 = comment22.hasAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        java.lang.String str7 = comment2.nodeName();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str12 = comment10.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment10.childNodesCopy();
        java.lang.String str14 = comment10.getData();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = comment17.hasParent();
        java.lang.String str22 = comment17.absUrl("hi!");
        org.jsoup.nodes.Node node24 = comment17.removeAttr("");
        org.jsoup.nodes.Node node25 = comment17.previousSibling();
        boolean boolean26 = comment10.equals((java.lang.Object) node25);
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment10.outerHtmlTail(appendable27, (int) (byte) 10, outputSettings29);
        boolean boolean31 = comment2.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.jsoup.nodes.Node node9 = comment2.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment12.childNodes();
        org.jsoup.nodes.Node node14 = comment12.clone();
        org.jsoup.nodes.Node node15 = comment12.shallowClone();
        org.jsoup.nodes.Node node16 = node15.root();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node15.childNodesCopy();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        boolean boolean23 = comment20.hasParent();
        org.jsoup.nodes.Node node26 = comment20.attr("", "hi!");
        java.lang.String str28 = comment20.attr("");
        org.jsoup.nodes.Document document29 = comment20.ownerDocument();
        org.jsoup.nodes.Node node31 = comment20.removeAttr("#comment");
        java.lang.String str32 = comment20.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = comment20.childNodesCopy();
        boolean boolean34 = comment20.isXmlDeclaration();
        boolean boolean35 = node15.equals((java.lang.Object) comment20);
        org.jsoup.nodes.Node node36 = node15.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#comment" + "'", str32, "#comment");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        boolean boolean13 = comment2.hasAttr("");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Document document18 = comment16.ownerDocument();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        boolean boolean24 = comment21.hasParent();
        org.jsoup.nodes.Node node27 = comment21.attr("", "hi!");
        java.lang.String str29 = comment21.attr("");
        org.jsoup.nodes.Document document30 = comment21.ownerDocument();
        org.jsoup.nodes.Node node32 = comment21.removeAttr("#comment");
        java.lang.String str33 = comment21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment21.childNodesCopy();
        boolean boolean35 = comment16.hasSameValue((java.lang.Object) nodeList34);
        boolean boolean36 = comment2.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node38 = comment2.removeAttr("\n<!--#comment-->");
        java.lang.String str39 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        java.lang.String str12 = comment2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node17 = comment2.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "#comment");
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node24 = comment20.removeAttr("<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment2.clone();
        org.jsoup.nodes.Document document13 = comment2.ownerDocument();
        java.lang.Class<?> wildcardClass14 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!---->");
        java.lang.String str2 = comment1.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment1.siblingNodes();
        boolean boolean4 = comment1.hasParent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n<!--\n<!---->-->" + "'", str2, "\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment7.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment7.childNodes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment7.outerHtmlTail(appendable12, 100, outputSettings14);
        boolean boolean16 = comment2.equals((java.lang.Object) comment7);
        java.lang.String str17 = comment7.toString();
        java.lang.String str18 = comment7.outerHtml();
        org.jsoup.nodes.Node node20 = comment7.removeAttr("\n<!--\n<!--\n<!---->-->-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment2.attr("hi!", "\n<!---->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str21 = comment19.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.childNodesCopy();
        boolean boolean23 = comment19.isXmlDeclaration();
        int int24 = comment19.childNodeSize();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment19.outerHtmlTail(appendable25, (int) ' ', outputSettings27);
        java.lang.String str30 = comment19.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment19.childNodes();
        org.jsoup.nodes.Node node34 = comment19.attr("\n<!--hi!-->", "\n<!---->");
        int int35 = comment19.childNodeSize();
        boolean boolean36 = comment2.equals((java.lang.Object) comment19);
        int int37 = comment19.childNodeSize();
        boolean boolean39 = comment19.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        boolean boolean11 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        org.jsoup.nodes.Node node10 = comment2.clearAttributes();
        org.jsoup.nodes.Node node11 = comment2.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str13 = comment11.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.childNodesCopy();
        org.jsoup.nodes.Node node17 = comment11.attr("#comment", "");
        org.jsoup.nodes.Node node18 = comment11.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment11.outerHtmlTail(appendable19, 100, outputSettings21);
        boolean boolean23 = comment11.isXmlDeclaration();
        org.jsoup.nodes.Node node25 = comment11.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node31 = comment28.nextSibling();
        java.lang.String str32 = comment28.toString();
        java.lang.String str33 = comment28.toString();
        boolean boolean34 = comment11.hasSameValue((java.lang.Object) comment28);
        boolean boolean35 = comment2.hasSameValue((java.lang.Object) comment28);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n<!--hi!-->" + "'", str32, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n<!--hi!-->" + "'", str33, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.lang.String str8 = comment2.absUrl("\n<!--hi!-->");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (int) (byte) -1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment7.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment7.childNodes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment7.outerHtmlTail(appendable12, 100, outputSettings14);
        boolean boolean16 = comment2.equals((java.lang.Object) comment7);
        org.jsoup.nodes.Node node17 = comment7.root();
        int int18 = comment7.siblingIndex();
        org.jsoup.nodes.Node node21 = comment7.attr("", "#comment");
        org.jsoup.nodes.Node node22 = comment7.root();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node26 = comment25.root();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment25.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = comment25.asXmlDeclaration();
        org.jsoup.nodes.Document document29 = comment25.ownerDocument();
        java.lang.Class<?> wildcardClass30 = comment25.getClass();
        boolean boolean31 = comment7.equals((java.lang.Object) comment25);
        org.jsoup.nodes.Node node32 = comment25.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(xmlDeclaration28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        java.lang.String str21 = comment2.outerHtml();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment2.outerHtmlTail(appendable22, (int) '4', outputSettings24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str3 = comment2.nodeName();
        org.jsoup.nodes.Node node4 = comment2.parentNode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        java.lang.String str17 = comment2.outerHtml();
        org.jsoup.nodes.Node node20 = comment2.attr("\n<!---->", "\n<!--\n<!---->-->");
        int int21 = node20.siblingIndex();
        boolean boolean22 = node20.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.String str6 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.siblingNodes();
        org.jsoup.nodes.Node node8 = comment2.clone();
        java.lang.String str10 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        boolean boolean11 = comment2.hasParent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, 1, outputSettings11);
        java.lang.String str13 = comment2.baseUri();
        java.lang.String str14 = comment2.baseUri();
        org.jsoup.nodes.Node node17 = comment2.attr("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node18 = node17.clone();
        org.jsoup.nodes.Node node19 = node18.root();
        // The following exception was thrown during execution in test generation
        try {
            node18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.Class<?> wildcardClass5 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        int int11 = comment2.childNodeSize();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.clone();
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parent();
        java.lang.String str8 = comment2.absUrl("\n<!---->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.removeAttr("\n<!--\n<!---->-->");
        java.lang.String str14 = comment2.getData();
        java.lang.String str15 = comment2.getData();
        org.jsoup.nodes.Node node18 = comment2.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "hi!");
        java.lang.String str3 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!---->", "hi!");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        org.jsoup.nodes.Node node14 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        org.jsoup.nodes.Document document14 = comment2.ownerDocument();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        boolean boolean22 = comment19.hasParent();
        java.lang.String str24 = comment19.absUrl("hi!");
        org.jsoup.nodes.Node node25 = comment19.parentNode();
        comment19.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes28 = comment19.attributes();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        comment19.outerHtmlTail(appendable29, (int) '4', outputSettings31);
        org.jsoup.nodes.Attributes attributes33 = comment19.attributes();
        org.jsoup.nodes.Node node34 = comment19.previousSibling();
        boolean boolean35 = comment2.hasSameValue((java.lang.Object) node34);
        java.lang.String str36 = comment2.nodeName();
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str41 = comment39.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = comment39.childNodesCopy();
        boolean boolean43 = comment39.isXmlDeclaration();
        int int44 = comment39.childNodeSize();
        org.jsoup.nodes.Node node45 = comment39.parent();
        org.jsoup.nodes.Comment comment48 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean50 = comment48.hasSameValue((java.lang.Object) 1);
        int int51 = comment48.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = comment48.siblingNodes();
        java.lang.String str53 = comment48.outerHtml();
        org.jsoup.nodes.Node node54 = comment48.root();
        org.jsoup.nodes.Node node55 = comment48.root();
        java.lang.String str56 = comment48.getData();
        org.jsoup.nodes.Node node59 = comment48.attr("hi!", "hi!");
        int int60 = comment48.siblingIndex();
        org.jsoup.nodes.Comment comment62 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node63 = comment62.root();
        org.jsoup.nodes.Node node64 = comment62.clone();
        boolean boolean65 = comment48.hasSameValue((java.lang.Object) comment62);
        boolean boolean66 = comment39.hasSameValue((java.lang.Object) comment48);
        int int67 = comment39.childNodeSize();
        java.lang.String str68 = comment39.getData();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#comment" + "'", str36, "#comment");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\n<!--hi!-->" + "'", str53, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        java.lang.String str15 = comment2.attr("hi!");
        java.lang.String str17 = comment2.absUrl("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        java.lang.String str3 = comment2.toString();
        org.jsoup.nodes.Node node5 = comment2.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        boolean boolean7 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        java.lang.String str9 = node8.outerHtml();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!---->" + "'", str9, "\n<!---->");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--hi!-->");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment2.outerHtmlTail(appendable16, (-1), outputSettings18);
        boolean boolean20 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node21 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        java.lang.String str3 = comment2.toString();
        org.jsoup.nodes.Node node5 = comment2.wrap("\n<!---->");
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!--\n<!---->-->");
        int int8 = comment2.childNodeSize();
        org.jsoup.nodes.Node node11 = comment2.attr("#comment", "hi!");
        org.jsoup.nodes.Node node13 = comment2.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        int int17 = comment14.siblingIndex();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node23 = comment20.nextSibling();
        boolean boolean24 = comment14.equals((java.lang.Object) comment20);
        org.jsoup.nodes.Node node25 = comment14.root();
        org.jsoup.nodes.Node node26 = comment14.shallowClone();
        boolean boolean27 = comment14.isXmlDeclaration();
        org.jsoup.nodes.Node node30 = comment14.attr("#comment", "");
        org.jsoup.nodes.Node node33 = comment14.attr("\n<!--hi!-->", "<?i?>");
        boolean boolean34 = comment14.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment2.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document7.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        boolean boolean15 = comment10.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean16 = comment10.isXmlDeclaration();
        boolean boolean17 = comment10.hasParent();
        org.jsoup.nodes.Node node19 = comment10.removeAttr("\n<!---->");
        boolean boolean20 = comment10.hasParent();
        java.lang.String str21 = comment10.nodeName();
        org.jsoup.nodes.Node node22 = comment10.shallowClone();
        org.jsoup.nodes.Node node23 = comment10.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment1.after((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node22 = comment19.nextSibling();
        java.lang.String str23 = comment19.toString();
        java.lang.String str24 = comment19.toString();
        boolean boolean25 = comment2.hasSameValue((java.lang.Object) comment19);
        org.jsoup.select.NodeFilter nodeFilter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment19.filter(nodeFilter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        java.lang.String str8 = comment2.getData();
        java.lang.String str10 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable12, (int) (byte) 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("hi!");
        java.lang.String str15 = comment2.toString();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node18 = comment2.parentNode();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment2.outerHtmlTail(appendable19, (int) (byte) 1, outputSettings21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.attr("hi!", "hi!");
        boolean boolean15 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = comment2.parentNode();
        boolean boolean17 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        int int14 = comment11.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        boolean boolean21 = comment11.equals((java.lang.Object) comment17);
        org.jsoup.nodes.Node node23 = comment17.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node24 = comment17.shallowClone();
        org.jsoup.nodes.Node node25 = comment17.previousSibling();
        boolean boolean26 = comment2.hasSameValue((java.lang.Object) node25);
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        boolean boolean15 = comment2.hasParent();
        boolean boolean16 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        int int18 = comment2.childNodeSize();
        java.lang.String str19 = comment2.toString();
        boolean boolean21 = comment2.hasAttr("<?commen?>");
        org.jsoup.nodes.Node node22 = comment2.clone();
        int int23 = comment2.childNodeSize();
        org.jsoup.nodes.Node node25 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node29 = comment28.clone();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean34 = comment32.hasSameValue((java.lang.Object) 1);
        boolean boolean35 = comment32.hasParent();
        java.lang.String str37 = comment32.absUrl("hi!");
        org.jsoup.nodes.Node node39 = comment32.removeAttr("");
        comment32.setBaseUri("hi!");
        int int42 = comment32.childNodeSize();
        org.jsoup.nodes.Node node43 = comment32.clone();
        boolean boolean44 = node29.equals((java.lang.Object) node43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = comment2.after(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        java.lang.String str11 = comment2.attr("<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = node13.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment2.clone();
        org.jsoup.nodes.Document document13 = comment2.ownerDocument();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (int) (short) 1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node6 = node4.wrap("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        boolean boolean15 = comment2.hasParent();
        boolean boolean16 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        int int18 = comment2.childNodeSize();
        java.lang.String str19 = comment2.toString();
        boolean boolean21 = comment2.hasAttr("<?commen?>");
        org.jsoup.nodes.Node node22 = comment2.clone();
        int int23 = comment2.childNodeSize();
        org.jsoup.nodes.Node node25 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node26 = node25.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        java.lang.String str13 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.nextSibling();
        java.lang.String str16 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!---->" + "'", str16, "\n<!---->");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        java.lang.String str13 = comment2.absUrl("\n<!--\n<!---->-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str23 = comment15.attr("");
        org.jsoup.nodes.Document document24 = comment15.ownerDocument();
        org.jsoup.nodes.Node node26 = comment15.removeAttr("#comment");
        java.lang.String str27 = comment15.nodeName();
        org.jsoup.nodes.Node node28 = comment15.shallowClone();
        boolean boolean29 = comment2.hasSameValue((java.lang.Object) comment15);
        java.lang.String str30 = comment15.nodeName();
        boolean boolean31 = comment15.hasParent();
        org.jsoup.nodes.Comment comment34 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean36 = comment34.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes37 = comment34.attributes();
        org.jsoup.nodes.Node node38 = comment34.parent();
        boolean boolean39 = comment34.isXmlDeclaration();
        boolean boolean40 = comment15.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) ' ', outputSettings13);
        org.jsoup.nodes.Node node15 = comment2.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node9 = comment6.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment6.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        java.lang.String str14 = comment6.nodeName();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean17 = comment6.hasSameValue((java.lang.Object) comment16);
        java.lang.String str18 = comment6.nodeName();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment6);
        java.lang.String str20 = comment6.baseUri();
        org.jsoup.nodes.Node node21 = comment6.clearAttributes();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str26 = comment24.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment24.childNodesCopy();
        org.jsoup.nodes.Node node30 = comment24.attr("#comment", "");
        boolean boolean31 = comment24.hasParent();
        org.jsoup.nodes.Node node32 = comment24.parentNode();
        boolean boolean33 = comment6.hasSameValue((java.lang.Object) comment24);
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node39 = comment36.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = comment36.siblingNodes();
        java.lang.String str41 = comment36.toString();
        boolean boolean42 = comment6.hasSameValue((java.lang.Object) comment36);
        org.jsoup.select.NodeFilter nodeFilter43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = comment36.filter(nodeFilter43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n<!---->" + "'", str41, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Node node8 = comment2.attr("\n<!--\n<!---->-->", "#comment");
        java.lang.String str10 = comment2.attr("#comment");
        java.lang.String str11 = comment2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        org.jsoup.nodes.Node node5 = comment2.wrap("\n<!---->");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        java.lang.String str11 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node12 = comment10.parentNode();
        int int13 = comment10.siblingIndex();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        org.jsoup.nodes.Node node22 = comment16.attr("", "hi!");
        java.lang.String str24 = comment16.attr("");
        org.jsoup.nodes.Document document25 = comment16.ownerDocument();
        org.jsoup.nodes.Node node27 = comment16.removeAttr("#comment");
        java.lang.String str28 = comment16.nodeName();
        org.jsoup.nodes.Node node30 = comment16.removeAttr("hi!");
        int int31 = comment16.siblingIndex();
        org.jsoup.nodes.Node node33 = comment16.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment16.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment16.childNodes();
        org.jsoup.nodes.Node node38 = comment16.attr("\n<!---->", "\n<!---->");
        boolean boolean39 = comment10.equals((java.lang.Object) comment16);
        java.lang.String str41 = comment10.absUrl("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.parent();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        java.lang.String str9 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, 1, outputSettings11);
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.Node node14 = comment2.clearAttributes();
        java.lang.String str15 = comment2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.siblingNodes();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable17, 10, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!---->" + "'", str15, "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        org.jsoup.nodes.Attributes attributes21 = comment2.attributes();
        boolean boolean23 = comment2.hasAttr("\n<!--#comment-->");
        boolean boolean24 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment2.childNodes();
        java.lang.String str26 = comment2.baseUri();
        org.jsoup.nodes.Node node29 = comment2.attr("<?i?>", "<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node7 = comment2.parent();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        boolean boolean13 = comment2.hasAttr("");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Document document18 = comment16.ownerDocument();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        boolean boolean24 = comment21.hasParent();
        org.jsoup.nodes.Node node27 = comment21.attr("", "hi!");
        java.lang.String str29 = comment21.attr("");
        org.jsoup.nodes.Document document30 = comment21.ownerDocument();
        org.jsoup.nodes.Node node32 = comment21.removeAttr("#comment");
        java.lang.String str33 = comment21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment21.childNodesCopy();
        boolean boolean35 = comment16.hasSameValue((java.lang.Object) nodeList34);
        boolean boolean36 = comment2.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node38 = comment2.removeAttr("\n<!--#comment-->");
        java.lang.String str39 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n<!---->" + "'", str39, "\n<!---->");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        java.lang.String str7 = comment2.getData();
        org.jsoup.nodes.Node node8 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node8.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("#comment", "");
        java.lang.String str9 = comment2.attr("#comment");
        java.lang.String str11 = comment2.attr("<?commen?>");
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        boolean boolean3 = comment2.isXmlDeclaration();
        comment2.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node9 = comment6.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment6.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        java.lang.String str14 = comment6.nodeName();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean17 = comment6.hasSameValue((java.lang.Object) comment16);
        java.lang.String str18 = comment6.nodeName();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment6);
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment22.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment22.siblingNodes();
        boolean boolean27 = comment6.hasSameValue((java.lang.Object) comment22);
        org.jsoup.nodes.Node node28 = comment6.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node28.setBaseUri("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        java.lang.String str15 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodesCopy();
        java.lang.String str17 = comment2.nodeName();
        java.lang.String str18 = comment2.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment2.clone();
        org.jsoup.nodes.Document document4 = node3.ownerDocument();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        java.lang.String str6 = comment2.toString();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!--\n<!---->-->", "\n<!--hi!-->");
        java.lang.String str11 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment2.clone();
        comment2.setBaseUri("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        java.lang.String str21 = comment16.absUrl("hi!");
        org.jsoup.nodes.Node node22 = comment16.clone();
        boolean boolean23 = comment2.equals((java.lang.Object) node22);
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment2.outerHtmlTail(appendable24, (int) (short) 1, outputSettings26);
        org.jsoup.nodes.Node node28 = comment2.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node9 = comment6.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment6.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        java.lang.String str14 = comment6.nodeName();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean17 = comment6.hasSameValue((java.lang.Object) comment16);
        java.lang.String str18 = comment6.nodeName();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment6);
        java.lang.String str20 = comment6.baseUri();
        java.lang.String str21 = comment6.getData();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        java.lang.String str24 = comment23.nodeName();
        boolean boolean25 = comment23.isXmlDeclaration();
        org.jsoup.nodes.Node node28 = comment23.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--#comment-->-->");
        java.lang.String str29 = comment23.toString();
        org.jsoup.nodes.Node node30 = comment23.clearAttributes();
        boolean boolean31 = comment6.equals((java.lang.Object) node30);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--\n<!--hi!-->-->" + "'", str29, "\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        org.jsoup.nodes.Node node18 = comment12.attr("", "hi!");
        java.lang.String str20 = comment12.attr("");
        org.jsoup.nodes.Document document21 = comment12.ownerDocument();
        org.jsoup.nodes.Node node23 = comment12.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodesCopy();
        boolean boolean25 = comment2.hasSameValue((java.lang.Object) node23);
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment2.outerHtmlTail(appendable26, (int) (short) 100, outputSettings28);
        org.jsoup.nodes.Attributes attributes30 = comment2.attributes();
        boolean boolean32 = comment2.hasAttr("\n<!--\n<!--\n<!---->-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--#comment-->");
        org.jsoup.nodes.Node node5 = comment2.attr("\n<!--\n<!--#comment-->-->", "hi!");
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str20 = comment18.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment18.childNodesCopy();
        boolean boolean22 = comment18.isXmlDeclaration();
        int int23 = comment18.childNodeSize();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment18.outerHtmlTail(appendable24, (int) ' ', outputSettings26);
        java.lang.String str29 = comment18.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = comment18.childNodes();
        org.jsoup.nodes.Node node33 = comment18.attr("\n<!--hi!-->", "\n<!---->");
        int int34 = comment18.childNodeSize();
        java.lang.String str35 = comment18.toString();
        boolean boolean36 = node15.hasSameValue((java.lang.Object) str35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node15.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node15.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n<!---->" + "'", str35, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--#comment-->", "#comment");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment2.outerHtmlTail(appendable17, 0, outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node21 = comment18.nextSibling();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment18.outerHtmlTail(appendable22, (int) (short) -1, outputSettings24);
        java.lang.String str26 = comment18.nodeName();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean29 = comment18.hasSameValue((java.lang.Object) comment28);
        java.lang.String str30 = comment18.nodeName();
        org.jsoup.nodes.Node node31 = comment18.root();
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str23 = comment15.attr("");
        org.jsoup.nodes.Document document24 = comment15.ownerDocument();
        org.jsoup.nodes.Node node26 = comment15.removeAttr("#comment");
        java.lang.String str27 = comment15.nodeName();
        org.jsoup.nodes.Node node28 = comment15.shallowClone();
        boolean boolean29 = comment2.hasSameValue((java.lang.Object) comment15);
        java.lang.String str30 = comment15.nodeName();
        org.jsoup.nodes.Node node31 = comment15.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        boolean boolean16 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node18 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node19 = comment2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        boolean boolean21 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = node5.root();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodesCopy();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        org.jsoup.nodes.Node node16 = comment10.attr("", "hi!");
        java.lang.String str18 = comment10.attr("");
        org.jsoup.nodes.Document document19 = comment10.ownerDocument();
        org.jsoup.nodes.Node node21 = comment10.removeAttr("#comment");
        java.lang.String str22 = comment10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment10.childNodesCopy();
        boolean boolean24 = comment10.isXmlDeclaration();
        boolean boolean25 = node5.equals((java.lang.Object) comment10);
        java.lang.String str26 = comment10.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.Node node13 = comment2.parent();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!---->");
        int int16 = comment2.childNodeSize();
        org.jsoup.nodes.Attributes attributes17 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        java.lang.String str10 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodes();
        org.jsoup.nodes.Node node12 = comment2.clearAttributes();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        java.lang.String str14 = comment9.absUrl("hi!");
        org.jsoup.nodes.Node node16 = comment9.removeAttr("");
        org.jsoup.nodes.Node node17 = comment9.previousSibling();
        boolean boolean18 = comment2.equals((java.lang.Object) node17);
        java.lang.String str19 = comment2.getData();
        boolean boolean21 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.root();
        java.lang.String str9 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.jsoup.nodes.Node node9 = comment2.wrap("\n<!--#comment-->");
        java.lang.Class<?> wildcardClass10 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        boolean boolean11 = node8.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
        java.lang.Class<?> wildcardClass13 = node8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        java.lang.String str17 = comment2.outerHtml();
        org.jsoup.nodes.Node node18 = comment2.parentNode();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str23 = comment21.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment21.childNodesCopy();
        java.lang.String str25 = comment21.getData();
        org.jsoup.nodes.Document document26 = comment21.ownerDocument();
        boolean boolean27 = comment2.hasSameValue((java.lang.Object) comment21);
        java.lang.String str28 = comment21.baseUri();
        org.jsoup.nodes.Node node31 = comment21.attr("\n<!--\n<!--hi!-->-->", "\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment21.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.String str13 = comment2.getData();
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        org.jsoup.nodes.Node node20 = comment14.attr("", "hi!");
        java.lang.String str22 = comment14.attr("");
        org.jsoup.nodes.Document document23 = comment14.ownerDocument();
        org.jsoup.nodes.Node node25 = comment14.removeAttr("#comment");
        java.lang.String str26 = comment14.nodeName();
        org.jsoup.nodes.Node node28 = comment14.removeAttr("hi!");
        int int29 = comment14.siblingIndex();
        org.jsoup.nodes.Node node31 = comment14.removeAttr("#comment");
        boolean boolean32 = comment2.equals((java.lang.Object) comment14);
        comment14.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node35 = comment14.root();
        java.lang.String str37 = comment14.attr("\n<!--\n<!--hi!-->-->");
        org.jsoup.nodes.Comment comment40 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str41 = comment40.getData();
        org.jsoup.nodes.Document document42 = comment40.ownerDocument();
        org.jsoup.nodes.Node node45 = comment40.attr("", "");
        boolean boolean46 = comment40.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes47 = comment40.attributes();
        org.jsoup.nodes.Comment comment50 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean52 = comment50.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node53 = comment50.nextSibling();
        java.lang.Appendable appendable54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = null;
        comment50.outerHtmlTail(appendable54, (int) (short) -1, outputSettings56);
        java.lang.String str58 = comment50.nodeName();
        boolean boolean59 = comment40.hasSameValue((java.lang.Object) comment50);
        boolean boolean60 = comment14.equals((java.lang.Object) boolean59);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#comment" + "'", str58, "#comment");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment2.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.lang.String str9 = comment1.attr("hi!");
        org.jsoup.nodes.Node node10 = comment1.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodes();
        org.jsoup.nodes.Node node17 = comment2.attr("\n<!--hi!-->", "\n<!---->");
        org.jsoup.nodes.Document document18 = comment2.ownerDocument();
        java.lang.String str19 = comment2.toString();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Document document24 = comment22.ownerDocument();
        org.jsoup.nodes.Node node27 = comment22.attr("", "");
        boolean boolean28 = comment22.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes29 = comment22.attributes();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean34 = comment32.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node35 = comment32.nextSibling();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        comment32.outerHtmlTail(appendable36, (int) (short) -1, outputSettings38);
        java.lang.String str40 = comment32.nodeName();
        boolean boolean41 = comment22.hasSameValue((java.lang.Object) comment32);
        java.lang.String str42 = comment32.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = comment32.siblingNodes();
        boolean boolean44 = comment2.equals((java.lang.Object) comment32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#comment" + "'", str40, "#comment");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        java.lang.String str13 = comment2.getData();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node17 = node16.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str13 = comment2.absUrl("hi!");
        java.lang.String str14 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!---->", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        comment2.setBaseUri("");
        boolean boolean14 = comment2.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        boolean boolean11 = node5.hasParent();
        org.jsoup.nodes.Node node12 = node5.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        int int4 = comment2.siblingIndex();
        int int5 = comment2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--#comment-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!--#comment-->-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
        boolean boolean20 = node16.equals((java.lang.Object) "\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Node node10 = node8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.baseUri();
        java.lang.String str11 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str9 = comment2.getData();
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasAttr("hi!");
        org.jsoup.nodes.Node node10 = comment7.parentNode();
        int int11 = comment7.siblingIndex();
        org.jsoup.nodes.Node node13 = comment7.removeAttr("#comment");
        org.jsoup.nodes.Node node14 = comment7.root();
        org.jsoup.nodes.Node node17 = comment7.attr("", "\n<!---->");
        java.lang.String str18 = node17.outerHtml();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment21.childNodes();
        java.lang.String str24 = comment21.attr("hi!");
        java.lang.String str25 = comment21.baseUri();
        boolean boolean26 = node17.hasSameValue((java.lang.Object) comment21);
        org.jsoup.nodes.Node node28 = comment21.wrap("\n<!---->");
        boolean boolean29 = node4.hasSameValue((java.lang.Object) "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node4.siblingNodes();
        org.jsoup.nodes.Node node31 = node4.nextSibling();
        org.jsoup.select.NodeFilter nodeFilter32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node31.filter(nodeFilter32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) ' ', outputSettings7);
        int int9 = comment2.siblingIndex();
        java.lang.String str10 = comment2.getData();
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?commen?>", "\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node4 = comment2.wrap("<?commen?>");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) ' ', outputSettings13);
        java.lang.String str15 = comment2.toString();
        org.jsoup.nodes.Node node16 = comment2.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.baseUri();
        int int11 = comment2.childNodeSize();
        org.jsoup.nodes.Node node12 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!---->-->");
        java.lang.String str11 = node10.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        int int2 = comment1.siblingIndex();
        org.jsoup.nodes.Node node5 = comment1.attr("\n<!--\n<!---->-->", "#comment");
        int int6 = comment1.siblingIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.Node node7 = comment2.root();
        java.lang.String str8 = comment2.baseUri();
        int int9 = comment2.childNodeSize();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        boolean boolean7 = comment2.hasAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = comment2.previousSibling();
        java.lang.String str16 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.String str13 = comment2.getData();
        org.jsoup.nodes.Node node14 = comment2.root();
        org.jsoup.nodes.Attributes attributes15 = comment2.attributes();
        boolean boolean16 = comment2.hasParent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("hi!");
        java.lang.String str15 = comment2.toString();
        org.jsoup.nodes.Node node17 = comment2.wrap("<?i?>");
        org.jsoup.nodes.Node node20 = comment2.attr("\n<!--\n<!--#comment-->-->", "<?commen?>");
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str25 = comment23.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment23.childNodesCopy();
        boolean boolean27 = comment23.isXmlDeclaration();
        int int28 = comment23.childNodeSize();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        comment23.outerHtmlTail(appendable29, (int) ' ', outputSettings31);
        java.lang.String str34 = comment23.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment23.childNodes();
        org.jsoup.nodes.Node node38 = comment23.attr("\n<!--hi!-->", "\n<!---->");
        int int39 = comment23.childNodeSize();
        org.jsoup.nodes.Node node40 = comment23.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = comment2.after(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        boolean boolean13 = comment2.equals((java.lang.Object) "\n<!---->");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, 10, outputSettings16);
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str22 = comment20.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment20.root();
        boolean boolean24 = comment20.isXmlDeclaration();
        boolean boolean26 = comment20.hasAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment20.siblingNodes();
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean32 = comment30.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node33 = comment30.nextSibling();
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        comment30.outerHtmlTail(appendable34, (int) (short) -1, outputSettings36);
        java.lang.String str38 = comment30.nodeName();
        org.jsoup.nodes.Comment comment40 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean41 = comment30.hasSameValue((java.lang.Object) comment40);
        java.lang.String str42 = comment30.nodeName();
        boolean boolean43 = comment30.hasParent();
        org.jsoup.nodes.Node node46 = comment30.attr("\n<!---->", "hi!");
        boolean boolean47 = comment20.hasSameValue((java.lang.Object) "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#comment" + "'", str38, "#comment");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#comment" + "'", str42, "#comment");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        java.lang.String str17 = comment2.attr("");
        org.jsoup.nodes.Attributes attributes18 = comment2.attributes();
        comment2.setBaseUri("");
        java.lang.String str21 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment2.childNodes();
        int int23 = comment2.childNodeSize();
        org.jsoup.select.NodeFilter nodeFilter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.filter(nodeFilter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.String str10 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node11 = comment2.previousSibling();
        org.jsoup.nodes.Node node12 = comment2.clone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = node5.root();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node5.childNodesCopy();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        org.jsoup.nodes.Node node16 = comment10.attr("", "hi!");
        java.lang.String str18 = comment10.attr("");
        org.jsoup.nodes.Document document19 = comment10.ownerDocument();
        org.jsoup.nodes.Node node21 = comment10.removeAttr("#comment");
        java.lang.String str22 = comment10.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment10.childNodesCopy();
        boolean boolean24 = comment10.isXmlDeclaration();
        boolean boolean25 = node5.equals((java.lang.Object) comment10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment10.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment13.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment13.childNodes();
        org.jsoup.nodes.Document document18 = comment13.ownerDocument();
        org.jsoup.nodes.Attributes attributes19 = comment13.attributes();
        boolean boolean20 = comment2.equals((java.lang.Object) attributes19);
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str24 = comment23.getData();
        org.jsoup.nodes.Document document25 = comment23.ownerDocument();
        org.jsoup.nodes.Node node28 = comment23.attr("", "");
        boolean boolean29 = comment23.isXmlDeclaration();
        org.jsoup.nodes.Node node30 = comment23.clone();
        boolean boolean31 = comment2.equals((java.lang.Object) comment23);
        org.jsoup.nodes.Node node34 = comment23.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document9.after("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--\n<!---->-->-->");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("#comment", "");
        java.lang.String str9 = comment2.attr("#comment");
        java.lang.String str11 = comment2.attr("<?commen?>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node25 = comment24.root();
        java.lang.String str26 = comment24.getData();
        boolean boolean27 = comment2.hasSameValue((java.lang.Object) comment24);
        org.jsoup.select.NodeFilter nodeFilter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment2.filter(nodeFilter28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        int int20 = comment17.siblingIndex();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node26 = comment23.nextSibling();
        boolean boolean27 = comment17.equals((java.lang.Object) comment23);
        org.jsoup.nodes.Node node28 = comment17.root();
        boolean boolean29 = comment17.isXmlDeclaration();
        boolean boolean30 = comment17.hasParent();
        org.jsoup.nodes.Node node31 = comment17.root();
        org.jsoup.nodes.Node node33 = comment17.removeAttr("#comment");
        boolean boolean34 = comment2.equals((java.lang.Object) comment17);
        java.lang.Class<?> wildcardClass35 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str7 = comment6.getData();
        org.jsoup.nodes.Document document8 = comment6.ownerDocument();
        org.jsoup.nodes.Node node11 = comment6.attr("", "");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        org.jsoup.nodes.Node node20 = comment14.attr("", "hi!");
        org.jsoup.nodes.Node node21 = node20.previousSibling();
        org.jsoup.nodes.Node node22 = node20.parentNode();
        boolean boolean23 = node11.hasSameValue((java.lang.Object) node20);
        org.jsoup.nodes.Node node24 = node11.shallowClone();
        org.jsoup.nodes.Node node25 = node11.parent();
        boolean boolean26 = comment2.hasSameValue((java.lang.Object) node25);
        java.lang.String str27 = comment2.getData();
        org.jsoup.nodes.Node node30 = comment2.attr("\n<!--#comment-->", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node31 = node30.root();
        org.jsoup.nodes.Comment comment34 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean36 = comment34.hasSameValue((java.lang.Object) 1);
        boolean boolean37 = comment34.hasParent();
        java.lang.String str39 = comment34.absUrl("hi!");
        java.lang.String str40 = comment34.toString();
        org.jsoup.nodes.Node node41 = comment34.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = comment34.asXmlDeclaration();
        java.lang.String str44 = comment34.attr("");
        boolean boolean45 = comment34.isXmlDeclaration();
        org.jsoup.nodes.Node node46 = comment34.root();
        boolean boolean47 = node31.equals((java.lang.Object) comment34);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration48 = comment34.asXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\n<!--hi!-->" + "'", str40, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(xmlDeclaration42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration48);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        java.lang.String str7 = comment2.toString();
        int int8 = comment2.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
        boolean boolean16 = comment2.hasAttr("hi!");
        java.lang.String str18 = comment2.absUrl("\n<!---->");
        java.lang.String str19 = comment2.getData();
        org.jsoup.nodes.Attributes attributes20 = comment2.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        java.lang.String str7 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        int int8 = comment2.childNodeSize();
        java.lang.String str9 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        int int2 = comment1.childNodeSize();
        java.lang.String str3 = comment1.baseUri();
        java.lang.String str5 = comment1.absUrl("\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        boolean boolean13 = comment2.hasParent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node11 = comment10.root();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment10.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment10.asXmlDeclaration();
        java.lang.String str14 = comment10.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment10.childNodesCopy();
        int int16 = comment10.siblingIndex();
        boolean boolean17 = comment2.equals((java.lang.Object) int16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodes();
        org.jsoup.nodes.Node node17 = comment2.attr("\n<!--hi!-->", "\n<!---->");
        int int18 = comment2.childNodeSize();
        java.lang.String str19 = comment2.toString();
        java.lang.String str20 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        java.lang.String str7 = comment2.getData();
        int int8 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, 0, outputSettings13);
        java.lang.String str15 = comment8.getData();
        org.jsoup.nodes.Node node17 = comment8.wrap("\n<!---->");
        java.lang.String str19 = comment8.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node21 = comment8.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.jsoup.nodes.Node node22 = comment8.root();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        java.lang.String str10 = comment2.toString();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (byte) 0, outputSettings13);
        boolean boolean16 = comment2.hasAttr("#comment");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!---->" + "'", str10, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        java.lang.String str15 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node16 = comment2.parent();
        java.lang.String str18 = comment2.attr("#comment");
        java.lang.String str19 = comment2.baseUri();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node23 = comment22.root();
        boolean boolean25 = comment22.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes26 = comment22.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment22.asXmlDeclaration();
        boolean boolean29 = comment22.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node30 = comment22.shallowClone();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment22.outerHtmlTail(appendable31, 0, outputSettings33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment2.before((org.jsoup.nodes.Node) comment22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.baseUri();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        org.jsoup.nodes.Node node22 = comment16.attr("", "hi!");
        org.jsoup.nodes.Node node23 = node22.root();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str28 = comment26.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment26.childNodesCopy();
        boolean boolean30 = comment26.isXmlDeclaration();
        int int31 = comment26.childNodeSize();
        boolean boolean32 = node23.equals((java.lang.Object) comment26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = comment2.after((org.jsoup.nodes.Node) comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Document document15 = comment2.ownerDocument();
        boolean boolean16 = comment2.hasParent();
        java.lang.String str17 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        org.jsoup.nodes.Attributes attributes21 = comment2.attributes();
        java.lang.String str22 = comment2.getData();
        comment2.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str13 = comment11.absUrl("hi!");
        java.lang.String str14 = comment11.nodeName();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) node15);
        java.lang.String str18 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment2.siblingNodes();
        boolean boolean20 = comment2.hasParent();
        java.lang.String str21 = comment2.nodeName();
        int int22 = comment2.childNodeSize();
        org.jsoup.select.NodeFilter nodeFilter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.filter(nodeFilter23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "hi!");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.equals((java.lang.Object) '4');
        java.lang.String str9 = comment2.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Document document3 = comment2.ownerDocument();
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        org.jsoup.nodes.Node node22 = comment2.removeAttr("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node15 = comment12.nextSibling();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment12.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        java.lang.String str20 = comment12.nodeName();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) comment12);
        java.lang.String str22 = comment12.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment12.siblingNodes();
        org.jsoup.nodes.Node node25 = comment12.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node26 = comment12.parent();
        java.lang.String str28 = comment12.attr("<?commen?>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 100, outputSettings9);
        boolean boolean12 = comment2.hasAttr("");
        boolean boolean13 = comment2.isXmlDeclaration();
        boolean boolean15 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Attributes attributes16 = comment2.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str14 = comment13.getData();
        org.jsoup.nodes.Document document15 = comment13.ownerDocument();
        org.jsoup.nodes.Node node18 = comment13.attr("", "");
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        boolean boolean24 = comment21.hasParent();
        org.jsoup.nodes.Node node27 = comment21.attr("", "hi!");
        org.jsoup.nodes.Node node28 = node27.previousSibling();
        org.jsoup.nodes.Node node29 = node27.parentNode();
        boolean boolean30 = node18.hasSameValue((java.lang.Object) node27);
        org.jsoup.nodes.Node node31 = node18.shallowClone();
        org.jsoup.nodes.Node node32 = node31.shallowClone();
        boolean boolean33 = comment2.equals((java.lang.Object) node32);
        org.jsoup.nodes.Node node34 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        java.lang.String str17 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node18 = comment2.root();
        org.jsoup.nodes.Node node19 = comment2.nextSibling();
        java.lang.String str21 = comment2.absUrl("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str13 = comment11.absUrl("hi!");
        java.lang.String str14 = comment11.nodeName();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) node15);
        org.jsoup.nodes.Node node17 = comment2.shallowClone();
        java.lang.String str18 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.after("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        org.jsoup.nodes.Node node13 = node12.clearAttributes();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node19 = comment16.nextSibling();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment16.outerHtmlTail(appendable20, (int) (short) -1, outputSettings22);
        java.lang.String str24 = comment16.nodeName();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean27 = comment16.hasSameValue((java.lang.Object) comment26);
        java.lang.String str28 = comment16.nodeName();
        org.jsoup.nodes.Node node29 = comment16.root();
        boolean boolean30 = node12.hasSameValue((java.lang.Object) comment16);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node12.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        org.jsoup.nodes.Node node16 = comment10.attr("", "hi!");
        org.jsoup.nodes.Node node17 = node16.previousSibling();
        org.jsoup.nodes.Node node18 = node16.parentNode();
        boolean boolean19 = node7.hasSameValue((java.lang.Object) node16);
        org.jsoup.nodes.Node node20 = node7.shallowClone();
        org.jsoup.nodes.Node node22 = node20.wrap("\n<!--hi!-->");
        java.lang.String str23 = node20.outerHtml();
        org.jsoup.nodes.Document document24 = node20.ownerDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Node node9 = node8.parent();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        java.lang.String str15 = comment2.attr("");
        java.lang.String str17 = comment2.attr("\n<!--\n<!---->-->");
        java.lang.String str19 = comment2.absUrl("#comment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration2 = comment1.asXmlDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment1.traverse(nodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xmlDeclaration2);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str13 = comment11.absUrl("hi!");
        java.lang.String str14 = comment11.nodeName();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) node15);
        org.jsoup.nodes.Node node17 = comment2.shallowClone();
        java.lang.String str19 = comment2.attr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node22 = comment2.attr("<?i?>", "\n<!--hi!-->");
        boolean boolean23 = comment2.isXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.filter(nodeFilter24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        java.lang.String str13 = comment2.nodeName();
        java.lang.String str14 = comment2.baseUri();
        org.jsoup.nodes.Node node15 = comment2.previousSibling();
        org.jsoup.nodes.Node node16 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean10 = comment2.hasParent();
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str13 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--\n<!--\n<!--#comment-->-->-->", "#comment");
        java.lang.Object obj17 = null;
        boolean boolean18 = node16.hasSameValue(obj17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.attr("<?i?>", "\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean2 = comment1.isXmlDeclaration();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.parent();
        java.lang.String str5 = comment1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        comment2.setBaseUri("#comment");
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        java.lang.String str8 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment2.removeAttr("");
        java.lang.String str12 = comment2.attr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str17 = comment15.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment15.childNodesCopy();
        boolean boolean19 = comment15.isXmlDeclaration();
        java.lang.String str20 = comment15.getData();
        java.lang.String str21 = comment15.getData();
        boolean boolean22 = comment2.equals((java.lang.Object) comment15);
        org.jsoup.nodes.Node node23 = comment2.parentNode();
        java.lang.Class<?> wildcardClass24 = comment2.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment17.siblingNodes();
        java.lang.Class<?> wildcardClass22 = comment17.getClass();
        boolean boolean23 = comment2.hasSameValue((java.lang.Object) wildcardClass22);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasSameValue((java.lang.Object) 1);
        boolean boolean30 = comment27.hasParent();
        java.lang.String str32 = comment27.absUrl("hi!");
        org.jsoup.nodes.Node node33 = comment27.parentNode();
        comment27.setBaseUri("\n<!--hi!-->");
        comment27.setBaseUri("");
        org.jsoup.nodes.Node node38 = comment27.clone();
        org.jsoup.nodes.Node node39 = node38.root();
        boolean boolean40 = comment2.equals((java.lang.Object) node38);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        int int17 = comment2.siblingIndex();
        java.lang.String str18 = comment2.outerHtml();
        org.jsoup.nodes.Node node19 = comment2.previousSibling();
        org.jsoup.nodes.Node node22 = comment2.attr("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--\n<!---->-->", "");
        java.lang.String str11 = comment2.absUrl("hi!");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        int int11 = comment8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment8.siblingNodes();
        java.lang.String str13 = comment8.outerHtml();
        org.jsoup.nodes.Node node14 = comment8.root();
        boolean boolean15 = comment2.hasSameValue((java.lang.Object) comment8);
        org.jsoup.nodes.Node node16 = comment8.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment8.outerHtmlHead(appendable17, (int) (byte) 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        int int11 = node10.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node10.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.String str6 = comment2.toString();
        java.lang.String str8 = comment2.attr("#comment");
        org.jsoup.nodes.Node node11 = comment2.attr("", "\n<!--hi!-->");
        org.jsoup.nodes.Document document12 = node11.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.lang.String str12 = comment2.baseUri();
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
        java.lang.String str12 = node10.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str7 = comment5.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment5.childNodesCopy();
        boolean boolean9 = comment5.isXmlDeclaration();
        int int10 = comment5.childNodeSize();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment5.outerHtmlTail(appendable11, (int) ' ', outputSettings13);
        boolean boolean16 = comment5.hasAttr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Document document21 = comment19.ownerDocument();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        boolean boolean27 = comment24.hasParent();
        org.jsoup.nodes.Node node30 = comment24.attr("", "hi!");
        java.lang.String str32 = comment24.attr("");
        org.jsoup.nodes.Document document33 = comment24.ownerDocument();
        org.jsoup.nodes.Node node35 = comment24.removeAttr("#comment");
        java.lang.String str36 = comment24.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment24.childNodesCopy();
        boolean boolean38 = comment19.hasSameValue((java.lang.Object) nodeList37);
        boolean boolean39 = comment5.equals((java.lang.Object) comment19);
        org.jsoup.nodes.Node node41 = comment5.removeAttr("\n<!--#comment-->");
        boolean boolean42 = comment1.equals((java.lang.Object) node41);
        boolean boolean43 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node44 = comment1.parentNode();
        java.lang.Appendable appendable45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        comment1.outerHtmlTail(appendable45, (int) (short) 100, outputSettings47);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#comment" + "'", str36, "#comment");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, 0, outputSettings13);
        org.jsoup.nodes.Node node15 = comment8.clone();
        org.jsoup.nodes.Node node17 = comment8.removeAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node15 = comment14.root();
        org.jsoup.nodes.Node node16 = comment14.clone();
        boolean boolean17 = comment2.hasSameValue((java.lang.Object) comment14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        boolean boolean11 = comment8.hasParent();
        java.lang.String str13 = comment8.absUrl("hi!");
        org.jsoup.nodes.Node node14 = comment8.parentNode();
        comment8.setBaseUri("\n<!--hi!-->");
        comment8.setBaseUri("");
        org.jsoup.nodes.Node node19 = comment8.parent();
        boolean boolean20 = comment2.equals((java.lang.Object) node19);
        java.lang.String str21 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment2.childNodes();
        java.lang.String str23 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!---->" + "'", str23, "\n<!---->");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        org.jsoup.nodes.Node node14 = node13.previousSibling();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment16.previousSibling();
        boolean boolean18 = node13.equals((java.lang.Object) node17);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node13.childNodes();
        java.lang.Class<?> wildcardClass20 = nodeList19.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        boolean boolean15 = comment2.hasParent();
        org.jsoup.nodes.Node node16 = comment2.root();
        org.jsoup.nodes.Node node17 = node16.root();
        org.jsoup.nodes.Node node18 = node16.nextSibling();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str23 = comment21.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment21.childNodesCopy();
        java.lang.String str25 = comment21.getData();
        java.lang.String str26 = comment21.baseUri();
        org.jsoup.nodes.Node node27 = comment21.parentNode();
        org.jsoup.nodes.Node node29 = comment21.removeAttr("\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = node29.childNodesCopy();
        boolean boolean31 = node16.hasSameValue((java.lang.Object) node29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        boolean boolean12 = comment2.hasAttr("\n<!--hi!-->");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable13, (int) ' ', outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?commen?>", "\n<!--#comment-->");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.lang.String str10 = node8.outerHtml();
        org.jsoup.nodes.Node node11 = node8.root();
        org.jsoup.nodes.Node node12 = node8.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.jsoup.nodes.Node node8 = node7.shallowClone();
        org.jsoup.nodes.Node node9 = node7.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parentNode();
        org.jsoup.nodes.Attributes attributes5 = comment1.attributes();
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        boolean boolean7 = comment1.isXmlDeclaration();
        java.lang.String str8 = comment1.nodeName();
        java.lang.String str9 = comment1.outerHtml();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--\n<!--hi!-->-->" + "'", str9, "\n<!--\n<!--hi!-->-->");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node12 = comment2.clearAttributes();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.clone();
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("<?i?>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node16 = comment13.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment13.outerHtmlTail(appendable17, (int) (short) -1, outputSettings19);
        java.lang.String str22 = comment13.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node24 = comment13.wrap("\n<!--hi!-->");
        java.lang.String str26 = comment13.attr("");
        comment13.setBaseUri("\n<!---->");
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        comment13.outerHtmlTail(appendable29, (int) '4', outputSettings31);
        boolean boolean33 = comment2.hasSameValue((java.lang.Object) appendable29);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = xmlDeclaration7.nextSibling();
        boolean boolean9 = xmlDeclaration7.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration7.siblingNodes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        boolean boolean6 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node7 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodes();
        boolean boolean6 = comment2.hasAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        int int17 = comment2.siblingIndex();
        java.lang.String str18 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Node node22 = comment21.shallowClone();
        java.lang.String str23 = comment21.toString();
        boolean boolean24 = comment2.hasSameValue((java.lang.Object) comment21);
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--\n<!---->-->" + "'", str23, "\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        boolean boolean9 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) '#', outputSettings7);
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        java.lang.String str17 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.siblingNodes();
        java.lang.String str19 = comment2.outerHtml();
        org.jsoup.nodes.Node node20 = comment2.clone();
        java.lang.String str22 = comment2.attr("#comment");
        org.jsoup.nodes.Node node23 = comment2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            node11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = node5.parent();
        org.jsoup.nodes.Node node7 = node5.nextSibling();
        org.jsoup.nodes.Node node8 = node5.root();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.nodes.Node node10 = node8.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        java.lang.Class<?> wildcardClass12 = node10.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        java.lang.String str6 = comment2.attr("<?commen?>");
        int int7 = comment2.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        boolean boolean14 = comment2.hasAttr("#comment");
        java.lang.String str15 = comment2.toString();
        java.lang.String str16 = comment2.nodeName();
        org.jsoup.nodes.Node node17 = comment2.clone();
        boolean boolean18 = node17.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        java.lang.String str17 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        boolean boolean23 = comment20.hasParent();
        java.lang.String str25 = comment20.absUrl("hi!");
        org.jsoup.nodes.Node node26 = comment20.parentNode();
        comment20.setBaseUri("\n<!--hi!-->");
        comment20.setBaseUri("");
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        comment20.outerHtmlTail(appendable31, (int) (byte) 100, outputSettings33);
        java.lang.String str35 = comment20.outerHtml();
        org.jsoup.nodes.Node node36 = comment20.parentNode();
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str41 = comment39.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = comment39.childNodesCopy();
        java.lang.String str43 = comment39.getData();
        org.jsoup.nodes.Document document44 = comment39.ownerDocument();
        boolean boolean45 = comment20.hasSameValue((java.lang.Object) comment39);
        java.lang.String str47 = comment39.attr("\n<!--#comment-->");
        java.lang.String str48 = comment39.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = comment2.before((org.jsoup.nodes.Node) comment39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n<!--hi!-->" + "'", str35, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node14 = comment11.nextSibling();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment11.outerHtmlTail(appendable15, (int) (short) -1, outputSettings17);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment11.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment11.childNodesCopy();
        org.jsoup.nodes.Node node21 = comment11.clearAttributes();
        boolean boolean22 = node8.hasSameValue((java.lang.Object) node21);
        node8.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str13 = comment11.absUrl("hi!");
        java.lang.String str14 = comment11.nodeName();
        org.jsoup.nodes.Node node15 = comment11.shallowClone();
        boolean boolean16 = comment2.hasSameValue((java.lang.Object) node15);
        java.lang.String str18 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment2.childNodes();
        boolean boolean20 = comment2.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        java.lang.String str16 = comment8.toString();
        java.lang.String str17 = comment8.nodeName();
        org.jsoup.nodes.Node node19 = comment8.wrap("\n<!--\n<!--hi!-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Node node10 = comment2.shallowClone();
        java.lang.String str11 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node14 = comment2.previousSibling();
        java.lang.String str16 = comment2.attr("hi!");
        org.jsoup.nodes.Node node18 = comment2.removeAttr("hi!");
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node24 = comment21.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment21.outerHtmlTail(appendable25, (int) (short) -1, outputSettings27);
        java.lang.String str30 = comment21.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node32 = comment21.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Document document33 = comment21.ownerDocument();
        comment21.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node36 = comment21.shallowClone();
        boolean boolean37 = node18.equals((java.lang.Object) comment21);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node18.siblingNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment17.siblingNodes();
        java.lang.Class<?> wildcardClass22 = comment17.getClass();
        boolean boolean23 = comment2.hasSameValue((java.lang.Object) wildcardClass22);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.siblingNodes();
        boolean boolean26 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node27 = comment2.clone();
        comment2.setBaseUri("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.String str13 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodesCopy();
        boolean boolean15 = comment2.hasParent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--\n<!--#comment-->-->-->");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node11 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.clone();
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.absUrl("<?i?>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 10, outputSettings12);
        org.jsoup.nodes.Node node14 = comment2.nextSibling();
        java.lang.String str15 = comment2.getData();
        org.jsoup.nodes.Node node16 = comment2.clone();
        java.lang.String str17 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.parentNode();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str15 = comment14.getData();
        org.jsoup.nodes.Document document16 = comment14.ownerDocument();
        org.jsoup.nodes.Node node19 = comment14.attr("", "");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node28 = comment22.attr("", "hi!");
        org.jsoup.nodes.Node node29 = node28.previousSibling();
        org.jsoup.nodes.Node node30 = node28.parentNode();
        boolean boolean31 = node19.hasSameValue((java.lang.Object) node28);
        org.jsoup.nodes.Node node32 = node19.shallowClone();
        node19.setBaseUri("hi!");
        org.jsoup.nodes.Node node35 = node19.shallowClone();
        org.jsoup.nodes.Node node36 = node35.parentNode();
        boolean boolean37 = xmlDeclaration10.hasSameValue((java.lang.Object) node35);
        org.jsoup.nodes.Node node38 = xmlDeclaration10.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = comment2.removeAttr("");
        org.jsoup.nodes.Attributes attributes21 = comment2.attributes();
        boolean boolean23 = comment2.hasAttr("\n<!--#comment-->");
        java.lang.String str24 = comment2.getData();
        org.jsoup.nodes.Node node25 = comment2.nextSibling();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable26, (int) (short) 100, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        org.jsoup.nodes.Node node16 = comment11.attr("", "");
        java.lang.String str17 = comment11.getData();
        int int18 = comment11.siblingIndex();
        boolean boolean19 = comment2.equals((java.lang.Object) comment11);
        boolean boolean21 = comment11.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = comment11.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xmlDeclaration22);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Document document13 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        int int19 = comment16.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment16.siblingNodes();
        java.lang.String str22 = comment16.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment16.childNodesCopy();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        int int29 = comment26.siblingIndex();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean34 = comment32.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node35 = comment32.nextSibling();
        boolean boolean36 = comment26.equals((java.lang.Object) comment32);
        org.jsoup.nodes.Node node37 = comment26.root();
        java.util.List<org.jsoup.nodes.Node> nodeList38 = node37.childNodes();
        org.jsoup.nodes.Node node39 = node37.previousSibling();
        boolean boolean40 = comment16.hasSameValue((java.lang.Object) node37);
        java.lang.String str41 = comment16.toString();
        java.lang.String str42 = comment16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = comment2.after((org.jsoup.nodes.Node) comment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n<!--hi!-->" + "'", str41, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean7 = comment5.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes8 = comment5.attributes();
        org.jsoup.nodes.Node node9 = comment5.parent();
        java.lang.String str10 = comment5.getData();
        int int11 = comment5.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment1.before((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.shallowClone();
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Node node12 = comment2.clone();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--\n<!---->-->", "#comment");
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean2 = comment1.isXmlDeclaration();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node5 = comment1.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node6 = comment1.previousSibling();
        boolean boolean7 = comment1.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        boolean boolean10 = comment2.hasAttr("\n<!--\n<!--hi!-->-->");
        java.lang.String str11 = comment2.getData();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.siblingNodes();
        org.jsoup.nodes.Node node16 = comment2.parentNode();
        java.lang.String str18 = comment2.absUrl("\n<!--hi!-->");
        int int19 = comment2.siblingIndex();
        comment2.setBaseUri("\n<!--#comment-->");
        java.lang.String str22 = comment2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment2.siblingNodes();
        org.jsoup.nodes.Node node24 = comment2.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment12.childNodesCopy();
        org.jsoup.nodes.Node node18 = comment12.attr("#comment", "");
        org.jsoup.nodes.Node node19 = comment12.nextSibling();
        org.jsoup.nodes.Node node22 = comment12.attr("\n<!--hi!-->", "");
        boolean boolean23 = comment2.hasSameValue((java.lang.Object) node22);
        java.lang.String str24 = comment2.baseUri();
        comment2.setBaseUri("#comment");
        java.lang.String str27 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!--hi!-->" + "'", str27, "\n<!--hi!-->");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        boolean boolean14 = comment2.isXmlDeclaration();
        boolean boolean15 = comment2.hasParent();
        boolean boolean16 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        int int18 = comment2.childNodeSize();
        java.lang.String str19 = comment2.toString();
        boolean boolean21 = comment2.hasAttr("<?commen?>");
        java.lang.String str22 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        java.lang.String str17 = comment2.outerHtml();
        org.jsoup.nodes.Node node18 = comment2.parentNode();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str23 = comment21.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment21.childNodesCopy();
        java.lang.String str25 = comment21.getData();
        org.jsoup.nodes.Document document26 = comment21.ownerDocument();
        boolean boolean27 = comment2.hasSameValue((java.lang.Object) comment21);
        java.lang.String str29 = comment21.absUrl("<?commen?>");
        boolean boolean30 = comment21.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Document document14 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document14.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        boolean boolean9 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--#comment-->", "");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        boolean boolean13 = comment2.hasAttr("");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Document document18 = comment16.ownerDocument();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        boolean boolean24 = comment21.hasParent();
        org.jsoup.nodes.Node node27 = comment21.attr("", "hi!");
        java.lang.String str29 = comment21.attr("");
        org.jsoup.nodes.Document document30 = comment21.ownerDocument();
        org.jsoup.nodes.Node node32 = comment21.removeAttr("#comment");
        java.lang.String str33 = comment21.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment21.childNodesCopy();
        boolean boolean35 = comment16.hasSameValue((java.lang.Object) nodeList34);
        boolean boolean36 = comment2.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node37 = comment16.parentNode();
        java.lang.String str39 = comment16.attr("");
        java.lang.String str41 = comment16.attr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node42 = comment16.clearAttributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node42);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str23 = comment15.attr("");
        org.jsoup.nodes.Document document24 = comment15.ownerDocument();
        org.jsoup.nodes.Node node26 = comment15.removeAttr("#comment");
        java.lang.String str27 = comment15.nodeName();
        org.jsoup.nodes.Node node28 = comment15.shallowClone();
        java.lang.String str30 = comment15.attr("");
        org.jsoup.nodes.Attributes attributes31 = comment15.attributes();
        boolean boolean32 = comment5.equals((java.lang.Object) comment15);
        org.jsoup.nodes.Node node34 = comment15.wrap("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node37 = comment15.attr("", "\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        boolean boolean10 = comment7.hasParent();
        boolean boolean12 = comment7.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean13 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment7.root();
        org.jsoup.nodes.Node node15 = node14.root();
        node14.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node18 = node14.parentNode();
        boolean boolean19 = comment2.equals((java.lang.Object) node18);
        org.jsoup.nodes.Node node21 = comment2.removeAttr("<?commen?>");
        comment2.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.String str6 = comment2.toString();
        java.lang.String str8 = comment2.attr("#comment");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node15 = comment12.nextSibling();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment12.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        java.lang.String str20 = comment12.nodeName();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node22 = comment12.parentNode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        boolean boolean12 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str23 = comment15.attr("");
        org.jsoup.nodes.Document document24 = comment15.ownerDocument();
        org.jsoup.nodes.Node node26 = comment15.removeAttr("#comment");
        java.lang.String str27 = comment15.nodeName();
        org.jsoup.nodes.Node node28 = comment15.shallowClone();
        org.jsoup.nodes.Node node29 = comment15.parentNode();
        boolean boolean30 = comment2.hasSameValue((java.lang.Object) comment15);
        org.jsoup.nodes.Node node31 = comment15.previousSibling();
        java.lang.String str33 = comment15.attr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        org.jsoup.nodes.Node node6 = comment2.nextSibling();
        java.lang.String str7 = comment2.nodeName();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node9 = comment6.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment6.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        java.lang.String str14 = comment6.nodeName();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean17 = comment6.hasSameValue((java.lang.Object) comment16);
        java.lang.String str18 = comment6.nodeName();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment6);
        java.lang.String str20 = comment6.baseUri();
        org.jsoup.nodes.Node node23 = comment6.attr("#comment", "\n<!--#comment-->");
        java.lang.String str24 = comment6.toString();
        java.lang.String str25 = comment6.outerHtml();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str24, "\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!--\n<!--#comment-->-->" + "'", str25, "\n<!--\n<!--#comment-->-->");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 100, outputSettings9);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (-1), outputSettings13);
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        org.jsoup.nodes.Node node16 = node15.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.after("\n<!--\n<!--hi!-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        boolean boolean8 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
        boolean boolean16 = comment2.hasAttr("hi!");
        java.lang.String str17 = comment2.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        java.lang.String str15 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodesCopy();
        java.lang.String str17 = comment2.nodeName();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node20 = comment19.root();
        org.jsoup.nodes.Node node21 = comment19.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.childNodesCopy();
        boolean boolean23 = comment2.equals((java.lang.Object) comment19);
        org.jsoup.nodes.Node node24 = comment19.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment19.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        java.lang.String str13 = comment2.attr("hi!");
        java.lang.String str14 = comment2.nodeName();
        java.lang.String str15 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        org.jsoup.nodes.Node node8 = node6.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.shallowClone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
    }
}

