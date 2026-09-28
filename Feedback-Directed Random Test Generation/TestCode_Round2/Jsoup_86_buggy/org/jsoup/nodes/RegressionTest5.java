package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        boolean boolean14 = comment2.hasAttr("#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment2.asXmlDeclaration();
        comment2.setBaseUri("<?commen?>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.childNodesCopy();
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.traverse(nodeVisitor19);
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
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node3.before("<?commen?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.Node node14 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = node14.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        java.lang.String str32 = comment2.attr("\n<!--#comment-->");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.parent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        java.lang.String str8 = comment2.nodeName();
        org.jsoup.nodes.Node node9 = comment2.parent();
        comment2.setBaseUri("\n<!--#comment-->");
        java.lang.String str12 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        int int21 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment2.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        // The following exception was thrown during execution in test generation
        try {
            comment16.remove();
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
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.Node node14 = comment2.nextSibling();
        int int15 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!---->");
        java.lang.String str22 = comment21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) 'a', outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        org.jsoup.nodes.Node node29 = comment2.attr("\n<!--\n<!--#comment-->-->", "\n<!--hi!-->");
        java.lang.String str31 = comment2.attr("\n<!---->");
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node7 = comment2.attr("#comment", "");
        java.lang.String str9 = comment2.attr("#comment");
        java.lang.String str10 = comment2.getData();
        java.lang.String str11 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!---->");
        java.lang.String str3 = comment2.nodeName();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable4, (int) (short) 10, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        org.jsoup.nodes.Node node16 = comment8.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node10 = node9.clearAttributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.shallowClone();
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment2.childNodesCopy();
        boolean boolean39 = comment2.hasAttr("<?i?>");
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
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node6 = comment2.root();
        int int7 = node6.siblingIndex();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        java.lang.String str16 = comment2.attr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        java.lang.String str9 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        org.jsoup.nodes.Node node12 = comment2.wrap("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        org.jsoup.nodes.Node node6 = comment1.attr("\n<!--hi!-->", "\n<!---->");
        org.jsoup.nodes.Node node7 = node6.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node7.unwrap();
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (byte) 0, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.before("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        java.lang.String str21 = comment12.attr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.lang.String str37 = comment15.getData();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        org.jsoup.nodes.Node node23 = comment2.parent();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable24, (int) 'a', outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
            org.jsoup.nodes.Node node16 = node14.after("\n<!--\n<!--#comment-->-->");
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Document document16 = node15.ownerDocument();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        boolean boolean22 = comment19.hasParent();
        org.jsoup.nodes.Node node25 = comment19.attr("", "hi!");
        org.jsoup.nodes.Node node26 = node25.previousSibling();
        org.jsoup.nodes.Node node27 = node25.parentNode();
        org.jsoup.nodes.Node node29 = node25.wrap("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = document16.after(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, (int) '4', outputSettings13);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.clone();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str19 = comment18.getData();
        org.jsoup.nodes.Document document20 = comment18.ownerDocument();
        org.jsoup.nodes.Node node23 = comment18.attr("", "");
        java.lang.String str24 = comment18.getData();
        int int25 = comment18.siblingIndex();
        java.lang.String str27 = comment18.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment18.siblingNodes();
        org.jsoup.nodes.Node node30 = comment18.removeAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        boolean boolean32 = node15.equals((java.lang.Object) node30);
        org.jsoup.nodes.Comment comment35 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment35.childNodesCopy();
        org.jsoup.nodes.Comment comment39 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean41 = comment39.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node42 = comment39.nextSibling();
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        comment39.outerHtmlTail(appendable43, (int) (short) -1, outputSettings45);
        java.lang.String str47 = comment39.nodeName();
        org.jsoup.nodes.Comment comment49 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean50 = comment39.hasSameValue((java.lang.Object) comment49);
        java.lang.String str51 = comment39.nodeName();
        boolean boolean52 = comment35.hasSameValue((java.lang.Object) comment39);
        java.lang.String str53 = comment39.baseUri();
        org.jsoup.nodes.Node node54 = comment39.root();
        org.jsoup.nodes.Node node55 = node54.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#comment" + "'", str47, "#comment");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#comment" + "'", str51, "#comment");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        java.lang.String str6 = comment2.nodeName();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        boolean boolean14 = comment9.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean15 = comment9.isXmlDeclaration();
        boolean boolean16 = comment9.hasParent();
        org.jsoup.nodes.Node node18 = comment9.removeAttr("\n<!---->");
        boolean boolean19 = comment2.equals((java.lang.Object) node18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment2.childNodes();
        boolean boolean21 = comment2.isXmlDeclaration();
        java.lang.String str22 = comment2.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node24 = comment2.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        java.lang.String str15 = comment2.attr("");
        org.jsoup.nodes.Node node16 = comment2.root();
        org.jsoup.nodes.Node node17 = comment2.nextSibling();
        org.jsoup.nodes.Node node18 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment19.outerHtmlHead(appendable38, (int) ' ', outputSettings40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.String str6 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.siblingNodes();
        org.jsoup.nodes.Node node8 = comment2.clone();
        java.lang.String str10 = comment2.absUrl("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node13 = comment2.attr("", "");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        org.jsoup.nodes.Node node15 = comment2.clone();
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment7.outerHtmlTail(appendable15, (int) '#', outputSettings17);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.lang.String str10 = comment2.toString();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Node node7 = comment2.removeAttr("hi!");
        java.lang.String str8 = comment2.baseUri();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment11.childNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment11.outerHtmlTail(appendable13, (int) (short) 1, outputSettings15);
        org.jsoup.nodes.Node node17 = comment11.previousSibling();
        java.lang.String str18 = comment11.baseUri();
        org.jsoup.nodes.Node node19 = comment11.clone();
        org.jsoup.nodes.Node node20 = comment11.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.after((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.root();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.lang.String str5 = comment2.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment2.after("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        org.jsoup.nodes.Node node18 = comment12.attr("", "hi!");
        org.jsoup.nodes.Document document19 = comment12.ownerDocument();
        org.jsoup.nodes.Document document20 = comment12.ownerDocument();
        boolean boolean21 = comment12.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment12.childNodes();
        boolean boolean23 = node9.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node26 = comment12.attr("", "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        org.jsoup.nodes.Document document37 = node15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = document37.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(document37);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.String str18 = comment2.absUrl("#comment");
        boolean boolean19 = comment2.isXmlDeclaration();
        java.lang.String str20 = comment2.baseUri();
        java.lang.Class<?> wildcardClass21 = comment2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        org.jsoup.nodes.Node node19 = comment2.shallowClone();
        java.lang.String str20 = comment2.nodeName();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        java.lang.String str28 = comment23.absUrl("hi!");
        java.lang.String str29 = comment23.toString();
        org.jsoup.nodes.Node node30 = comment23.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = comment23.asXmlDeclaration();
        org.jsoup.nodes.Node node32 = xmlDeclaration31.clearAttributes();
        boolean boolean33 = comment2.hasSameValue((java.lang.Object) node32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--hi!-->" + "'", str29, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(xmlDeclaration31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.lang.Class<?> wildcardClass15 = node14.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        boolean boolean13 = comment2.equals((java.lang.Object) "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = comment2.childNodes();
        org.jsoup.nodes.Node node15 = comment2.clone();
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        java.lang.String str13 = comment2.getData();
        boolean boolean15 = comment2.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        java.lang.Class<?> wildcardClass24 = node23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        boolean boolean11 = comment2.hasAttr("\n<!---->");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.traverse(nodeVisitor12);
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
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.lang.String str9 = comment2.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node10 = comment2.attr("\n<!---->", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        int int12 = comment2.siblingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str28 = comment27.getData();
        org.jsoup.nodes.Node node29 = comment27.nextSibling();
        boolean boolean30 = comment27.isXmlDeclaration();
        boolean boolean31 = comment27.isXmlDeclaration();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment27.outerHtmlTail(appendable32, (int) (short) 10, outputSettings34);
        boolean boolean36 = comment27.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment27);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str9 = comment2.outerHtml();
        java.lang.String str10 = comment2.getData();
        comment2.setBaseUri("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node13 = comment2.root();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--hi!-->", "#comment");
        int int17 = node16.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node7 = xmlDeclaration6.nextSibling();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration6.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("", "\n<!--hi!-->");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        int int15 = comment12.siblingIndex();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node21 = comment18.nextSibling();
        boolean boolean22 = comment12.equals((java.lang.Object) comment18);
        org.jsoup.nodes.Node node23 = comment12.root();
        boolean boolean24 = comment12.isXmlDeclaration();
        boolean boolean25 = comment12.hasParent();
        java.lang.String str27 = comment12.absUrl("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = comment12.asXmlDeclaration();
        org.jsoup.nodes.Node node29 = comment12.nextSibling();
        org.jsoup.nodes.Node node32 = comment12.attr("\n<!--hi!-->", "\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = comment12.asXmlDeclaration();
        boolean boolean34 = comment2.equals((java.lang.Object) comment12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(xmlDeclaration28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(xmlDeclaration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        boolean boolean7 = comment1.isXmlDeclaration();
        boolean boolean8 = comment1.isXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.String str7 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (-1), outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        org.jsoup.nodes.Node node16 = comment8.previousSibling();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str20 = comment19.getData();
        org.jsoup.nodes.Document document21 = comment19.ownerDocument();
        org.jsoup.nodes.Node node24 = comment19.attr("", "");
        java.lang.String str25 = comment19.getData();
        int int26 = comment19.siblingIndex();
        boolean boolean28 = comment19.hasAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment19.siblingNodes();
        boolean boolean30 = comment8.hasSameValue((java.lang.Object) comment19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment19.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!--\n<!---->-->");
        boolean boolean4 = comment2.hasAttr("<?i?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        org.jsoup.nodes.Node node38 = comment16.wrap("<?i?>");
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
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        boolean boolean14 = comment2.hasAttr("#comment");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        boolean boolean9 = comment2.isXmlDeclaration();
        comment2.setBaseUri("<?commen?>");
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.lang.String str10 = comment2.attr("#comment");
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment2.outerHtmlTail(appendable12, 0, outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        boolean boolean16 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Node node18 = comment2.wrap("<?commen?>");
        java.lang.String str19 = comment2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Node node6 = node5.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.root();
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
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        int int9 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.Node node10 = comment2.shallowClone();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node11 = comment2.attr("hi!", "\n<!---->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasAttr("hi!");
        org.jsoup.nodes.Node node17 = comment14.parentNode();
        int int18 = comment14.siblingIndex();
        org.jsoup.nodes.Node node20 = comment14.removeAttr("#comment");
        org.jsoup.nodes.Node node21 = comment14.root();
        org.jsoup.nodes.Node node23 = comment14.wrap("\n<!--hi!-->");
        boolean boolean25 = comment14.hasAttr("\n<!---->");
        java.lang.String str27 = comment14.attr("hi!");
        org.jsoup.nodes.Document document28 = comment14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = node11.before((org.jsoup.nodes.Node) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(document28);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.removeAttr("hi!");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, (int) (byte) 10, outputSettings12);
        int int14 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        int int6 = comment1.childNodeSize();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("#comment", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment1.before((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        boolean boolean14 = comment5.hasAttr("<?i?>");
        org.jsoup.nodes.Attributes attributes15 = comment5.attributes();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        org.jsoup.nodes.Node node11 = node8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node8.before("#comment");
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
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        java.lang.String str5 = comment2.baseUri();
        java.lang.String str6 = comment2.baseUri();
        org.jsoup.nodes.Node node7 = comment2.previousSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        comment2.setBaseUri("#comment");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        boolean boolean6 = comment2.isXmlDeclaration();
        boolean boolean8 = comment2.hasAttr("\n<!--#comment-->");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.siblingNodes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        boolean boolean15 = comment12.hasParent();
        java.lang.String str17 = comment12.absUrl("hi!");
        org.jsoup.nodes.Node node19 = comment12.removeAttr("");
        org.jsoup.nodes.Node node20 = comment12.previousSibling();
        int int21 = comment12.siblingIndex();
        org.jsoup.nodes.Node node22 = comment12.shallowClone();
        org.jsoup.nodes.Node node25 = comment12.attr("hi!", "hi!");
        org.jsoup.nodes.Node node26 = comment12.clearAttributes();
        org.jsoup.nodes.Node node27 = comment12.parentNode();
        org.jsoup.nodes.Attributes attributes28 = comment12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = comment2.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        boolean boolean15 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.jsoup.nodes.Node node26 = comment2.previousSibling();
        org.jsoup.nodes.Node node28 = comment2.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
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
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node28 = comment22.attr("", "hi!");
        org.jsoup.nodes.Document document29 = comment22.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = comment22.asXmlDeclaration();
        boolean boolean31 = comment2.hasSameValue((java.lang.Object) xmlDeclaration30);
        java.lang.String str32 = comment2.baseUri();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable25, (int) '4', outputSettings27);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node28 = comment22.attr("", "hi!");
        org.jsoup.nodes.Document document29 = comment22.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = comment22.asXmlDeclaration();
        boolean boolean31 = comment2.hasSameValue((java.lang.Object) xmlDeclaration30);
        org.jsoup.nodes.Node node32 = xmlDeclaration30.clone();
        java.lang.String str33 = xmlDeclaration30.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration30.before("");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<?i?>" + "'", str33, "<?i?>");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--#comment-->", "\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node10 = node9.root();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        boolean boolean14 = comment2.hasAttr("#comment");
        int int15 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.getData();
        java.lang.String str8 = comment2.baseUri();
        java.lang.String str9 = comment2.outerHtml();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("");
        org.jsoup.nodes.Node node12 = node11.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!---->" + "'", str9, "\n<!---->");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        org.jsoup.nodes.Node node22 = comment16.clearAttributes();
        org.jsoup.nodes.Node node23 = node22.parentNode();
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        org.jsoup.nodes.Node node3 = comment1.clone();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment6.outerHtmlTail(appendable7, (int) '#', outputSettings9);
        org.jsoup.nodes.Node node11 = comment6.shallowClone();
        boolean boolean12 = node3.equals((java.lang.Object) comment6);
        org.jsoup.nodes.Node node13 = node3.parentNode();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--hi!-->", "hi!");
        java.lang.String str17 = comment2.attr("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->", "\n<!--\n<!--#comment-->-->");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "#comment");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str7 = comment5.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment5.childNodesCopy();
        boolean boolean9 = comment5.isXmlDeclaration();
        int int10 = comment5.childNodeSize();
        org.jsoup.nodes.Node node13 = comment5.attr("\n<!---->", "\n<!--\n<!---->-->");
        node13.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.before(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.jsoup.nodes.Node node19 = comment2.removeAttr("");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Node node28 = comment22.attr("", "hi!");
        java.lang.String str30 = comment22.attr("");
        org.jsoup.nodes.Document document31 = comment22.ownerDocument();
        org.jsoup.nodes.Node node33 = comment22.removeAttr("#comment");
        java.lang.String str34 = comment22.nodeName();
        org.jsoup.nodes.Node node36 = comment22.removeAttr("");
        boolean boolean38 = comment22.hasAttr("hi!");
        org.jsoup.nodes.Node node41 = comment22.attr("\n<!--hi!-->", "");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = node41.siblingNodes();
        boolean boolean43 = comment2.equals((java.lang.Object) node41);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#comment" + "'", str34, "#comment");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        comment2.outerHtmlTail(appendable14, (int) (short) 1, outputSettings16);
        org.jsoup.nodes.Node node18 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        int int24 = comment19.siblingIndex();
        org.jsoup.nodes.Node node25 = comment19.nextSibling();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Comment comment13 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean15 = comment13.hasSameValue((java.lang.Object) 1);
        boolean boolean16 = comment13.hasParent();
        org.jsoup.nodes.Node node19 = comment13.attr("", "hi!");
        java.lang.String str21 = comment13.attr("");
        int int22 = comment13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node10.after((org.jsoup.nodes.Node) comment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clearAttributes();
        org.jsoup.nodes.Document document4 = node3.ownerDocument();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(document4);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.String str6 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.siblingNodes();
        java.lang.String str8 = comment2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#comment" + "'", str8, "#comment");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?commen?>", "");
        int int3 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.String str10 = comment2.attr("#comment");
        org.jsoup.nodes.Node node11 = comment2.previousSibling();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment2.outerHtmlTail(appendable12, (int) ' ', outputSettings14);
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        int int21 = comment18.siblingIndex();
        org.jsoup.nodes.Comment comment24 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean26 = comment24.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node27 = comment24.nextSibling();
        boolean boolean28 = comment18.equals((java.lang.Object) comment24);
        org.jsoup.nodes.Node node29 = comment18.root();
        boolean boolean30 = comment18.isXmlDeclaration();
        org.jsoup.nodes.Comment comment33 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean35 = comment33.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node36 = comment33.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment33.siblingNodes();
        java.lang.Class<?> wildcardClass38 = comment33.getClass();
        boolean boolean39 = comment18.hasSameValue((java.lang.Object) wildcardClass38);
        java.util.List<org.jsoup.nodes.Node> nodeList40 = comment18.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = comment2.before((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        org.jsoup.nodes.Node node22 = node21.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node22.unwrap();
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("\n<!--hi!-->");
        boolean boolean5 = node4.hasParent();
        org.jsoup.nodes.Node node6 = node4.clone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        org.jsoup.nodes.Node node15 = comment9.attr("", "hi!");
        java.lang.String str17 = comment9.attr("");
        org.jsoup.nodes.Document document18 = comment9.ownerDocument();
        org.jsoup.nodes.Node node19 = comment9.parentNode();
        boolean boolean21 = comment9.hasAttr("#comment");
        comment9.setBaseUri("#comment");
        boolean boolean24 = node4.hasSameValue((java.lang.Object) "#comment");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!--#comment-->-->");
        java.lang.String str3 = comment2.baseUri();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.String str6 = comment2.toString();
        int int7 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        org.jsoup.nodes.Node node36 = comment24.attr("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment24.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = comment24.after("");
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, (-1), outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node15 = comment12.nextSibling();
        int int16 = comment12.childNodeSize();
        org.jsoup.nodes.Node node17 = comment12.parent();
        java.lang.String str18 = comment12.getData();
        org.jsoup.nodes.Node node19 = comment12.parentNode();
        java.lang.String str21 = comment12.attr("hi!");
        boolean boolean22 = comment12.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after((org.jsoup.nodes.Node) comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        boolean boolean14 = comment11.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node23 = comment21.removeAttr("\n<!--hi!-->");
        boolean boolean24 = node18.hasSameValue((java.lang.Object) node23);
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes30 = comment27.attributes();
        org.jsoup.nodes.Node node31 = comment27.parent();
        java.lang.String str32 = comment27.getData();
        int int33 = comment27.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = node18.before((org.jsoup.nodes.Node) comment27);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
            java.lang.String str16 = comment2.absUrl("");
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--hi!-->");
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        org.jsoup.nodes.Node node29 = comment20.attr("\n<!--hi!-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment20.before("\n<!--#comment-->");
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
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node14 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = node14.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            node13.remove();
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
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 100, outputSettings9);
        boolean boolean12 = comment2.hasAttr("");
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clone();
        int int4 = comment2.siblingIndex();
        java.lang.String str6 = comment2.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        int int3 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        org.jsoup.nodes.Node node44 = comment1.removeAttr("hi!");
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
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        boolean boolean9 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "\n<!--\n<!---->-->");
        java.lang.Class<?> wildcardClass13 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = comment2.previousSibling();
        int int15 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (short) 1, outputSettings7);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.clone();
        org.jsoup.nodes.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.before(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node13 = node11.clone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment16.childNodesCopy();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node23 = comment20.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment20.outerHtmlTail(appendable24, (int) (short) -1, outputSettings26);
        java.lang.String str28 = comment20.nodeName();
        org.jsoup.nodes.Comment comment30 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean31 = comment20.hasSameValue((java.lang.Object) comment30);
        java.lang.String str32 = comment20.nodeName();
        boolean boolean33 = comment16.hasSameValue((java.lang.Object) comment20);
        java.lang.String str34 = comment20.baseUri();
        org.jsoup.nodes.Node node35 = comment20.root();
        org.jsoup.nodes.Node node36 = node35.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = node13.after(node36);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#comment" + "'", str32, "#comment");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.attr("\n<!--hi!-->");
        boolean boolean6 = comment2.hasAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.jsoup.nodes.Node node24 = comment2.shallowClone();
        org.jsoup.nodes.Node node25 = node24.root();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = node24.siblingNodes();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        org.jsoup.nodes.Node node11 = comment2.nextSibling();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        int int21 = comment2.siblingIndex();
        org.jsoup.nodes.Node node23 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.siblingNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        java.lang.String str28 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        java.lang.String str6 = comment2.baseUri();
        boolean boolean8 = comment2.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.nodes.Document document5 = node3.ownerDocument();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        java.lang.String str27 = node23.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node23.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = node23.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!--hi!-->" + "'", str27, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        org.jsoup.nodes.Node node18 = comment12.previousSibling();
        org.jsoup.select.NodeFilter nodeFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment12.filter(nodeFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        comment7.setBaseUri("hi!");
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment7.outerHtmlTail(appendable20, (int) '4', outputSettings22);
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.absUrl("\n<!---->");
        java.lang.String str6 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.siblingNodes();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str12 = comment11.getData();
        org.jsoup.nodes.Document document13 = comment11.ownerDocument();
        org.jsoup.nodes.Node node16 = comment11.attr("", "");
        java.lang.String str17 = comment11.getData();
        int int18 = comment11.siblingIndex();
        java.lang.String str20 = comment11.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment11.siblingNodes();
        java.lang.String str22 = comment11.getData();
        org.jsoup.nodes.Node node23 = comment11.root();
        org.jsoup.nodes.Node node24 = comment11.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node24 = comment21.nextSibling();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment21.outerHtmlTail(appendable25, (int) (short) -1, outputSettings27);
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment21.childNodesCopy();
        java.lang.String str30 = comment21.toString();
        java.lang.String str32 = comment21.absUrl("#comment");
        java.lang.String str33 = comment21.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = comment21.asXmlDeclaration();
        org.jsoup.nodes.Node node35 = comment21.root();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration34);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.wrap("\n<!--\n<!---->-->");
        int int10 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Node node9 = node8.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodes();
        boolean boolean11 = node8.hasParent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
        java.lang.String str13 = node8.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node8.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.childNodesCopy();
        int int11 = node8.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node8.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        int int11 = node10.siblingIndex();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        int int17 = comment14.siblingIndex();
        comment14.setBaseUri("");
        java.lang.String str20 = comment14.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node10.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        org.jsoup.nodes.Node node29 = node16.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            node29.remove();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        boolean boolean7 = comment1.isXmlDeclaration();
        boolean boolean8 = comment1.isXmlDeclaration();
        java.lang.String str9 = comment1.outerHtml();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        org.jsoup.nodes.Node node19 = node17.root();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment22.childNodesCopy();
        java.lang.String str24 = comment22.nodeName();
        java.lang.String str25 = comment22.outerHtml();
        org.jsoup.nodes.Node node26 = comment22.previousSibling();
        java.lang.Class<?> wildcardClass27 = comment22.getClass();
        boolean boolean28 = node17.equals((java.lang.Object) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            node17.remove();
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!---->" + "'", str25, "\n<!---->");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node24 = comment23.root();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment23.childNodesCopy();
        java.lang.String str26 = comment23.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment23.asXmlDeclaration();
        boolean boolean28 = comment2.equals((java.lang.Object) comment23);
        org.jsoup.nodes.Node node30 = comment2.wrap("\n<!---->");
        java.lang.String str31 = comment2.baseUri();
        org.jsoup.nodes.Node node33 = comment2.wrap("<?i?>");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        org.jsoup.nodes.Node node20 = comment2.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.traverse(nodeVisitor21);
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean14 = comment12.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node15 = comment12.nextSibling();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment12.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        java.lang.String str21 = comment12.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment12.wrap("\n<!--hi!-->");
        boolean boolean24 = node9.equals((java.lang.Object) comment12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment12.asXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration25.filter(nodeFilter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration25);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        java.lang.String str3 = comment2.outerHtml();
        org.jsoup.nodes.Comment comment6 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean8 = comment6.hasSameValue((java.lang.Object) 1);
        boolean boolean9 = comment6.hasParent();
        org.jsoup.nodes.Node node12 = comment6.attr("", "hi!");
        java.lang.String str14 = comment6.attr("");
        java.lang.String str16 = comment6.absUrl("hi!");
        int int17 = comment6.siblingIndex();
        org.jsoup.nodes.Node node18 = comment6.shallowClone();
        boolean boolean20 = comment6.hasAttr("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.before((org.jsoup.nodes.Node) comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--hi!-->" + "'", str3, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodesCopy();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        java.lang.String str17 = comment2.attr("\n<!--\n<!---->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        boolean boolean11 = node8.equals((java.lang.Object) comment10);
        org.jsoup.nodes.Node node12 = node8.shallowClone();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Node node14 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        int int12 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.nextSibling();
        boolean boolean15 = comment2.hasParent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.siblingNodes();
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str19 = comment17.absUrl("hi!");
        java.lang.String str20 = comment17.nodeName();
        org.jsoup.nodes.Node node21 = comment17.shallowClone();
        org.jsoup.nodes.Node node22 = comment17.clearAttributes();
        boolean boolean23 = comment2.hasSameValue((java.lang.Object) comment17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean9 = comment7.hasSameValue((java.lang.Object) 1);
        boolean boolean10 = comment7.hasParent();
        org.jsoup.nodes.Document document11 = comment7.ownerDocument();
        boolean boolean13 = comment7.hasAttr("#comment");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str17 = comment16.getData();
        org.jsoup.nodes.Document document18 = comment16.ownerDocument();
        org.jsoup.nodes.Node node21 = comment16.attr("", "");
        java.lang.String str22 = comment16.getData();
        int int23 = comment16.siblingIndex();
        boolean boolean24 = comment7.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node25 = comment7.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment7.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            document4.replaceWith((org.jsoup.nodes.Node) comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--\n<!--\n<!--#comment-->-->-->");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment2.asXmlDeclaration();
        java.lang.String str28 = comment2.outerHtml();
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
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--hi!-->" + "'", str28, "\n<!--hi!-->");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        int int3 = comment1.childNodeSize();
        org.jsoup.nodes.Attributes attributes4 = comment1.attributes();
        comment1.setBaseUri("<?commen?>");
        org.jsoup.nodes.Node node7 = comment1.parentNode();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        java.lang.String str27 = comment2.toString();
        org.jsoup.nodes.Node node28 = comment2.parent();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!--hi!-->" + "'", str27, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        java.lang.String str24 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n<!---->" + "'", str24, "\n<!---->");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("#comment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Node node15 = comment2.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.nodeName();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = comment2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node9.setBaseUri("\n<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.attr("#comment");
        java.lang.String str7 = comment2.absUrl("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        boolean boolean6 = comment2.hasParent();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        boolean boolean19 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node22 = comment2.attr("\n<!--#comment-->", "\n<!--#comment-->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.Class<?> wildcardClass10 = node9.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Node node10 = node9.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.root();
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        org.jsoup.nodes.Node node20 = node16.parentNode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "#comment");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean7 = comment5.hasSameValue((java.lang.Object) 1);
        boolean boolean8 = comment5.hasParent();
        java.lang.String str10 = comment5.absUrl("hi!");
        org.jsoup.nodes.Node node11 = comment5.parentNode();
        org.jsoup.nodes.Node node12 = comment5.clearAttributes();
        java.lang.String str13 = comment5.getData();
        boolean boolean14 = comment2.equals((java.lang.Object) str13);
        java.lang.String str15 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        java.lang.String str13 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        org.jsoup.nodes.Attributes attributes7 = comment2.attributes();
        int int8 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        org.jsoup.nodes.Node node8 = comment2.clone();
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        int int10 = comment2.siblingIndex();
        org.jsoup.nodes.Node node11 = comment2.root();
        boolean boolean12 = comment2.isXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        org.jsoup.nodes.Node node6 = comment2.parent();
        boolean boolean7 = comment2.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        org.jsoup.nodes.Attributes attributes15 = comment2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) (byte) 1, outputSettings7);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        java.lang.String str21 = comment2.toString();
        org.jsoup.nodes.Node node24 = comment2.attr("<?commen?>", "<?commen?>");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.jsoup.nodes.Node node20 = comment2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!---->", "hi!");
        java.lang.String str3 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.shallowClone();
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node8 = comment5.attr("", "");
        org.jsoup.nodes.Node node11 = comment5.attr("#comment", "#comment");
        boolean boolean12 = comment1.hasSameValue((java.lang.Object) comment5);
        java.lang.String str13 = comment5.outerHtml();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--#comment-->" + "'", str13, "\n<!--#comment-->");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        org.jsoup.nodes.Attributes attributes21 = comment2.attributes();
        int int22 = comment2.childNodeSize();
        boolean boolean24 = comment2.hasAttr("");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            node8.replaceWith(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.removeAttr("\n<!---->");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable6, (int) '4', outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.clone();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str13 = comment12.getData();
        org.jsoup.nodes.Document document14 = comment12.ownerDocument();
        org.jsoup.nodes.Node node17 = comment12.attr("", "");
        java.lang.String str18 = comment12.getData();
        int int19 = comment12.siblingIndex();
        java.lang.String str21 = comment12.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment12.siblingNodes();
        org.jsoup.nodes.Node node24 = comment12.removeAttr("hi!");
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        comment12.outerHtmlTail(appendable25, 1, outputSettings27);
        java.lang.String str30 = comment12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = comment12.childNodes();
        boolean boolean32 = node9.equals((java.lang.Object) comment12);
        boolean boolean33 = node9.hasParent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        org.jsoup.nodes.Comment comment37 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean39 = comment37.hasSameValue((java.lang.Object) 1);
        int int40 = comment37.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = comment37.siblingNodes();
        comment37.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes44 = comment37.attributes();
        boolean boolean45 = comment2.equals((java.lang.Object) attributes44);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        boolean boolean11 = comment2.hasAttr("#comment");
        java.lang.String str12 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(xmlDeclaration14);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        comment2.setBaseUri("hi!");
        int int9 = comment2.childNodeSize();
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = node10.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, 100, outputSettings9);
        boolean boolean11 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasParent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        boolean boolean32 = comment25.isXmlDeclaration();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        boolean boolean19 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node22 = comment2.attr("\n<!--#comment-->", "\n<!--#comment-->");
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node28 = comment25.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = comment25.siblingNodes();
        java.lang.String str30 = comment25.toString();
        org.jsoup.nodes.Node node31 = comment25.parentNode();
        boolean boolean32 = node22.hasSameValue((java.lang.Object) node31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node22 = comment21.root();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment21.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = comment21.asXmlDeclaration();
        comment21.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node27 = comment21.shallowClone();
        org.jsoup.nodes.Node node28 = comment21.parentNode();
        org.jsoup.nodes.Attributes attributes29 = comment21.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = comment21.asXmlDeclaration();
        comment21.setBaseUri("\n<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = node3.after((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(xmlDeclaration24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(xmlDeclaration30);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable30, (int) '4', outputSettings32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Node node11 = comment2.attr("", "\n<!--\n<!---->-->");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = comment2.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        org.jsoup.nodes.Node node9 = comment2.parent();
        int int10 = comment2.childNodeSize();
        org.jsoup.nodes.Node node11 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!---->");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        comment2.outerHtmlTail(appendable3, (int) '#', outputSettings5);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment2.siblingNodes();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node8 = node7.parent();
        boolean boolean9 = node7.hasParent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        java.lang.String str21 = comment2.absUrl("\n<!--#comment-->");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.clone();
        org.jsoup.nodes.Node node14 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = node14.ownerDocument();
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
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.parent();
        java.lang.String str7 = comment2.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.after("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node6 = comment2.removeAttr("\n<!--#comment-->");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        boolean boolean13 = comment2.equals((java.lang.Object) "\n<!---->");
        org.jsoup.nodes.Node node15 = comment2.wrap("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = node15.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodes();
        java.lang.String str12 = comment2.attr("");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str17 = comment15.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment15.childNodesCopy();
        org.jsoup.nodes.Node node21 = comment15.attr("#comment", "");
        org.jsoup.nodes.Node node22 = node21.root();
        org.jsoup.nodes.Node node23 = node22.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment2.before(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        boolean boolean17 = comment7.hasParent();
        boolean boolean18 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment7.parentNode();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str23 = comment22.getData();
        org.jsoup.nodes.Document document24 = comment22.ownerDocument();
        org.jsoup.nodes.Node node27 = comment22.attr("", "");
        java.lang.String str28 = comment22.getData();
        int int29 = comment22.siblingIndex();
        java.lang.String str31 = comment22.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList32 = comment22.siblingNodes();
        java.lang.String str33 = comment22.getData();
        org.jsoup.nodes.Attributes attributes34 = comment22.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = node19.equals((java.lang.Object) comment22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(attributes34);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node10.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        java.lang.String str17 = comment2.baseUri();
        java.lang.Class<?> wildcardClass18 = comment2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--hi!-->", "");
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = node4.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!---->", "\n<!---->");
        org.jsoup.nodes.Node node23 = comment21.removeAttr("\n<!--hi!-->");
        boolean boolean24 = node18.hasSameValue((java.lang.Object) node23);
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasSameValue((java.lang.Object) 1);
        boolean boolean30 = comment27.hasParent();
        java.lang.String str32 = comment27.absUrl("hi!");
        org.jsoup.nodes.Node node34 = comment27.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment27.childNodes();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        comment27.outerHtmlTail(appendable36, (int) ' ', outputSettings38);
        org.jsoup.nodes.Comment comment42 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean44 = comment42.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node45 = comment42.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = comment42.siblingNodes();
        java.lang.String str47 = comment42.toString();
        boolean boolean48 = comment42.isXmlDeclaration();
        java.lang.String str50 = comment42.attr("#comment");
        org.jsoup.nodes.Node node51 = comment42.shallowClone();
        boolean boolean52 = comment27.hasSameValue((java.lang.Object) node51);
        org.jsoup.nodes.Node node53 = node51.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node54 = node18.before(node51);
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
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\n<!--hi!-->" + "'", str47, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        org.jsoup.nodes.Node node4 = comment2.removeAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        java.lang.String str3 = comment1.attr("#comment");
        org.jsoup.nodes.Node node4 = comment1.root();
        org.jsoup.nodes.Node node6 = comment1.wrap("\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = comment1.childNodes();
        org.jsoup.nodes.Document document8 = comment1.ownerDocument();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = comment2.asXmlDeclaration();
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
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        java.lang.String str9 = comment2.baseUri();
        java.lang.String str10 = comment2.nodeName();
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
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        boolean boolean19 = comment2.isXmlDeclaration();
        java.lang.String str20 = comment2.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment2.outerHtmlTail(appendable18, (int) (short) 1, outputSettings20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        org.jsoup.nodes.Node node5 = comment2.attr("\n<!---->", "");
        comment2.setBaseUri("<?i?>");
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        org.jsoup.select.NodeFilter nodeFilter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node21.filter(nodeFilter22);
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
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("<?i?>");
        java.lang.String str10 = comment2.absUrl("#comment");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable3, (int) (short) 100, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--#comment-->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment2.clone();
        boolean boolean4 = node3.hasParent();
        org.jsoup.nodes.Node node6 = node3.wrap("\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        comment2.outerHtmlTail(appendable5, (int) ' ', outputSettings7);
        int int9 = comment2.siblingIndex();
        org.jsoup.nodes.Node node10 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str4 = comment2.outerHtml();
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        java.lang.String str6 = comment2.toString();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.String str10 = comment2.absUrl("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n<!--hi!-->" + "'", str6, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.previousSibling();
        java.lang.String str6 = comment2.absUrl("hi!");
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment9.childNodesCopy();
        int int13 = comment9.childNodeSize();
        org.jsoup.nodes.Node node16 = comment9.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Node node17 = node16.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = node4.shallowClone();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str11 = comment9.absUrl("hi!");
        java.lang.String str12 = comment9.nodeName();
        boolean boolean13 = node4.hasSameValue((java.lang.Object) str12);
        org.jsoup.nodes.Node node14 = node4.clearAttributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#comment" + "'", str12, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.after("<?commen?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        java.lang.Class<?> wildcardClass23 = comment2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        org.jsoup.nodes.Comment comment5 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean7 = comment5.hasSameValue((java.lang.Object) 1);
        int int8 = comment5.siblingIndex();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node14 = comment11.nextSibling();
        boolean boolean15 = comment5.equals((java.lang.Object) comment11);
        java.lang.String str16 = comment5.nodeName();
        java.lang.String str17 = comment5.baseUri();
        java.lang.String str18 = comment5.toString();
        org.jsoup.nodes.Node node19 = comment5.root();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment5.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = comment2.after((org.jsoup.nodes.Node) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!--hi!-->" + "'", str18, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!---->" + "'", str3, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Node node10 = comment2.attr("hi!", "#comment");
        boolean boolean11 = comment2.isXmlDeclaration();
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.previousSibling();
        org.jsoup.nodes.Node node14 = comment2.root();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str23 = comment15.absUrl("#comment");
        boolean boolean25 = comment15.hasAttr("#comment");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = comment28.hasParent();
        org.jsoup.nodes.Node node34 = comment28.attr("", "hi!");
        java.lang.String str36 = comment28.attr("");
        org.jsoup.nodes.Document document37 = comment28.ownerDocument();
        org.jsoup.nodes.Node node39 = comment28.removeAttr("#comment");
        java.lang.String str40 = comment28.nodeName();
        org.jsoup.nodes.Node node41 = comment28.shallowClone();
        org.jsoup.nodes.Node node42 = comment28.parentNode();
        boolean boolean43 = comment15.hasSameValue((java.lang.Object) comment28);
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#comment" + "'", str40, "#comment");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        org.jsoup.nodes.Node node20 = comment2.removeAttr("\n<!--#comment-->");
        java.lang.String str22 = comment2.attr("\n<!--\n<!--\n<!--#comment-->-->-->");
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
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        java.lang.String str9 = comment2.baseUri();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--#comment-->", "\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("\n<!--\n<!--#comment-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        org.jsoup.nodes.Node node11 = comment2.root();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str16 = comment14.absUrl("hi!");
        comment14.setBaseUri("#comment");
        java.lang.String str19 = comment14.toString();
        boolean boolean20 = node11.hasSameValue((java.lang.Object) comment14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!---->" + "'", str19, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        org.jsoup.nodes.Node node18 = comment2.attr("\n<!---->", "hi!");
        boolean boolean20 = comment2.hasAttr("\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = comment1.siblingNodes();
        java.lang.String str3 = comment1.baseUri();
        org.junit.Assert.assertNotNull(nodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        java.lang.String str13 = comment2.baseUri();
        java.lang.String str14 = comment2.getData();
        java.lang.String str15 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        org.jsoup.select.NodeFilter nodeFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node16.filter(nodeFilter18);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        org.jsoup.nodes.Node node29 = comment20.attr("\n<!--hi!-->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment20.before("\n<!--hi!-->");
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
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.Object obj10 = null;
        boolean boolean11 = comment2.hasSameValue(obj10);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        comment2.outerHtmlTail(appendable12, (int) 'a', outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
            org.jsoup.nodes.Node node15 = node14.unwrap();
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node13 = comment2.clone();
        int int14 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment17 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean19 = comment17.hasSameValue((java.lang.Object) 1);
        boolean boolean20 = comment17.hasParent();
        java.lang.String str22 = comment17.absUrl("hi!");
        org.jsoup.nodes.Node node23 = comment17.parentNode();
        comment17.setBaseUri("\n<!--hi!-->");
        comment17.setBaseUri("");
        boolean boolean28 = comment17.isXmlDeclaration();
        comment17.setBaseUri("");
        boolean boolean31 = comment2.hasSameValue((java.lang.Object) comment17);
        org.jsoup.nodes.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = comment17.after(node32);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        org.jsoup.nodes.Node node18 = comment2.attr("\n<!---->", "hi!");
        org.jsoup.nodes.Document document19 = node18.ownerDocument();
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = comment22.childNodesCopy();
        java.lang.String str24 = comment22.nodeName();
        java.lang.String str25 = comment22.outerHtml();
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean30 = comment28.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = comment28.hasParent();
        java.lang.String str33 = comment28.absUrl("hi!");
        org.jsoup.nodes.Node node34 = comment28.parentNode();
        comment28.setBaseUri("\n<!--hi!-->");
        comment28.setBaseUri("");
        org.jsoup.nodes.Node node39 = comment28.parent();
        boolean boolean40 = comment22.equals((java.lang.Object) node39);
        boolean boolean41 = comment22.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = document19.equals((java.lang.Object) comment22);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<!---->" + "'", str25, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        boolean boolean12 = comment9.hasParent();
        java.lang.String str14 = comment9.absUrl("hi!");
        java.lang.String str15 = comment9.toString();
        org.jsoup.nodes.Node node16 = comment9.previousSibling();
        org.jsoup.nodes.Node node19 = comment9.attr("hi!", "");
        boolean boolean20 = comment2.equals((java.lang.Object) node19);
        org.jsoup.select.NodeFilter nodeFilter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment2.filter(nodeFilter21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration6 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Attributes attributes9 = comment2.attributes();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!--\n<!---->-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xmlDeclaration6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str13 = comment2.absUrl("hi!");
        org.jsoup.nodes.Attributes attributes14 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str20 = comment18.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment18.childNodesCopy();
        org.jsoup.nodes.Node node24 = comment18.attr("#comment", "");
        org.jsoup.nodes.Node node25 = node24.root();
        org.jsoup.nodes.Node node26 = node24.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration15.replaceWith(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(xmlDeclaration15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.clone();
        java.lang.String str12 = node11.outerHtml();
        org.jsoup.nodes.Node node13 = node11.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node11.siblingNodes();
        org.jsoup.nodes.Node node15 = node11.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node5 = node4.clone();
        org.jsoup.nodes.Node node6 = node5.parent();
        org.jsoup.nodes.Node node7 = node5.nextSibling();
        org.jsoup.nodes.Node node8 = node5.root();
        org.jsoup.nodes.Node node9 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node9.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        org.jsoup.nodes.Node node42 = comment2.attr("", "\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = node42.childNodes();
        org.jsoup.nodes.Node node44 = node42.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node44.root();
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
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.nodeName();
        org.jsoup.nodes.Node node14 = comment2.attr("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Node node16 = comment2.wrap("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        java.lang.String str19 = comment12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment12.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        comment1.outerHtmlTail(appendable2, (int) (byte) -1, outputSettings4);
        org.jsoup.nodes.Node node6 = comment1.shallowClone();
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment14.outerHtmlTail(appendable22, (int) (byte) 1, outputSettings24);
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        java.lang.String str9 = comment2.absUrl("<?i?>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node17 = comment2.removeAttr("\n<!--#comment-->");
        comment2.setBaseUri("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        int int3 = comment1.childNodeSize();
        java.lang.String str4 = comment1.outerHtml();
        org.jsoup.nodes.Node node5 = comment1.parent();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        java.util.List<org.jsoup.nodes.Node> nodeList34 = comment6.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.Node node13 = comment2.parent();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node17 = comment16.root();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment16.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = comment16.asXmlDeclaration();
        comment16.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node22 = comment16.shallowClone();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment25.childNodes();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment25.outerHtmlTail(appendable27, (int) (short) 1, outputSettings29);
        org.jsoup.nodes.Node node31 = comment25.parentNode();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        comment25.outerHtmlTail(appendable32, 1, outputSettings34);
        java.lang.String str36 = comment25.baseUri();
        boolean boolean37 = comment16.equals((java.lang.Object) str36);
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(xmlDeclaration19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.childNodesCopy();
        boolean boolean16 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment2.attr("\n<!--hi!-->", "\n<!--hi!-->");
        org.jsoup.nodes.Node node20 = node19.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.shallowClone();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment8.outerHtmlTail(appendable16, (int) (byte) 10, outputSettings18);
        org.jsoup.nodes.Node node20 = comment8.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = comment8.traverse(nodeVisitor21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        int int7 = comment2.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.getData();
        java.lang.String str10 = comment2.attr("#comment");
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        java.lang.String str12 = comment2.toString();
        org.jsoup.nodes.Node node14 = comment2.wrap("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        org.jsoup.nodes.Node node16 = comment2.clearAttributes();
        org.jsoup.nodes.Node node17 = node16.shallowClone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.attr("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Node node7 = comment2.removeAttr("");
        org.jsoup.nodes.Node node8 = comment2.root();
        java.lang.String str9 = comment2.getData();
        java.lang.String str10 = comment2.baseUri();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (byte) 0, outputSettings11);
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        java.lang.String str14 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--hi!-->", "\n<!---->");
        java.lang.String str3 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.removeAttr("\n<!--\n<!--\n<!--#comment-->-->-->");
        int int6 = node5.siblingIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.after("\n<!--hi!-->");
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
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        org.jsoup.nodes.Node node20 = comment2.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node20.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        boolean boolean11 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        int int17 = comment14.siblingIndex();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node23 = comment20.nextSibling();
        boolean boolean24 = comment14.equals((java.lang.Object) comment20);
        org.jsoup.nodes.Node node26 = comment20.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node27 = node26.nextSibling();
        org.jsoup.nodes.Node node28 = node26.clone();
        boolean boolean29 = comment2.equals((java.lang.Object) node28);
        org.jsoup.nodes.Node node30 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node30.before("#comment");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node17 = comment2.attr("", "#comment");
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable18, (int) (short) 10, outputSettings20);
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
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        org.jsoup.nodes.Document document24 = node21.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList25 = document24.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(document24);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n<!--\n<!---->-->", "\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.siblingNodes();
        org.jsoup.nodes.Node node6 = comment2.attr("#comment", "\n<!---->");
        org.jsoup.nodes.Document document7 = node6.ownerDocument();
        org.jsoup.nodes.Node node8 = node6.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        java.lang.String str29 = comment21.attr("\n<!--#comment-->");
        java.lang.Class<?> wildcardClass30 = comment21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        java.lang.String str13 = comment2.nodeName();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = node14.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str11 = comment2.outerHtml();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.siblingNodes();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        boolean boolean14 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = comment2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.root();
        java.lang.String str10 = comment2.getData();
        org.jsoup.nodes.Node node13 = comment2.attr("", "<?commen?>");
        boolean boolean14 = node13.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        int int25 = comment22.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = comment22.siblingNodes();
        comment22.setBaseUri("hi!");
        org.jsoup.nodes.Node node29 = comment22.nextSibling();
        java.lang.String str31 = comment22.attr("<?commen?>");
        boolean boolean32 = node19.hasSameValue((java.lang.Object) "<?commen?>");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.siblingNodes();
        java.lang.String str9 = comment2.nodeName();
        java.lang.String str10 = comment2.outerHtml();
        int int11 = comment2.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!--hi!-->" + "'", str10, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.baseUri();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        org.jsoup.nodes.Node node15 = comment2.clone();
        org.jsoup.nodes.Node node17 = comment2.wrap("<?commen?>");
        org.jsoup.nodes.Node node18 = comment2.clearAttributes();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable19, (int) (short) 100, outputSettings21);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#comment" + "'", str13, "#comment");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        java.lang.String str21 = comment2.attr("\n<!--#comment-->");
        int int22 = comment2.childNodeSize();
        org.jsoup.nodes.Attributes attributes23 = comment2.attributes();
        org.jsoup.nodes.Node node24 = comment2.parentNode();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        comment2.outerHtmlTail(appendable4, (int) (short) 1, outputSettings6);
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        java.lang.String str9 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.lang.String str11 = comment2.getData();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment14.attr("", "");
        org.jsoup.nodes.Node node20 = comment14.attr("#comment", "#comment");
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        boolean boolean26 = comment23.hasParent();
        java.lang.String str28 = comment23.absUrl("hi!");
        org.jsoup.nodes.Node node29 = comment23.parentNode();
        comment23.setBaseUri("\n<!--hi!-->");
        comment23.setBaseUri("");
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean38 = comment36.hasSameValue((java.lang.Object) 1);
        boolean boolean39 = comment36.hasParent();
        org.jsoup.nodes.Node node42 = comment36.attr("", "hi!");
        java.lang.String str44 = comment36.attr("");
        org.jsoup.nodes.Document document45 = comment36.ownerDocument();
        org.jsoup.nodes.Node node47 = comment36.removeAttr("#comment");
        java.lang.String str48 = comment36.nodeName();
        org.jsoup.nodes.Node node49 = comment36.shallowClone();
        boolean boolean50 = comment23.hasSameValue((java.lang.Object) comment36);
        boolean boolean51 = comment14.hasSameValue((java.lang.Object) comment36);
        org.jsoup.nodes.Attributes attributes52 = comment14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = comment2.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#comment" + "'", str48, "#comment");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes52);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        org.jsoup.nodes.Node node19 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node20 = comment2.previousSibling();
        int int21 = comment2.siblingIndex();
        org.jsoup.nodes.Node node23 = comment2.wrap("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = comment26.hasParent();
        org.jsoup.nodes.Node node32 = comment26.attr("", "hi!");
        java.lang.String str34 = comment26.attr("");
        org.jsoup.nodes.Document document35 = comment26.ownerDocument();
        java.lang.String str36 = comment26.getData();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = comment26.asXmlDeclaration();
        org.jsoup.nodes.Node node39 = comment26.removeAttr("\n<!--hi!-->");
        java.lang.Appendable appendable40 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        comment26.outerHtmlTail(appendable40, (-1), outputSettings42);
        boolean boolean44 = comment26.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node23.after((org.jsoup.nodes.Node) comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(xmlDeclaration37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        org.jsoup.nodes.Node node16 = comment2.parentNode();
        org.jsoup.nodes.Node node17 = comment2.nextSibling();
        java.lang.String str18 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Comment comment7 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment7.childNodes();
        org.jsoup.nodes.Node node9 = comment7.clone();
        org.jsoup.nodes.Node node10 = comment7.shallowClone();
        org.jsoup.nodes.Node node12 = comment7.removeAttr("");
        org.jsoup.nodes.Attributes attributes13 = comment7.attributes();
        boolean boolean14 = comment7.isXmlDeclaration();
        org.jsoup.nodes.Node node17 = comment7.attr("\n<!--hi!-->", "\n<!--\n<!---->-->");
        boolean boolean18 = comment2.equals((java.lang.Object) comment7);
        java.lang.String str19 = comment2.baseUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str9 = comment2.attr("");
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!--\n<!---->-->", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodesCopy();
        org.jsoup.nodes.Node node14 = node12.nextSibling();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Attributes attributes11 = comment2.attributes();
        boolean boolean12 = comment2.hasParent();
        org.jsoup.nodes.Node node13 = comment2.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.after("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.clearAttributes();
        org.jsoup.nodes.Node node10 = node9.shallowClone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        org.jsoup.nodes.Node node17 = comment8.clone();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean22 = comment20.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node23 = comment20.nextSibling();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        comment20.outerHtmlTail(appendable24, (int) (short) -1, outputSettings26);
        boolean boolean29 = comment20.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node30 = comment20.root();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.childNodesCopy();
        boolean boolean32 = node17.hasSameValue((java.lang.Object) nodeList31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Document document10 = comment2.ownerDocument();
        boolean boolean12 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.removeAttr("\n<!--#comment-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        java.lang.String str18 = comment2.outerHtml();
        org.jsoup.nodes.Attributes attributes19 = comment2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<!---->" + "'", str18, "\n<!---->");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = node5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.nodeName();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        org.jsoup.nodes.Node node35 = comment15.attr("", "\n<!--hi!-->");
        java.lang.String str37 = comment15.absUrl("#comment");
        java.lang.String str38 = comment15.nodeName();
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#comment" + "'", str38, "#comment");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        org.jsoup.nodes.Node node6 = comment2.shallowClone();
        org.jsoup.nodes.Node node7 = comment2.parent();
        int int8 = comment2.childNodeSize();
        org.jsoup.nodes.Node node9 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        boolean boolean19 = comment2.isXmlDeclaration();
        comment2.setBaseUri("\n<!--hi!-->");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = comment2.asXmlDeclaration();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration12.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(xmlDeclaration12);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.childNodesCopy();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, 0, outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = comment2.attributes();
        org.jsoup.nodes.Node node16 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
            org.jsoup.nodes.Node node20 = comment2.before("<?i?>");
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
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        org.jsoup.nodes.Node node16 = comment2.removeAttr("\n<!--\n<!---->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        comment2.setBaseUri("\n<!---->");
        java.lang.String str11 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.baseUri();
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.nodeName();
        java.lang.String str11 = comment2.absUrl("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.after("hi!");
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
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node20.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "<?i?>");
        org.jsoup.nodes.Node node3 = comment2.parentNode();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        java.lang.String str8 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment2.removeAttr("");
        java.lang.String str12 = comment2.attr("\n<!--\n<!--#comment-->-->");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        org.jsoup.nodes.Node node22 = node21.root();
        boolean boolean23 = comment2.equals((java.lang.Object) node21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node21.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node3.childNodes();
        node3.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        org.jsoup.nodes.Node node22 = comment6.removeAttr("\n<!--#comment-->");
        java.lang.String str23 = node22.outerHtml();
        org.jsoup.nodes.Node node24 = node22.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.siblingNodes();
        boolean boolean26 = node24.hasParent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.equals((java.lang.Object) '4');
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Node node11 = comment2.attr("", "\n<!--#comment-->");
        java.lang.String str12 = comment2.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!---->" + "'", str12, "\n<!---->");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.root();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        java.lang.String str9 = comment8.nodeName();
        boolean boolean10 = node5.equals((java.lang.Object) comment8);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment8.outerHtmlTail(appendable11, 0, outputSettings13);
        org.jsoup.nodes.Attributes attributes15 = comment8.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable20, (int) ' ', outputSettings22);
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!---->", "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        boolean boolean29 = comment6.hasAttr("");
        int int30 = comment6.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        org.jsoup.nodes.Node node3 = comment2.clone();
        int int4 = comment2.siblingIndex();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node14 = comment2.root();
        int int15 = comment2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodes();
        org.jsoup.nodes.Node node19 = comment2.attr("hi!", "#comment");
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
            org.jsoup.nodes.Node node16 = node15.root();
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
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        boolean boolean8 = comment2.hasAttr("#comment");
        boolean boolean9 = comment2.hasParent();
        comment2.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str10 = comment2.nodeName();
        org.jsoup.nodes.Comment comment12 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean13 = comment2.hasSameValue((java.lang.Object) comment12);
        org.jsoup.nodes.Node node15 = comment12.removeAttr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        org.jsoup.nodes.Node node26 = comment2.nextSibling();
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
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        java.lang.String str20 = comment2.getData();
        java.lang.String str21 = comment2.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!---->" + "'", str21, "\n<!---->");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str18 = comment16.attr("\n<!--hi!-->");
        boolean boolean19 = node13.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Node node20 = comment16.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Node node8 = comment2.previousSibling();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node14 = comment11.nextSibling();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment11.outerHtmlTail(appendable15, (int) (short) -1, outputSettings17);
        java.lang.String str19 = comment11.nodeName();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment11.outerHtmlTail(appendable20, (int) (byte) -1, outputSettings22);
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = comment26.hasParent();
        org.jsoup.nodes.Document document30 = comment26.ownerDocument();
        boolean boolean32 = comment26.hasAttr("#comment");
        org.jsoup.nodes.Comment comment35 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str36 = comment35.getData();
        org.jsoup.nodes.Document document37 = comment35.ownerDocument();
        org.jsoup.nodes.Node node40 = comment35.attr("", "");
        java.lang.String str41 = comment35.getData();
        int int42 = comment35.siblingIndex();
        boolean boolean43 = comment26.equals((java.lang.Object) comment35);
        boolean boolean44 = comment11.equals((java.lang.Object) boolean43);
        org.jsoup.nodes.Node node47 = comment11.attr("\n<!--hi!-->", "\n<!--\n<!--#comment-->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = node8.after(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#comment" + "'", str19, "#comment");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        org.jsoup.nodes.Attributes attributes16 = comment2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!---->" + "'", str15, "\n<!---->");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Node node17 = node16.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node17.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        org.jsoup.nodes.Node node22 = comment2.parent();
        org.jsoup.nodes.Node node24 = comment2.removeAttr("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = comment2.asXmlDeclaration();
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
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.lang.String str12 = comment2.baseUri();
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment16.childNodes();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment16.outerHtmlTail(appendable18, (int) (short) 1, outputSettings20);
        org.jsoup.nodes.Node node22 = comment16.parentNode();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment16.outerHtmlTail(appendable23, 1, outputSettings25);
        boolean boolean27 = comment2.equals((java.lang.Object) comment16);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment16.childNodes();
        org.jsoup.nodes.Node node30 = comment16.removeAttr("\n<!--\n<!--#comment-->-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
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
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean7 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Document document8 = comment2.ownerDocument();
        java.lang.String str9 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = comment2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        int int11 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = comment2.unwrap();
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
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        java.lang.String str17 = comment8.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        java.lang.String str7 = comment2.absUrl("\n<!--hi!-->");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, 1, outputSettings10);
        java.lang.String str12 = comment2.toString();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str22 = comment15.outerHtml();
        org.jsoup.nodes.Node node25 = comment15.attr("\n<!--#comment-->", "");
        java.lang.Class<?> wildcardClass26 = comment15.getClass();
        boolean boolean27 = comment2.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n<!--hi!-->" + "'", str22, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        java.lang.Class<?> wildcardClass16 = attributes15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        java.lang.String str5 = comment2.nodeName();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!--#comment-->");
        comment2.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        org.jsoup.nodes.Node node18 = comment2.parentNode();
        org.jsoup.nodes.Node node19 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node19.wrap("<?commen?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean23 = comment21.hasSameValue((java.lang.Object) 1);
        int int24 = comment21.siblingIndex();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean29 = comment27.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node30 = comment27.nextSibling();
        boolean boolean31 = comment21.equals((java.lang.Object) comment27);
        org.jsoup.nodes.Node node32 = comment21.root();
        boolean boolean33 = comment21.isXmlDeclaration();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean38 = comment36.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node39 = comment36.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = comment36.siblingNodes();
        java.lang.Class<?> wildcardClass41 = comment36.getClass();
        boolean boolean42 = comment21.hasSameValue((java.lang.Object) wildcardClass41);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = comment21.siblingNodes();
        org.jsoup.nodes.Document document44 = comment21.ownerDocument();
        org.jsoup.nodes.Node node45 = comment21.previousSibling();
        boolean boolean46 = comment21.hasParent();
        org.jsoup.nodes.Node node49 = comment21.attr("hi!", "<?i?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = node3.after(node49);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        java.lang.String str10 = comment2.toString();
        int int11 = comment2.childNodeSize();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable12, (int) (byte) 10, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!---->" + "'", str10, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment2.outerHtmlTail(appendable19, 10, outputSettings21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        org.jsoup.nodes.Node node34 = comment22.attr("\n<!--hi!-->", "<?i?>");
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
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        boolean boolean30 = comment15.isXmlDeclaration();
        org.jsoup.nodes.Node node31 = comment15.shallowClone();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        boolean boolean23 = comment2.hasAttr("<?commen?>");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str7 = comment2.outerHtml();
        org.jsoup.nodes.Node node8 = comment2.root();
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        org.jsoup.nodes.Node node12 = comment2.attr("\n<!---->", "");
        comment2.setBaseUri("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.siblingNodes();
        java.lang.String str16 = comment2.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#comment" + "'", str16, "#comment");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node10 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean17 = comment15.hasSameValue((java.lang.Object) 1);
        boolean boolean18 = comment15.hasParent();
        org.jsoup.nodes.Node node21 = comment15.attr("", "hi!");
        java.lang.String str23 = comment15.attr("");
        org.jsoup.nodes.Document document24 = comment15.ownerDocument();
        org.jsoup.nodes.Node node26 = comment15.removeAttr("#comment");
        java.lang.String str27 = comment15.nodeName();
        org.jsoup.nodes.Node node30 = comment15.attr("", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        boolean boolean32 = node12.equals((java.lang.Object) node30);
        org.jsoup.nodes.Document document33 = node12.ownerDocument();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean38 = comment36.hasAttr("hi!");
        org.jsoup.nodes.Node node39 = comment36.parentNode();
        int int40 = comment36.siblingIndex();
        org.jsoup.nodes.Node node42 = comment36.removeAttr("#comment");
        org.jsoup.nodes.Node node43 = comment36.root();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = document33.equals((java.lang.Object) node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!--\n<!---->-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = comment2.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodesCopy();
        boolean boolean17 = comment2.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = comment2.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        org.jsoup.nodes.Node node22 = node21.root();
        org.jsoup.nodes.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node21.after(node23);
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
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodesCopy();
        java.lang.String str17 = comment2.outerHtml();
        java.lang.String str18 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        boolean boolean19 = comment2.isXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment2.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = comment2.asXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(xmlDeclaration21);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        java.lang.String str8 = comment2.attr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment2.childNodesCopy();
        java.lang.String str10 = comment2.getData();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment2.childNodes();
        org.jsoup.nodes.Node node12 = comment2.clearAttributes();
        boolean boolean13 = comment2.isXmlDeclaration();
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable7, (int) (byte) 1, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = comment2.siblingNodes();
        java.lang.String str11 = comment2.nodeName();
        org.jsoup.nodes.Node node14 = comment2.attr("#comment", "\n<!--hi!-->");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable15, (int) (short) 10, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#comment" + "'", str11, "#comment");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        org.jsoup.nodes.Document document9 = comment2.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = comment2.asXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(xmlDeclaration10);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        java.lang.Class<?> wildcardClass16 = comment8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#comment" + "'", str9, "#comment");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#comment" + "'", str15, "#comment");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        org.jsoup.nodes.Node node13 = node12.shallowClone();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str18 = comment16.attr("\n<!--hi!-->");
        boolean boolean19 = node13.equals((java.lang.Object) comment16);
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean24 = comment22.hasSameValue((java.lang.Object) 1);
        boolean boolean25 = comment22.hasParent();
        org.jsoup.nodes.Document document26 = comment22.ownerDocument();
        boolean boolean28 = comment22.hasAttr("#comment");
        boolean boolean29 = comment22.hasParent();
        org.jsoup.nodes.Document document30 = comment22.ownerDocument();
        boolean boolean31 = comment16.hasSameValue((java.lang.Object) comment22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.previousSibling();
        java.lang.String str8 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node10 = comment2.removeAttr("");
        org.jsoup.nodes.Node node12 = node10.wrap("<?i?>");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "\n<!--hi!-->");
        int int3 = comment2.childNodeSize();
        org.jsoup.nodes.Node node4 = comment2.clone();
        org.jsoup.nodes.Node node7 = comment2.attr("hi!", "#comment");
        java.lang.String str8 = comment2.toString();
        java.lang.String str9 = comment2.baseUri();
        int int10 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--#comment-->" + "'", str8, "\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        boolean boolean17 = comment2.hasAttr("<?commen?>");
        org.jsoup.nodes.Node node18 = comment2.nextSibling();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        comment2.outerHtmlTail(appendable19, 10, outputSettings21);
        org.jsoup.nodes.Node node24 = comment2.removeAttr("\n<!--hi!-->");
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
        java.util.List<org.jsoup.nodes.Node> nodeList43 = comment27.siblingNodes();
        boolean boolean45 = comment27.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node46 = comment27.shallowClone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = node24.before((org.jsoup.nodes.Node) comment27);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#comment" + "'", str39, "#comment");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.siblingNodes();
        org.jsoup.nodes.Node node7 = comment2.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after("\n<!--\n<!--\n<!--#comment-->-->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = node3.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node3.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        java.lang.String str37 = comment2.absUrl("\n<!---->");
        org.jsoup.nodes.Comment comment40 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean42 = comment40.hasAttr("hi!");
        org.jsoup.nodes.Node node43 = comment40.parentNode();
        int int44 = comment40.siblingIndex();
        org.jsoup.nodes.Node node46 = comment40.removeAttr("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = comment40.childNodesCopy();
        java.lang.String str48 = comment40.baseUri();
        org.jsoup.nodes.Node node51 = comment40.attr("\n<!--hi!-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = comment2.before((org.jsoup.nodes.Node) comment40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment20.childNodes();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment20.outerHtmlTail(appendable22, (int) (short) 1, outputSettings24);
        org.jsoup.nodes.Node node26 = comment20.previousSibling();
        java.lang.String str27 = comment20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment20.childNodesCopy();
        boolean boolean29 = node16.hasSameValue((java.lang.Object) nodeList28);
        java.lang.String str30 = node16.outerHtml();
        org.jsoup.nodes.Comment comment33 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean35 = comment33.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node36 = comment33.nextSibling();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        comment33.outerHtmlTail(appendable37, (int) (short) -1, outputSettings39);
        java.lang.String str42 = comment33.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node44 = comment33.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node47 = comment33.attr("hi!", "\n<!---->");
        boolean boolean48 = node16.hasSameValue((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = node16.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = node16.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeList49);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        java.lang.String str20 = comment2.getData();
        java.lang.String str21 = comment2.outerHtml();
        org.jsoup.nodes.Node node22 = comment2.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n<!--hi!-->" + "'", str21, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        java.lang.String str21 = comment2.absUrl("\n<!--#comment-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        int int11 = comment2.childNodeSize();
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
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = comment7.before("\n<!--hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        org.jsoup.nodes.Node node6 = comment2.clone();
        org.jsoup.nodes.Node node9 = comment2.attr("\n<!--\n<!---->-->", "");
        boolean boolean11 = comment2.hasAttr("<?i?>");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Comment comment15 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str17 = comment15.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment15.childNodesCopy();
        org.jsoup.nodes.Node node21 = comment15.attr("#comment", "");
        org.jsoup.nodes.Node node22 = comment15.nextSibling();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment15.outerHtmlTail(appendable23, 100, outputSettings25);
        org.jsoup.nodes.Node node28 = comment15.removeAttr("\n<!--\n<!---->-->");
        boolean boolean29 = comment2.equals((java.lang.Object) node28);
        java.lang.String str30 = comment2.baseUri();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment11.childNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment11.outerHtmlTail(appendable13, (int) (short) 1, outputSettings15);
        org.jsoup.nodes.Node node17 = comment11.parentNode();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment11.outerHtmlTail(appendable18, 1, outputSettings20);
        java.lang.String str22 = comment11.baseUri();
        boolean boolean23 = comment2.equals((java.lang.Object) str22);
        org.jsoup.nodes.Comment comment26 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean28 = comment26.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = comment26.hasParent();
        org.jsoup.nodes.Node node32 = comment26.attr("", "hi!");
        java.lang.String str34 = comment26.absUrl("#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList35 = comment26.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration4 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node5 = comment2.clone();
        org.jsoup.nodes.Document document6 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment9 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean11 = comment9.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node12 = comment9.nextSibling();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        comment9.outerHtmlTail(appendable13, (int) (short) -1, outputSettings15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment9.childNodesCopy();
        comment9.setBaseUri("\n<!--\n<!---->-->");
        java.lang.String str20 = comment9.toString();
        boolean boolean21 = comment9.isXmlDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document6.after((org.jsoup.nodes.Node) comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n<!--hi!-->" + "'", str20, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        comment2.outerHtmlTail(appendable20, (-1), outputSettings22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        org.jsoup.nodes.Node node37 = node15.clone();
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
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        int int9 = comment2.siblingIndex();
        boolean boolean10 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node11 = comment2.clone();
        org.jsoup.nodes.Node node12 = node11.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.unwrap();
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
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = comment2.before("\n<!--#comment-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        java.lang.String str17 = comment8.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = comment8.asXmlDeclaration();
        java.lang.Class<?> wildcardClass19 = xmlDeclaration18.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        org.jsoup.nodes.Node node26 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = node26.before("#comment");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        java.lang.String str32 = node30.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n<!---->" + "'", str32, "\n<!---->");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node13 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        org.jsoup.nodes.Node node15 = node13.clearAttributes();
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean20 = comment18.hasSameValue((java.lang.Object) 1);
        boolean boolean21 = comment18.hasParent();
        boolean boolean23 = comment18.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean24 = comment18.isXmlDeclaration();
        boolean boolean25 = comment18.hasParent();
        org.jsoup.nodes.Node node27 = comment18.removeAttr("\n<!---->");
        org.jsoup.nodes.Node node28 = node27.shallowClone();
        boolean boolean29 = node15.hasSameValue((java.lang.Object) node27);
        org.jsoup.nodes.Node node30 = node27.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment2.childNodesCopy();
        boolean boolean16 = comment2.isXmlDeclaration();
        java.lang.String str18 = comment2.attr("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str9 = comment2.outerHtml();
        java.lang.String str10 = comment2.getData();
        java.lang.String str11 = comment2.toString();
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        java.lang.Class<?> wildcardClass14 = comment2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!--hi!-->" + "'", str9, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<!--hi!-->" + "'", str11, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
        org.jsoup.nodes.Node node17 = comment8.clone();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str22 = comment20.absUrl("\n<!--hi!-->");
        java.lang.String str24 = comment20.attr("hi!");
        org.jsoup.nodes.Node node26 = comment20.removeAttr("#comment");
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceWith((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        java.lang.String str16 = comment2.attr("\n<!--\n<!---->-->");
        java.lang.String str17 = comment2.nodeName();
        java.lang.String str18 = comment2.getData();
        org.jsoup.nodes.Attributes attributes19 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n<!--hi!-->" + "'", str13, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#comment" + "'", str17, "#comment");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        org.jsoup.nodes.Node node17 = comment2.previousSibling();
        int int18 = comment2.childNodeSize();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str23 = comment21.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment21.childNodesCopy();
        boolean boolean25 = comment21.isXmlDeclaration();
        int int26 = comment21.childNodeSize();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment21.outerHtmlTail(appendable27, (int) ' ', outputSettings29);
        java.lang.String str32 = comment21.absUrl("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = comment21.childNodes();
        org.jsoup.nodes.Node node36 = comment21.attr("\n<!--hi!-->", "\n<!---->");
        org.jsoup.nodes.Document document37 = comment21.ownerDocument();
        boolean boolean39 = comment21.hasAttr("\n<!--#comment-->");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment21);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = node14.root();
        org.jsoup.nodes.Node node16 = node15.shallowClone();
        org.jsoup.nodes.Node node17 = node15.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node17.childNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        int int3 = comment1.childNodeSize();
        boolean boolean4 = comment1.hasParent();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        boolean boolean17 = comment7.hasParent();
        org.jsoup.nodes.Node node19 = comment7.removeAttr("<?i?>");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--hi!-->" + "'", str4, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        java.lang.String str14 = comment2.nodeName();
        org.jsoup.nodes.Node node15 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = comment2.childNodesCopy();
        java.lang.String str17 = comment2.outerHtml();
        java.lang.String str18 = comment2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = comment2.unwrap();
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
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!---->" + "'", str17, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node12 = comment2.parentNode();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = node14.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node14.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        java.lang.String str18 = comment2.baseUri();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<?commen?>", "\n<!--\n<!--\n<!--#comment-->-->-->");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        org.jsoup.nodes.Node node8 = xmlDeclaration7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = node8.hasParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        org.jsoup.nodes.Node node4 = comment2.root();
        org.jsoup.nodes.Attributes attributes5 = comment2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = comment2.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.lang.String str8 = comment2.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        boolean boolean9 = comment2.hasParent();
        org.jsoup.nodes.Node node11 = comment2.removeAttr("\n<!---->");
        boolean boolean12 = comment2.hasParent();
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node14 = comment2.root();
        int int15 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            comment2.remove();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        org.jsoup.nodes.Comment comment41 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node42 = comment41.shallowClone();
        org.jsoup.nodes.Comment comment45 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node48 = comment45.attr("", "");
        org.jsoup.nodes.Node node51 = comment45.attr("#comment", "#comment");
        boolean boolean52 = comment41.hasSameValue((java.lang.Object) comment45);
        org.jsoup.nodes.Comment comment55 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean57 = comment55.hasSameValue((java.lang.Object) 1);
        boolean boolean58 = comment55.hasParent();
        org.jsoup.nodes.Node node61 = comment55.attr("", "hi!");
        java.lang.String str63 = comment55.attr("");
        org.jsoup.nodes.Document document64 = comment55.ownerDocument();
        org.jsoup.nodes.Node node66 = comment55.removeAttr("#comment");
        java.lang.String str67 = comment55.nodeName();
        org.jsoup.nodes.Node node68 = comment55.shallowClone();
        java.lang.String str70 = comment55.attr("");
        org.jsoup.nodes.Attributes attributes71 = comment55.attributes();
        boolean boolean72 = comment45.equals((java.lang.Object) comment55);
        org.jsoup.nodes.Node node75 = comment55.attr("", "\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node76 = node22.before((org.jsoup.nodes.Node) comment55);
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
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNull(document64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "#comment" + "'", str67, "#comment");
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        org.jsoup.nodes.Document document20 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node26 = comment23.nextSibling();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        comment23.outerHtmlTail(appendable27, (int) (short) -1, outputSettings29);
        comment23.setBaseUri("\n<!--hi!-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = document20.before((org.jsoup.nodes.Node) comment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        boolean boolean15 = comment2.hasAttr("\n<!--\n<!--#comment-->-->");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        comment2.outerHtmlTail(appendable16, (int) (short) -1, outputSettings18);
        org.jsoup.nodes.Node node21 = comment2.removeAttr("hi!");
        java.lang.String str22 = comment2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = comment16.unwrap();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#comment" + "'", str24, "#comment");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#comment" + "'", str28, "#comment");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.childNodesCopy();
        boolean boolean19 = comment2.isXmlDeclaration();
        java.lang.String str21 = comment2.absUrl("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
        org.jsoup.nodes.Node node26 = node22.root();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean31 = comment29.hasSameValue((java.lang.Object) 1);
        java.lang.String str32 = comment29.baseUri();
        org.jsoup.nodes.Node node35 = comment29.attr("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = comment29.siblingNodes();
        org.jsoup.nodes.Node node37 = comment29.root();
        // The following exception was thrown during execution in test generation
        try {
            node22.replaceWith((org.jsoup.nodes.Node) comment29);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.lang.String str4 = comment2.getData();
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str11 = comment10.getData();
        org.jsoup.nodes.Document document12 = comment10.ownerDocument();
        org.jsoup.nodes.Node node15 = comment10.attr("", "");
        java.lang.String str16 = comment10.getData();
        int int17 = comment10.siblingIndex();
        java.lang.String str19 = comment10.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = comment10.siblingNodes();
        org.jsoup.nodes.Node node22 = comment10.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        comment2.setBaseUri("#comment");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        java.lang.String str22 = comment12.attr("<?commen?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment12.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node5 = comment2.attr("", "");
        boolean boolean7 = comment2.hasAttr("");
        boolean boolean9 = comment2.hasAttr("#comment");
        java.lang.String str10 = comment2.toString();
        int int11 = comment2.childNodeSize();
        org.jsoup.nodes.Node node12 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.childNodes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<!---->" + "'", str10, "\n<!---->");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        org.jsoup.nodes.Node node14 = comment8.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node15 = comment8.nextSibling();
        java.lang.String str16 = comment8.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.previousSibling();
        int int3 = comment1.siblingIndex();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment1.outerHtmlHead(appendable4, 1, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.Object obj10 = null;
        boolean boolean11 = comment2.hasSameValue(obj10);
        java.lang.String str13 = comment2.attr("\n<!--\n<!---->-->");
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = comment16.childNodes();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        comment16.outerHtmlTail(appendable18, (int) (short) 1, outputSettings20);
        org.jsoup.nodes.Node node22 = comment16.parentNode();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        comment16.outerHtmlTail(appendable23, 1, outputSettings25);
        java.lang.String str27 = comment16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = comment2.after((org.jsoup.nodes.Node) comment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = comment2.nextSibling();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        comment2.outerHtmlTail(appendable10, 100, outputSettings12);
        org.jsoup.nodes.Node node14 = comment2.root();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node4 = comment2.wrap("\n<!--hi!-->");
        boolean boolean5 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.wrap("\n<!---->");
        java.lang.String str8 = comment2.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = comment2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = comment8.childNodesCopy();
        java.lang.String str10 = comment8.nodeName();
        org.jsoup.nodes.Node node11 = comment8.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment8.childNodes();
        org.jsoup.nodes.Node node13 = comment8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.before((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#comment" + "'", str10, "#comment");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = comment2.siblingNodes();
        org.jsoup.nodes.Node node14 = comment2.removeAttr("hi!");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment2.outerHtmlTail(appendable15, 1, outputSettings17);
        org.jsoup.nodes.Node node21 = comment2.attr("\n<!---->", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after("\n<!--\n<!---->-->");
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
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.outerHtmlHead(appendable9, (int) (short) 0, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(xmlDeclaration5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        java.lang.String str23 = comment2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = comment2.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n<!--hi!-->" + "'", str23, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        java.lang.String str8 = comment2.toString();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        java.lang.String str10 = comment2.baseUri();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        comment2.outerHtmlTail(appendable11, 1, outputSettings13);
        java.lang.String str15 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<!--hi!-->" + "'", str8, "\n<!--hi!-->");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n<!--hi!-->" + "'", str15, "\n<!--hi!-->");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        java.lang.String str5 = comment2.attr("\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        org.jsoup.nodes.Node node10 = comment2.previousSibling();
        int int11 = comment2.siblingIndex();
        org.jsoup.nodes.Attributes attributes12 = comment2.attributes();
        org.jsoup.nodes.Node node13 = comment2.parent();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        org.jsoup.nodes.Attributes attributes25 = comment2.attributes();
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
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        int int13 = comment2.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = comment2.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
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
        org.jsoup.nodes.Node node23 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node2 = comment1.root();
        org.jsoup.nodes.Node node3 = comment1.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment1.childNodesCopy();
        org.jsoup.nodes.Node node5 = comment1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = comment1.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean5 = comment2.hasSameValue((java.lang.Object) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = comment2.asXmlDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration7.childNodes();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration7.attributes();
        org.jsoup.nodes.Document document10 = xmlDeclaration7.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(xmlDeclaration7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.siblingNodes();
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = comment20.childNodes();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        comment20.outerHtmlTail(appendable22, (int) (short) 1, outputSettings24);
        org.jsoup.nodes.Node node26 = comment20.previousSibling();
        java.lang.String str27 = comment20.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = comment20.childNodesCopy();
        boolean boolean29 = node16.hasSameValue((java.lang.Object) nodeList28);
        java.lang.String str30 = node16.outerHtml();
        org.jsoup.nodes.Comment comment33 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean35 = comment33.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node36 = comment33.nextSibling();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        comment33.outerHtmlTail(appendable37, (int) (short) -1, outputSettings39);
        java.lang.String str42 = comment33.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node44 = comment33.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Node node47 = comment33.attr("hi!", "\n<!---->");
        boolean boolean48 = node16.hasSameValue((java.lang.Object) "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = node16.siblingNodes();
        org.jsoup.nodes.Comment comment52 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean54 = comment52.hasSameValue((java.lang.Object) 1);
        int int55 = comment52.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = comment52.siblingNodes();
        comment52.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes59 = comment52.attributes();
        org.jsoup.nodes.Node node61 = comment52.removeAttr("\n<!--hi!-->");
        org.jsoup.nodes.Comment comment64 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean66 = comment64.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node67 = comment64.nextSibling();
        java.lang.Appendable appendable68 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings70 = null;
        comment64.outerHtmlTail(appendable68, (int) (short) -1, outputSettings70);
        java.lang.String str72 = comment64.nodeName();
        org.jsoup.nodes.Comment comment74 = new org.jsoup.nodes.Comment("hi!");
        boolean boolean75 = comment64.hasSameValue((java.lang.Object) comment74);
        java.lang.String str76 = comment64.nodeName();
        boolean boolean77 = comment64.hasParent();
        org.jsoup.nodes.Node node80 = comment64.attr("\n<!---->", "hi!");
        boolean boolean81 = node61.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node82 = node16.before(node61);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n<!--hi!-->" + "'", str30, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "#comment" + "'", str72, "#comment");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#comment" + "'", str76, "#comment");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        node17.setBaseUri("\n<!--\n<!--\n<!--#comment-->-->-->");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        org.jsoup.nodes.Node node28 = comment21.previousSibling();
        java.lang.String str29 = comment21.baseUri();
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
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Document document4 = comment2.ownerDocument();
        org.jsoup.nodes.Node node7 = comment2.attr("", "");
        java.lang.String str8 = comment2.getData();
        int int9 = comment2.siblingIndex();
        java.lang.String str11 = comment2.attr("");
        java.lang.String str12 = comment2.baseUri();
        org.jsoup.nodes.Node node13 = comment2.parentNode();
        java.lang.String str14 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = comment2.root();
        org.jsoup.nodes.Node node15 = comment2.attr("\n<!--hi!-->", "hi!");
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        int int19 = comment18.childNodeSize();
        java.lang.String str20 = comment18.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Attributes attributes2 = comment1.attributes();
        int int3 = comment1.childNodeSize();
        int int4 = comment1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = comment1.before("\n<!--\n<!---->-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = comment2.asXmlDeclaration();
        boolean boolean15 = comment2.hasAttr("\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(xmlDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        org.jsoup.nodes.Node node13 = comment2.removeAttr("#comment");
        boolean boolean15 = node13.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Document document16 = node13.ownerDocument();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean21 = comment19.hasSameValue((java.lang.Object) 1);
        int int22 = comment19.siblingIndex();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean27 = comment25.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node28 = comment25.nextSibling();
        boolean boolean29 = comment19.equals((java.lang.Object) comment25);
        org.jsoup.nodes.Node node30 = comment19.root();
        boolean boolean31 = comment19.isXmlDeclaration();
        boolean boolean32 = comment19.hasParent();
        boolean boolean33 = comment19.isXmlDeclaration();
        org.jsoup.nodes.Node node34 = comment19.clearAttributes();
        int int35 = comment19.childNodeSize();
        java.lang.String str36 = comment19.toString();
        boolean boolean38 = comment19.hasAttr("<?commen?>");
        org.jsoup.nodes.Node node39 = comment19.clone();
        int int40 = comment19.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = document16.before((org.jsoup.nodes.Node) comment19);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\n<!---->" + "'", str36, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        int int5 = comment2.siblingIndex();
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node11 = comment8.nextSibling();
        boolean boolean12 = comment2.equals((java.lang.Object) comment8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        java.lang.String str14 = comment2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n<!--hi!-->" + "'", str14, "\n<!--hi!-->");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        java.util.List<org.jsoup.nodes.Node> nodeList54 = node52.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList54);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.absUrl("#comment");
        int int11 = comment2.childNodeSize();
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!---->");
        java.lang.String str14 = comment2.getData();
        org.jsoup.nodes.Node node15 = comment2.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Document document7 = comment2.ownerDocument();
        java.lang.String str8 = comment2.getData();
        org.jsoup.nodes.Node node9 = comment2.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = comment2.before("#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        java.lang.String str7 = comment2.outerHtml();
        int int8 = comment2.siblingIndex();
        org.jsoup.nodes.Node node9 = comment2.previousSibling();
        java.lang.String str10 = comment2.getData();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n<!--hi!-->" + "'", str7, "\n<!--hi!-->");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node16 = comment2.attr("\n<!--\n<!--#comment-->-->", "");
        org.jsoup.nodes.Node node17 = node16.root();
        java.lang.Class<?> wildcardClass18 = node16.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        org.jsoup.nodes.Node node16 = comment2.root();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        java.lang.String str39 = comment33.getData();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n<!--hi!-->" + "'", str39, "\n<!--hi!-->");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        boolean boolean4 = comment2.isXmlDeclaration();
        java.lang.String str5 = comment2.nodeName();
        java.lang.String str7 = comment2.attr("\n<!---->");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = comment2.asXmlDeclaration();
        int int9 = comment2.siblingIndex();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xmlDeclaration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        org.jsoup.nodes.Node node13 = comment2.wrap("\n<!--hi!-->");
        org.jsoup.nodes.Document document14 = comment2.ownerDocument();
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node17 = comment2.shallowClone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = comment2.childNodesCopy();
        int int19 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        java.lang.String str5 = comment2.attr("hi!");
        org.jsoup.nodes.Comment comment8 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean10 = comment8.hasSameValue((java.lang.Object) 1);
        boolean boolean11 = comment8.hasParent();
        org.jsoup.nodes.Node node14 = comment8.attr("", "hi!");
        java.lang.String str16 = comment8.attr("");
        org.jsoup.nodes.Document document17 = comment8.ownerDocument();
        org.jsoup.nodes.Node node19 = comment8.removeAttr("#comment");
        java.lang.String str20 = comment8.nodeName();
        org.jsoup.nodes.Node node21 = comment8.shallowClone();
        java.lang.String str23 = comment8.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment8.siblingNodes();
        java.lang.String str25 = comment8.nodeName();
        java.lang.String str26 = comment8.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = comment2.before((org.jsoup.nodes.Node) comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#comment" + "'", str25, "#comment");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#comment" + "'", str26, "#comment");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str3 = comment2.getData();
        org.jsoup.nodes.Node node4 = comment2.nextSibling();
        boolean boolean5 = comment2.isXmlDeclaration();
        boolean boolean6 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        comment2.outerHtmlTail(appendable7, (int) (short) 10, outputSettings9);
        org.jsoup.nodes.Node node11 = comment2.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = node11.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodesCopy();
        java.lang.String str4 = comment2.baseUri();
        org.jsoup.nodes.Node node5 = comment2.root();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node7 = comment2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        org.jsoup.nodes.Node node12 = comment2.attr("hi!", "\n<!--hi!-->");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = comment2.childNodes();
        org.jsoup.nodes.Node node14 = comment2.shallowClone();
        org.jsoup.nodes.Node node17 = comment2.attr("<?commen?>", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        java.util.List<org.jsoup.nodes.Node> nodeList19 = node3.siblingNodes();
        org.jsoup.nodes.Comment comment21 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node23 = comment21.removeAttr("#comment");
        java.lang.String str25 = comment21.attr("hi!");
        boolean boolean26 = node3.hasSameValue((java.lang.Object) comment21);
        // The following exception was thrown during execution in test generation
        try {
            node3.remove();
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
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.equals((java.lang.Object) '4');
        org.jsoup.nodes.Comment comment10 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = comment10.childNodes();
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        boolean boolean18 = comment14.isXmlDeclaration();
        org.jsoup.nodes.Node node19 = comment14.parentNode();
        boolean boolean20 = comment10.equals((java.lang.Object) node19);
        boolean boolean21 = comment2.equals((java.lang.Object) boolean20);
        org.jsoup.nodes.Node node22 = comment2.shallowClone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        java.lang.String str40 = comment2.getData();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#comment" + "'", str40, "#comment");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        java.lang.String str16 = comment2.attr("#comment");
        java.lang.String str17 = comment2.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n<!--hi!-->" + "'", str17, "\n<!--hi!-->");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        comment2.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        int int13 = comment2.childNodeSize();
        org.jsoup.nodes.Node node14 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        int int14 = comment11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment11.siblingNodes();
        java.lang.String str16 = comment11.outerHtml();
        org.jsoup.nodes.Node node17 = comment11.root();
        org.jsoup.nodes.Node node18 = comment11.root();
        java.lang.String str19 = comment11.getData();
        org.jsoup.nodes.Node node22 = comment11.attr("hi!", "hi!");
        int int23 = comment11.siblingIndex();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node26 = comment25.root();
        org.jsoup.nodes.Node node27 = comment25.clone();
        boolean boolean28 = comment11.hasSameValue((java.lang.Object) comment25);
        boolean boolean29 = comment2.hasSameValue((java.lang.Object) comment11);
        java.lang.String str31 = comment11.absUrl("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node9 = comment2.removeAttr("");
        comment2.setBaseUri("hi!");
        int int12 = comment2.childNodeSize();
        org.jsoup.nodes.Attributes attributes13 = comment2.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node11 = comment2.wrap("\n<!--hi!-->");
        boolean boolean13 = comment2.hasAttr("\n<!---->");
        java.lang.String str15 = comment2.attr("hi!");
        org.jsoup.nodes.Document document16 = comment2.ownerDocument();
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("", "\n<!--hi!-->");
        org.jsoup.nodes.Node node22 = comment19.attr("", "");
        boolean boolean24 = comment19.hasAttr("");
        boolean boolean26 = comment19.hasAttr("#comment");
        java.lang.String str27 = comment19.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = document16.hasSameValue((java.lang.Object) str27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n<!---->" + "'", str27, "\n<!---->");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        java.lang.String str12 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node13 = comment2.parent();
        int int14 = comment2.childNodeSize();
        int int15 = comment2.childNodeSize();
        int int16 = comment2.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean7 = comment2.hasSameValue((java.lang.Object) (byte) -1);
        boolean boolean8 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        java.lang.String str12 = comment2.baseUri();
        java.lang.String str14 = comment2.attr("\n<!---->");
        java.lang.String str15 = comment2.baseUri();
        boolean boolean16 = comment2.hasParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        boolean boolean11 = comment2.hasAttr("\n<!--hi!-->");
        org.jsoup.nodes.Node node12 = comment2.parent();
        int int13 = comment2.childNodeSize();
        boolean boolean15 = comment2.hasAttr("\n<!--#comment-->");
        boolean boolean17 = comment2.hasAttr("");
        org.jsoup.nodes.Comment comment20 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str22 = comment20.absUrl("hi!");
        java.lang.String str23 = comment20.nodeName();
        boolean boolean24 = comment20.hasParent();
        org.jsoup.nodes.Comment comment27 = new org.jsoup.nodes.Comment("hi!", "hi!");
        java.lang.String str28 = comment27.getData();
        org.jsoup.nodes.Document document29 = comment27.ownerDocument();
        org.jsoup.nodes.Node node32 = comment27.attr("", "");
        java.lang.String str33 = comment27.getData();
        int int34 = comment27.siblingIndex();
        java.lang.String str36 = comment27.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment27.siblingNodes();
        java.lang.String str38 = comment27.baseUri();
        java.lang.String str39 = comment27.getData();
        boolean boolean40 = comment20.equals((java.lang.Object) comment27);
        org.jsoup.nodes.Node node41 = comment20.parent();
        java.lang.String str42 = comment20.toString();
        java.lang.String str44 = comment20.attr("<?commen?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = comment2.after((org.jsoup.nodes.Node) comment20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n<!---->" + "'", str42, "\n<!---->");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        org.jsoup.nodes.Node node8 = comment2.parent();
        org.jsoup.nodes.Comment comment11 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean13 = comment11.hasSameValue((java.lang.Object) 1);
        int int14 = comment11.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = comment11.siblingNodes();
        java.lang.String str16 = comment11.outerHtml();
        org.jsoup.nodes.Node node17 = comment11.root();
        org.jsoup.nodes.Node node18 = comment11.root();
        java.lang.String str19 = comment11.getData();
        org.jsoup.nodes.Node node22 = comment11.attr("hi!", "hi!");
        int int23 = comment11.siblingIndex();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("hi!");
        org.jsoup.nodes.Node node26 = comment25.root();
        org.jsoup.nodes.Node node27 = comment25.clone();
        boolean boolean28 = comment11.hasSameValue((java.lang.Object) comment25);
        boolean boolean29 = comment2.hasSameValue((java.lang.Object) comment11);
        java.lang.String str30 = comment11.getData();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n<!--hi!-->" + "'", str16, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = comment2.parentNode();
        int int6 = comment2.siblingIndex();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("#comment");
        org.jsoup.nodes.Node node9 = comment2.root();
        org.jsoup.nodes.Node node12 = comment2.attr("", "\n<!---->");
        boolean boolean13 = comment2.hasParent();
        org.jsoup.nodes.Comment comment16 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean18 = comment16.hasSameValue((java.lang.Object) 1);
        boolean boolean19 = comment16.hasParent();
        boolean boolean20 = comment16.isXmlDeclaration();
        org.jsoup.nodes.Node node21 = comment16.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = comment16.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = comment2.after((org.jsoup.nodes.Node) comment16);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        int int21 = comment2.siblingIndex();
        org.jsoup.nodes.Node node23 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        boolean boolean6 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node7 = comment2.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node10 = comment2.removeAttr("\n<!--\n<!---->-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = comment2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        java.lang.String str20 = comment2.nodeName();
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        int int26 = comment23.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = comment23.siblingNodes();
        java.lang.String str28 = comment23.outerHtml();
        org.jsoup.nodes.Node node29 = comment23.root();
        org.jsoup.nodes.Node node30 = comment23.nextSibling();
        org.jsoup.nodes.Node node33 = comment23.attr("\n<!---->", "");
        boolean boolean35 = comment23.hasAttr("#comment");
        boolean boolean37 = comment23.hasAttr("\n<!--\n<!---->-->");
        comment23.setBaseUri("<?commen?>");
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith((org.jsoup.nodes.Node) comment23);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<!--hi!-->" + "'", str28, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        comment2.setBaseUri("\n<!--hi!-->");
        org.jsoup.nodes.Node node14 = comment2.attr("", "#comment");
        org.jsoup.nodes.Node node15 = comment2.clone();
        comment2.setBaseUri("\n<!--#comment-->");
        int int18 = comment2.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = comment2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        boolean boolean6 = comment2.isXmlDeclaration();
        int int7 = comment2.childNodeSize();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        comment2.outerHtmlTail(appendable8, (int) ' ', outputSettings10);
        org.jsoup.nodes.Node node12 = comment2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        org.jsoup.nodes.Attributes attributes22 = comment14.attributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        org.jsoup.nodes.Node node8 = comment2.attr("", "hi!");
        java.lang.String str10 = comment2.attr("");
        org.jsoup.nodes.Document document11 = comment2.ownerDocument();
        java.lang.String str12 = comment2.getData();
        java.lang.String str13 = comment2.getData();
        org.jsoup.nodes.Node node14 = comment2.parentNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node24 = comment23.root();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = comment23.childNodesCopy();
        java.lang.String str26 = comment23.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = comment23.asXmlDeclaration();
        boolean boolean28 = comment2.equals((java.lang.Object) comment23);
        org.jsoup.nodes.Node node31 = comment2.attr("<?commen?>", "hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#comment" + "'", str14, "#comment");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#comment" + "'", str18, "#comment");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n<!--hi!-->" + "'", str26, "\n<!--hi!-->");
        org.junit.Assert.assertNotNull(xmlDeclaration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = comment2.childNodes();
        comment2.setBaseUri("\n<!--hi!-->");
        boolean boolean6 = comment2.hasParent();
        boolean boolean7 = comment2.isXmlDeclaration();
        org.jsoup.nodes.Node node8 = comment2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration23.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(xmlDeclaration23);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node5 = comment2.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        comment2.outerHtmlTail(appendable6, (int) (short) -1, outputSettings8);
        java.lang.String str11 = comment2.attr("\n<!--hi!-->");
        java.lang.String str12 = comment2.outerHtml();
        java.lang.String str13 = comment2.baseUri();
        org.jsoup.nodes.Node node14 = comment2.nextSibling();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        comment2.outerHtmlTail(appendable15, (int) 'a', outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--hi!-->" + "'", str12, "\n<!--hi!-->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        org.jsoup.nodes.Comment comment23 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean25 = comment23.hasSameValue((java.lang.Object) 1);
        int int26 = comment23.siblingIndex();
        org.jsoup.nodes.Comment comment29 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean31 = comment29.hasSameValue((java.lang.Object) 1);
        org.jsoup.nodes.Node node32 = comment29.nextSibling();
        boolean boolean33 = comment23.equals((java.lang.Object) comment29);
        org.jsoup.nodes.Node node34 = comment23.root();
        boolean boolean35 = comment23.isXmlDeclaration();
        boolean boolean36 = comment23.hasParent();
        boolean boolean37 = comment23.isXmlDeclaration();
        org.jsoup.nodes.Node node38 = comment23.clearAttributes();
        int int39 = comment23.childNodeSize();
        java.lang.String str40 = comment23.toString();
        org.jsoup.nodes.Node node43 = comment23.attr("\n<!--hi!-->", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = comment2.after(node43);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\n<!---->" + "'", str40, "\n<!---->");
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        org.jsoup.nodes.Node node8 = comment2.attr("#comment", "");
        org.jsoup.nodes.Node node9 = node8.root();
        org.jsoup.nodes.Node node10 = node8.clone();
        org.jsoup.nodes.Node node11 = node8.clearAttributes();
        boolean boolean12 = node11.hasParent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jsoup.nodes.Comment comment1 = new org.jsoup.nodes.Comment("\n<!--hi!-->");
        org.jsoup.nodes.Node node2 = comment1.parentNode();
        java.lang.String str3 = comment1.nodeName();
        org.jsoup.nodes.Node node4 = comment1.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.filter(nodeFilter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        org.jsoup.nodes.Node node35 = comment15.attr("", "\n<!--hi!-->");
        java.lang.String str37 = comment15.absUrl("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = comment15.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        java.lang.String str21 = comment2.attr("\n<!--#comment-->");
        boolean boolean22 = comment2.hasParent();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
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
            org.jsoup.nodes.Node node20 = comment2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        int int21 = comment2.siblingIndex();
        org.jsoup.nodes.Node node23 = comment2.removeAttr("\n<!--\n<!--#comment-->-->");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = comment2.childNodes();
        boolean boolean26 = comment2.hasAttr("\n<!---->");
        org.jsoup.nodes.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            comment2.replaceWith(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node5 = comment2.previousSibling();
        int int6 = comment2.childNodeSize();
        org.jsoup.nodes.Node node8 = comment2.removeAttr("");
        java.lang.String str9 = comment2.outerHtml();
        comment2.setBaseUri("");
        org.jsoup.nodes.Comment comment14 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean16 = comment14.hasSameValue((java.lang.Object) 1);
        boolean boolean17 = comment14.hasParent();
        boolean boolean18 = comment14.isXmlDeclaration();
        int int19 = comment14.childNodeSize();
        org.jsoup.nodes.Node node21 = comment14.removeAttr("");
        org.jsoup.nodes.Attributes attributes22 = comment14.attributes();
        boolean boolean23 = comment14.hasParent();
        org.jsoup.nodes.Node node24 = comment14.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = comment2.after((org.jsoup.nodes.Node) comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<!---->" + "'", str9, "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        org.jsoup.nodes.Node node3 = comment2.root();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = comment2.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.nodes.Node node8 = comment2.shallowClone();
        org.jsoup.nodes.Node node9 = comment2.parentNode();
        org.jsoup.nodes.Attributes attributes10 = comment2.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = comment2.asXmlDeclaration();
        comment2.setBaseUri("\n<!---->");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = comment2.traverse(nodeVisitor14);
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
        org.junit.Assert.assertNotNull(xmlDeclaration11);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        int int21 = comment2.siblingIndex();
        org.jsoup.nodes.Attributes attributes22 = comment2.attributes();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", "hi!");
        java.lang.String str4 = comment2.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = comment2.childNodesCopy();
        java.lang.String str6 = comment2.getData();
        org.jsoup.nodes.Node node7 = comment2.root();
        org.jsoup.nodes.Attributes attributes8 = comment2.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("hi!", "hi!");
        boolean boolean4 = comment2.hasSameValue((java.lang.Object) 1);
        boolean boolean5 = comment2.hasParent();
        java.lang.String str7 = comment2.absUrl("hi!");
        org.jsoup.nodes.Node node8 = comment2.parentNode();
        comment2.setBaseUri("\n<!--hi!-->");
        comment2.setBaseUri("");
        boolean boolean13 = comment2.isXmlDeclaration();
        comment2.setBaseUri("");
        org.jsoup.nodes.Node node17 = comment2.wrap("<?commen?>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node17);
    }
}

