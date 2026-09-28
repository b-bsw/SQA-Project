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
        org.jsoup.nodes.Node node21 = comment6.root();
        org.jsoup.nodes.Node node22 = node21.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.filter(nodeFilter23);
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment1.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.String str10 = comment2.toString();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.nextSibling();
        java.lang.String str13 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Document document8 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        boolean boolean14 = comment2.hasAttr("");
        boolean boolean15 = comment2.hasParent();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment2.outerHtmlTail(appendable16, (int) (byte) 10, outputSettings18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        boolean boolean10 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.String str16 = comment2.getData();
        int int17 = comment2.childNodeSize();
        java.lang.Class<?> wildcardClass18 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("\n<!---->");
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
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment14.outerHtmlTail(appendable18, (int) (byte) 10, outputSettings20);
        // The following exception was thrown during execution in test generation
        try {
            comment14.remove();
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.traverse(nodeVisitor18);
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
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "#comment");
        boolean boolean3 = comment2.isXmlDeclaration();
        comment2.setBaseUri("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        boolean boolean11 = comment8.hasParent();
        java.lang.String str13 = comment8.absUrl("hi!");
        org.jsoup.nodes.Node node15 = comment8.removeAttr("");
        comment8.setBaseUri("hi!");
        org.jsoup.nodes.Node node18 = comment8.root();
        org.jsoup.nodes.Node node21 = comment8.attr("\n<!--hi!-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.after(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("");
        boolean boolean18 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = comment2.attr("\n<!--hi!-->", "");
        int int22 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment8.shallowClone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        org.jsoup.nodes.Node node18 = comment12.attr("#comment", "#comment");
        boolean boolean19 = comment8.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment12.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration20.childNodesCopy();
        boolean boolean22 = comment2.hasSameValue((java.lang.Object) xmlDeclaration20);
        java.lang.String str23 = xmlDeclaration20.outerHtml();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<?commen?>" + "'", str23, "<?commen?>");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        boolean boolean14 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node17 = comment2.attr("#comment", "");
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment20.attr("", "");
        org.jsoup.nodes.Node node24 = comment20.previousSibling();
        java.lang.String str25 = comment20.baseUri();
        boolean boolean26 = node17.hasSameValue((java.lang.Object) comment20);
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str30 = comment29.getData();
        org.jsoup.nodes.Document document31 = comment29.ownerDocument();
        org.jsoup.nodes.Node node34 = comment29.attr("", "");
        boolean boolean35 = comment29.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes36 = comment29.attributes();
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean41 = comment39.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node42 = comment39.nextSibling();
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        comment39.outerHtmlTail(appendable43, (int) (short) -1, outputSettings45);
        java.lang.String str47 = comment39.nodeName();
        boolean boolean48 = comment29.hasSameValue((java.lang.Object) comment39);
        org.jsoup.nodes.Node node49 = comment29.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = node17.after((org.jsoup.nodes.Node) comment29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#comment" + "'", str47, "#comment");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->");
        java.lang.Class<?> wildcardClass2 = comment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node12 = node11.shallowClone();
        int int13 = node11.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        org.jsoup.nodes.Node node19 = comment2.attr("\n<!--\n<!---->-->", "hi!");
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.traverse(nodeVisitor20);
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
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment8.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment8.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        org.jsoup.nodes.Node node11 = node9.wrap("\n<!--#comment-->");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str9 = comment2.attr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.lang.String str33 = comment15.nodeName();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment36.childNodesCopy();
        java.lang.String str38 = comment36.nodeName();
        java.lang.String str39 = comment36.outerHtml();
        org.jsoup.nodes.Comment comment42 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean44 = comment42.hasSameValue((java.lang.Object) 1);
        boolean boolean45 = comment42.hasParent();
        java.lang.String str47 = comment42.absUrl("hi!");
        org.jsoup.nodes.Node node48 = comment42.parentNode();
        comment42.setBaseUri("\n<!--hi!-->");
        comment42.setBaseUri("");
        org.jsoup.nodes.Node node53 = comment42.parent();
        boolean boolean54 = comment36.equals((java.lang.Object) node53);
        java.lang.String str55 = comment36.getData();
        org.jsoup.nodes.Node node56 = comment36.nextSibling();
        java.lang.String str58 = comment36.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment15.replaceWith((org.jsoup.nodes.Node) comment36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#comment" + "'", str38, "#comment");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n<!---->" + "'", str39, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.root();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        boolean boolean13 = comment9.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment9.parentNode();
        boolean boolean15 = comment2.equals((java.lang.Object) node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = node14.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (byte) -1, outputSettings4);
        org.jsoup.nodes.Attributes attributes6 = comment1.attributes();
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment19.outerHtmlHead(appendable26, (int) (short) 100, outputSettings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.attr("hi!", "hi!");
        int int14 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node17 = comment16.root();
        org.jsoup.nodes.Node node18 = comment16.clone();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment16);
        org.jsoup.nodes.Attributes attributes20 = comment16.attributes();
        java.lang.String str22 = comment16.absUrl("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        int int14 = comment11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment11.siblingNodes();
        java.lang.String str16 = comment11.outerHtml();
        org.jsoup.nodes.Node node17 = comment11.shallowClone();
        boolean boolean19 = comment11.hasSameValue((java.lang.Object) 1.0d);
        java.lang.String str20 = comment11.getData();
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.parent();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, 0, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean32 = comment30.hasSameValue((java.lang.Object) 1);
        boolean boolean33 = comment30.hasParent();
        org.jsoup.nodes.Node node36 = comment30.attr("", "hi!");
        java.lang.String str38 = comment30.attr("");
        org.jsoup.nodes.Document document39 = comment30.ownerDocument();
        java.lang.String str40 = comment30.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = comment30.asXmlDeclaration();
        org.jsoup.nodes.Node node43 = comment30.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment46 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node47 = comment46.root();
        java.lang.String str48 = comment46.getData();
        org.jsoup.nodes.Node node49 = comment46.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = comment46.siblingNodes();
        boolean boolean51 = comment30.hasSameValue((java.lang.Object) comment46);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = comment2.before((org.jsoup.nodes.Node) comment46);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        java.lang.String str13 = comment2.absUrl("\n<!---->");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--\n<!---->-->", "");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment19.childNodes();
        java.lang.String str22 = comment19.attr("hi!");
        java.lang.String str23 = comment19.baseUri();
        boolean boolean24 = comment2.equals((java.lang.Object) str23);
        java.lang.String str25 = comment2.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration26);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clone();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        boolean boolean9 = comment6.hasParent();
        java.lang.String str11 = comment6.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment6.removeAttr("");
        comment6.setBaseUri("hi!");
        int int16 = comment6.childNodeSize();
        org.jsoup.nodes.Node node17 = comment6.clone();
        boolean boolean18 = node3.equals((java.lang.Object) node17);
        org.jsoup.select.NodeFilter nodeFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node3.filter(nodeFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        boolean boolean24 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node25 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.after("#comment");
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = node2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str6 = comment2.attr("hi!");
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = comment2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        org.jsoup.nodes.Node node17 = comment2.parentNode();
        org.jsoup.nodes.Node node18 = comment2.root();
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
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment6.outerHtmlHead(appendable21, 0, outputSettings23);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str10 = comment2.attr("#comment");
        org.jsoup.nodes.Node node11 = comment2.shallowClone();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment2.outerHtmlTail(appendable13, (int) (byte) 100, outputSettings15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        java.lang.String str9 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str9 = comment7.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment7.childNodesCopy();
        java.lang.String str11 = comment7.getData();
        java.lang.String str12 = comment7.baseUri();
        org.jsoup.nodes.Node node13 = comment7.clone();
        boolean boolean14 = comment2.equals((java.lang.Object) comment7);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment7.childNodesCopy();
        org.jsoup.nodes.Node node17 = comment7.removeAttr("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment7.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodesCopy();
        java.lang.String str15 = comment2.toString();
        org.jsoup.nodes.Node node16 = comment2.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.filter(nodeFilter17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        java.lang.String str7 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration5.after("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!---->");
        java.lang.String str8 = comment2.baseUri();
        java.lang.String str10 = comment2.attr("<?i?>");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node11.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        java.lang.String str10 = comment2.toString();
        int int11 = comment2.childNodeSize();
        java.lang.String str13 = comment2.attr("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!---->" + "'", str10, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("hi!");
        java.lang.String str17 = comment2.nodeName();
        java.lang.String str19 = comment2.attr("#comment");
        org.jsoup.nodes.Node node20 = comment2.nextSibling();
        java.lang.String str21 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node12 = node11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.attr("hi!", "#comment");
        boolean boolean10 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        boolean boolean11 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasParent();
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node14 = comment2.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        boolean boolean7 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment1.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        int int17 = comment14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment14.siblingNodes();
        java.lang.String str19 = comment14.outerHtml();
        org.jsoup.nodes.Node node20 = comment14.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.outerHtml();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (byte) -1, outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        org.jsoup.nodes.Document document23 = node8.ownerDocument();
        java.lang.Class<?> wildcardClass24 = node8.getClass();
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment12.childNodes();
        boolean boolean17 = comment2.equals((java.lang.Object) comment12);
        java.lang.String str19 = comment12.attr("hi!");
        java.lang.String str20 = comment12.baseUri();
        org.jsoup.nodes.Node node21 = comment12.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment18.childNodesCopy();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node25 = comment22.nextSibling();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment22.outerHtmlTail(appendable26, (int) (short) -1, outputSettings28);
        java.lang.String str30 = comment22.nodeName();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean33 = comment22.hasSameValue((java.lang.Object) comment32);
        java.lang.String str34 = comment22.nodeName();
        boolean boolean35 = comment18.hasSameValue((java.lang.Object) comment22);
        java.lang.String str36 = comment22.baseUri();
        org.jsoup.nodes.Node node37 = comment22.root();
        java.lang.Class<?> wildcardClass38 = node37.getClass();
        boolean boolean39 = comment2.hasSameValue((java.lang.Object) node37);
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        java.lang.String str7 = comment2.getData();
        org.jsoup.nodes.Node node8 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment5.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration13.childNodesCopy();
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration13.filter(nodeFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!---->");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("");
        int int17 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Node node11 = comment2.attr("", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node12 = node11.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment12.attr("#comment", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node8.after("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        org.jsoup.nodes.Node node14 = comment1.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = comment1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        java.lang.String str3 = comment2.outerHtml();
        java.lang.String str5 = comment2.attr("\n<!--\n<!---->-->");
        java.lang.Class<?> wildcardClass6 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--\n<!---->-->" + "'", str3, "\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable21, (int) (short) -1, outputSettings23);
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
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.jsoup.nodes.Comment comment37 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "");
        org.jsoup.nodes.Document document38 = comment37.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = comment17.after((org.jsoup.nodes.Node) comment37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(document38);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        java.lang.String str16 = comment2.attr("#comment");
        java.lang.String str17 = comment2.toString();
        org.jsoup.nodes.Node node18 = comment2.shallowClone();
        java.lang.String str20 = comment2.attr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node21 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        org.jsoup.nodes.Node node17 = comment2.parent();
        boolean boolean19 = comment2.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.jsoup.nodes.Attributes attributes19 = comment2.attributes();
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
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.jsoup.nodes.Document document20 = comment2.ownerDocument();
        boolean boolean22 = comment2.hasAttr("#comment");
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        boolean boolean18 = comment2.hasAttr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        java.lang.String str14 = comment2.absUrl("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        java.lang.String str13 = node12.outerHtml();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment16.childNodes();
        java.lang.String str19 = comment16.attr("hi!");
        java.lang.String str20 = comment16.baseUri();
        boolean boolean21 = node12.hasSameValue((java.lang.Object) comment16);
        org.jsoup.nodes.Node node23 = comment16.wrap("\n<!---->");
        java.lang.String str25 = comment16.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment16.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment12.childNodes();
        boolean boolean14 = comment12.hasParent();
        boolean boolean15 = comment2.hasSameValue((java.lang.Object) comment12);
        boolean boolean16 = comment12.isXmlDeclaration();
        int int17 = comment12.siblingIndex();
        java.lang.String str19 = comment12.absUrl("#comment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment5.asXmlDeclaration();
        boolean boolean14 = comment5.isXmlDeclaration();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = comment17.hasParent();
        java.lang.String str22 = comment17.absUrl("hi!");
        org.jsoup.nodes.Node node23 = comment17.parentNode();
        comment17.setBaseUri("\n<!--hi!-->");
        comment17.setBaseUri("");
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment17.outerHtmlTail(appendable28, (int) (byte) 100, outputSettings30);
        int int32 = comment17.siblingIndex();
        boolean boolean33 = comment17.hasParent();
        boolean boolean34 = comment17.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment17.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = comment5.before((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.lang.String str11 = comment2.toString();
        java.lang.String str13 = comment2.absUrl("#comment");
        java.lang.String str14 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.childNodesCopy();
        boolean boolean17 = comment2.hasAttr("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.jsoup.nodes.Node node19 = comment2.parentNode();
        org.jsoup.nodes.Node node20 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment1.removeAttr("#comment");
        java.lang.String str5 = comment1.attr("hi!");
        java.lang.Class<?> wildcardClass6 = comment1.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.jsoup.nodes.Node node23 = node21.clearAttributes();
        org.jsoup.nodes.Node node24 = node23.nextSibling();
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.root();
        org.jsoup.nodes.Document document5 = comment2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment12.childNodes();
        boolean boolean17 = comment2.equals((java.lang.Object) comment12);
        org.jsoup.nodes.Attributes attributes18 = comment12.attributes();
        org.jsoup.nodes.Node node19 = comment12.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node7 = comment2.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = comment2.parentNode();
        java.lang.String str16 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment2.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        node7.setBaseUri("hi!");
        org.jsoup.nodes.Document document23 = node7.ownerDocument();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node29 = comment26.nextSibling();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        comment26.outerHtmlTail(appendable30, (int) (short) -1, outputSettings32);
        java.lang.String str34 = comment26.nodeName();
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        comment26.outerHtmlTail(appendable35, (int) (byte) -1, outputSettings37);
        comment26.setBaseUri("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = document23.before((org.jsoup.nodes.Node) comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.String str19 = comment2.outerHtml();
        int int20 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.unwrap();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node6 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        int int18 = comment15.siblingIndex();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node24 = comment21.nextSibling();
        boolean boolean25 = comment15.equals((java.lang.Object) comment21);
        org.jsoup.nodes.Node node27 = comment21.removeAttr("\n<!--hi!-->");
        boolean boolean28 = comment2.equals((java.lang.Object) "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        boolean boolean12 = comment2.isXmlDeclaration();
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
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before("\n<!--hi!-->");
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
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Document document11 = node10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        java.lang.String str10 = comment2.toString();
        int int11 = comment2.childNodeSize();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!---->" + "'", str10, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = node6.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean31 = comment29.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node32 = comment29.nextSibling();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        comment29.outerHtmlTail(appendable33, (int) (short) -1, outputSettings35);
        org.jsoup.nodes.Node node37 = comment29.root();
        org.jsoup.nodes.Node node39 = comment29.removeAttr("#comment");
        org.jsoup.nodes.Comment comment42 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean44 = comment42.hasSameValue((java.lang.Object) 1);
        boolean boolean45 = comment42.hasParent();
        org.jsoup.nodes.Node node48 = comment42.attr("", "hi!");
        java.lang.String str50 = comment42.attr("");
        org.jsoup.nodes.Document document51 = comment42.ownerDocument();
        org.jsoup.nodes.Node node53 = comment42.removeAttr("#comment");
        java.lang.String str54 = comment42.nodeName();
        org.jsoup.nodes.Node node57 = comment42.attr("", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList58 = node57.siblingNodes();
        boolean boolean59 = node39.equals((java.lang.Object) node57);
        boolean boolean60 = node39.hasParent();
        org.jsoup.nodes.Comment comment62 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node63 = comment62.root();
        org.jsoup.nodes.Node node64 = comment62.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = node64.childNodes();
        boolean boolean66 = node39.hasSameValue((java.lang.Object) nodeList65);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node67 = comment2.after(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(document51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#comment" + "'", str54, "#comment");
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        java.lang.String str20 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node21 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.before("<?commen?>");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        int int21 = comment18.siblingIndex();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node27 = comment24.nextSibling();
        boolean boolean28 = comment18.equals((java.lang.Object) comment24);
        org.jsoup.nodes.Node node30 = comment24.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node31 = comment24.shallowClone();
        java.lang.String str32 = comment24.toString();
        java.lang.String str33 = comment24.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment24);
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n<!--hi!-->" + "'", str32, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#comment" + "'", str33, "#comment");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        org.jsoup.nodes.Node node25 = comment2.removeAttr("<?commen?>");
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
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        org.jsoup.nodes.Node node8 = node6.root();
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        boolean boolean9 = comment6.hasParent();
        boolean boolean11 = comment6.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean12 = comment6.isXmlDeclaration();
        boolean boolean13 = comment6.hasParent();
        org.jsoup.nodes.Node node15 = comment6.removeAttr("\n<!---->");
        boolean boolean16 = comment6.hasParent();
        int int17 = comment6.childNodeSize();
        org.jsoup.nodes.Node node20 = comment6.attr("\n<!--\n<!---->-->", "");
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment23.childNodes();
        java.lang.String str26 = comment23.attr("hi!");
        java.lang.String str27 = comment23.baseUri();
        boolean boolean28 = comment6.equals((java.lang.Object) str27);
        boolean boolean29 = comment2.equals((java.lang.Object) comment6);
        org.jsoup.nodes.Node node30 = comment6.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.attr("hi!", "hi!");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, (int) (byte) -1, outputSettings16);
        boolean boolean18 = comment2.isXmlDeclaration();
        boolean boolean19 = comment2.hasParent();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment22.childNodesCopy();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node29 = comment26.nextSibling();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        comment26.outerHtmlTail(appendable30, (int) (short) -1, outputSettings32);
        java.lang.String str34 = comment26.nodeName();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean37 = comment26.hasSameValue((java.lang.Object) comment36);
        java.lang.String str38 = comment26.nodeName();
        boolean boolean39 = comment22.hasSameValue((java.lang.Object) comment26);
        java.lang.String str40 = comment26.baseUri();
        org.jsoup.nodes.Node node42 = comment26.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment45 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = comment45.childNodesCopy();
        java.lang.String str47 = comment45.baseUri();
        org.jsoup.nodes.Node node48 = comment45.root();
        boolean boolean49 = node42.hasSameValue((java.lang.Object) comment45);
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#comment" + "'", str38, "#comment");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!---->", "\n<!--\n<!---->-->");
        java.lang.String str11 = comment2.getData();
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = comment2.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, 100, outputSettings8);
        java.lang.String str11 = comment2.absUrl("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (int) (short) 10, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--#comment-->");
        org.jsoup.nodes.Node node3 = comment2.previousSibling();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.root();
        org.jsoup.nodes.Node node7 = node6.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Node node10 = node9.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = node3.parent();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.jsoup.select.NodeVisitor nodeVisitor37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = comment2.traverse(nodeVisitor37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = node13.root();
        org.jsoup.nodes.Node node15 = node14.parent();
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.filter(nodeFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (-1), outputSettings6);
        java.lang.String str9 = comment2.attr("<?i?>");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "#comment");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment2.outerHtmlTail(appendable17, (int) (short) -1, outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment12.childNodes();
        boolean boolean17 = comment2.equals((java.lang.Object) comment12);
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment2.outerHtmlTail(appendable18, (int) (short) 1, outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.root();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, 1, outputSettings8);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.traverse(nodeVisitor16);
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
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        java.lang.String str13 = comment2.toString();
        java.lang.String str14 = comment2.toString();
        java.lang.String str16 = comment2.attr("<?commen?>");
        java.lang.String str18 = comment2.attr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        org.jsoup.nodes.Node node18 = comment12.attr("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node18.childNodes();
        boolean boolean20 = comment2.equals((java.lang.Object) nodeList19);
        org.jsoup.nodes.Node node21 = comment2.nextSibling();
        java.lang.String str22 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        org.jsoup.nodes.Node node11 = node10.clearAttributes();
        org.jsoup.nodes.Document document12 = node10.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        int int14 = comment2.siblingIndex();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment2.outerHtmlTail(appendable15, 1, outputSettings17);
        org.jsoup.select.NodeFilter nodeFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.filter(nodeFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.Node node13 = comment2.previousSibling();
        int int14 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node18 = comment17.clone();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment17);
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node22 = comment21.parentNode();
        java.lang.String str23 = comment21.nodeName();
        org.jsoup.nodes.Node node24 = comment21.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment17.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node9 = comment8.shallowClone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        org.jsoup.nodes.Node node18 = comment12.attr("#comment", "#comment");
        boolean boolean19 = comment8.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment12.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration20.childNodesCopy();
        boolean boolean22 = comment2.hasSameValue((java.lang.Object) xmlDeclaration20);
        java.lang.String str24 = comment2.attr("\n<!--#comment-->");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) ' ', outputSettings13);
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment17.siblingNodes();
        java.lang.String str22 = comment17.toString();
        boolean boolean23 = comment17.isXmlDeclaration();
        java.lang.String str25 = comment17.attr("#comment");
        org.jsoup.nodes.Node node26 = comment17.shallowClone();
        boolean boolean27 = comment2.hasSameValue((java.lang.Object) node26);
        org.jsoup.nodes.Node node28 = node26.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node26.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.siblingNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(xmlDeclaration14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        org.jsoup.nodes.Attributes attributes18 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.after("\n<!--hi!-->");
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        java.lang.String str13 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node13 = node12.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        org.jsoup.nodes.Attributes attributes16 = comment8.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = comment2.clearAttributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        boolean boolean13 = comment9.isXmlDeclaration();
        int int14 = comment9.childNodeSize();
        org.jsoup.nodes.Node node15 = comment9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.after(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        boolean boolean16 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node17 = comment2.clone();
        org.jsoup.nodes.Node node18 = node17.clone();
        java.lang.String str19 = node17.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        boolean boolean40 = comment22.hasParent();
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
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        org.jsoup.nodes.Node node19 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node20 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        org.jsoup.nodes.Node node7 = node6.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        java.lang.Class<?> wildcardClass6 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        boolean boolean13 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.shallowClone();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        boolean boolean20 = comment2.hasParent();
        java.lang.String str21 = comment2.getData();
        int int22 = comment2.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        java.lang.String str15 = comment2.attr("hi!");
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.filter(nodeFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        org.jsoup.nodes.Node node19 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        java.lang.String str27 = comment22.absUrl("hi!");
        java.lang.String str28 = comment22.getData();
        java.lang.String str30 = comment22.attr("#comment");
        org.jsoup.nodes.Attributes attributes31 = comment22.attributes();
        int int32 = comment22.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = comment2.after((org.jsoup.nodes.Node) comment22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        org.jsoup.nodes.Node node3 = comment1.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment1.outerHtmlTail(appendable5, (int) (byte) 1, outputSettings7);
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment11.childNodes();
        org.jsoup.nodes.Node node13 = comment11.clone();
        org.jsoup.nodes.Node node14 = comment11.shallowClone();
        org.jsoup.nodes.Node node15 = node14.root();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node14.childNodesCopy();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        boolean boolean22 = comment19.hasParent();
        org.jsoup.nodes.Node node25 = comment19.attr("", "hi!");
        java.lang.String str27 = comment19.attr("");
        org.jsoup.nodes.Document document28 = comment19.ownerDocument();
        org.jsoup.nodes.Node node30 = comment19.removeAttr("#comment");
        java.lang.String str31 = comment19.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment19.childNodesCopy();
        boolean boolean33 = comment19.isXmlDeclaration();
        boolean boolean34 = node14.equals((java.lang.Object) comment19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment1.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#comment" + "'", str31, "#comment");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Node node3 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node9 = comment6.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment6.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        java.lang.String str15 = comment6.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment6.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = comment6.attr("hi!", "\n<!---->");
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
        boolean boolean40 = comment6.equals((java.lang.Object) comment23);
        java.lang.String str41 = comment6.getData();
        boolean boolean42 = node3.equals((java.lang.Object) comment6);
        org.jsoup.select.NodeVisitor nodeVisitor43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = comment6.traverse(nodeVisitor43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.parent();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, (int) (byte) 100, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Document document14 = comment12.ownerDocument();
        org.jsoup.nodes.Node node17 = comment12.attr("", "");
        boolean boolean18 = comment12.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes19 = comment12.attributes();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node25 = comment22.nextSibling();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment22.outerHtmlTail(appendable26, (int) (short) -1, outputSettings28);
        java.lang.String str30 = comment22.nodeName();
        boolean boolean31 = comment12.hasSameValue((java.lang.Object) comment22);
        boolean boolean32 = node9.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Comment comment35 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str37 = comment35.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node38 = comment35.root();
        boolean boolean39 = node9.hasSameValue((java.lang.Object) node38);
        node9.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        boolean boolean4 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment2.after("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        node9.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node15.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!--hi!-->");
        int int12 = node11.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node8 = node7.parent();
        java.lang.String str9 = node7.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = node37.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.jsoup.nodes.Node node15 = node14.parentNode();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str19 = comment18.getData();
        org.jsoup.nodes.Node node20 = comment18.nextSibling();
        int int21 = comment18.siblingIndex();
        int int22 = comment18.childNodeSize();
        java.lang.String str24 = comment18.attr("<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = node15.after((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        java.lang.Class<?> wildcardClass17 = node15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "");
        boolean boolean14 = comment2.hasAttr("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.jsoup.nodes.Node node31 = comment15.removeAttr("");
        java.lang.String str32 = comment15.outerHtml();
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        comment15.outerHtmlTail(appendable33, (int) 'a', outputSettings35);
        org.jsoup.nodes.Node node37 = comment15.nextSibling();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n<!---->" + "'", str32, "\n<!---->");
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, 0, outputSettings13);
        org.jsoup.nodes.Document document15 = comment8.ownerDocument();
        org.jsoup.nodes.Node node17 = comment8.removeAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, 1, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        boolean boolean17 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment2.outerHtmlTail(appendable18, (int) ' ', outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        java.lang.String str9 = comment2.baseUri();
        java.lang.String str10 = comment2.nodeName();
        java.lang.String str11 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.jsoup.nodes.Node node16 = node14.clone();
        int int17 = node14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node14.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = document14.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        boolean boolean9 = comment6.hasParent();
        boolean boolean10 = comment6.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment6.parentNode();
        boolean boolean12 = comment2.equals((java.lang.Object) node11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.after("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("#comment", "");
        java.lang.String str9 = comment2.attr("#comment");
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        org.jsoup.nodes.Node node19 = comment13.attr("", "hi!");
        java.lang.String str21 = comment13.attr("");
        org.jsoup.nodes.Document document22 = comment13.ownerDocument();
        org.jsoup.nodes.Node node24 = comment13.removeAttr("#comment");
        java.lang.String str25 = comment13.nodeName();
        org.jsoup.nodes.Node node27 = comment13.removeAttr("hi!");
        int int28 = comment13.siblingIndex();
        org.jsoup.nodes.Node node30 = comment13.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment13.childNodes();
        org.jsoup.nodes.Node node35 = comment13.attr("\n<!---->", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment13.childNodesCopy();
        boolean boolean37 = comment2.hasSameValue((java.lang.Object) nodeList36);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.jsoup.nodes.Node node35 = comment14.attr("", "");
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
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        java.lang.String str16 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        java.lang.String str14 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.before("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.lang.String str16 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        boolean boolean11 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.shallowClone();
        org.jsoup.nodes.Node node10 = node8.nextSibling();
        node8.setBaseUri("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        int int18 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        comment2.setBaseUri("hi!");
        java.lang.String str8 = comment2.outerHtml();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment13.shallowClone();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = comment17.attr("", "");
        org.jsoup.nodes.Node node23 = comment17.attr("#comment", "#comment");
        boolean boolean24 = comment13.hasSameValue((java.lang.Object) comment17);
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasSameValue((java.lang.Object) 1);
        boolean boolean30 = comment27.hasParent();
        org.jsoup.nodes.Node node33 = comment27.attr("", "hi!");
        java.lang.String str35 = comment27.attr("");
        org.jsoup.nodes.Document document36 = comment27.ownerDocument();
        org.jsoup.nodes.Node node38 = comment27.removeAttr("#comment");
        java.lang.String str39 = comment27.nodeName();
        org.jsoup.nodes.Node node40 = comment27.shallowClone();
        java.lang.String str42 = comment27.attr("");
        org.jsoup.nodes.Attributes attributes43 = comment27.attributes();
        boolean boolean44 = comment17.equals((java.lang.Object) comment27);
        org.jsoup.nodes.Node node47 = comment27.attr("", "\n<!--hi!-->");
        boolean boolean48 = comment2.equals((java.lang.Object) comment27);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#comment" + "'", str39, "#comment");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        boolean boolean6 = comment2.hasAttr("\n<!--#comment-->");
        org.jsoup.nodes.Node node8 = comment2.wrap("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node8.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.after("<?commen?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment12.childNodes();
        boolean boolean17 = comment2.equals((java.lang.Object) comment12);
        java.lang.String str18 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable8, (int) (short) 1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        java.lang.String str6 = comment2.nodeName();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        org.jsoup.nodes.Node node15 = comment9.attr("", "hi!");
        java.lang.String str17 = comment9.attr("");
        org.jsoup.nodes.Document document18 = comment9.ownerDocument();
        org.jsoup.nodes.Node node20 = comment9.removeAttr("#comment");
        java.lang.String str21 = comment9.nodeName();
        org.jsoup.nodes.Node node22 = comment9.shallowClone();
        java.lang.String str24 = comment9.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment9.root();
        org.jsoup.nodes.Node node26 = comment9.nextSibling();
        java.lang.String str28 = comment9.attr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node26 = comment25.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = node26.childNodes();
        boolean boolean28 = comment12.equals((java.lang.Object) nodeList27);
        int int29 = comment12.childNodeSize();
        org.jsoup.nodes.Node node30 = comment12.nextSibling();
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.jsoup.nodes.Node node24 = node22.shallowClone();
        int int25 = node22.siblingIndex();
        org.jsoup.nodes.Node node26 = node22.parent();
        // The following exception was thrown during execution in test generation
        try {
            node26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.clone();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, (-1), outputSettings9);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        int int19 = comment16.siblingIndex();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node25 = comment22.nextSibling();
        boolean boolean26 = comment16.equals((java.lang.Object) comment22);
        org.jsoup.nodes.Node node28 = comment22.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node29 = comment22.shallowClone();
        org.jsoup.nodes.Node node30 = node29.nextSibling();
        java.lang.String str31 = node29.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment2.after(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!--hi!-->" + "'", str31, "\n<!--hi!-->");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.lang.String str12 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration13.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment9.childNodesCopy();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node16 = comment13.nextSibling();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment13.outerHtmlTail(appendable17, (int) (short) -1, outputSettings19);
        java.lang.String str21 = comment13.nodeName();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean24 = comment13.hasSameValue((java.lang.Object) comment23);
        java.lang.String str25 = comment13.nodeName();
        boolean boolean26 = comment9.hasSameValue((java.lang.Object) comment13);
        java.lang.String str27 = comment13.baseUri();
        org.jsoup.nodes.Node node29 = comment13.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = comment32.childNodesCopy();
        java.lang.String str34 = comment32.baseUri();
        org.jsoup.nodes.Node node35 = comment32.root();
        boolean boolean36 = node29.hasSameValue((java.lang.Object) comment32);
        org.jsoup.nodes.Node node37 = node29.clearAttributes();
        int int38 = node29.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = comment2.after(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#comment" + "'", str21, "#comment");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment1.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment1.parentNode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Document document11 = comment9.ownerDocument();
        org.jsoup.nodes.Node node14 = comment9.attr("", "");
        java.lang.String str15 = comment9.getData();
        int int16 = comment9.siblingIndex();
        java.lang.String str18 = comment9.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment9.siblingNodes();
        java.lang.String str20 = comment9.getData();
        org.jsoup.nodes.Node node21 = comment9.root();
        org.jsoup.nodes.Node node22 = comment9.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = document6.hasSameValue((java.lang.Object) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        int int10 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment2.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.after("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str40 = comment39.getData();
        org.jsoup.nodes.Document document41 = comment39.ownerDocument();
        org.jsoup.nodes.Node node44 = comment39.attr("", "");
        boolean boolean45 = comment39.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes46 = comment39.attributes();
        org.jsoup.nodes.Comment comment49 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean51 = comment49.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node52 = comment49.nextSibling();
        java.lang.Appendable appendable53 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = null;
        comment49.outerHtmlTail(appendable53, (int) (short) -1, outputSettings55);
        java.lang.String str57 = comment49.nodeName();
        boolean boolean58 = comment39.hasSameValue((java.lang.Object) comment49);
        java.lang.String str59 = comment49.baseUri();
        org.jsoup.nodes.Comment comment62 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node63 = comment62.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = node63.childNodes();
        boolean boolean65 = comment49.equals((java.lang.Object) nodeList64);
        int int66 = comment49.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node67 = comment2.after((org.jsoup.nodes.Node) comment49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#comment" + "'", str57, "#comment");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        java.lang.Class<?> wildcardClass12 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment2.attr("hi!", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodes();
        org.jsoup.nodes.Node node18 = node16.root();
        boolean boolean19 = node18.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable15, 0, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        boolean boolean19 = comment14.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean20 = comment14.isXmlDeclaration();
        org.jsoup.nodes.Node node21 = comment14.parentNode();
        boolean boolean23 = comment14.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node24 = comment14.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        org.jsoup.nodes.Node node14 = node13.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node13.childNodes();
        org.jsoup.nodes.Document document16 = node13.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = comment11.parentNode();
        int int15 = comment11.siblingIndex();
        org.jsoup.nodes.Node node17 = comment11.removeAttr("#comment");
        org.jsoup.nodes.Document document18 = comment11.ownerDocument();
        boolean boolean19 = comment2.equals((java.lang.Object) comment11);
        java.lang.String str20 = comment11.nodeName();
        java.lang.String str21 = comment11.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasSameValue((java.lang.Object) 1.0d);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, 10, outputSettings13);
        org.jsoup.nodes.Node node15 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.before("<?i?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.Class<?> wildcardClass9 = comment2.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str24 = comment23.getData();
        int int25 = comment23.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node20.before((org.jsoup.nodes.Node) comment23);
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        java.lang.String str10 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Document document14 = comment12.ownerDocument();
        org.jsoup.nodes.Node node17 = comment12.attr("", "");
        boolean boolean18 = comment12.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes19 = comment12.attributes();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node25 = comment22.nextSibling();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        comment22.outerHtmlTail(appendable26, (int) (short) -1, outputSettings28);
        java.lang.String str30 = comment22.nodeName();
        boolean boolean31 = comment12.hasSameValue((java.lang.Object) comment22);
        boolean boolean32 = node9.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Comment comment35 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str37 = comment35.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node38 = comment35.root();
        boolean boolean39 = node9.hasSameValue((java.lang.Object) node38);
        org.jsoup.nodes.Node node40 = node38.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#comment" + "'", str30, "#comment");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        org.jsoup.nodes.Node node18 = comment7.shallowClone();
        org.jsoup.nodes.Node node20 = node18.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        int int5 = comment2.siblingIndex();
        int int6 = comment2.childNodeSize();
        java.lang.String str7 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        org.jsoup.nodes.Node node19 = comment2.attr("", "<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.String str28 = comment2.absUrl("\n<!--hi!-->");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        org.jsoup.nodes.Node node25 = comment2.attr("hi!", "<?i?>");
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
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        int int14 = node12.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = comment17.hasParent();
        java.lang.String str22 = comment17.absUrl("hi!");
        org.jsoup.nodes.Node node23 = comment17.parentNode();
        comment17.setBaseUri("\n<!--hi!-->");
        comment17.setBaseUri("");
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean32 = comment30.hasSameValue((java.lang.Object) 1);
        boolean boolean33 = comment30.hasParent();
        org.jsoup.nodes.Node node36 = comment30.attr("", "hi!");
        java.lang.String str38 = comment30.attr("");
        org.jsoup.nodes.Document document39 = comment30.ownerDocument();
        org.jsoup.nodes.Node node41 = comment30.removeAttr("#comment");
        java.lang.String str42 = comment30.nodeName();
        org.jsoup.nodes.Node node43 = comment30.shallowClone();
        boolean boolean44 = comment17.hasSameValue((java.lang.Object) comment30);
        org.jsoup.nodes.Node node46 = comment30.removeAttr("");
        java.lang.String str47 = comment30.outerHtml();
        boolean boolean48 = node12.equals((java.lang.Object) comment30);
        java.lang.String str49 = comment30.toString();
        boolean boolean51 = comment30.hasAttr("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#comment" + "'", str42, "#comment");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\n<!---->" + "'", str47, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\n<!---->" + "'", str49, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable10, 0, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        int int9 = comment2.childNodeSize();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?i?>", "#comment");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        int int10 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.root();
        java.lang.String str12 = comment2.absUrl("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node14 = comment2.parent();
        boolean boolean15 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes16 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment2.childNodes();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        boolean boolean23 = comment20.hasParent();
        org.jsoup.nodes.Node node26 = comment20.attr("", "hi!");
        java.lang.String str28 = comment20.attr("");
        org.jsoup.nodes.Document document29 = comment20.ownerDocument();
        org.jsoup.nodes.Node node31 = comment20.removeAttr("#comment");
        java.lang.String str32 = comment20.nodeName();
        org.jsoup.nodes.Node node33 = comment20.shallowClone();
        org.jsoup.nodes.Node node34 = comment20.nextSibling();
        org.jsoup.nodes.Node node35 = comment20.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = comment2.before(node35);
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#comment" + "'", str32, "#comment");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment12.parentNode();
        int int16 = comment12.siblingIndex();
        java.lang.String str17 = comment12.outerHtml();
        java.lang.String str19 = comment12.attr("\n<!---->");
        org.jsoup.nodes.Node node20 = comment12.parentNode();
        boolean boolean21 = comment2.equals((java.lang.Object) node20);
        java.lang.String str22 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        boolean boolean14 = comment2.hasAttr("#comment");
        comment2.setBaseUri("#comment");
        org.jsoup.select.NodeFilter nodeFilter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.filter(nodeFilter17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        org.jsoup.nodes.Node node21 = node20.clone();
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment6.childNodes();
        org.jsoup.nodes.Node node8 = comment6.clone();
        org.jsoup.nodes.Node node9 = comment6.shallowClone();
        org.jsoup.nodes.Node node11 = comment6.removeAttr("");
        boolean boolean12 = node11.hasParent();
        boolean boolean13 = comment2.equals((java.lang.Object) node11);
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node11.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (byte) 0, outputSettings11);
        java.lang.String str13 = comment2.toString();
        java.lang.String str14 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        java.lang.String str3 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        boolean boolean7 = node6.hasParent();
        org.jsoup.nodes.Node node8 = node6.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable17, (int) (byte) 100, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment9.outerHtmlTail(appendable10, (int) '#', outputSettings12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment9.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("");
        int int12 = comment11.siblingIndex();
        boolean boolean13 = node8.equals((java.lang.Object) comment11);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment11.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.siblingNodes();
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.jsoup.nodes.Node node27 = comment10.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment10.clearAttributes();
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
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = comment2.attr("hi!", "hi!");
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        comment2.outerHtmlTail(appendable17, 1, outputSettings19);
        java.lang.String str22 = comment2.attr("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str9 = comment7.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment7.childNodesCopy();
        java.lang.String str11 = comment7.getData();
        java.lang.String str12 = comment7.baseUri();
        org.jsoup.nodes.Node node13 = comment7.clone();
        boolean boolean14 = comment2.equals((java.lang.Object) comment7);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment7.childNodesCopy();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str20 = comment18.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment18.childNodesCopy();
        boolean boolean22 = comment18.isXmlDeclaration();
        int int23 = comment18.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment7.replaceWith((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.String str6 = comment2.getData();
        boolean boolean7 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = comment12.parentNode();
        int int16 = comment12.siblingIndex();
        java.lang.String str17 = comment12.outerHtml();
        java.lang.String str19 = comment12.attr("\n<!---->");
        org.jsoup.nodes.Node node20 = comment12.parentNode();
        boolean boolean21 = comment2.equals((java.lang.Object) node20);
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str26 = comment24.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment24.childNodesCopy();
        boolean boolean28 = comment24.isXmlDeclaration();
        int int29 = comment24.childNodeSize();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        comment24.outerHtmlTail(appendable30, (int) ' ', outputSettings32);
        java.lang.String str35 = comment24.absUrl("\n<!---->");
        org.jsoup.nodes.Node node36 = comment24.previousSibling();
        java.lang.String str38 = comment24.attr("hi!");
        org.jsoup.nodes.Node node40 = comment24.removeAttr("hi!");
        org.jsoup.nodes.Comment comment43 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean45 = comment43.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node46 = comment43.nextSibling();
        java.lang.Appendable appendable47 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        comment43.outerHtmlTail(appendable47, (int) (short) -1, outputSettings49);
        java.lang.String str52 = comment43.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node54 = comment43.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Document document55 = comment43.ownerDocument();
        comment43.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node58 = comment43.shallowClone();
        boolean boolean59 = node40.equals((java.lang.Object) comment43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = node20.after((org.jsoup.nodes.Node) comment43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(document55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (byte) -1, outputSettings13);
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = comment17.hasParent();
        org.jsoup.nodes.Document document21 = comment17.ownerDocument();
        boolean boolean23 = comment17.hasAttr("#comment");
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str27 = comment26.getData();
        org.jsoup.nodes.Document document28 = comment26.ownerDocument();
        org.jsoup.nodes.Node node31 = comment26.attr("", "");
        java.lang.String str32 = comment26.getData();
        int int33 = comment26.siblingIndex();
        boolean boolean34 = comment17.equals((java.lang.Object) comment26);
        boolean boolean35 = comment2.equals((java.lang.Object) boolean34);
        org.jsoup.nodes.Node node38 = comment2.attr("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        boolean boolean39 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        java.lang.String str10 = comment2.absUrl("\n<!---->");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) ' ', outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        org.jsoup.nodes.Node node31 = comment15.removeAttr("");
        java.lang.String str32 = comment15.getData();
        org.jsoup.nodes.Document document33 = comment15.ownerDocument();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean38 = comment36.hasAttr("hi!");
        org.jsoup.nodes.Node node39 = comment36.parentNode();
        int int40 = comment36.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = document33.hasSameValue((java.lang.Object) comment36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.clone();
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str21 = comment19.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.childNodesCopy();
        boolean boolean23 = comment19.isXmlDeclaration();
        int int24 = comment19.childNodeSize();
        org.jsoup.nodes.Node node27 = comment19.attr("\n<!---->", "\n<!--\n<!---->-->");
        boolean boolean28 = node16.hasSameValue((java.lang.Object) comment19);
        org.jsoup.nodes.Node node30 = comment19.removeAttr("");
        int int31 = node30.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node17 = comment14.nextSibling();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment14.outerHtmlTail(appendable18, (int) (short) -1, outputSettings20);
        java.lang.String str23 = comment14.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment14.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node28 = comment14.attr("hi!", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node28.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = node7.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        boolean boolean25 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Document document26 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = document26.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        org.jsoup.nodes.Node node13 = node12.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        java.lang.String str11 = comment2.baseUri();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable12, (int) (byte) 1, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("#comment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        boolean boolean14 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node17 = comment2.attr("hi!", "\n<!---->");
        boolean boolean18 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        boolean boolean11 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasAttr("hi!");
        org.jsoup.nodes.Node node17 = comment14.parentNode();
        int int18 = comment14.siblingIndex();
        org.jsoup.nodes.Node node20 = comment14.removeAttr("#comment");
        org.jsoup.nodes.Node node21 = comment14.root();
        org.jsoup.nodes.Node node23 = comment14.wrap("\n<!--hi!-->");
        boolean boolean25 = comment14.hasAttr("\n<!---->");
        java.lang.String str27 = comment14.attr("hi!");
        org.jsoup.nodes.Node node30 = comment14.attr("", "");
        java.lang.String str31 = comment14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment2.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!---->" + "'", str31, "\n<!---->");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        int int10 = comment2.childNodeSize();
        org.jsoup.nodes.Node node11 = comment2.shallowClone();
        boolean boolean13 = comment2.hasAttr("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        boolean boolean17 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment2.removeAttr("");
        org.jsoup.nodes.Node node20 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        org.jsoup.nodes.Node node18 = node17.parentNode();
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Node node4 = comment1.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 100, outputSettings12);
        java.lang.String str14 = comment2.toString();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment17.childNodesCopy();
        boolean boolean22 = comment17.hasAttr("hi!");
        org.jsoup.nodes.Document document23 = comment17.ownerDocument();
        org.jsoup.nodes.Node node25 = comment17.removeAttr("\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        int int10 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        java.lang.String str12 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.nodeName();
        org.jsoup.nodes.Node node14 = comment2.attr("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment2.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str9 = comment2.attr("\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        java.lang.String str11 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        java.lang.String str5 = comment2.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!---->" + "'", str5, "\n<!---->");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = node6.parent();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment10.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = node7.hasSameValue((java.lang.Object) comment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment12.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment12.childNodes();
        boolean boolean17 = comment2.equals((java.lang.Object) comment12);
        java.lang.String str19 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.lang.String str8 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        comment2.setBaseUri("\n<!--hi!-->");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable16, 1, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.filter(nodeFilter14);
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
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        comment2.setBaseUri("");
        boolean boolean14 = comment2.hasParent();
        comment2.setBaseUri("<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment7.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment7.childNodes();
        org.jsoup.nodes.Document document12 = comment7.ownerDocument();
        org.jsoup.nodes.Attributes attributes13 = comment7.attributes();
        java.lang.String str14 = comment7.baseUri();
        org.jsoup.nodes.Node node17 = comment7.attr("\n<!--#comment-->", "\n<!--#comment-->");
        boolean boolean18 = node3.hasSameValue((java.lang.Object) node17);
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node3.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        int int19 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        int int8 = comment2.childNodeSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.lang.String str12 = comment2.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document14 = comment2.ownerDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        org.jsoup.nodes.Node node21 = comment6.root();
        java.lang.String str22 = comment6.toString();
        java.lang.String str23 = comment6.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        boolean boolean17 = comment2.isXmlDeclaration();
        boolean boolean19 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        java.lang.Class<?> wildcardClass13 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.attr("hi!", "#comment");
        org.jsoup.nodes.Document document10 = node9.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node9.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node9.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        boolean boolean4 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment7.outerHtmlHead(appendable18, (int) (byte) 1, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        java.lang.String str5 = comment1.toString();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "<?i?>");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str6 = comment5.getData();
        org.jsoup.nodes.Document document7 = comment5.ownerDocument();
        org.jsoup.nodes.Node node10 = comment5.attr("", "");
        boolean boolean11 = comment5.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes12 = comment5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.before((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        java.lang.String str14 = comment2.baseUri();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment2.outerHtmlTail(appendable15, 100, outputSettings17);
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment2.outerHtmlTail(appendable19, (int) (byte) 100, outputSettings21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        boolean boolean8 = comment2.hasSameValue((java.lang.Object) (short) 100);
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Document document14 = comment12.ownerDocument();
        org.jsoup.nodes.Node node17 = comment12.attr("", "");
        java.lang.String str18 = comment12.getData();
        int int19 = comment12.siblingIndex();
        java.lang.String str21 = comment12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment12.siblingNodes();
        org.jsoup.nodes.Node node25 = comment12.attr("#comment", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!---->" + "'", str9, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.clone();
        boolean boolean14 = node13.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "<?commen?>");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) 'a', outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.jsoup.nodes.Node node16 = node14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node14.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        java.lang.String str9 = comment2.baseUri();
        java.lang.String str10 = comment2.nodeName();
        java.lang.String str11 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!---->" + "'", str11, "\n<!---->");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.clone();
        boolean boolean10 = comment2.hasParent();
        int int11 = comment2.childNodeSize();
        java.lang.String str12 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str15 = comment13.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment13.childNodesCopy();
        boolean boolean17 = comment13.isXmlDeclaration();
        int int18 = comment13.childNodeSize();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment13.outerHtmlTail(appendable19, (int) ' ', outputSettings21);
        java.lang.String str24 = comment13.absUrl("\n<!---->");
        org.jsoup.nodes.Node node25 = comment13.previousSibling();
        java.lang.String str27 = comment13.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node8.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.Node node13 = comment2.previousSibling();
        int int14 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node18 = comment17.clone();
        boolean boolean19 = comment2.hasSameValue((java.lang.Object) comment17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node11 = comment8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        java.lang.String str26 = comment19.attr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Document document27 = comment19.ownerDocument();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment14.previousSibling();
        int int16 = comment14.siblingIndex();
        int int17 = comment14.siblingIndex();
        boolean boolean18 = node12.hasSameValue((java.lang.Object) comment14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        int int15 = comment12.siblingIndex();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node21 = comment18.nextSibling();
        boolean boolean22 = comment12.equals((java.lang.Object) comment18);
        org.jsoup.nodes.Node node23 = comment12.root();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodes();
        org.jsoup.nodes.Node node25 = node23.previousSibling();
        boolean boolean26 = comment2.hasSameValue((java.lang.Object) node23);
        java.lang.String str28 = comment2.attr("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.attr("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node4 = comment2.clone();
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parent();
        java.lang.String str8 = comment2.absUrl("hi!");
        java.lang.String str9 = comment2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node26 = comment2.parent();
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
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.lang.String str9 = comment2.attr("\n<!---->");
        org.jsoup.nodes.Node node10 = comment2.parentNode();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) (short) 10, outputSettings13);
        java.lang.String str15 = comment2.outerHtml();
        boolean boolean16 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        int int13 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        boolean boolean23 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node24 = comment2.parent();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node13 = node12.parent();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment16.childNodes();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment16.outerHtmlTail(appendable18, (int) (short) 1, outputSettings20);
        boolean boolean23 = comment16.hasAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node12.after((org.jsoup.nodes.Node) comment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.String str10 = comment2.toString();
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str12 = comment10.absUrl("hi!");
        java.lang.String str13 = comment10.nodeName();
        org.jsoup.nodes.Node node14 = comment10.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        boolean boolean19 = comment2.isXmlDeclaration();
        java.lang.Class<?> wildcardClass20 = comment2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        java.lang.String str34 = comment2.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n<!--hi!-->" + "'", str34, "\n<!--hi!-->");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.jsoup.nodes.Node node21 = node7.wrap("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node22 = node7.root();
        org.jsoup.nodes.Node node23 = node7.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        boolean boolean25 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = comment28.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment28.siblingNodes();
        boolean boolean33 = comment2.hasSameValue((java.lang.Object) comment28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = comment28.after("\n<!--#comment-->");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        org.jsoup.nodes.Node node21 = comment6.root();
        java.lang.String str22 = comment6.toString();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment6.outerHtmlHead(appendable23, (int) (short) -1, outputSettings25);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node17 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node18 = comment2.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        org.jsoup.nodes.Node node16 = comment8.parentNode();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node22 = comment19.nextSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment19.outerHtmlTail(appendable23, (int) (short) -1, outputSettings25);
        java.lang.String str28 = comment19.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node30 = comment19.wrap("\n<!--hi!-->");
        java.lang.String str32 = comment19.attr("");
        org.jsoup.nodes.Node node33 = comment19.root();
        org.jsoup.nodes.Node node34 = comment19.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node16.before((org.jsoup.nodes.Node) comment19);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = node5.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node5.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.attr("<?commen?>", "\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.unwrap();
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        node7.setBaseUri("hi!");
        org.jsoup.nodes.Node node23 = node7.shallowClone();
        org.jsoup.nodes.Node node24 = node23.parentNode();
        node23.setBaseUri("\n<!--\n<!--#comment-->-->");
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        java.lang.String str17 = comment2.baseUri();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.root();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        boolean boolean13 = comment9.isXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment9.parentNode();
        boolean boolean15 = comment2.equals((java.lang.Object) node14);
        boolean boolean17 = comment2.hasAttr("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        // The following exception was thrown during execution in test generation
        try {
            node15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        java.lang.String str26 = comment10.toString();
        // The following exception was thrown during execution in test generation
        try {
            comment10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!---->" + "'", str26, "\n<!---->");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        boolean boolean25 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = comment28.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment28.siblingNodes();
        boolean boolean33 = comment2.hasSameValue((java.lang.Object) comment28);
        java.lang.Class<?> wildcardClass34 = comment2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        java.lang.String str16 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Attributes attributes17 = comment2.attributes();
        java.lang.String str19 = comment2.attr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, 0, outputSettings13);
        org.jsoup.nodes.Document document15 = comment8.ownerDocument();
        org.jsoup.nodes.Node node16 = comment8.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        java.lang.String str17 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment2.nextSibling();
        org.jsoup.nodes.Node node22 = comment2.attr("\n<!--hi!-->", "\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment2.asXmlDeclaration();
        int int24 = comment2.childNodeSize();
        java.lang.Class<?> wildcardClass25 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        java.lang.String str16 = comment2.attr("#comment");
        java.lang.String str17 = comment2.toString();
        org.jsoup.nodes.Node node18 = comment2.shallowClone();
        org.jsoup.nodes.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node18.before(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("\n<!---->");
        java.lang.String str10 = comment2.absUrl("<?i?>");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node8 = node7.clearAttributes();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        org.jsoup.nodes.Node node17 = comment11.attr("", "hi!");
        java.lang.String str19 = comment11.attr("");
        org.jsoup.nodes.Document document20 = comment11.ownerDocument();
        org.jsoup.nodes.Node node22 = comment11.removeAttr("#comment");
        java.lang.String str23 = comment11.nodeName();
        org.jsoup.nodes.Node node24 = comment11.shallowClone();
        java.lang.String str26 = comment11.attr("");
        org.jsoup.nodes.Attributes attributes27 = comment11.attributes();
        comment11.setBaseUri("");
        java.lang.String str30 = comment11.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment11.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node8.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment12.childNodesCopy();
        boolean boolean16 = comment12.isXmlDeclaration();
        java.lang.String str17 = comment12.getData();
        java.lang.String str18 = comment12.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment12.childNodesCopy();
        java.lang.String str16 = comment12.getData();
        org.jsoup.nodes.Document document17 = comment12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document9.replaceWith((org.jsoup.nodes.Node) document17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = comment2.clearAttributes();
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = comment26.hasParent();
        org.jsoup.nodes.Node node32 = comment26.attr("", "hi!");
        java.lang.String str34 = comment26.attr("");
        org.jsoup.nodes.Document document35 = comment26.ownerDocument();
        java.lang.String str37 = comment26.absUrl("hi!");
        boolean boolean38 = node22.hasSameValue((java.lang.Object) "hi!");
        int int39 = node22.siblingIndex();
        org.jsoup.nodes.Comment comment42 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node43 = comment42.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node22.after((org.jsoup.nodes.Node) comment42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        int int12 = comment9.siblingIndex();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node18 = comment15.nextSibling();
        boolean boolean19 = comment9.equals((java.lang.Object) comment15);
        org.jsoup.nodes.Node node20 = comment9.root();
        org.jsoup.nodes.Node node21 = comment9.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment9.siblingNodes();
        org.jsoup.nodes.Node node23 = comment9.parentNode();
        java.lang.String str25 = comment9.absUrl("\n<!--hi!-->");
        int int26 = comment9.siblingIndex();
        comment9.setBaseUri("\n<!--#comment-->");
        java.lang.String str29 = comment9.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = comment9.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment2.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#comment" + "'", str29, "#comment");
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.shallowClone();
        java.lang.String str11 = comment2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        boolean boolean13 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.siblingNodes();
        org.jsoup.nodes.Node node17 = comment2.attr("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        int int23 = comment20.siblingIndex();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node29 = comment26.nextSibling();
        boolean boolean30 = comment20.equals((java.lang.Object) comment26);
        org.jsoup.nodes.Node node31 = comment20.root();
        boolean boolean32 = comment20.isXmlDeclaration();
        boolean boolean33 = comment20.hasParent();
        boolean boolean34 = comment20.isXmlDeclaration();
        org.jsoup.nodes.Node node35 = comment20.parent();
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str28 = comment26.absUrl("hi!");
        java.lang.String str29 = comment26.nodeName();
        org.jsoup.nodes.Node node31 = comment26.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node23.before(node31);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#comment" + "'", str29, "#comment");
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        boolean boolean4 = comment1.hasAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = comment1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        java.lang.String str15 = comment2.absUrl("\n<!--#comment-->");
        java.lang.Object obj16 = null;
        boolean boolean17 = comment2.equals(obj16);
        java.lang.String str18 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        boolean boolean6 = comment2.hasParent();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str10 = comment9.getData();
        org.jsoup.nodes.Document document11 = comment9.ownerDocument();
        org.jsoup.nodes.Node node14 = comment9.attr("", "");
        java.lang.String str15 = comment9.getData();
        int int16 = comment9.siblingIndex();
        java.lang.String str18 = comment9.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment9.siblingNodes();
        java.lang.String str20 = comment9.baseUri();
        java.lang.String str21 = comment9.getData();
        boolean boolean22 = comment2.equals((java.lang.Object) comment9);
        org.jsoup.nodes.Node node23 = comment2.parent();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment2.outerHtmlTail(appendable24, (int) '4', outputSettings26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodesCopy();
        java.lang.String str16 = comment2.absUrl("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        java.lang.String str16 = comment2.getData();
        org.jsoup.nodes.Node node17 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node17.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = document9.siblingIndex();
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
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.lang.String str12 = comment2.baseUri();
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        org.jsoup.nodes.Document document20 = comment16.ownerDocument();
        boolean boolean22 = comment16.hasAttr("#comment");
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str26 = comment25.getData();
        org.jsoup.nodes.Document document27 = comment25.ownerDocument();
        org.jsoup.nodes.Node node30 = comment25.attr("", "");
        java.lang.String str31 = comment25.getData();
        int int32 = comment25.siblingIndex();
        boolean boolean33 = comment16.equals((java.lang.Object) comment25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node13.after((org.jsoup.nodes.Node) comment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(document27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        org.jsoup.nodes.Node node22 = comment2.parent();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        boolean boolean28 = comment25.hasParent();
        java.lang.String str30 = comment25.absUrl("hi!");
        org.jsoup.nodes.Node node31 = comment25.parentNode();
        comment25.setBaseUri("\n<!--hi!-->");
        comment25.setBaseUri("");
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        comment25.outerHtmlTail(appendable36, (int) (byte) 100, outputSettings38);
        int int40 = comment25.siblingIndex();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        comment25.outerHtmlTail(appendable41, 1, outputSettings43);
        // The following exception was thrown during execution in test generation
        try {
            node22.replaceWith((org.jsoup.nodes.Node) comment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        java.lang.String str26 = comment10.toString();
        org.jsoup.nodes.Node node27 = comment10.root();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!---->" + "'", str26, "\n<!---->");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean13 = comment2.hasSameValue((java.lang.Object) comment12);
        java.lang.String str14 = comment2.nodeName();
        boolean boolean15 = comment2.hasParent();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node18 = comment17.parentNode();
        java.lang.String str19 = comment17.nodeName();
        org.jsoup.nodes.Node node20 = comment17.shallowClone();
        boolean boolean21 = comment2.hasSameValue((java.lang.Object) node20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.wrap("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node8.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = comment2.attr("hi!", "hi!");
        java.lang.String str16 = node15.outerHtml();
        org.jsoup.nodes.Node node17 = node15.parent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        java.lang.String str17 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment2.asXmlDeclaration();
        java.lang.Class<?> wildcardClass19 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        comment2.setBaseUri("hi!");
        java.lang.String str8 = comment2.outerHtml();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean2 = comment1.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = comment1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        node41.setBaseUri("\n<!--\n<!--#comment-->-->");
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
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        boolean boolean10 = comment2.hasSameValue((java.lang.Object) 1.0d);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, 10, outputSettings13);
        org.jsoup.nodes.Node node15 = comment2.nextSibling();
        int int16 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        org.jsoup.nodes.Node node14 = node13.nextSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str3 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = document10.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = node8.wrap("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (byte) 0, outputSettings11);
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.equals((java.lang.Object) '4');
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        org.jsoup.nodes.Node node11 = comment2.attr("\n<!--#comment-->", "<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node23 = comment20.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment20.outerHtmlTail(appendable24, (int) (short) -1, outputSettings26);
        java.lang.String str29 = comment20.attr("\n<!--hi!-->");
        java.lang.String str30 = comment20.outerHtml();
        java.lang.String str31 = comment20.toString();
        java.lang.String str33 = comment20.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment20.childNodesCopy();
        java.lang.String str35 = comment20.nodeName();
        java.lang.String str36 = comment20.getData();
        boolean boolean37 = comment2.hasSameValue((java.lang.Object) str36);
        boolean boolean39 = comment2.hasAttr("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!--hi!-->" + "'", str31, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#comment" + "'", str35, "#comment");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        org.jsoup.nodes.Node node31 = comment15.removeAttr("");
        org.jsoup.nodes.Attributes attributes32 = comment15.attributes();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str9 = comment7.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment7.childNodesCopy();
        java.lang.String str11 = comment7.getData();
        java.lang.String str12 = comment7.baseUri();
        org.jsoup.nodes.Node node13 = comment7.clone();
        boolean boolean14 = comment2.equals((java.lang.Object) comment7);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment7.childNodesCopy();
        boolean boolean16 = comment7.isXmlDeclaration();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.toString();
        java.lang.String str6 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--hi!-->" + "'", str5, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        int int21 = node7.siblingIndex();
        java.lang.Class<?> wildcardClass22 = node7.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        org.jsoup.nodes.Node node8 = comment2.wrap("<?commen?>");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        org.jsoup.nodes.Document document18 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment21.childNodes();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment21.outerHtmlTail(appendable23, (int) (short) 1, outputSettings25);
        org.jsoup.nodes.Node node27 = comment21.parentNode();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        comment21.outerHtmlTail(appendable28, 1, outputSettings30);
        org.jsoup.nodes.Node node32 = comment21.previousSibling();
        int int33 = comment21.siblingIndex();
        java.lang.String str34 = comment21.nodeName();
        org.jsoup.nodes.Node node35 = comment21.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = comment2.after((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        org.jsoup.nodes.Node node8 = comment2.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!---->", "\n<!--\n<!---->-->");
        java.lang.String str11 = comment2.getData();
        org.jsoup.nodes.Node node14 = comment2.attr("\n<!--\n<!--#comment-->-->", "<?i?>");
        org.jsoup.nodes.Node node16 = comment2.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        org.jsoup.nodes.Node node22 = comment2.clearAttributes();
        org.jsoup.nodes.Node node23 = node22.nextSibling();
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = comment26.hasParent();
        java.lang.String str31 = comment26.absUrl("hi!");
        org.jsoup.nodes.Node node33 = comment26.removeAttr("");
        org.jsoup.nodes.Node node34 = comment26.previousSibling();
        int int35 = comment26.siblingIndex();
        org.jsoup.nodes.Node node36 = comment26.shallowClone();
        org.jsoup.nodes.Node node39 = comment26.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = comment26.childNodesCopy();
        org.jsoup.nodes.Attributes attributes41 = comment26.attributes();
        boolean boolean42 = comment26.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            node22.replaceWith((org.jsoup.nodes.Node) comment26);
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) 'a', outputSettings6);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        java.lang.String str16 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        java.lang.String str18 = comment2.attr("\n<!--hi!-->");
        java.lang.Class<?> wildcardClass19 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "<?commen?>");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        boolean boolean4 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str9 = comment7.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment7.childNodesCopy();
        org.jsoup.nodes.Node node13 = comment7.attr("#comment", "");
        org.jsoup.nodes.Node node14 = comment7.nextSibling();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment7.outerHtmlTail(appendable15, 100, outputSettings17);
        boolean boolean19 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Node node21 = comment7.removeAttr("\n<!---->");
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        boolean boolean27 = comment24.hasParent();
        java.lang.String str29 = comment24.absUrl("hi!");
        org.jsoup.nodes.Node node31 = comment24.removeAttr("");
        org.jsoup.nodes.Node node32 = comment24.previousSibling();
        int int33 = comment24.siblingIndex();
        org.jsoup.nodes.Node node34 = comment24.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = comment24.asXmlDeclaration();
        boolean boolean36 = comment7.hasSameValue((java.lang.Object) comment24);
        org.jsoup.nodes.Node node39 = comment7.attr("\n<!--hi!-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = comment1.after((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(xmlDeclaration35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        java.lang.String str17 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment2.nextSibling();
        org.jsoup.nodes.Node node22 = comment2.attr("\n<!--hi!-->", "\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment2.asXmlDeclaration();
        int int24 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str19 = comment17.absUrl("hi!");
        java.lang.String str20 = comment17.nodeName();
        org.jsoup.nodes.Node node21 = comment17.shallowClone();
        boolean boolean22 = node21.hasParent();
        org.jsoup.nodes.Node node23 = node21.root();
        boolean boolean24 = comment2.hasSameValue((java.lang.Object) node23);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment2.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node12 = node11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = node12.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.jsoup.nodes.Node node30 = comment15.clone();
        java.lang.String str31 = comment15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment15.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = comment15.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n<!---->" + "'", str31, "\n<!---->");
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        org.jsoup.nodes.Node node19 = comment13.attr("", "hi!");
        java.lang.String str21 = comment13.attr("");
        org.jsoup.nodes.Document document22 = comment13.ownerDocument();
        org.jsoup.nodes.Node node24 = comment13.removeAttr("#comment");
        java.lang.String str25 = comment13.nodeName();
        org.jsoup.nodes.Node node27 = comment13.removeAttr("hi!");
        java.lang.String str28 = comment13.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment2.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        boolean boolean20 = comment2.hasAttr("#comment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        org.jsoup.nodes.Node node11 = node10.clearAttributes();
        org.jsoup.nodes.Node node13 = node10.wrap("<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        org.jsoup.nodes.Node node11 = comment2.clone();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(xmlDeclaration8);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        java.lang.String str11 = comment2.baseUri();
        java.lang.String str13 = comment2.attr("<?i?>");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        org.jsoup.nodes.Node node19 = comment2.previousSibling();
        org.jsoup.nodes.Attributes attributes20 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.after("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("");
        boolean boolean2 = comment1.hasParent();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean7 = comment5.hasSameValue((java.lang.Object) 1);
        boolean boolean8 = comment5.hasParent();
        org.jsoup.nodes.Node node11 = comment5.attr("", "hi!");
        java.lang.String str13 = comment5.attr("");
        org.jsoup.nodes.Document document14 = comment5.ownerDocument();
        org.jsoup.nodes.Node node16 = comment5.removeAttr("#comment");
        java.lang.String str17 = comment5.nodeName();
        org.jsoup.nodes.Node node18 = comment5.shallowClone();
        java.lang.String str20 = comment5.attr("");
        boolean boolean21 = comment1.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = comment1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        boolean boolean13 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.siblingNodes();
        org.jsoup.nodes.Node node15 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        boolean boolean14 = comment2.hasAttr("");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node20 = comment17.nextSibling();
        int int21 = comment17.childNodeSize();
        boolean boolean22 = comment2.equals((java.lang.Object) int21);
        java.lang.String str23 = comment2.outerHtml();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable24, 100, outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        org.jsoup.nodes.Node node17 = node15.shallowClone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.nodes.Node node5 = node3.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        java.lang.String str31 = comment2.attr("");
        boolean boolean33 = comment2.hasAttr("\n<!--hi!-->");
        boolean boolean34 = comment2.isXmlDeclaration();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--#comment-->");
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.filter(nodeFilter16);
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
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment9.shallowClone();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment13.attr("", "");
        org.jsoup.nodes.Node node19 = comment13.attr("#comment", "#comment");
        boolean boolean20 = comment9.hasSameValue((java.lang.Object) comment13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment13.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration21.childNodesCopy();
        boolean boolean23 = comment2.hasSameValue((java.lang.Object) xmlDeclaration21);
        java.lang.String str24 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!---->" + "'", str24, "\n<!---->");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        org.jsoup.nodes.Node node24 = node20.previousSibling();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        org.jsoup.nodes.Node node18 = node17.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.shallowClone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        boolean boolean23 = comment20.hasParent();
        org.jsoup.nodes.Node node26 = comment20.attr("", "hi!");
        java.lang.String str28 = comment20.attr("");
        org.jsoup.nodes.Document document29 = comment20.ownerDocument();
        org.jsoup.nodes.Node node31 = comment20.removeAttr("#comment");
        java.lang.String str32 = comment20.nodeName();
        org.jsoup.nodes.Node node34 = comment20.removeAttr("hi!");
        boolean boolean36 = comment20.hasAttr("hi!");
        org.jsoup.nodes.Node node38 = comment20.removeAttr("");
        org.jsoup.nodes.Attributes attributes39 = comment20.attributes();
        org.jsoup.nodes.Node node41 = comment20.removeAttr("");
        boolean boolean42 = comment2.equals((java.lang.Object) node41);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#comment" + "'", str32, "#comment");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?commen?>", "<?i?>");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.equals((java.lang.Object) '4');
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str8 = comment2.toString();
        boolean boolean10 = comment2.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node23.siblingNodes();
        org.jsoup.nodes.Node node27 = node23.root();
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
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        java.lang.String str26 = comment19.attr("\n<!--\n<!---->-->");
        boolean boolean28 = comment19.hasAttr("\n<!---->");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.attr("<?i?>", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str14 = comment12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment12.childNodesCopy();
        boolean boolean17 = comment12.hasAttr("");
        org.jsoup.nodes.Node node18 = comment12.parent();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str23 = comment21.absUrl("hi!");
        java.lang.String str24 = comment21.nodeName();
        org.jsoup.nodes.Node node25 = comment21.shallowClone();
        boolean boolean26 = comment12.hasSameValue((java.lang.Object) node25);
        java.lang.String str27 = node25.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment2.before(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!---->" + "'", str27, "\n<!---->");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = node14.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node14.before("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = comment2.clearAttributes();
        org.jsoup.nodes.Node node11 = comment2.shallowClone();
        org.jsoup.nodes.Document document12 = comment2.ownerDocument();
        java.lang.String str13 = comment2.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!---->" + "'", str13, "\n<!---->");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node16 = comment2.removeAttr("");
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str21 = comment19.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment19.childNodesCopy();
        boolean boolean23 = comment19.isXmlDeclaration();
        int int24 = comment19.childNodeSize();
        org.jsoup.nodes.Node node27 = comment19.attr("\n<!---->", "\n<!--\n<!---->-->");
        boolean boolean28 = node16.hasSameValue((java.lang.Object) comment19);
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node34 = comment31.attr("", "");
        org.jsoup.nodes.Node node37 = comment31.attr("#comment", "#comment");
        org.jsoup.nodes.Comment comment40 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean42 = comment40.hasSameValue((java.lang.Object) 1);
        boolean boolean43 = comment40.hasParent();
        java.lang.String str45 = comment40.absUrl("hi!");
        org.jsoup.nodes.Node node46 = comment40.parentNode();
        comment40.setBaseUri("\n<!--hi!-->");
        comment40.setBaseUri("");
        org.jsoup.nodes.Comment comment53 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean55 = comment53.hasSameValue((java.lang.Object) 1);
        boolean boolean56 = comment53.hasParent();
        org.jsoup.nodes.Node node59 = comment53.attr("", "hi!");
        java.lang.String str61 = comment53.attr("");
        org.jsoup.nodes.Document document62 = comment53.ownerDocument();
        org.jsoup.nodes.Node node64 = comment53.removeAttr("#comment");
        java.lang.String str65 = comment53.nodeName();
        org.jsoup.nodes.Node node66 = comment53.shallowClone();
        boolean boolean67 = comment40.hasSameValue((java.lang.Object) comment53);
        boolean boolean68 = comment31.hasSameValue((java.lang.Object) comment53);
        org.jsoup.nodes.Node node71 = comment31.attr("", "\n<!--\n<!--#comment-->-->");
        java.lang.String str72 = comment31.getData();
        boolean boolean73 = node16.equals((java.lang.Object) comment31);
        java.lang.String str74 = comment31.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "#comment" + "'", str65, "#comment");
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "#comment" + "'", str72, "#comment");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "#comment" + "'", str74, "#comment");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("");
        java.lang.String str8 = comment2.attr("\n<!--hi!-->");
        java.lang.Class<?> wildcardClass9 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        org.jsoup.nodes.Node node22 = comment2.nextSibling();
        java.lang.String str24 = comment2.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.after("hi!");
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
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!---->");
        boolean boolean2 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        org.jsoup.nodes.Comment comment33 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean35 = comment33.hasSameValue((java.lang.Object) 1);
        int int36 = comment33.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment33.siblingNodes();
        comment33.setBaseUri("hi!");
        org.jsoup.nodes.Node node40 = comment33.nextSibling();
        java.lang.String str41 = comment33.nodeName();
        boolean boolean42 = comment33.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = comment15.before((org.jsoup.nodes.Node) comment33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#comment" + "'", str41, "#comment");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = node30.childNodesCopy();
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
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        org.jsoup.nodes.Node node19 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Attributes attributes20 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration10.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration10.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodes();
        boolean boolean12 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        java.lang.String str13 = comment2.absUrl("#comment");
        org.jsoup.nodes.Node node14 = comment2.clone();
        org.jsoup.nodes.Node node15 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        org.jsoup.select.NodeFilter nodeFilter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.filter(nodeFilter17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!---->" + "'", str14, "\n<!---->");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str10 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Node node7 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean12 = comment10.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = comment10.hasParent();
        boolean boolean15 = comment10.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean16 = comment10.isXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment10.root();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment20.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment20.childNodes();
        boolean boolean25 = comment10.equals((java.lang.Object) comment20);
        java.lang.String str27 = comment20.attr("hi!");
        org.jsoup.nodes.Attributes attributes28 = comment20.attributes();
        org.jsoup.nodes.Node node30 = comment20.wrap("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node7.before((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        boolean boolean13 = comment2.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodes();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str19 = comment17.absUrl("hi!");
        java.lang.String str20 = comment17.nodeName();
        org.jsoup.nodes.Node node21 = comment17.shallowClone();
        boolean boolean22 = node21.hasParent();
        org.jsoup.nodes.Node node23 = node21.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.before(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        java.lang.String str16 = comment2.attr("#comment");
        java.lang.String str17 = comment2.toString();
        org.jsoup.nodes.Node node18 = comment2.shallowClone();
        org.jsoup.nodes.Node node19 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node28 = comment22.attr("", "hi!");
        java.lang.String str30 = comment22.attr("");
        org.jsoup.nodes.Document document31 = comment22.ownerDocument();
        org.jsoup.nodes.Node node33 = comment22.removeAttr("#comment");
        java.lang.String str34 = comment22.nodeName();
        org.jsoup.nodes.Node node35 = comment22.shallowClone();
        java.lang.String str37 = comment22.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = comment22.siblingNodes();
        java.lang.String str39 = comment22.outerHtml();
        org.jsoup.nodes.Node node40 = comment22.clone();
        java.lang.String str42 = comment22.attr("#comment");
        boolean boolean43 = comment22.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node19.before((org.jsoup.nodes.Node) comment22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n<!---->" + "'", str39, "\n<!---->");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        boolean boolean18 = node17.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, 1, outputSettings11);
        java.lang.String str14 = comment2.attr("#comment");
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str19 = comment18.getData();
        org.jsoup.nodes.Document document20 = comment18.ownerDocument();
        org.jsoup.nodes.Node node23 = comment18.attr("", "");
        java.lang.String str24 = comment18.getData();
        int int25 = comment18.siblingIndex();
        java.lang.String str27 = comment18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment18.siblingNodes();
        java.lang.String str29 = comment18.getData();
        org.jsoup.nodes.Node node30 = comment18.root();
        org.jsoup.nodes.Attributes attributes31 = comment18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = comment2.before((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        org.jsoup.nodes.Document document6 = comment1.ownerDocument();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node19 = comment18.root();
        java.lang.String str20 = comment18.getData();
        org.jsoup.nodes.Node node21 = comment18.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment18.siblingNodes();
        boolean boolean23 = comment2.hasSameValue((java.lang.Object) comment18);
        java.lang.String str24 = comment18.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!--hi!-->" + "'", str24, "\n<!--hi!-->");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        org.jsoup.nodes.Node node5 = comment2.wrap("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.parent();
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment17.childNodes();
        java.lang.String str19 = comment17.outerHtml();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment22.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment22.childNodes();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment22.outerHtmlTail(appendable27, 100, outputSettings29);
        boolean boolean31 = comment17.equals((java.lang.Object) comment22);
        org.jsoup.nodes.Node node32 = comment22.root();
        boolean boolean33 = comment2.equals((java.lang.Object) node32);
        org.jsoup.nodes.Node node34 = node32.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node7.childNodes();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        int int26 = comment23.siblingIndex();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean31 = comment29.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node32 = comment29.nextSibling();
        boolean boolean33 = comment23.equals((java.lang.Object) comment29);
        org.jsoup.nodes.Node node35 = comment29.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node36 = comment29.nextSibling();
        java.lang.String str37 = comment29.nodeName();
        java.lang.String str38 = comment29.nodeName();
        java.lang.String str39 = comment29.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = node7.after((org.jsoup.nodes.Node) comment29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#comment" + "'", str37, "#comment");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#comment" + "'", str38, "#comment");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.unwrap();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        int int10 = comment2.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.siblingNodes();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        org.jsoup.nodes.Node node19 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        java.lang.String str27 = comment22.absUrl("hi!");
        org.jsoup.nodes.Node node29 = comment22.removeAttr("");
        org.jsoup.nodes.Node node30 = comment22.root();
        boolean boolean31 = node19.equals((java.lang.Object) node30);
        // The following exception was thrown during execution in test generation
        try {
            node30.remove();
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        boolean boolean5 = comment2.isXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.parent();
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment17.childNodes();
        java.lang.String str19 = comment17.outerHtml();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node25 = comment22.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment22.childNodes();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment22.outerHtmlTail(appendable27, 100, outputSettings29);
        boolean boolean31 = comment17.equals((java.lang.Object) comment22);
        org.jsoup.nodes.Node node32 = comment22.root();
        boolean boolean33 = comment2.equals((java.lang.Object) node32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node32.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--hi!-->" + "'", str19, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node6 = xmlDeclaration4.wrap("<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        org.jsoup.nodes.Node node21 = node20.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        boolean boolean11 = comment2.hasAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        java.lang.String str19 = comment14.absUrl("hi!");
        org.jsoup.nodes.Node node21 = comment14.removeAttr("");
        org.jsoup.nodes.Node node22 = comment14.previousSibling();
        int int23 = comment14.siblingIndex();
        org.jsoup.nodes.Node node24 = comment14.shallowClone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment14.asXmlDeclaration();
        org.jsoup.nodes.Node node27 = comment14.removeAttr("\n<!--#comment-->");
        org.jsoup.nodes.Document document28 = comment14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(xmlDeclaration25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.String str13 = comment2.nodeName();
        java.lang.String str14 = comment2.baseUri();
        org.jsoup.nodes.Node node15 = comment2.root();
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.filter(nodeFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        boolean boolean20 = comment2.hasParent();
        java.lang.String str21 = comment2.getData();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment24.childNodesCopy();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node31 = comment28.nextSibling();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment28.outerHtmlTail(appendable32, (int) (short) -1, outputSettings34);
        java.lang.String str36 = comment28.nodeName();
        org.jsoup.nodes.Comment comment38 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean39 = comment28.hasSameValue((java.lang.Object) comment38);
        java.lang.String str40 = comment28.nodeName();
        boolean boolean41 = comment24.hasSameValue((java.lang.Object) comment28);
        boolean boolean42 = comment24.hasParent();
        org.jsoup.nodes.Comment comment45 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node46 = comment45.root();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = comment45.childNodesCopy();
        java.lang.String str48 = comment45.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration49 = comment45.asXmlDeclaration();
        boolean boolean50 = comment24.equals((java.lang.Object) comment45);
        org.jsoup.nodes.Node node52 = comment24.removeAttr("#comment");
        boolean boolean53 = comment2.equals((java.lang.Object) node52);
        node52.setBaseUri("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#comment" + "'", str36, "#comment");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#comment" + "'", str40, "#comment");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n<!--hi!-->" + "'", str48, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        int int8 = comment2.siblingIndex();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document9.before("<?commen?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes17 = comment16.attributes();
        org.jsoup.nodes.Node node20 = comment16.attr("\n<!--hi!-->", "\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment8.asXmlDeclaration();
        org.jsoup.nodes.Node node14 = comment8.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        org.jsoup.nodes.Node node11 = comment2.nextSibling();
        org.jsoup.select.NodeFilter nodeFilter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.filter(nodeFilter12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node8 = node7.parent();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node7.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.attr("#comment", "\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str3 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = comment11.hasParent();
        java.lang.String str16 = comment11.absUrl("hi!");
        org.jsoup.nodes.Node node17 = comment11.parentNode();
        comment11.setBaseUri("\n<!--hi!-->");
        comment11.setBaseUri("");
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        boolean boolean27 = comment24.hasParent();
        org.jsoup.nodes.Node node30 = comment24.attr("", "hi!");
        java.lang.String str32 = comment24.attr("");
        org.jsoup.nodes.Document document33 = comment24.ownerDocument();
        org.jsoup.nodes.Node node35 = comment24.removeAttr("#comment");
        java.lang.String str36 = comment24.nodeName();
        org.jsoup.nodes.Node node37 = comment24.shallowClone();
        boolean boolean38 = comment11.hasSameValue((java.lang.Object) comment24);
        boolean boolean39 = comment2.hasSameValue((java.lang.Object) comment24);
        org.jsoup.nodes.Node node41 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node42 = node41.previousSibling();
        org.jsoup.nodes.Comment comment45 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str47 = comment45.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = comment45.childNodesCopy();
        org.jsoup.nodes.Attributes attributes49 = comment45.attributes();
        org.jsoup.nodes.Node node50 = comment45.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = node42.after((org.jsoup.nodes.Node) comment45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#comment" + "'", str36, "#comment");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        boolean boolean7 = comment1.isXmlDeclaration();
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.nodes.Attributes attributes9 = comment1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            comment1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str6 = comment2.attr("hi!");
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.toString();
        org.jsoup.nodes.Node node15 = comment2.wrap("\n<!--#comment-->");
        org.jsoup.nodes.Node node16 = comment2.root();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node20 = comment19.root();
        org.jsoup.nodes.Node node21 = comment19.clearAttributes();
        org.jsoup.nodes.Node node22 = node21.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.before(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.nextSibling();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, (-1), outputSettings9);
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        org.jsoup.nodes.Node node19 = comment13.attr("", "hi!");
        java.lang.String str21 = comment13.absUrl("#comment");
        boolean boolean22 = comment2.equals((java.lang.Object) "#comment");
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasAttr("hi!");
        org.jsoup.nodes.Node node28 = comment25.parentNode();
        int int29 = comment25.siblingIndex();
        org.jsoup.nodes.Node node31 = comment25.removeAttr("#comment");
        org.jsoup.nodes.Document document32 = comment25.ownerDocument();
        org.jsoup.nodes.Attributes attributes33 = comment25.attributes();
        boolean boolean34 = comment2.equals((java.lang.Object) comment25);
        org.jsoup.nodes.Node node35 = comment25.clearAttributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        int int17 = comment2.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        int int15 = comment2.siblingIndex();
        int int16 = comment2.childNodeSize();
        org.jsoup.nodes.Node node17 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node12 = node11.shallowClone();
        org.jsoup.nodes.Document document13 = node11.ownerDocument();
        org.jsoup.nodes.Node node14 = node11.nextSibling();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        int int20 = comment17.siblingIndex();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node26 = comment23.nextSibling();
        boolean boolean27 = comment17.equals((java.lang.Object) comment23);
        java.lang.String str28 = comment17.nodeName();
        java.lang.String str29 = comment17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node14.before((org.jsoup.nodes.Node) comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?commen?>", "#comment");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        boolean boolean7 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!--\n<!---->-->", "");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment2.parent();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable14, (-1), outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, (-1), outputSettings9);
        java.lang.String str11 = comment2.toString();
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable8, (int) (short) 1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        int int8 = comment2.siblingIndex();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        boolean boolean11 = comment2.hasAttr("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.lang.String str11 = comment2.toString();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration5.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        org.jsoup.nodes.Node node24 = comment2.parent();
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
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        int int3 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str13 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        boolean boolean11 = comment2.hasParent();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        java.lang.String str19 = comment14.absUrl("hi!");
        org.jsoup.nodes.Node node20 = comment14.parentNode();
        comment14.setBaseUri("\n<!--hi!-->");
        comment14.setBaseUri("");
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasSameValue((java.lang.Object) 1);
        boolean boolean30 = comment27.hasParent();
        org.jsoup.nodes.Node node33 = comment27.attr("", "hi!");
        java.lang.String str35 = comment27.attr("");
        org.jsoup.nodes.Document document36 = comment27.ownerDocument();
        org.jsoup.nodes.Node node38 = comment27.removeAttr("#comment");
        java.lang.String str39 = comment27.nodeName();
        org.jsoup.nodes.Node node40 = comment27.shallowClone();
        boolean boolean41 = comment14.hasSameValue((java.lang.Object) comment27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = comment2.before((org.jsoup.nodes.Node) comment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#comment" + "'", str39, "#comment");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.lang.String str17 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment2.nextSibling();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str24 = comment22.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment22.childNodesCopy();
        boolean boolean27 = comment22.hasAttr("");
        org.jsoup.nodes.Node node28 = comment22.parent();
        org.jsoup.nodes.Comment comment31 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str33 = comment31.absUrl("hi!");
        java.lang.String str34 = comment31.nodeName();
        org.jsoup.nodes.Node node35 = comment31.shallowClone();
        boolean boolean36 = comment22.hasSameValue((java.lang.Object) node35);
        java.lang.String str38 = comment22.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = comment22.siblingNodes();
        org.jsoup.nodes.Comment comment42 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean44 = comment42.hasSameValue((java.lang.Object) 1);
        boolean boolean45 = comment42.hasParent();
        org.jsoup.nodes.Node node48 = comment42.attr("", "hi!");
        org.jsoup.nodes.Document document49 = comment42.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration50 = comment42.asXmlDeclaration();
        boolean boolean51 = comment22.hasSameValue((java.lang.Object) xmlDeclaration50);
        org.jsoup.nodes.Node node52 = xmlDeclaration50.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceWith((org.jsoup.nodes.Node) xmlDeclaration50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertNotNull(xmlDeclaration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        int int8 = comment2.siblingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node10 = node9.root();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        boolean boolean18 = comment13.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean19 = comment13.isXmlDeclaration();
        boolean boolean20 = comment13.hasParent();
        org.jsoup.nodes.Node node22 = comment13.removeAttr("\n<!---->");
        boolean boolean23 = comment13.hasParent();
        int int24 = comment13.childNodeSize();
        org.jsoup.nodes.Node node25 = comment13.root();
        int int26 = comment13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = node10.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        java.lang.Object obj9 = null;
        boolean boolean10 = node8.equals(obj9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        int int15 = comment12.siblingIndex();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node21 = comment18.nextSibling();
        boolean boolean22 = comment12.equals((java.lang.Object) comment18);
        org.jsoup.nodes.Node node23 = comment12.root();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = node23.childNodes();
        org.jsoup.nodes.Node node25 = node23.previousSibling();
        boolean boolean26 = comment2.hasSameValue((java.lang.Object) node23);
        int int27 = comment2.childNodeSize();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable28, 100, outputSettings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.filter(nodeFilter15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str3 = comment2.outerHtml();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--hi!-->" + "'", str3, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("hi!");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        org.jsoup.nodes.Node node13 = comment12.clearAttributes();
        boolean boolean14 = node9.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node15 = node9.clearAttributes();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = comment18.childNodes();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment18.outerHtmlTail(appendable20, (int) (short) 1, outputSettings22);
        org.jsoup.nodes.Node node24 = comment18.previousSibling();
        java.lang.String str25 = comment18.baseUri();
        org.jsoup.nodes.Node node26 = comment18.clone();
        org.jsoup.nodes.Node node27 = comment18.parentNode();
        org.jsoup.nodes.Attributes attributes28 = comment18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(attributes28);
    }
}

